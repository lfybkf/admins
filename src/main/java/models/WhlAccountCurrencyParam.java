
	//Generated 02/07/2014 16:44:38
	package models;

	import java.util.*;
	import javax.persistence.*;
	import app.*;
	import org.apache.commons.validator.routines.DateValidator;

	@Entity
	@Table(name="configuration.whl_account_currency_params")
	public class WhlAccountCurrencyParam implements app.IEntity
	{

	private static final long serialVersionUID = 2L;
	static final String ident = "whl_account_currency_param";
	static final String type = "WhlAccountCurrencyParam";
	public String getIdent() {return ident;}
	public String getType() {return type;}
	public String getFullInfo() {String s = toString(); s = (s != null) ? s : Const.NEW; return String.format("%s: %s ", type, s);}
	public static String takeIdent() {return ident;}
	public static String takeType() {return type;}
	
	//public static final String ref = "whl_account_currency_param_id";

	//mapping database fields to entity parameters
	public static Map<String, String> DbE = new HashMap<String, String>();

	static {
	//fill DbE
	
		DbE.put("whl_account_currency_param_id", "id");
	
		DbE.put("code", "code");
	
		DbE.put("currency_code", "currency_code");
	
		DbE.put("value", "value");
	
		DbE.put("whl_account_id", "whl_account_id");
	
		DbE.put("user_group_id", "user_group_id");
	
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

		
				Ret = getCode() + " " + getCurrency_code();
			
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
	
		value = Utils.getFirst(values.get("currency_code"));
		
		if (value != null)
		{
		
				this.setCurrency_code(value);
			
		}//if
	
		value = Utils.getFirst(values.get("value"));
		
		if (value != null)
		{
		
				this.setValue(value);
			
		}//if
	
		value = Utils.getFirst(values.get("whl_account_id"));
		
		if (value != null)
		{
		
				Long ent_id = Long.parseLong(value);
				IEntity ent = this.getWhl_account_id();
				if (ent == null || ent.getId().equals(ent_id) == false)
				{
					this.setWhl_account_id((WhlAccount)Finder.get(WhlAccount.takeIdent(), ent_id));
				}//if
			
		}//if
	
		value = Utils.getFirst(values.get("user_group_id"));
		
		if (value != null)
		{
		
				Long ent_id = Long.parseLong(value);
				IEntity ent = this.getUser_group_id();
				if (ent == null || ent.getId().equals(ent_id) == false)
				{
					this.setUser_group_id((UserGroup)Finder.get(UserGroup.takeIdent(), ent_id));
				}//if
			
		}//if
	
	}//function

	//id =====================
	
	@Id
	@Column(name="whl_account_currency_param_id")
		
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="whl_account_currency_params_whl_account_currency_param_id_seq")
	@SequenceGenerator(name="whl_account_currency_params_whl_account_currency_param_id_seq", sequenceName="configuration.whl_account_currency_params_whl_account_currency_param_id_seq")
		
	private Long id=0L;
	public Long getId() {return id;}
	public void setId(Long aid) {id = aid;}
	
	//id =====================

	//fields =====================
	
			private String code;
			public String getCode() {return code;} //getter
			public void setCode(String arg_value) {code = arg_value;} //setter
			
			private String currency_code;
			public String getCurrency_code() {return currency_code;} //getter
			public void setCurrency_code(String arg_value) {currency_code = arg_value;} //setter
			
			private String value;
			public String getValue() {return value;} //getter
			public void setValue(String arg_value) {value = arg_value;} //setter
			
			@ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="whl_account_id")
			
			private WhlAccount whl_account_id;
			public WhlAccount getWhl_account_id() {return whl_account_id;} //getter
			public void setWhl_account_id(WhlAccount arg_value) {whl_account_id = arg_value;} //setter
			
			@ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="user_group_id")
			
			private UserGroup user_group_id;
			public UserGroup getUser_group_id() {return user_group_id;} //getter
			public void setUser_group_id(UserGroup arg_value) {user_group_id = arg_value;} //setter
			
	//fields =====================

}//class

