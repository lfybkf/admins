package admins;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.*;
import app.*;

import org.junit.Test;

import com.avaje.ebean.Ebean;  
import com.avaje.ebean.FetchConfig;
import com.avaje.ebean.Query;
import com.avaje.ebean.RawSql;
import com.avaje.ebean.SqlRow;
import com.avaje.ebean.config.AutofetchConfig;

public class DB 
{

	@Test
	public void testConnection() 
	{
		String sql = "select count(*) as count from configuration.casino_accounts";
		SqlRow row = Finder.DB.createSqlQuery(sql).findUnique();

		Integer i = row.getInteger("count");

		assertTrue(i > 1); ;
	}//function
	
	@Test
	public void testFinder() 
	{
		IEntity ent = Objestry.create(AuthTypeParam.takeIdent());
		assertTrue("finder didnt find ", ent != null && ent instanceof models.AuthTypeParam);
	}//function

	@Test
	public void testFinder2() 
	{
		//IEntity ent = Finder.get(models.WhlAccount.class, 45L);
		IEntity ent = Finder.get(models.AuthType.class, 2L);
		assertTrue("finder didnt find ", ent != null && ent instanceof models.AuthType);
	}//function

	@Test
	public void testFinderList() 
	{
		Link link = Linkistry.findOnIdent("whl_account_server");
		link.master_id = 1L;
		List<? extends IEntity> list = Link_List.get(link);
		assertTrue("finder didnt get list ", list.size() > 0);
	}//function

	@Test
	public void testFinderList2() 
	{
		IEntity ent_master = null;
		Link link = Linkistry.findOnIdent("provider_all");
		if (link.isStarted() == false)
		{
			ent_master = Finder.get(link.Master, link.master_id);
		}//if
		String s = Utils.toString(ent_master);
		
		boolean bQt = Finder.DB.getAdminAutofetch().isQueryTuning();
		
		assertTrue("finder err", s.length() == 0);
	}//function

	@Test
	public void testFinderEager() 
	{
		String ident="whl_account_currency_param";
		String path = "user_group_id"; 
		Long id = 8421L;
		//IEntity ent = Finder.get(ident, id);
		//WhlAccountCurrencyParam obj = (WhlAccountCurrencyParam)ent; 
		
		Query<WhlAccountCurrencyParam> q = Finder.DB.createQuery(WhlAccountCurrencyParam.class);//  find(WhlAccountCurrencyParam.class, );//.fetch(path, new FetchConfig().query());
		IEntity ent = q.setId(id).fetch(path).findUnique();
		WhlAccountCurrencyParam obj = (WhlAccountCurrencyParam)ent;
		
		//System.out.println("q.getRawSql() ");
		//System.out.println(q.getRawSql().toString());
		String s = obj.getUser_group_id().toString();
		assertNotNull(s);

	}//function
	
	@Test
	public void testMap() 
	{
		Map<String, String[]> map = new HashMap<>();
		map.put("name", new String[] {"BU"});
		map.put("is_valid", new String[] {"on"});
		map.put("create_date", new String[] {"17/01/2014 15:28:57"});
		map.put("component_code", new String[] {"usaroulette"});
		map.put("provider_id", new String[] {"1"});
		map.put("status", new String[] {"A"});
		map.put("component_code", new String[] {"usaroulette"});
		
		IEntity ent = Finder.get(CasinoAccount.takeIdent(), 3L);
		String s1 = ent.toString();
		
		ent.fill(map);
		//Finder.update(ent);
		
		String s2 = ent.toString();
		assertFalse("map err", s1.equals(s2));
	}//function

	@Test
	public void testMapBoolean() 
	{
		Map<String, String[]> map = new HashMap<>();
		map.put("name", new String[] {"BU"});
		map.put("is_valid", new String[] {"on"});
		
		IEntity ent = Objestry.create(CasinoAccount.takeIdent());
		ent.fill(map);

		CasinoAccount obj = (CasinoAccount)ent;
		assertTrue("map err", obj.isIs_valid() == true && obj.isIs_active() == false);
	}//function
	
	@Test
	public void testInit() 
	{
		Finder.init();
		System.out.println(Finder.DB.toString());
		assertTrue("finder DB not good ", Finder.DB != null);
	}//function
}//class
