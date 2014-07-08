
	//Generated 02/07/2014 16:44:39
	package models;

	import java.util.*;
	import javax.persistence.*;
	import app.*;
	import org.apache.commons.validator.routines.DateValidator;

	@Entity
	@Table(name="configuration.whl_category_params")
	public class WhlCategoryParam implements app.IEntity
	{

	private static final long serialVersionUID = 2L;
	static final String ident = "whl_category_param";
	static final String type = "WhlCategoryParam";
	public String getIdent() {return ident;}
	public String getType() {return type;}
	public String getFullInfo() {String s = toString(); s = (s != null) ? s : Const.NEW; return String.format("%s: %s ", type, s);}
	public static String takeIdent() {return ident;}
	public static String takeType() {return type;}
	
	//public static final String ref = "whl_category_param_id";

	//mapping database fields to entity parameters
	public static Map<String, String> DbE = new HashMap<String, String>();

	static {
	//fill DbE
	
		DbE.put("whl_category_param_id", "id");
	
		DbE.put("code", "code");
	
		DbE.put("value", "value");
	
		DbE.put("whl_category_id", "whl_category_id");
	
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
	
		value = Utils.getFirst(values.get("value"));
		
		if (value != null)
		{
		
				this.setValue(value);
			
		}//if
	
		value = Utils.getFirst(values.get("whl_category_id"));
		
		if (value != null)
		{
		
				Long ent_id = Long.parseLong(value);
				IEntity ent = this.getWhl_category_id();
				if (ent == null || ent.getId().equals(ent_id) == false)
				{
					this.setWhl_category_id((WhlCategory)Finder.get(WhlCategory.takeIdent(), ent_id));
				}//if
			
		}//if
	
	}//function

	//id =====================
	
	@Id
	@Column(name="whl_category_param_id")
		
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="whl_category_params_whl_category_param_id_seq")
	@SequenceGenerator(name="whl_category_params_whl_category_param_id_seq", sequenceName="configuration.whl_category_params_whl_category_param_id_seq")
		
	private Long id=0L;
	public Long getId() {return id;}
	public void setId(Long aid) {id = aid;}
	
	//id =====================

	//fields =====================
	
			private String code;
			public String getCode() {return code;} //getter
			public void setCode(String arg_value) {code = arg_value;} //setter
			
			private String value;
			public String getValue() {return value;} //getter
			public void setValue(String arg_value) {value = arg_value;} //setter
			
			@ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="whl_category_id")
			
			private WhlCategory whl_category_id;
			public WhlCategory getWhl_category_id() {return whl_category_id;} //getter
			public void setWhl_category_id(WhlCategory arg_value) {whl_category_id = arg_value;} //setter
			
	//fields =====================

}//class

