
	//Generated 02/07/2014 16:44:39
	package models;

	import java.util.*;
	import javax.persistence.*;
	import app.*;
	import org.apache.commons.validator.routines.DateValidator;

	@Entity
	@Table(name="configuration.auth_type_params")
	public class AuthTypeParam implements app.IEntity
	{

	private static final long serialVersionUID = 2L;
	static final String ident = "auth_type_param";
	static final String type = "AuthTypeParam";
	public String getIdent() {return ident;}
	public String getType() {return type;}
	public String getFullInfo() {String s = toString(); s = (s != null) ? s : Const.NEW; return String.format("%s: %s ", type, s);}
	public static String takeIdent() {return ident;}
	public static String takeType() {return type;}
	
	//public static final String ref = "auth_type_param_id";

	//mapping database fields to entity parameters
	public static Map<String, String> DbE = new HashMap<String, String>();

	static {
	//fill DbE
	
		DbE.put("auth_type_param_id", "id");
	
		DbE.put("code", "code");
	
		DbE.put("value", "value");
	
		DbE.put("auth_type_id", "auth_type_id");
	
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
	
		value = Utils.getFirst(values.get("auth_type_id"));
		
		if (value != null)
		{
		
				Long ent_id = Long.parseLong(value);
				IEntity ent = this.getAuth_type_id();
				if (ent == null || ent.getId().equals(ent_id) == false)
				{
					this.setAuth_type_id((AuthType)Finder.get(AuthType.takeIdent(), ent_id));
				}//if
			
		}//if
	
	}//function

	//id =====================
	
	@Id
	@Column(name="auth_type_param_id")
		
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="auth_type_params_auth_type_param_id_seq")
	@SequenceGenerator(name="auth_type_params_auth_type_param_id_seq", sequenceName="configuration.auth_type_params_auth_type_param_id_seq")
		
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
			@JoinColumn(name="auth_type_id")
			
			private AuthType auth_type_id;
			public AuthType getAuth_type_id() {return auth_type_id;} //getter
			public void setAuth_type_id(AuthType arg_value) {auth_type_id = arg_value;} //setter
			
	//fields =====================

}//class

