package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.EbeanServerFactory;
import com.avaje.ebean.Query;
import com.avaje.ebean.config.AutofetchMode;
import com.avaje.ebean.config.DataSourceConfig;
import com.avaje.ebean.config.ServerConfig;


public class Finder {
	
	public static EbeanServer DB = null;
	private static ServerConfig cfg = null;
	public static String label = "undefined";
	
	static
	{
		init();
	}//function

	public static void init()
	{
		Properties prop = Utils.takeProperties("/db.properties");
		
		DataSourceConfig dsc = new DataSourceConfig();  
		dsc.setDriver(prop.getProperty("driver", "org.postgresql.Driver"));  
		dsc.setUsername(prop.getProperty("user", "wrong db user"));  
		dsc.setPassword(prop.getProperty("password", "wrong db password"));  
		dsc.setUrl(prop.getProperty("url", "wrong db url"));  
		dsc.setHeartbeatSql(prop.getProperty("heartbeatsql", "wrong db heartbeatsql"));  
		
		cfg = new ServerConfig();
		cfg.setDataSourceConfig(dsc);  
		cfg.setName(prop.getProperty("name", "wrong db name"));
		cfg.setDebugSql(Boolean.parseBoolean(prop.getProperty("debugsql")));
		cfg.setDdlGenerate(false);
		cfg.setDdlRun(false);
		cfg.getAutofetchConfig().setMode(AutofetchMode.DEFAULT_OFF);
		//cfg.addPackage("models");
		//cfg.setDatabasePlatformName(prop.getProperty("platform", "postgres"));
		//cfg.setDefaultServer(true);
		
		DB = EbeanServerFactory.create(cfg);
		
		label = prop.getProperty("label", label);
	}//function
	
	public static IEntity zgetOnType(String clazz, Long id)
	{
		return get(clazz.toLowerCase(), id);
	}//function

	public static IEntity get(String ident, Long id)
	{
		Class<? extends IEntity> clazz = Objestry.get(ident);
		IEntity ret = (IEntity)DB.find(clazz, id) ;
		return ret;
	}//function
	
	public static IEntity get(Class<? extends IEntity> clazz, Long id)
	{
		IEntity ret = (IEntity)DB.find(clazz, id);
		return ret;
	}//function
	
	
	public static List<IEntity> listOfOne(IEntity ent)
	{
		List<IEntity> Ret = new ArrayList<IEntity>();
		Ret.add(ent);
		return Ret;
	}//function

	public static List<? extends IEntity> getList(Query<? extends IEntity> query)
	{
		List<? extends IEntity> Ret = query.findList();
		System.out.println(query.getGeneratedSql());
		return Ret;
	}//function
	
	public static Query<? extends IEntity> query(Class<? extends IEntity> clazz)
	{
		Query<? extends IEntity> Ret = DB.find(clazz);
		return Ret;
	}//function
	
	public static boolean update(IEntity ent)
	{
		boolean Ret = true;
		
		try {
			DB.update(ent);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return Ret;
	}//function

	public static boolean insert(IEntity ent)
	{
		boolean Ret = true;
		
		try {
			DB.insert(ent);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return Ret;
	}//function
}//class
