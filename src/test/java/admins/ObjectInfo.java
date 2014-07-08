package admins;

import static org.junit.Assert.*;
import models.BetType;

import org.junit.Test;

import app.ObjectUrl;
import app.Objestry;

public class ObjectInfo {

	@Test
	public void testUrlParse() 
	{
		app.ObjectUrl obj = app.ObjectUrl.CreateFromUrl("/casino_account/414/edit"); 
		assertNull(obj.error, obj.error);
	}//function

	@Test
	public void testUrlCreate() 
	{
		String url = BetType.takeUrlCreate(); 
		assertEquals(url, "/objects/bet_type/0/create");
	}//function
	
	@Test
	public void testObjestry() 
	{
		String s = Objestry.getSimple("casino_account");
		assertEquals("class found", "CasinoAccount", s);
	}//function
}//class
