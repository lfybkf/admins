package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.*;

/**
 * all object operations
 */
@WebServlet("/objects/*")
public class ObjectController extends HttpServlet {
	private static final long serialVersionUID = 2L;
       
    public ObjectController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String url = request.getPathInfo();
		ObjectUrl ourl = ObjectUrl.CreateFromUrl(url);
		PrintWriter writer = response.getWriter();
		
		if (ourl.error != null)
		{
			writer.println("PathInfo " + url);
			writer.println("ERROR " + ourl.error);	
		}//if
		else
		{
			IEntity ent = Finder.get(ourl.ident, ourl.id);
			if (ent == null)
				writer.println(String.format("NOT FOUND %s %s", ourl.ident, ourl.id.toString()));
			else if (ourl.operation.equals(ObjectUrl.Oper.EDIT))
			{
				request.setAttribute(Attr.LINKS, Linkistry.takeFrom(ent.getIdent(), ent.getId()));
				request.setAttribute(Attr.ENTITY, ent);
				request.setAttribute("ourl", ourl);
				
				String Jsp = takeJspUrl(ent.getIdent());
				RequestDispatcher view = request.getRequestDispatcher(Jsp);
				view.forward(request, response);
			}//else
			else if (ourl.operation.equals(ObjectUrl.Oper.UPDATE))
				writer.println("MUST NOT IMPLEMENTED");
			else if (ourl.operation.equals(ObjectUrl.Oper.DELETE))
				writer.println("YET NOT IMPLEMENTED");

	
		}//else

	}//function

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String url = request.getPathInfo();
		ObjectUrl ourl = ObjectUrl.CreateFromUrl(url);
		PrintWriter writer = response.getWriter();

		if (ourl.operation.equals(ObjectUrl.Oper.UPDATE))
		{
			//debug
			System.out.println(Utils.toString(request));
			
			Map<String, String[]> values = request.getParameterMap();
			boolean isNew = (ourl.id <= 0L);
			IEntity ent = isNew ? Objestry.create(ourl.ident) : Finder.get(ourl.ident, ourl.id);
			ent.fill(values);
			boolean isSaved = (isNew) ? Finder.insert(ent) : Finder.update(ent);
			if (isSaved)
			{
				String UrlToReturn = request.getParameter(Const.URL_LIST);
				
				if (UrlToReturn != null)
				{
					response.sendRedirect(UrlToReturn);
				}//if
				else
				{
					writer.println(String.format("UPDATED %s %s", ourl.ident, ourl.id.toString()));
				}//else
					
			}//if
			else
			{
				writer.println(String.format("ERROR UPDATE %s %s", ourl.ident, ourl.id.toString()));
			}//else
		}//if
		else if (ourl.operation.equals(ObjectUrl.Oper.CREATE))
		{
			Map<String, String[]> values = request.getParameterMap();
			IEntity ent = Objestry.create(ourl.ident);
			System.out.println("Create ent " + ourl.ident);
			
			if (ent == null)
				writer.println("CREATE ERROR");
			else
			{
				//debug
				System.out.println(Utils.MapToString(values));
				//System.out.println(Utils.toString(request));
				ent.fillDefaults();
				
				//fill master
				if (values.containsKey(Const.MASTER_IDENT))
				{
					String master_field = Utils.getFirst(values.get(Const.MASTER_IDENT)) + "_id";
					String master_value = Utils.getFirst(values.get(Const.MASTER_ID));
					Map<String, String[]> master_values = new HashMap<String, String[]>();
					master_values.put(master_field, new String[] {master_value});
					ent.fill(master_values);
				}//if
				//ent.fill(values); values is empty
				request.setAttribute(Attr.LINKS, Linkistry.takeEmpty());
				request.setAttribute(Attr.ENTITY, ent);
				request.setAttribute(Attr.ENTITY_INFO, ent.getFullInfo());
				request.setAttribute("ourl", ourl);
				//url of list. Need to return to list after creating
				String urlList = Utils.getFirst(values.get(Attr.URL_LIST));
				request.setAttribute(Attr.URL_LIST, urlList);

				String Jsp = takeJspUrl(ent.getIdent());
				RequestDispatcher view = request.getRequestDispatcher(Jsp);
				view.forward(request, response);
			}//else
		}//else
			

	}//function

	private static String takeJspUrl(String ident)
	{
		return String.format("/jsp/item%s.jsp", Objestry.getSimple(ident));
	}//function
}
