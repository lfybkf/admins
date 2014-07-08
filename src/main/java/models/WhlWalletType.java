
	//Generated 02/07/2014 16:44:39
	package models;

	import java.util.*;
	import javax.persistence.*;
	import app.*;
	import org.apache.commons.validator.routines.DateValidator;

	@Entity
	@Table(name="configuration.whl_wallet_types")
	public class WhlWalletType implements app.IEntity
	{

	private static final long serialVersionUID = 2L;
	static final String ident = "whl_wallet_type";
	static final String type = "WhlWalletType";
	public String getIdent() {return ident;}
	public String getType() {return type;}
	public String getFullInfo() {String s = toString(); s = (s != null) ? s : Const.NEW; return String.format("%s: %s ", type, s);}
	public static String takeIdent() {return ident;}
	public static String takeType() {return type;}
	
	//public static final String ref = "whl_wallet_type_id";

	//mapping database fields to entity parameters
	public static Map<String, String> DbE = new HashMap<String, String>();

	static {
	//fill DbE
	
		DbE.put("whl_wallet_type_id", "id");
	
		DbE.put("wallet_type_id", "wallet_type_id");
	
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

		
				WhiteLabel ref = getWhl_id();
				String s = ref != null ? ref.getName() : "";
				Ret = getWallet_type_id().getCode() + " (" + s + ")";
			
		return Ret;
	}//method

	@Override
	public void fillDefaults()
	{
		
	}//function

	public void fill(Map<String, String[]> values)
	{
	String value;
	
		value = Utils.getFirst(values.get("wallet_type_id"));
		
		if (value != null)
		{
		
				Long ent_id = Long.parseLong(value);
				IEntity ent = this.getWallet_type_id();
				if (ent == null || ent.getId().equals(ent_id) == false)
				{
					this.setWallet_type_id((WalletType)Finder.get(WalletType.takeIdent(), ent_id));
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
	@Column(name="whl_wallet_type_id")
		
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="whl_wallet_types_whl_wallet_type_id_seq")
	@SequenceGenerator(name="whl_wallet_types_whl_wallet_type_id_seq", sequenceName="configuration.whl_wallet_types_whl_wallet_type_id_seq")
		
	private Long id=0L;
	public Long getId() {return id;}
	public void setId(Long aid) {id = aid;}
	
	//id =====================

	//fields =====================
	
			@ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="wallet_type_id")
			
			private WalletType wallet_type_id;
			public WalletType getWallet_type_id() {return wallet_type_id;} //getter
			public void setWallet_type_id(WalletType arg_value) {wallet_type_id = arg_value;} //setter
			
			@ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="whl_id")
			
			private WhiteLabel whl_id;
			public WhiteLabel getWhl_id() {return whl_id;} //getter
			public void setWhl_id(WhiteLabel arg_value) {whl_id = arg_value;} //setter
			
	//fields =====================

}//class

