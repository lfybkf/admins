
	//GENERATED 08/07/2014 11:30:59
	package app;

	import java.util.*;
	import java.text.*;
	import models.*;
	import com.avaje.ebean.*;

public class Link_List
{

	public static List<? extends IEntity> get(Link link)
	{
Long master_id = link.master_id;
String Child = link.Child;
String Name = link.Name;
if (false)
	;

//=========AuthType BEGIN
else if (Child.equals(AuthType.takeIdent()))
{
List<AuthType> Ret = null;
if (false)
	;

else if (Name.equals("all"))
{
	
Query<AuthType> query = Finder.DB.find(AuthType.class)
		.orderBy("name");
Ret = query.findList();
	
}//if
	
else if (Name.equals("whl"))
{
	
String prefix = "z.";
String sql = MessageFormat.format("SELECT {0} FROM configuration.auth_types z JOIN configuration.whl_auth_types sw ON sw.auth_type_id = z.auth_type_id WHERE sw.whl_id = :master_id ORDER BY z.name ", Utils.DbFields(AuthType.DbE, prefix, ", "));
RawSqlBuilder rsb = RawSqlBuilder.parse(sql);
rsb = Utils.MapColumns(AuthType.DbE, rsb, prefix);
RawSql rawSql = rsb.create();
Query<AuthType> query = Finder.DB.find(AuthType.class).setRawSql(rawSql);
query.setParameter("master_id", master_id);
Ret = query.findList();
	//Logger.info(sql);
	
}//if
	
return Ret;
}//if
//=========AuthType END
	
//=========AuthTypeParam BEGIN
else if (Child.equals(AuthTypeParam.takeIdent()))
{
List<AuthTypeParam> Ret = null;
if (false)
	;

else if (Name.equals("auth_type"))
{
	
Query<AuthTypeParam> query = Finder.DB.find(AuthTypeParam.class).fetch("auth_type_id")
	.where().eq("auth_type_id.id", master_id )
		.orderBy("code");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========AuthTypeParam END
	
//=========BetType BEGIN
else if (Child.equals(BetType.takeIdent()))
{
List<BetType> Ret = null;
if (false)
	;

else if (Name.equals("casino_account"))
{
	
Query<BetType> query = Finder.DB.find(BetType.class).fetch("casino_account_id")
	.where().eq("casino_account_id.id", master_id )
		.orderBy("code");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========BetType END
	
//=========CasinoAccount BEGIN
else if (Child.equals(CasinoAccount.takeIdent()))
{
List<CasinoAccount> Ret = null;
if (false)
	;

else if (Name.equals("all"))
{
	
Query<CasinoAccount> query = Finder.DB.find(CasinoAccount.class).fetch("provider_id")
		.orderBy("name");
Ret = query.findList();
	
}//if
	
else if (Name.equals("provider"))
{
	
Query<CasinoAccount> query = Finder.DB.find(CasinoAccount.class).fetch("provider_id")
	.where().eq("provider_id.id", master_id )
		.orderBy("name");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========CasinoAccount END
	
//=========CurrencyParam BEGIN
else if (Child.equals(CurrencyParam.takeIdent()))
{
List<CurrencyParam> Ret = null;
if (false)
	;

else if (Name.equals("casino_account"))
{
	
Query<CurrencyParam> query = Finder.DB.find(CurrencyParam.class).fetch("casino_account_id")
	.where().eq("casino_account_id.id", master_id )
		.orderBy("code, currency_code");
Ret = query.findList();
	
}//if
	
else if (Name.equals("same_code"))
{
	
String prefix = "z.";
String sql = MessageFormat.format("SELECT {0} FROM configuration.currency_params z WHERE code = (SELECT code FROM configuration.currency_params WHERE currency_param_id = :master_id) ", Utils.DbFields(CurrencyParam.DbE, prefix, ", "));
RawSqlBuilder rsb = RawSqlBuilder.parse(sql);
rsb = Utils.MapColumns(CurrencyParam.DbE, rsb, prefix);
RawSql rawSql = rsb.create();
Query<CurrencyParam> query = Finder.DB.find(CurrencyParam.class).fetch("casino_account_id", new FetchConfig().query()).setRawSql(rawSql);
query.setParameter("master_id", master_id);
Ret = query.findList();
	//Logger.info(sql);
	
}//if
	
return Ret;
}//if
//=========CurrencyParam END
	
//=========EventType BEGIN
else if (Child.equals(EventType.takeIdent()))
{
List<EventType> Ret = null;
if (false)
	;

else if (Name.equals("casino_account"))
{
	
Query<EventType> query = Finder.DB.find(EventType.class).fetch("casino_account_id")
	.where().eq("casino_account_id.id", master_id )
		.orderBy("code");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========EventType END
	
//=========LangParam BEGIN
else if (Child.equals(LangParam.takeIdent()))
{
List<LangParam> Ret = null;
if (false)
	;

else if (Name.equals("casino_account"))
{
	
Query<LangParam> query = Finder.DB.find(LangParam.class).fetch("casino_account_id")
	.where().eq("casino_account_id.id", master_id )
		.orderBy("code, lang");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========LangParam END
	
//=========Param BEGIN
else if (Child.equals(Param.takeIdent()))
{
List<Param> Ret = null;
if (false)
	;

else if (Name.equals("casino_account"))
{
	
Query<Param> query = Finder.DB.find(Param.class).fetch("casino_account_id")
	.where().eq("casino_account_id.id", master_id )
		.orderBy("code");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========Param END
	
//=========Provider BEGIN
else if (Child.equals(Provider.takeIdent()))
{
List<Provider> Ret = null;
if (false)
	;

else if (Name.equals("all"))
{
	
Query<Provider> query = Finder.DB.find(Provider.class)
		.orderBy("name");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========Provider END
	
//=========Server BEGIN
else if (Child.equals(Server.takeIdent()))
{
List<Server> Ret = null;
if (false)
	;

else if (Name.equals("all"))
{
	
Query<Server> query = Finder.DB.find(Server.class)
		.orderBy("name");
Ret = query.findList();
	
}//if
	
else if (Name.equals("whl_account"))
{
	
String prefix = "z.";
String sql = MessageFormat.format("SELECT {0} FROM configuration.servers z JOIN configuration.server_whl_accounts sw ON sw.server_id = z.server_id WHERE sw.whl_account_id = :master_id ORDER BY z.name ", Utils.DbFields(Server.DbE, prefix, ", "));
RawSqlBuilder rsb = RawSqlBuilder.parse(sql);
rsb = Utils.MapColumns(Server.DbE, rsb, prefix);
RawSql rawSql = rsb.create();
Query<Server> query = Finder.DB.find(Server.class).setRawSql(rawSql);
query.setParameter("master_id", master_id);
Ret = query.findList();
	//Logger.info(sql);
	
}//if
	
return Ret;
}//if
//=========Server END
	
//=========UserGroup BEGIN
else if (Child.equals(UserGroup.takeIdent()))
{
List<UserGroup> Ret = null;
if (false)
	;

else if (Name.equals("whl"))
{
	
Query<UserGroup> query = Finder.DB.find(UserGroup.class).fetch("whl_id")
	.where().eq("whl_id.id", master_id )
		.orderBy("name");
Ret = query.findList();
	
}//if
	
else if (Name.equals("whl_account"))
{
	
String prefix = "z.";
String sql = MessageFormat.format("SELECT {0} FROM configuration.user_groups z JOIN configuration.whl_account_groups ln ON ln.user_group_id = z.user_group_id WHERE ln.whl_account_id = :master_id ORDER BY z.name  ", Utils.DbFields(UserGroup.DbE, prefix, ", "));
RawSqlBuilder rsb = RawSqlBuilder.parse(sql);
rsb = Utils.MapColumns(UserGroup.DbE, rsb, prefix);
RawSql rawSql = rsb.create();
Query<UserGroup> query = Finder.DB.find(UserGroup.class).fetch("whl_id", new FetchConfig().query()).setRawSql(rawSql);
query.setParameter("master_id", master_id);
Ret = query.findList();
	//Logger.info(sql);
	
}//if
	
return Ret;
}//if
//=========UserGroup END
	
//=========WalletType BEGIN
else if (Child.equals(WalletType.takeIdent()))
{
List<WalletType> Ret = null;
if (false)
	;

else if (Name.equals("all"))
{
	
Query<WalletType> query = Finder.DB.find(WalletType.class)
		.orderBy("name");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========WalletType END
	
//=========WhiteLabel BEGIN
else if (Child.equals(WhiteLabel.takeIdent()))
{
List<WhiteLabel> Ret = null;
if (false)
	;

else if (Name.equals("all"))
{
	
Query<WhiteLabel> query = Finder.DB.find(WhiteLabel.class)
		.orderBy("name");
Ret = query.findList();
	
}//if
	
else if (Name.equals("auth_type"))
{
	
String prefix = "z.";
String sql = MessageFormat.format("SELECT {0} FROM configuration.whitelabels z JOIN configuration.whl_auth_types sw ON sw.whl_id = z.whl_id WHERE sw.auth_type_id = :master_id ORDER BY z.name ", Utils.DbFields(WhiteLabel.DbE, prefix, ", "));
RawSqlBuilder rsb = RawSqlBuilder.parse(sql);
rsb = Utils.MapColumns(WhiteLabel.DbE, rsb, prefix);
RawSql rawSql = rsb.create();
Query<WhiteLabel> query = Finder.DB.find(WhiteLabel.class).setRawSql(rawSql);
query.setParameter("master_id", master_id);
Ret = query.findList();
	//Logger.info(sql);
	
}//if
	
return Ret;
}//if
//=========WhiteLabel END
	
//=========WhlAccount BEGIN
else if (Child.equals(WhlAccount.takeIdent()))
{
List<WhlAccount> Ret = null;
if (false)
	;

else if (Name.equals("all"))
{
	
Query<WhlAccount> query = Finder.DB.find(WhlAccount.class).fetch("whl_id").fetch("casino_account_id")
		.orderBy("name");
Ret = query.findList();
	
}//if
	
else if (Name.equals("casino_account"))
{
	
Query<WhlAccount> query = Finder.DB.find(WhlAccount.class).fetch("whl_id").fetch("casino_account_id")
	.where().eq("casino_account_id.id", master_id )
		.orderBy("name");
Ret = query.findList();
	
}//if
	
else if (Name.equals("server"))
{
	
String prefix = "z.";
String sql = MessageFormat.format("SELECT {0} FROM configuration.whl_accounts z JOIN configuration.server_whl_accounts sw ON sw.whl_account_id = z.whl_account_id WHERE sw.server_id = :master_id ORDER BY z.name ", Utils.DbFields(WhlAccount.DbE, prefix, ", "));
RawSqlBuilder rsb = RawSqlBuilder.parse(sql);
rsb = Utils.MapColumns(WhlAccount.DbE, rsb, prefix);
RawSql rawSql = rsb.create();
Query<WhlAccount> query = Finder.DB.find(WhlAccount.class).fetch("whl_id", new FetchConfig().query()).fetch("casino_account_id", new FetchConfig().query()).setRawSql(rawSql);
query.setParameter("master_id", master_id);
Ret = query.findList();
	//Logger.info(sql);
	
}//if
	
else if (Name.equals("whl"))
{
	
Query<WhlAccount> query = Finder.DB.find(WhlAccount.class).fetch("whl_id").fetch("casino_account_id")
	.where().eq("whl_id.id", master_id )
		.orderBy("name");
Ret = query.findList();
	
}//if
	
else if (Name.equals("whl_category"))
{
	
String prefix = "z.";
String sql = MessageFormat.format("SELECT {0} FROM configuration.whl_accounts z JOIN configuration.whl_category_game ln ON ln.whl_account_id = z.whl_account_id WHERE ln.whl_category_id = :master_id ORDER BY z.name ", Utils.DbFields(WhlAccount.DbE, prefix, ", "));
RawSqlBuilder rsb = RawSqlBuilder.parse(sql);
rsb = Utils.MapColumns(WhlAccount.DbE, rsb, prefix);
RawSql rawSql = rsb.create();
Query<WhlAccount> query = Finder.DB.find(WhlAccount.class).fetch("whl_id", new FetchConfig().query()).fetch("casino_account_id", new FetchConfig().query()).setRawSql(rawSql);
query.setParameter("master_id", master_id);
Ret = query.findList();
	//Logger.info(sql);
	
}//if
	
return Ret;
}//if
//=========WhlAccount END
	
//=========WhlAccountCurrencyParam BEGIN
else if (Child.equals(WhlAccountCurrencyParam.takeIdent()))
{
List<WhlAccountCurrencyParam> Ret = null;
if (false)
	;

else if (Name.equals("same_code"))
{
	
String prefix = "z.";
String sql = MessageFormat.format("SELECT {0} FROM configuration.whl_account_currency_params z WHERE code = (SELECT code FROM configuration.currency_params WHERE currency_param_id = :master_id) ORDER BY z.code, z.currency_code ", Utils.DbFields(WhlAccountCurrencyParam.DbE, prefix, ", "));
RawSqlBuilder rsb = RawSqlBuilder.parse(sql);
rsb = Utils.MapColumns(WhlAccountCurrencyParam.DbE, rsb, prefix);
RawSql rawSql = rsb.create();
Query<WhlAccountCurrencyParam> query = Finder.DB.find(WhlAccountCurrencyParam.class).fetch("whl_account_id", new FetchConfig().query()).fetch("user_group_id", new FetchConfig().query()).setRawSql(rawSql);
query.setParameter("master_id", master_id);
Ret = query.findList();
	//Logger.info(sql);
	
}//if
	
else if (Name.equals("user_group"))
{
	
Query<WhlAccountCurrencyParam> query = Finder.DB.find(WhlAccountCurrencyParam.class).fetch("whl_account_id").fetch("user_group_id")
	.where().eq("user_group_id.id", master_id )
		.orderBy("code, currency_code");
Ret = query.findList();
	
}//if
	
else if (Name.equals("whl_account"))
{
	
Query<WhlAccountCurrencyParam> query = Finder.DB.find(WhlAccountCurrencyParam.class).fetch("whl_account_id").fetch("user_group_id")
	.where().eq("whl_account_id.id", master_id )
		.orderBy("code, currency_code");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========WhlAccountCurrencyParam END
	
//=========WhlAccountLangParam BEGIN
else if (Child.equals(WhlAccountLangParam.takeIdent()))
{
List<WhlAccountLangParam> Ret = null;
if (false)
	;

else if (Name.equals("whl_account"))
{
	
Query<WhlAccountLangParam> query = Finder.DB.find(WhlAccountLangParam.class).fetch("whl_account_id")
	.where().eq("whl_account_id.id", master_id )
		.orderBy("code, lang");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========WhlAccountLangParam END
	
//=========WhlAccountParam BEGIN
else if (Child.equals(WhlAccountParam.takeIdent()))
{
List<WhlAccountParam> Ret = null;
if (false)
	;

else if (Name.equals("whl_account"))
{
	
Query<WhlAccountParam> query = Finder.DB.find(WhlAccountParam.class).fetch("whl_account_id")
	.where().eq("whl_account_id.id", master_id )
		.orderBy("code");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========WhlAccountParam END
	
//=========WhlCategory BEGIN
else if (Child.equals(WhlCategory.takeIdent()))
{
List<WhlCategory> Ret = null;
if (false)
	;

else if (Name.equals("whl"))
{
	
Query<WhlCategory> query = Finder.DB.find(WhlCategory.class).fetch("whl_category_id_parent").fetch("whl_id")
	.where().eq("whl_id.id", master_id )
		.orderBy("code");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========WhlCategory END
	
//=========WhlCategoryLangParam BEGIN
else if (Child.equals(WhlCategoryLangParam.takeIdent()))
{
List<WhlCategoryLangParam> Ret = null;
if (false)
	;

else if (Name.equals("whl_category"))
{
	
Query<WhlCategoryLangParam> query = Finder.DB.find(WhlCategoryLangParam.class).fetch("whl_category_id")
	.where().eq("whl_category_id.id", master_id )
		.orderBy("code, lang");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========WhlCategoryLangParam END
	
//=========WhlCategoryParam BEGIN
else if (Child.equals(WhlCategoryParam.takeIdent()))
{
List<WhlCategoryParam> Ret = null;
if (false)
	;

else if (Name.equals("whl_category"))
{
	
Query<WhlCategoryParam> query = Finder.DB.find(WhlCategoryParam.class).fetch("whl_category_id")
	.where().eq("whl_category_id.id", master_id )
		.orderBy("code");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========WhlCategoryParam END
	
//=========WhlCurrency BEGIN
else if (Child.equals(WhlCurrency.takeIdent()))
{
List<WhlCurrency> Ret = null;
if (false)
	;

else if (Name.equals("whl"))
{
	
Query<WhlCurrency> query = Finder.DB.find(WhlCurrency.class).fetch("whl_id")
	.where().eq("whl_id.id", master_id )
		.orderBy("currency_code");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========WhlCurrency END
	
//=========WhlWalletType BEGIN
else if (Child.equals(WhlWalletType.takeIdent()))
{
List<WhlWalletType> Ret = null;
if (false)
	;

else if (Name.equals("wallet_type"))
{
	
Query<WhlWalletType> query = Finder.DB.find(WhlWalletType.class).fetch("wallet_type_id").fetch("whl_id")
	.where().eq("wallet_type_id.id", master_id )
		.orderBy("whl_id");
Ret = query.findList();
	
}//if
	
else if (Name.equals("whl"))
{
	
Query<WhlWalletType> query = Finder.DB.find(WhlWalletType.class).fetch("wallet_type_id").fetch("whl_id")
	.where().eq("whl_id.id", master_id )
		.orderBy("whl_id");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========WhlWalletType END
	
//=========WhlWalletTypeParam BEGIN
else if (Child.equals(WhlWalletTypeParam.takeIdent()))
{
List<WhlWalletTypeParam> Ret = null;
if (false)
	;

else if (Name.equals("all"))
{
	
Query<WhlWalletTypeParam> query = Finder.DB.find(WhlWalletTypeParam.class).fetch("whl_wallet_type_id")
		.orderBy("code");
Ret = query.findList();
	
}//if
	
else if (Name.equals("whl"))
{
	
String prefix = "z.";
String sql = MessageFormat.format("SELECT {0} FROM configuration.whl_wallet_type_params z WHERE z.whl_wallet_type_id IN (SELECT whl_wallet_type_id FROM configuration.whl_wallet_types where whl_id = :master_id) order by z.code, z.whl_wallet_type_id ", Utils.DbFields(WhlWalletTypeParam.DbE, prefix, ", "));
RawSqlBuilder rsb = RawSqlBuilder.parse(sql);
rsb = Utils.MapColumns(WhlWalletTypeParam.DbE, rsb, prefix);
RawSql rawSql = rsb.create();
Query<WhlWalletTypeParam> query = Finder.DB.find(WhlWalletTypeParam.class).fetch("whl_wallet_type_id", new FetchConfig().query()).setRawSql(rawSql);
query.setParameter("master_id", master_id);
Ret = query.findList();
	//Logger.info(sql);
	
}//if
	
else if (Name.equals("whl_wallet_type"))
{
	
Query<WhlWalletTypeParam> query = Finder.DB.find(WhlWalletTypeParam.class).fetch("whl_wallet_type_id")
	.where().eq("whl_wallet_type_id.id", master_id )
		.orderBy("code");
Ret = query.findList();
	
}//if
	
return Ret;
}//if
//=========WhlWalletTypeParam END
	

	return null;
	}//method
	}//class
//GENERATED 08/07/2014 11:30:59