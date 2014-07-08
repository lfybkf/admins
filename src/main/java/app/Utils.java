package app;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.avaje.ebean.RawSqlBuilder;

public class Utils 
{
	public static RawSqlBuilder MapColumns(Map<String, String> DbE, RawSqlBuilder rsb, String prefix)
	{
		String V;
		String F;
		for (String K: DbE.keySet())
		{
			V = DbE.get(K);
			F = prefix + K;
			if (V.contains("_id"))
				rsb = rsb.columnMapping(F, V + ".id");
			else
				rsb = rsb.columnMapping(F, V);
		}//for
		return rsb;
	}//method
	
	public static String DbFields(Map<String, String> DbE, String prefix, String delim)
	{
		StringBuilder sb = new StringBuilder();
		int c = 0;
		for (String K: DbE.keySet())
		{
			sb.append(prefix);
			sb.append(K);
			c++;
			if (c != DbE.size())
				sb.append(delim);
		}//for
		return sb.toString();
	}//method
	
	public static String toString(Object obj, String def)
	{
		if (obj != null)
			return obj.toString();
		else
			return def;
	}//function
	
	public static String toString(Object obj)
	{
		return toString(obj, "");
	}//function

	public static String toStringExt(String before, Object obj, String after)
	{
		if (obj != null)
			return before + obj.toString() + after;
		else
			return "";
	}//function
	
	public static String IfNotNull(Object obj, String s)
	{
		if (obj != null)
			return s;
		else
			return "";
	}//function

	public static String IfNotNull(Object obj, String sYes, String sNot)
	{
		if (obj != null)
			return sYes;
		else
			return sNot;
	}//function
	
	public static String If(boolean b, String sYes, String sNot)
	{
		if (b)
			return sYes;
		else
			return sNot;
	}//function
	
	public static String getFirst(String[] ss)
	{
		if (ss == null)
			return null;
		
		if (ss.length < 1)
			return null;
		
		return ss[0];
	}//function
	
	public static String MapToString(Map<String, String[]> map)
	{
		if (map == null)
			return "map is null";
		
		String value;
		StringBuilder sb = new StringBuilder();
		Set<String> keys = map.keySet();
		for (String key: keys) 
		{
			value = getFirst(map.get(key));
			sb.append(String.format("%s=%s", key, value));
			sb.append("\n");
		}//for
		return sb.toString();
	}//function

	public static String toString(HttpServletRequest request)
	{
		if (request == null)
			return "request is null";
		
		String key;
		String value;
		Object obj;
		StringBuilder sb = new StringBuilder();
		//attr
		sb.append("=REQUEST INFO\n");
		sb.append( String.format("==Uri=%s\n", request.getRequestURI()) );
		sb.append("===Attrs\n");
		Enumeration<String> attrs =  request.getAttributeNames();
		while(attrs.hasMoreElements()) 
		{
			key = attrs.nextElement();
			obj = request.getAttribute(key);
			if (obj instanceof Boolean)
				value = "Boolean";
			else
				value = request.getAttribute(key).toString();
			sb.append(String.format("%s=%s", key, value));
			sb.append("\n");
		}//while
		
		//parameter
		sb.append("===Params\n");
		Map<String, String[]> params = request.getParameterMap();
		for (String param: params.keySet()) 
		{
			value = getFirst(params.get(param));
			sb.append(String.format("%s=%s", param, value));
			sb.append("\n");
		}//for
		
		//headers
		sb.append("===Headers\n");
		Enumeration<String> headers =  request.getHeaderNames();
		while(headers.hasMoreElements()) 
		{
			key = headers.nextElement();
			value = (String)request.getHeader(key);
			sb.append(String.format("%s=%s", key, value));
			sb.append("\n");
		}//while

		return sb.toString();
	}//function

	public static Properties takeProperties(String resourceFile)
	{
		Properties prop = new Properties();
		try {
			
			//InputStreamReader in = new InputStreamReader(new FileInputStream("db.properties"),"UTF-8");
			InputStream in = Utils.class.getResourceAsStream(resourceFile);
			prop.load(in);
		} catch (IOException e) {
			System.out.println(resourceFile + " not found");
			e.printStackTrace();
			return null;
		}
		return prop;
	}//function 
}//class
