
	//GENERATED 08/07/2014 11:30:59
	package app;

	import models.*;

public class Linkistry_Fill
{
	public static void justDoIt()
	{
	if (Linkistry.hasContent())
	return;

	Link item;

	
	item = new Link();
	item.Child = AuthType.takeIdent();
	item.Name = "all";
	
	Linkistry.add(item);

	item = new Link();
	item.Child = AuthType.takeIdent();
	item.Name = "whl";
	item.Master = WhiteLabel.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = AuthTypeParam.takeIdent();
	item.Name = "auth_type";
	item.Master = AuthType.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = BetType.takeIdent();
	item.Name = "casino_account";
	item.Master = CasinoAccount.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = CasinoAccount.takeIdent();
	item.Name = "all";
	
	Linkistry.add(item);

	item = new Link();
	item.Child = CasinoAccount.takeIdent();
	item.Name = "provider";
	item.Master = Provider.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = CurrencyParam.takeIdent();
	item.Name = "casino_account";
	item.Master = CasinoAccount.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = CurrencyParam.takeIdent();
	item.Name = "same_code";
	item.Master = CurrencyParam.takeIdent();item.Label = "same code";
	Linkistry.add(item);

	item = new Link();
	item.Child = EventType.takeIdent();
	item.Name = "casino_account";
	item.Master = CasinoAccount.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = LangParam.takeIdent();
	item.Name = "casino_account";
	item.Master = CasinoAccount.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = Param.takeIdent();
	item.Name = "casino_account";
	item.Master = CasinoAccount.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = Provider.takeIdent();
	item.Name = "all";
	
	Linkistry.add(item);

	item = new Link();
	item.Child = Server.takeIdent();
	item.Name = "all";
	
	Linkistry.add(item);

	item = new Link();
	item.Child = Server.takeIdent();
	item.Name = "whl_account";
	item.Master = WhlAccount.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = UserGroup.takeIdent();
	item.Name = "whl";
	item.Master = WhiteLabel.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = UserGroup.takeIdent();
	item.Name = "whl_account";
	item.Master = WhlAccount.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WalletType.takeIdent();
	item.Name = "all";
	
	Linkistry.add(item);

	item = new Link();
	item.Child = WhiteLabel.takeIdent();
	item.Name = "all";
	
	Linkistry.add(item);

	item = new Link();
	item.Child = WhiteLabel.takeIdent();
	item.Name = "auth_type";
	item.Master = AuthType.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlAccount.takeIdent();
	item.Name = "all";
	
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlAccount.takeIdent();
	item.Name = "casino_account";
	item.Master = CasinoAccount.takeIdent();item.Label = "samples of";
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlAccount.takeIdent();
	item.Name = "whl";
	item.Master = WhiteLabel.takeIdent();item.Label = "registered here";
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlAccount.takeIdent();
	item.Name = "server";
	item.Master = Server.takeIdent();item.Label = "on this server";
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlAccount.takeIdent();
	item.Name = "whl_category";
	item.Master = WhlCategory.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlAccountCurrencyParam.takeIdent();
	item.Name = "whl_account";
	item.Master = WhlAccount.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlAccountCurrencyParam.takeIdent();
	item.Name = "user_group";
	item.Master = UserGroup.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlAccountCurrencyParam.takeIdent();
	item.Name = "same_code";
	item.Master = CurrencyParam.takeIdent();item.Label = "same code";
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlAccountLangParam.takeIdent();
	item.Name = "whl_account";
	item.Master = WhlAccount.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlAccountParam.takeIdent();
	item.Name = "whl_account";
	item.Master = WhlAccount.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlCategory.takeIdent();
	item.Name = "whl";
	item.Master = WhiteLabel.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlCategoryLangParam.takeIdent();
	item.Name = "whl_category";
	item.Master = WhlCategory.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlCategoryParam.takeIdent();
	item.Name = "whl_category";
	item.Master = WhlCategory.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlCurrency.takeIdent();
	item.Name = "whl";
	item.Master = WhiteLabel.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlWalletType.takeIdent();
	item.Name = "whl";
	item.Master = WhiteLabel.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlWalletType.takeIdent();
	item.Name = "wallet_type";
	item.Master = WalletType.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlWalletTypeParam.takeIdent();
	item.Name = "all";
	
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlWalletTypeParam.takeIdent();
	item.Name = "whl_wallet_type";
	item.Master = WhlWalletType.takeIdent();
	Linkistry.add(item);

	item = new Link();
	item.Child = WhlWalletTypeParam.takeIdent();
	item.Name = "whl";
	item.Master = WhiteLabel.takeIdent();
	Linkistry.add(item);

	}//function
}//class
//GENERATED 08/07/2014 11:30:59