
	//Generated 02/07/2014 16:44:38
	package models;

	import java.util.*;
	import javax.persistence.*;
	import app.*;
	import org.apache.commons.validator.routines.DateValidator;

	@Entity
	@Table(name="configuration.user_groups")
	public class UserGroup implements app.IEntity
	{

	private static final long serialVersionUID = 2L;
	static final String ident = "user_group";
	static final String type = "UserGroup";
	public String getIdent() {return ident;}
	public String getType() {return type;}
	public String getFullInfo() {String s = toString(); s = (s != null) ? s : Const.NEW; return String.format("%s: %s ", type, s);}
	public static String takeIdent() {return ident;}
	public static String takeType() {return type;}
	
	//public static final String ref = "user_group_id";

	//mapping database fields to entity parameters
	public static Map<String, String> DbE = new HashMap<String, String>();

	static {
	//fill DbE
	
		DbE.put("user_group_id", "id");
	
		DbE.put("name", "name");
	
		DbE.put("code", "code");
	
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
	
		value = Utils.getFirst(values.get("name"));
		
		if (value != null)
		{
		
				this.setName(value);
			
		}//if
	
		value = Utils.getFirst(values.get("code"));
		
		if (value != null)
		{
		
				this.setCode(value);
			
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
	@Column(name="user_group_id")
		
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_groups_user_group_id_seq")
	@SequenceGenerator(name="user_groups_user_group_id_seq", sequenceName="configuration.user_groups_user_group_id_seq")
		
	private Long id=0L;
	public Long getId() {return id;}
	public void setId(Long aid) {id = aid;}
	
	//id =====================

	//fields =====================
	
			private String name;
			public String getName() {return name;} //getter
			public void setName(String arg_value) {name = arg_value;} //setter
			
			private String code;
			public String getCode() {return code;} //getter
			public void setCode(String arg_value) {code = arg_value;} //setter
			
			@ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="whl_id")
			
			private WhiteLabel whl_id;
			public WhiteLabel getWhl_id() {return whl_id;} //getter
			public void setWhl_id(WhiteLabel arg_value) {whl_id = arg_value;} //setter
			
	//fields =====================

}//class

