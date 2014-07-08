package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.*;

@WebServlet("/links/*")
public class LinkController extends HttpServlet 
{
	private static final long serialVersionUID = 2L;
	
	public LinkController() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException 
	{
		//debug
		System.out.println(Utils.toString(request));
		
		String url = request.getPathInfo();
		PrintWriter writer = response.getWriter();
		Link link;
		try 
		{
			link = Linkistry.findOnUrl(url);
			List<? extends IEntity> list = Link_List.get(link);

			//order
			String order = request.getParameter("order");
			Comparator<IEntity> comparator = null;
			if (order != null)
				comparator = Link_Order.takeComparator(link.Child, order);
			if (comparator != null)
				Collections.sort(list, comparator);

			//fill list
			request.setAttribute(Attr.ENTITIES, list);
			
			//links
			if (link.isStarted())
			{
				request.setAttribute(Attr.LINKS, Linkistry.takeStarted());
			}//if
			else
			{
				IEntity ent_master = Finder.get(link.Master, link.master_id);
				request.setAttribute(Attr.MASTER, ent_master);
				request.setAttribute(Attr.LINKS, Linkistry.takeFrom(link.Master, link.master_id));
			}//else
			
			//links goto
			request.setAttribute(Attr.LINKS_GOTO, Linkistry.takeFrom(link.Child, 0L));
			
			//call JSP
			String Jsp = String.format("/jsp/list%s.jsp", Objestry.getSimple(link.Child));
			RequestDispatcher view = request.getRequestDispatcher(Jsp);
			view.forward(request, response);
		} catch (Exception e) {
			writer.println(e.getMessage());
		}//try
	}//function


	
}//class
