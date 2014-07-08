package admins;

import static org.junit.Assert.*;

//import org.junit.Assert;
import org.junit.Test;

import app.*;
import models.*;

public class HtmlTest {

	@Test
	public void testInput() {
		Html input = new Html();
		String s = input.clear().setId("code").setName("code").setClass("input-xxlarge")
		.setValue("QUQU").setReadonly("").buildText();
		assertFalse(s.isEmpty());
	}

	@Test
	public void testSelect() {
		String ident="provider";
		Html input = new Html();
		Link link;
		IEntity ent = Finder.get(ident, 1L);
		
		link = Linkistry.findOnNameAndChild("all", ident);
		
		String s = input.clear().setId(ident + "_id").setClass(Html.CLASS_LARGE).setReadonly("")
		.setEntity(ent).buildSelect(link);
		assertFalse(s.isEmpty());
	}

	@Test
	public void testSelect2() {
		String ident="whl_account_currency_param";
		Html input = new Html();
		Link link;
		IEntity ent = Finder.get(ident, 8421L);
		WhlAccountCurrencyParam obj = (WhlAccountCurrencyParam)ent; 
		
		link = Linkistry.findOnNameAndChild("all", ident);
		
		String s = input.clear().setEntity(obj.getUser_group_id()).buildSelect(link);
		assertFalse(s.isEmpty());
		//assertNotNull(obj.user_group_id.name);
	}
	
	
	@Test
	public void testForm() {
		Html input = new Html();
		String s = input.clear().buildFormOpen(Provider.takeUrlCreate());
		assertFalse(s.isEmpty());
	}
}
