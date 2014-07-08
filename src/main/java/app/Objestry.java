package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//object registry
public class Objestry
{
	static Map<String, Class<? extends IEntity>> content = new HashMap<String, Class<? extends IEntity>>();

	static
	{
		Objestry_Fill.justDoIt();
	}//function

	public static Class<? extends IEntity> get(String ident)
	{
		return content.get(ident);
	}//function
	
	public static String getIdent(Class<? extends IEntity> value)
	{
		for (Entry<String, Class<? extends IEntity>> entry : content.entrySet()) {
	        if (value.equals(entry.getValue())) {
	            return entry.getKey();
	        }
	    }
		return null;
	}//function
	
	public static String getSimple(String ident)
	{
		Class<? extends IEntity> c = get(ident);
		if (c != null)
			return content.get(ident).getSimpleName();
		else
			return null;
	}//function
	
	public static void add(String ident, Class<? extends IEntity> clazz)
	{
		content.put(ident, clazz);
	}//function
	
	public static IEntity create(String ident)
	{
		IEntity ent = null;
		Class<? extends IEntity> clazz = get(ident);
		try {
			ent = (IEntity) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return ent;
	}//function
}//class

