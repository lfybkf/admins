package app;

import org.apache.commons.validator.routines.LongValidator;

public final class ObjectUrl 
{
	public String ident;
	public String operation;
	public Long id;
	public String error;
	static String context = "/objects/%s/%s/%s";
	static String info = "ident=%s id=%s operation=%s";
	
	public final static class Oper
	{
		
		public static final String CREATE = "create";
		public static final String DELETE = "delete";
		public static final String EDIT = "edit";
		public static final String UPDATE = "update";
		
		public static boolean IsValid(String s)
		{
			return s.equals(CREATE) || s.equals(DELETE) || s.equals(EDIT) || s.equals(UPDATE);
		}//function
	}//class
	
	public static ObjectUrl CreateFromUrl(String url)
	{
		ObjectUrl ret = new ObjectUrl();
		String[] items = url.split("/");
		if (items.length != 4)
		{
			ret.error = "url must contain: /object_type/object_id/operation";
			return ret;
		}//if

		ret.ident = items[1];
		ret.id = LongValidator.getInstance().validate(items[2]);
		ret.operation = items[3];
		
		if (ret.id == null)
		{
			ret.error = "id " + items[2] + " is invalid";
			return ret;
		}//if

		if (Oper.IsValid(ret.operation) == false)
		{
			ret.error = "operation " + ret.operation + " is invalid";
			return ret;
		}//if

		return ret;
	}//function

	public String getUrlUpdate()
	{
		return String.format(context, ident, id.toString(), Oper.UPDATE);
	}//function
	
	public String getUrlEdit()
	{
		return takeUrlEdit(ident, id);
	}//function
	
	public String getUrlCreate()
	{
		return takeUrlCreate(ident, id);
	}//function

	public static String takeUrlEdit(String ident, Long id)
	{
		return String.format(context, ident, id.toString(), Oper.EDIT);
	}//function

	public static String takeUrlCreate(String ident, Long id)
	{
		return String.format(context, ident, id.toString(), Oper.CREATE);
	}//function
	
	public String toString()
	{
		return String.format(info, ident, id.toString(), operation);
	}//function

}//class
