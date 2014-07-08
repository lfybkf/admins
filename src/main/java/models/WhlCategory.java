
	//Generated 02/07/2014 16:44:39
	package models;

	import java.util.*;
	import javax.persistence.*;
	import app.*;
	import org.apache.commons.validator.routines.DateValidator;

	@Entity
	@Table(name="configuration.whl_categories")
	public class WhlCategory implements app.IEntity
	{

	private static final long serialVersionUID = 2L;
	static final String ident = "whl_category";
	static final String type = "WhlCategory";
	public String getIdent() {return ident;}
	public String getType() {return type;}
	public String getFullInfo() {String s = toString(); s = (s != null) ? s : Const.NEW; return String.format("%s: %s ", type, s);}
	public static String takeIdent() {return ident;}
	public static String takeType() {return type;}
	
	//public static final String ref = "whl_category_id";

	//mapping database fields to entity parameters
	public static Map<String, String> DbE = new HashMap<String, String>();

	static {
	//fill DbE
	
		DbE.put("whl_category_id", "id");
	
		DbE.put("code", "code");
	
		DbE.put("name", "name");
	
		DbE.put("component_code", "component_code");
	
		DbE.put("whl_category_id_parent", "whl_category_id_parent");
	
		DbE.put("whl_id", "whl_id");
	
	}//static


	@Override
	public String getUrlEdit()
	{
		return app.ObjectUrl.takeUrlEdit(getIdent(), id);
	}//method

	public static String takeUrlCreate()
	{
	return app.ObjectUrl.takeUrlCreate(takeIdent(), 0L);
	}//method

	@Override
	public String toString()
	{
		String Ret = super.toString();

		
				Ret = getName();
				if (Ret == null || Ret.length() == 0)
					Ret = getCode();
			
		return Ret;
	}//method

	@Override
	public void fillDefaults()
	{
		
	}//function

	public void fill(Map<String, String[]> values)
	{
	String value;
	
		value = Utils.getFirst(values.get("code"));
		
		if (value != null)
		{
		
				this.setCode(value);
			
		}//if
	
		value = Utils.getFirst(values.get("name"));
		
		if (value != null)
		{
		
				this.setName(value);
			
		}//if
	
		value = Utils.getFirst(values.get("component_code"));
		
		if (value != null)
		{
		
				this.setComponent_code(value);
			
		}//if
	
		value = Utils.getFirst(values.get("whl_category_id_parent"));
		
		if (value != null)
		{
		
				Long ent_id = Long.parseLong(value);
				IEntity ent = this.getWhl_category_id_parent();
				if (ent == null || ent.getId().equals(ent_id) == false)
				{
					this.setWhl_category_id_parent((WhlCategory)Finder.get(WhlCategory.takeIdent(), ent_id));
				}//if
			
		}//if
	
		value = Utils.getFirst(values.get("whl_id"));
		
		if (value != null)
		{
		
				Long ent_id = Long.parseLong(value);
				IEntity ent = this.getWhl_id();
				if (ent == null || ent.getId().equals(ent_id) == false)
				{
					this.setWhl_id((WhiteLabel)Finder.get(WhiteLabel.takeIdent(), ent_id));
				}//if
			
		}//if
	
	}//function

	//id =====================
	
	@Id
	@Column(name="whl_category_id")
		
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="whl_categories_whl_category_id_seq")
	@SequenceGenerator(name="whl_categories_whl_category_id_seq", sequenceName="configuration.whl_categories_whl_category_id_seq")
		
	private Long id=0L;
	public Long getId() {return id;}
	public void setId(Long aid) {id = aid;}
	
	//id =====================

	//fields =====================
	
			private String code;
			public String getCode() {return code;} //getter
			public void setCode(String arg_value) {code = arg_value;} //setter
			
			private String name;
			public String getName() {return name;} //getter
			public void setName(String arg_value) {name = arg_value;} //setter
			
			private String component_code;
			public String getComponent_code() {return component_code;} //getter
			public void setComponent_code(String arg_value) {component_code = arg_value;} //setter
			
			@ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="whl_category_id_parent")
			
			private WhlCategory whl_category_id_parent;
			public WhlCategory getWhl_category_id_parent() {return whl_category_id_parent;} //getter
			public void setWhl_category_id_parent(WhlCategory arg_value) {whl_category_id_parent = arg_value;} //setter
			
			@ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="whl_id")
			
			private WhiteLabel whl_id;
			public WhiteLabel getWhl_id() {return whl_id;} //getter
			public void setWhl_id(WhiteLabel arg_value) {whl_id = arg_value;} //setter
			
	//fields =====================

}//class

