
	//Generated 02/07/2014 16:44:38
	package models;

	import java.util.*;
	import javax.persistence.*;
	import app.*;
	import org.apache.commons.validator.routines.DateValidator;

	@Entity
	@Table(name="configuration.casino_accounts")
	public class CasinoAccount implements app.IEntity
	{

	private static final long serialVersionUID = 2L;
	static final String ident = "casino_account";
	static final String type = "CasinoAccount";
	public String getIdent() {return ident;}
	public String getType() {return type;}
	public String getFullInfo() {String s = toString(); s = (s != null) ? s : Const.NEW; return String.format("%s: %s ", type, s);}
	public static String takeIdent() {return ident;}
	public static String takeType() {return type;}
	
	//public static final String ref = "casino_account_id";

	//mapping database fields to entity parameters
	public static Map<String, String> DbE = new HashMap<String, String>();

	static {
	//fill DbE
	
		DbE.put("casino_account_id", "id");
	
		DbE.put("name", "name");
	
		DbE.put("integration_code", "integration_code");
	
		DbE.put("component_code", "component_code");
	
		DbE.put("status", "status");
	
		DbE.put("is_valid", "is_valid");
	
		DbE.put("is_active", "is_active");
	
		DbE.put("create_date", "create_date");
	
		DbE.put("provider_id", "provider_id");
	
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
			
		return Ret;
	}//method

	@Override
	public void fillDefaults()
	{
		
			this.create_date = new Date();
		
	}//function

	public void fill(Map<String, String[]> values)
	{
	String value;
	
		value = Utils.getFirst(values.get("name"));
		
		if (value != null)
		{
		
				this.setName(value);
			
		}//if
	
		value = Utils.getFirst(values.get("integration_code"));
		
		if (value != null)
		{
		
				this.setIntegration_code(value);
			
		}//if
	
		value = Utils.getFirst(values.get("component_code"));
		
		if (value != null)
		{
		
				this.setComponent_code(value);
			
		}//if
	
		value = Utils.getFirst(values.get("status"));
		
		if (value != null)
		{
		
				this.setStatus(value);
			
		}//if
	
		value = Utils.getFirst(values.get("is_valid"));
		
			this.setIs_valid((value != null));
		
		if (value != null)
		{
		
				;//this.setIs_valid(Boolean.parseBoolean(value));
			
		}//if
	
		value = Utils.getFirst(values.get("is_active"));
		
			this.setIs_active((value != null));
		
		if (value != null)
		{
		
				;//this.setIs_active(Boolean.parseBoolean(value));
			
		}//if
	
		value = Utils.getFirst(values.get("create_date"));
		
		if (value != null)
		{
		
				this.setCreate_date(DateValidator.getInstance().validate(value, Const.FMT_DATE_FULL));
			
		}//if
	
		value = Utils.getFirst(values.get("provider_id"));
		
		if (value != null)
		{
		
				Long ent_id = Long.parseLong(value);
				IEntity ent = this.getProvider_id();
				if (ent == null || ent.getId().equals(ent_id) == false)
				{
					this.setProvider_id((Provider)Finder.get(Provider.takeIdent(), ent_id));
				}//if
			
		}//if
	
	}//function

	//id =====================
	
	@Id
	@Column(name="casino_account_id")
		
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="casino_accounts_casino_account_id_seq")
	@SequenceGenerator(name="casino_accounts_casino_account_id_seq", sequenceName="configuration.casino_accounts_casino_account_id_seq")
		
	private Long id=0L;
	public Long getId() {return id;}
	public void setId(Long aid) {id = aid;}
	
	//id =====================

	//fields =====================
	
			private String name;
			public String getName() {return name;} //getter
			public void setName(String arg_value) {name = arg_value;} //setter
			
			private String integration_code;
			public String getIntegration_code() {return integration_code;} //getter
			public void setIntegration_code(String arg_value) {integration_code = arg_value;} //setter
			
			private String component_code;
			public String getComponent_code() {return component_code;} //getter
			public void setComponent_code(String arg_value) {component_code = arg_value;} //setter
			
			private String status;
			public String getStatus() {return status;} //getter
			public void setStatus(String arg_value) {status = arg_value;} //setter
			
			private boolean is_valid;
			public boolean getIs_valid() {return is_valid;} //getter
			public void setIs_valid(boolean arg_value) {is_valid = arg_value;} //setter
			
				public boolean isIs_valid() {return is_valid;} //getter is
			
			private boolean is_active;
			public boolean getIs_active() {return is_active;} //getter
			public void setIs_active(boolean arg_value) {is_active = arg_value;} //setter
			
				public boolean isIs_active() {return is_active;} //getter is
			
			private Date create_date;
			public Date getCreate_date() {return create_date;} //getter
			public void setCreate_date(Date arg_value) {create_date = arg_value;} //setter
			
			@ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="provider_id")
			
			private Provider provider_id;
			public Provider getProvider_id() {return provider_id;} //getter
			public void setProvider_id(Provider arg_value) {provider_id = arg_value;} //setter
			
	//fields =====================

}//class

