package app;

import java.util.*;

import org.apache.commons.validator.routines.LongValidator;

//link registry
public class Linkistry {
	private static List<Link> content = new ArrayList<Link>();
	private static List<Link> started = new ArrayList<Link>();
	public static Comparator<Link> cmpOnChild = new Comparator<Link>() {
        public int compare(Link o1, Link o2) {
            return o1.Child.compareTo(o2.Child);
        }}; 
	
	static 
	{
		Linkistry_Fill.justDoIt();
	}//static
	
	public static void sort(List<Link> list)
	{
		Collections.sort(list, cmpOnChild);
	}//function
	
	public static List<Link> takeStarted()
	{
		if (started.isEmpty())
		{
			for (Link item: content)
			{
				if (item.isStarted())
					started.add(item);
				
				sort(started);
			}//for
		}//if
		return started;
	}//method

	public static List<Link> takeEmpty()
	{
		List<Link> ret = new ArrayList<Link>();
		return ret;
	}//method
	
	public static List<Link> takeFrom(String Master, Long master_id)
	{
		List<Link> ret = new ArrayList<Link>();
		for (Link Link: content)
		{
			if (Link.fromMaster(Master))
			{
				Link.master_id = master_id;
				ret.add(Link);
			}//if
		}//for
		sort(ret);
		return ret;
	}//method

	public static List<Link> takeAll()
	{
		List<Link> ret = new ArrayList<Link>();
		for (Link Link: content)
		{
			ret.add(Link);
		}//for
		return ret;
	}//method
	
	public static boolean hasContent()
	{
		return (content.isEmpty() == false);
	}

	public static int getCount()
	{
		return content.size() ;
	}
	public static void add(Link arg)
	{
		arg.Normalize();
		content.add(arg);
	}
	
	public static Link findOnUrl(String url)
	{
		Link ret = null;
		String[] items = url.split("/");
		String ident;
		Long id;
		
		if (items.length != 3)		{throw new IllegalArgumentException("url must contain: /link_ident/master_id");}//if

		id = LongValidator.getInstance().validate(items[2]);
		if (id == null)		{throw new IllegalArgumentException("id " + items[2] + " is invalid");}//if

		ident = items[1];
		ret = findOnIdent(ident);
		if (ret == null)	{throw new IllegalArgumentException("Link identificator " + ident + " is invalid");	}//if
		
		ret.setMaster_id(id);
		return ret;
	}//function
	
	public static Link findOnIdent(String arg)
	{
		for (Link l: content)
		{
			if (l.getIdent().equals(arg))
			{l.Reset();  return l;}
		}//for
		return null;
	}//function

	public static Link findOnNameAndChild(String aName, String aChild)
	{
		for (Link l: content)
		{
			if (l.Name.equals(aName) && l.Child.equals(aChild))
				{l.Reset();  return l;}
		}//for
		return null;
	}//function
}//class
