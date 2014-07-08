
	//GENERATED 08/07/2014 11:30:59

	package app;

	import models.*;
	import java.util.Comparator;

public class Link_Order
{
	public static Comparator<IEntity> takeComparator(String ident, String order)
	{
		if (false)
			;
	
		else if (ident.equals(AuthType.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthType == false)
						return 0;
					if (obj2 instanceof AuthType == false)
						return 0;
					
					AuthType ent1 = (AuthType)obj1;
					AuthType ent2 = (AuthType)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthType == false)
						return 0;
					if (obj2 instanceof AuthType == false)
						return 0;
					
					AuthType ent1 = (AuthType)obj1;
					AuthType ent2 = (AuthType)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthType == false)
						return 0;
					if (obj2 instanceof AuthType == false)
						return 0;
					
					AuthType ent1 = (AuthType)obj1;
					AuthType ent2 = (AuthType)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(AuthTypeParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthTypeParam == false)
						return 0;
					if (obj2 instanceof AuthTypeParam == false)
						return 0;
					
					AuthTypeParam ent1 = (AuthTypeParam)obj1;
					AuthTypeParam ent2 = (AuthTypeParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthTypeParam == false)
						return 0;
					if (obj2 instanceof AuthTypeParam == false)
						return 0;
					
					AuthTypeParam ent1 = (AuthTypeParam)obj1;
					AuthTypeParam ent2 = (AuthTypeParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthTypeParam == false)
						return 0;
					if (obj2 instanceof AuthTypeParam == false)
						return 0;
					
					AuthTypeParam ent1 = (AuthTypeParam)obj1;
					AuthTypeParam ent2 = (AuthTypeParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("auth_type_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthTypeParam == false)
						return 0;
					if (obj2 instanceof AuthTypeParam == false)
						return 0;
					
					AuthTypeParam ent1 = (AuthTypeParam)obj1;
					AuthTypeParam ent2 = (AuthTypeParam)obj2;

					
					String s1 = ent1.getAuth_type_id().toString();
					String s2 = ent2.getAuth_type_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(BetType.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof BetType == false)
						return 0;
					if (obj2 instanceof BetType == false)
						return 0;
					
					BetType ent1 = (BetType)obj1;
					BetType ent2 = (BetType)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof BetType == false)
						return 0;
					if (obj2 instanceof BetType == false)
						return 0;
					
					BetType ent1 = (BetType)obj1;
					BetType ent2 = (BetType)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof BetType == false)
						return 0;
					if (obj2 instanceof BetType == false)
						return 0;
					
					BetType ent1 = (BetType)obj1;
					BetType ent2 = (BetType)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("client_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof BetType == false)
						return 0;
					if (obj2 instanceof BetType == false)
						return 0;
					
					BetType ent1 = (BetType)obj1;
					BetType ent2 = (BetType)obj2;

					
					Long v1 = new Long(ent1.getClient_code());
					Long v2 = new Long(ent2.getClient_code());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof BetType == false)
						return 0;
					if (obj2 instanceof BetType == false)
						return 0;
					
					BetType ent1 = (BetType)obj1;
					BetType ent2 = (BetType)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(CasinoAccount.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("integration_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					String s1 = ent1.getIntegration_code();
					String s2 = ent2.getIntegration_code();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("component_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					String s1 = ent1.getComponent_code();
					String s2 = ent2.getComponent_code();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("status"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					String s1 = ent1.getStatus();
					String s2 = ent2.getStatus();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("is_valid"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					Boolean v1 = new Boolean(ent1.getIs_valid());
					Boolean v2 = new Boolean(ent2.getIs_valid());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("is_active"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					Boolean v1 = new Boolean(ent1.getIs_active());
					Boolean v2 = new Boolean(ent2.getIs_active());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("create_date"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					return 0;	
					
					
				}
			};
			}//if
			
			if (order.equals("provider_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					String s1 = ent1.getProvider_id().toString();
					String s2 = ent2.getProvider_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(CurrencyParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CurrencyParam == false)
						return 0;
					if (obj2 instanceof CurrencyParam == false)
						return 0;
					
					CurrencyParam ent1 = (CurrencyParam)obj1;
					CurrencyParam ent2 = (CurrencyParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CurrencyParam == false)
						return 0;
					if (obj2 instanceof CurrencyParam == false)
						return 0;
					
					CurrencyParam ent1 = (CurrencyParam)obj1;
					CurrencyParam ent2 = (CurrencyParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("currency_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CurrencyParam == false)
						return 0;
					if (obj2 instanceof CurrencyParam == false)
						return 0;
					
					CurrencyParam ent1 = (CurrencyParam)obj1;
					CurrencyParam ent2 = (CurrencyParam)obj2;

					
					String s1 = ent1.getCurrency_code();
					String s2 = ent2.getCurrency_code();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CurrencyParam == false)
						return 0;
					if (obj2 instanceof CurrencyParam == false)
						return 0;
					
					CurrencyParam ent1 = (CurrencyParam)obj1;
					CurrencyParam ent2 = (CurrencyParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CurrencyParam == false)
						return 0;
					if (obj2 instanceof CurrencyParam == false)
						return 0;
					
					CurrencyParam ent1 = (CurrencyParam)obj1;
					CurrencyParam ent2 = (CurrencyParam)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(EventType.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof EventType == false)
						return 0;
					if (obj2 instanceof EventType == false)
						return 0;
					
					EventType ent1 = (EventType)obj1;
					EventType ent2 = (EventType)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof EventType == false)
						return 0;
					if (obj2 instanceof EventType == false)
						return 0;
					
					EventType ent1 = (EventType)obj1;
					EventType ent2 = (EventType)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof EventType == false)
						return 0;
					if (obj2 instanceof EventType == false)
						return 0;
					
					EventType ent1 = (EventType)obj1;
					EventType ent2 = (EventType)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(LangParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof LangParam == false)
						return 0;
					if (obj2 instanceof LangParam == false)
						return 0;
					
					LangParam ent1 = (LangParam)obj1;
					LangParam ent2 = (LangParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof LangParam == false)
						return 0;
					if (obj2 instanceof LangParam == false)
						return 0;
					
					LangParam ent1 = (LangParam)obj1;
					LangParam ent2 = (LangParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("lang"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof LangParam == false)
						return 0;
					if (obj2 instanceof LangParam == false)
						return 0;
					
					LangParam ent1 = (LangParam)obj1;
					LangParam ent2 = (LangParam)obj2;

					
					String s1 = ent1.getLang();
					String s2 = ent2.getLang();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof LangParam == false)
						return 0;
					if (obj2 instanceof LangParam == false)
						return 0;
					
					LangParam ent1 = (LangParam)obj1;
					LangParam ent2 = (LangParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof LangParam == false)
						return 0;
					if (obj2 instanceof LangParam == false)
						return 0;
					
					LangParam ent1 = (LangParam)obj1;
					LangParam ent2 = (LangParam)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(Param.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Param == false)
						return 0;
					if (obj2 instanceof Param == false)
						return 0;
					
					Param ent1 = (Param)obj1;
					Param ent2 = (Param)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Param == false)
						return 0;
					if (obj2 instanceof Param == false)
						return 0;
					
					Param ent1 = (Param)obj1;
					Param ent2 = (Param)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Param == false)
						return 0;
					if (obj2 instanceof Param == false)
						return 0;
					
					Param ent1 = (Param)obj1;
					Param ent2 = (Param)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Param == false)
						return 0;
					if (obj2 instanceof Param == false)
						return 0;
					
					Param ent1 = (Param)obj1;
					Param ent2 = (Param)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(Provider.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Provider == false)
						return 0;
					if (obj2 instanceof Provider == false)
						return 0;
					
					Provider ent1 = (Provider)obj1;
					Provider ent2 = (Provider)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Provider == false)
						return 0;
					if (obj2 instanceof Provider == false)
						return 0;
					
					Provider ent1 = (Provider)obj1;
					Provider ent2 = (Provider)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Provider == false)
						return 0;
					if (obj2 instanceof Provider == false)
						return 0;
					
					Provider ent1 = (Provider)obj1;
					Provider ent2 = (Provider)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(Server.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Server == false)
						return 0;
					if (obj2 instanceof Server == false)
						return 0;
					
					Server ent1 = (Server)obj1;
					Server ent2 = (Server)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Server == false)
						return 0;
					if (obj2 instanceof Server == false)
						return 0;
					
					Server ent1 = (Server)obj1;
					Server ent2 = (Server)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Server == false)
						return 0;
					if (obj2 instanceof Server == false)
						return 0;
					
					Server ent1 = (Server)obj1;
					Server ent2 = (Server)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("address"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Server == false)
						return 0;
					if (obj2 instanceof Server == false)
						return 0;
					
					Server ent1 = (Server)obj1;
					Server ent2 = (Server)obj2;

					
					String s1 = ent1.getAddress();
					String s2 = ent2.getAddress();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(UserGroup.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof UserGroup == false)
						return 0;
					if (obj2 instanceof UserGroup == false)
						return 0;
					
					UserGroup ent1 = (UserGroup)obj1;
					UserGroup ent2 = (UserGroup)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof UserGroup == false)
						return 0;
					if (obj2 instanceof UserGroup == false)
						return 0;
					
					UserGroup ent1 = (UserGroup)obj1;
					UserGroup ent2 = (UserGroup)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof UserGroup == false)
						return 0;
					if (obj2 instanceof UserGroup == false)
						return 0;
					
					UserGroup ent1 = (UserGroup)obj1;
					UserGroup ent2 = (UserGroup)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof UserGroup == false)
						return 0;
					if (obj2 instanceof UserGroup == false)
						return 0;
					
					UserGroup ent1 = (UserGroup)obj1;
					UserGroup ent2 = (UserGroup)obj2;

					
					String s1 = ent1.getWhl_id().toString();
					String s2 = ent2.getWhl_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WalletType.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WalletType == false)
						return 0;
					if (obj2 instanceof WalletType == false)
						return 0;
					
					WalletType ent1 = (WalletType)obj1;
					WalletType ent2 = (WalletType)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WalletType == false)
						return 0;
					if (obj2 instanceof WalletType == false)
						return 0;
					
					WalletType ent1 = (WalletType)obj1;
					WalletType ent2 = (WalletType)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WalletType == false)
						return 0;
					if (obj2 instanceof WalletType == false)
						return 0;
					
					WalletType ent1 = (WalletType)obj1;
					WalletType ent2 = (WalletType)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhiteLabel.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhiteLabel == false)
						return 0;
					if (obj2 instanceof WhiteLabel == false)
						return 0;
					
					WhiteLabel ent1 = (WhiteLabel)obj1;
					WhiteLabel ent2 = (WhiteLabel)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhiteLabel == false)
						return 0;
					if (obj2 instanceof WhiteLabel == false)
						return 0;
					
					WhiteLabel ent1 = (WhiteLabel)obj1;
					WhiteLabel ent2 = (WhiteLabel)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhiteLabel == false)
						return 0;
					if (obj2 instanceof WhiteLabel == false)
						return 0;
					
					WhiteLabel ent1 = (WhiteLabel)obj1;
					WhiteLabel ent2 = (WhiteLabel)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("is_blocked"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhiteLabel == false)
						return 0;
					if (obj2 instanceof WhiteLabel == false)
						return 0;
					
					WhiteLabel ent1 = (WhiteLabel)obj1;
					WhiteLabel ent2 = (WhiteLabel)obj2;

					
					Boolean v1 = new Boolean(ent1.getIs_blocked());
					Boolean v2 = new Boolean(ent2.getIs_blocked());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlAccount.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("integration_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getIntegration_code();
					String s2 = ent2.getIntegration_code();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("status"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getStatus();
					String s2 = ent2.getStatus();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("url"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getUrl();
					String s2 = ent2.getUrl();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("description"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getDescription();
					String s2 = ent2.getDescription();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("is_valid"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					Boolean v1 = new Boolean(ent1.getIs_valid());
					Boolean v2 = new Boolean(ent2.getIs_valid());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("is_active"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					Boolean v1 = new Boolean(ent1.getIs_active());
					Boolean v2 = new Boolean(ent2.getIs_active());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("create_date"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					return 0;	
					
					
				}
			};
			}//if
			
			if (order.equals("whl_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getWhl_id().toString();
					String s2 = ent2.getWhl_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlAccountCurrencyParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("currency_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					String s1 = ent1.getCurrency_code();
					String s2 = ent2.getCurrency_code();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					String s1 = ent1.getWhl_account_id().toString();
					String s2 = ent2.getWhl_account_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("user_group_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					String s1 = ent1.getUser_group_id().toString();
					String s2 = ent2.getUser_group_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlAccountLangParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountLangParam == false)
						return 0;
					if (obj2 instanceof WhlAccountLangParam == false)
						return 0;
					
					WhlAccountLangParam ent1 = (WhlAccountLangParam)obj1;
					WhlAccountLangParam ent2 = (WhlAccountLangParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountLangParam == false)
						return 0;
					if (obj2 instanceof WhlAccountLangParam == false)
						return 0;
					
					WhlAccountLangParam ent1 = (WhlAccountLangParam)obj1;
					WhlAccountLangParam ent2 = (WhlAccountLangParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("lang"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountLangParam == false)
						return 0;
					if (obj2 instanceof WhlAccountLangParam == false)
						return 0;
					
					WhlAccountLangParam ent1 = (WhlAccountLangParam)obj1;
					WhlAccountLangParam ent2 = (WhlAccountLangParam)obj2;

					
					String s1 = ent1.getLang();
					String s2 = ent2.getLang();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountLangParam == false)
						return 0;
					if (obj2 instanceof WhlAccountLangParam == false)
						return 0;
					
					WhlAccountLangParam ent1 = (WhlAccountLangParam)obj1;
					WhlAccountLangParam ent2 = (WhlAccountLangParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountLangParam == false)
						return 0;
					if (obj2 instanceof WhlAccountLangParam == false)
						return 0;
					
					WhlAccountLangParam ent1 = (WhlAccountLangParam)obj1;
					WhlAccountLangParam ent2 = (WhlAccountLangParam)obj2;

					
					String s1 = ent1.getWhl_account_id().toString();
					String s2 = ent2.getWhl_account_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlAccountParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountParam == false)
						return 0;
					if (obj2 instanceof WhlAccountParam == false)
						return 0;
					
					WhlAccountParam ent1 = (WhlAccountParam)obj1;
					WhlAccountParam ent2 = (WhlAccountParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountParam == false)
						return 0;
					if (obj2 instanceof WhlAccountParam == false)
						return 0;
					
					WhlAccountParam ent1 = (WhlAccountParam)obj1;
					WhlAccountParam ent2 = (WhlAccountParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountParam == false)
						return 0;
					if (obj2 instanceof WhlAccountParam == false)
						return 0;
					
					WhlAccountParam ent1 = (WhlAccountParam)obj1;
					WhlAccountParam ent2 = (WhlAccountParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountParam == false)
						return 0;
					if (obj2 instanceof WhlAccountParam == false)
						return 0;
					
					WhlAccountParam ent1 = (WhlAccountParam)obj1;
					WhlAccountParam ent2 = (WhlAccountParam)obj2;

					
					String s1 = ent1.getWhl_account_id().toString();
					String s2 = ent2.getWhl_account_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlCategory.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("component_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					String s1 = ent1.getComponent_code();
					String s2 = ent2.getComponent_code();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_category_id_parent"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					String s1 = ent1.getWhl_category_id_parent().toString();
					String s2 = ent2.getWhl_category_id_parent().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					String s1 = ent1.getWhl_id().toString();
					String s2 = ent2.getWhl_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlCategoryLangParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryLangParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryLangParam == false)
						return 0;
					
					WhlCategoryLangParam ent1 = (WhlCategoryLangParam)obj1;
					WhlCategoryLangParam ent2 = (WhlCategoryLangParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryLangParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryLangParam == false)
						return 0;
					
					WhlCategoryLangParam ent1 = (WhlCategoryLangParam)obj1;
					WhlCategoryLangParam ent2 = (WhlCategoryLangParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("lang"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryLangParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryLangParam == false)
						return 0;
					
					WhlCategoryLangParam ent1 = (WhlCategoryLangParam)obj1;
					WhlCategoryLangParam ent2 = (WhlCategoryLangParam)obj2;

					
					String s1 = ent1.getLang();
					String s2 = ent2.getLang();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryLangParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryLangParam == false)
						return 0;
					
					WhlCategoryLangParam ent1 = (WhlCategoryLangParam)obj1;
					WhlCategoryLangParam ent2 = (WhlCategoryLangParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_category_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryLangParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryLangParam == false)
						return 0;
					
					WhlCategoryLangParam ent1 = (WhlCategoryLangParam)obj1;
					WhlCategoryLangParam ent2 = (WhlCategoryLangParam)obj2;

					
					String s1 = ent1.getWhl_category_id().toString();
					String s2 = ent2.getWhl_category_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlCategoryParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryParam == false)
						return 0;
					
					WhlCategoryParam ent1 = (WhlCategoryParam)obj1;
					WhlCategoryParam ent2 = (WhlCategoryParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryParam == false)
						return 0;
					
					WhlCategoryParam ent1 = (WhlCategoryParam)obj1;
					WhlCategoryParam ent2 = (WhlCategoryParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryParam == false)
						return 0;
					
					WhlCategoryParam ent1 = (WhlCategoryParam)obj1;
					WhlCategoryParam ent2 = (WhlCategoryParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_category_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryParam == false)
						return 0;
					
					WhlCategoryParam ent1 = (WhlCategoryParam)obj1;
					WhlCategoryParam ent2 = (WhlCategoryParam)obj2;

					
					String s1 = ent1.getWhl_category_id().toString();
					String s2 = ent2.getWhl_category_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlCurrency.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCurrency == false)
						return 0;
					if (obj2 instanceof WhlCurrency == false)
						return 0;
					
					WhlCurrency ent1 = (WhlCurrency)obj1;
					WhlCurrency ent2 = (WhlCurrency)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("currency_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCurrency == false)
						return 0;
					if (obj2 instanceof WhlCurrency == false)
						return 0;
					
					WhlCurrency ent1 = (WhlCurrency)obj1;
					WhlCurrency ent2 = (WhlCurrency)obj2;

					
					String s1 = ent1.getCurrency_code();
					String s2 = ent2.getCurrency_code();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCurrency == false)
						return 0;
					if (obj2 instanceof WhlCurrency == false)
						return 0;
					
					WhlCurrency ent1 = (WhlCurrency)obj1;
					WhlCurrency ent2 = (WhlCurrency)obj2;

					
					String s1 = ent1.getWhl_id().toString();
					String s2 = ent2.getWhl_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlWalletType.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletType == false)
						return 0;
					if (obj2 instanceof WhlWalletType == false)
						return 0;
					
					WhlWalletType ent1 = (WhlWalletType)obj1;
					WhlWalletType ent2 = (WhlWalletType)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("wallet_type_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletType == false)
						return 0;
					if (obj2 instanceof WhlWalletType == false)
						return 0;
					
					WhlWalletType ent1 = (WhlWalletType)obj1;
					WhlWalletType ent2 = (WhlWalletType)obj2;

					
					String s1 = ent1.getWallet_type_id().toString();
					String s2 = ent2.getWallet_type_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletType == false)
						return 0;
					if (obj2 instanceof WhlWalletType == false)
						return 0;
					
					WhlWalletType ent1 = (WhlWalletType)obj1;
					WhlWalletType ent2 = (WhlWalletType)obj2;

					
					String s1 = ent1.getWhl_id().toString();
					String s2 = ent2.getWhl_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlWalletTypeParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletTypeParam == false)
						return 0;
					if (obj2 instanceof WhlWalletTypeParam == false)
						return 0;
					
					WhlWalletTypeParam ent1 = (WhlWalletTypeParam)obj1;
					WhlWalletTypeParam ent2 = (WhlWalletTypeParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletTypeParam == false)
						return 0;
					if (obj2 instanceof WhlWalletTypeParam == false)
						return 0;
					
					WhlWalletTypeParam ent1 = (WhlWalletTypeParam)obj1;
					WhlWalletTypeParam ent2 = (WhlWalletTypeParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletTypeParam == false)
						return 0;
					if (obj2 instanceof WhlWalletTypeParam == false)
						return 0;
					
					WhlWalletTypeParam ent1 = (WhlWalletTypeParam)obj1;
					WhlWalletTypeParam ent2 = (WhlWalletTypeParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_wallet_type_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletTypeParam == false)
						return 0;
					if (obj2 instanceof WhlWalletTypeParam == false)
						return 0;
					
					WhlWalletTypeParam ent1 = (WhlWalletTypeParam)obj1;
					WhlWalletTypeParam ent2 = (WhlWalletTypeParam)obj2;

					
					String s1 = ent1.getWhl_wallet_type_id().toString();
					String s2 = ent2.getWhl_wallet_type_id().toString();
					return s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		return null;
	}//function


	public static Comparator<IEntity> takeComparatorBack(String ident, String order)
	{
		if (false)
			;
	
		else if (ident.equals(AuthType.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthType == false)
						return 0;
					if (obj2 instanceof AuthType == false)
						return 0;
					
					AuthType ent1 = (AuthType)obj1;
					AuthType ent2 = (AuthType)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthType == false)
						return 0;
					if (obj2 instanceof AuthType == false)
						return 0;
					
					AuthType ent1 = (AuthType)obj1;
					AuthType ent2 = (AuthType)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthType == false)
						return 0;
					if (obj2 instanceof AuthType == false)
						return 0;
					
					AuthType ent1 = (AuthType)obj1;
					AuthType ent2 = (AuthType)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(AuthTypeParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthTypeParam == false)
						return 0;
					if (obj2 instanceof AuthTypeParam == false)
						return 0;
					
					AuthTypeParam ent1 = (AuthTypeParam)obj1;
					AuthTypeParam ent2 = (AuthTypeParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthTypeParam == false)
						return 0;
					if (obj2 instanceof AuthTypeParam == false)
						return 0;
					
					AuthTypeParam ent1 = (AuthTypeParam)obj1;
					AuthTypeParam ent2 = (AuthTypeParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthTypeParam == false)
						return 0;
					if (obj2 instanceof AuthTypeParam == false)
						return 0;
					
					AuthTypeParam ent1 = (AuthTypeParam)obj1;
					AuthTypeParam ent2 = (AuthTypeParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("auth_type_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof AuthTypeParam == false)
						return 0;
					if (obj2 instanceof AuthTypeParam == false)
						return 0;
					
					AuthTypeParam ent1 = (AuthTypeParam)obj1;
					AuthTypeParam ent2 = (AuthTypeParam)obj2;

					
					String s1 = ent1.getAuth_type_id().toString();
					String s2 = ent2.getAuth_type_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(BetType.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof BetType == false)
						return 0;
					if (obj2 instanceof BetType == false)
						return 0;
					
					BetType ent1 = (BetType)obj1;
					BetType ent2 = (BetType)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof BetType == false)
						return 0;
					if (obj2 instanceof BetType == false)
						return 0;
					
					BetType ent1 = (BetType)obj1;
					BetType ent2 = (BetType)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof BetType == false)
						return 0;
					if (obj2 instanceof BetType == false)
						return 0;
					
					BetType ent1 = (BetType)obj1;
					BetType ent2 = (BetType)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("client_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof BetType == false)
						return 0;
					if (obj2 instanceof BetType == false)
						return 0;
					
					BetType ent1 = (BetType)obj1;
					BetType ent2 = (BetType)obj2;

					
					Long v1 = new Long(ent1.getClient_code());
					Long v2 = new Long(ent2.getClient_code());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof BetType == false)
						return 0;
					if (obj2 instanceof BetType == false)
						return 0;
					
					BetType ent1 = (BetType)obj1;
					BetType ent2 = (BetType)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(CasinoAccount.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("integration_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					String s1 = ent1.getIntegration_code();
					String s2 = ent2.getIntegration_code();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("component_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					String s1 = ent1.getComponent_code();
					String s2 = ent2.getComponent_code();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("status"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					String s1 = ent1.getStatus();
					String s2 = ent2.getStatus();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("is_valid"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					Boolean v1 = new Boolean(ent1.getIs_valid());
					Boolean v2 = new Boolean(ent2.getIs_valid());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("is_active"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					Boolean v1 = new Boolean(ent1.getIs_active());
					Boolean v2 = new Boolean(ent2.getIs_active());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("create_date"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					return 0;	
					
					
				}
			};
			}//if
			
			if (order.equals("provider_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CasinoAccount == false)
						return 0;
					if (obj2 instanceof CasinoAccount == false)
						return 0;
					
					CasinoAccount ent1 = (CasinoAccount)obj1;
					CasinoAccount ent2 = (CasinoAccount)obj2;

					
					String s1 = ent1.getProvider_id().toString();
					String s2 = ent2.getProvider_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(CurrencyParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CurrencyParam == false)
						return 0;
					if (obj2 instanceof CurrencyParam == false)
						return 0;
					
					CurrencyParam ent1 = (CurrencyParam)obj1;
					CurrencyParam ent2 = (CurrencyParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CurrencyParam == false)
						return 0;
					if (obj2 instanceof CurrencyParam == false)
						return 0;
					
					CurrencyParam ent1 = (CurrencyParam)obj1;
					CurrencyParam ent2 = (CurrencyParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("currency_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CurrencyParam == false)
						return 0;
					if (obj2 instanceof CurrencyParam == false)
						return 0;
					
					CurrencyParam ent1 = (CurrencyParam)obj1;
					CurrencyParam ent2 = (CurrencyParam)obj2;

					
					String s1 = ent1.getCurrency_code();
					String s2 = ent2.getCurrency_code();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CurrencyParam == false)
						return 0;
					if (obj2 instanceof CurrencyParam == false)
						return 0;
					
					CurrencyParam ent1 = (CurrencyParam)obj1;
					CurrencyParam ent2 = (CurrencyParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof CurrencyParam == false)
						return 0;
					if (obj2 instanceof CurrencyParam == false)
						return 0;
					
					CurrencyParam ent1 = (CurrencyParam)obj1;
					CurrencyParam ent2 = (CurrencyParam)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(EventType.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof EventType == false)
						return 0;
					if (obj2 instanceof EventType == false)
						return 0;
					
					EventType ent1 = (EventType)obj1;
					EventType ent2 = (EventType)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof EventType == false)
						return 0;
					if (obj2 instanceof EventType == false)
						return 0;
					
					EventType ent1 = (EventType)obj1;
					EventType ent2 = (EventType)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof EventType == false)
						return 0;
					if (obj2 instanceof EventType == false)
						return 0;
					
					EventType ent1 = (EventType)obj1;
					EventType ent2 = (EventType)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(LangParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof LangParam == false)
						return 0;
					if (obj2 instanceof LangParam == false)
						return 0;
					
					LangParam ent1 = (LangParam)obj1;
					LangParam ent2 = (LangParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof LangParam == false)
						return 0;
					if (obj2 instanceof LangParam == false)
						return 0;
					
					LangParam ent1 = (LangParam)obj1;
					LangParam ent2 = (LangParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("lang"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof LangParam == false)
						return 0;
					if (obj2 instanceof LangParam == false)
						return 0;
					
					LangParam ent1 = (LangParam)obj1;
					LangParam ent2 = (LangParam)obj2;

					
					String s1 = ent1.getLang();
					String s2 = ent2.getLang();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof LangParam == false)
						return 0;
					if (obj2 instanceof LangParam == false)
						return 0;
					
					LangParam ent1 = (LangParam)obj1;
					LangParam ent2 = (LangParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof LangParam == false)
						return 0;
					if (obj2 instanceof LangParam == false)
						return 0;
					
					LangParam ent1 = (LangParam)obj1;
					LangParam ent2 = (LangParam)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(Param.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Param == false)
						return 0;
					if (obj2 instanceof Param == false)
						return 0;
					
					Param ent1 = (Param)obj1;
					Param ent2 = (Param)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Param == false)
						return 0;
					if (obj2 instanceof Param == false)
						return 0;
					
					Param ent1 = (Param)obj1;
					Param ent2 = (Param)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Param == false)
						return 0;
					if (obj2 instanceof Param == false)
						return 0;
					
					Param ent1 = (Param)obj1;
					Param ent2 = (Param)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Param == false)
						return 0;
					if (obj2 instanceof Param == false)
						return 0;
					
					Param ent1 = (Param)obj1;
					Param ent2 = (Param)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(Provider.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Provider == false)
						return 0;
					if (obj2 instanceof Provider == false)
						return 0;
					
					Provider ent1 = (Provider)obj1;
					Provider ent2 = (Provider)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Provider == false)
						return 0;
					if (obj2 instanceof Provider == false)
						return 0;
					
					Provider ent1 = (Provider)obj1;
					Provider ent2 = (Provider)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Provider == false)
						return 0;
					if (obj2 instanceof Provider == false)
						return 0;
					
					Provider ent1 = (Provider)obj1;
					Provider ent2 = (Provider)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(Server.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Server == false)
						return 0;
					if (obj2 instanceof Server == false)
						return 0;
					
					Server ent1 = (Server)obj1;
					Server ent2 = (Server)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Server == false)
						return 0;
					if (obj2 instanceof Server == false)
						return 0;
					
					Server ent1 = (Server)obj1;
					Server ent2 = (Server)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Server == false)
						return 0;
					if (obj2 instanceof Server == false)
						return 0;
					
					Server ent1 = (Server)obj1;
					Server ent2 = (Server)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("address"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof Server == false)
						return 0;
					if (obj2 instanceof Server == false)
						return 0;
					
					Server ent1 = (Server)obj1;
					Server ent2 = (Server)obj2;

					
					String s1 = ent1.getAddress();
					String s2 = ent2.getAddress();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(UserGroup.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof UserGroup == false)
						return 0;
					if (obj2 instanceof UserGroup == false)
						return 0;
					
					UserGroup ent1 = (UserGroup)obj1;
					UserGroup ent2 = (UserGroup)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof UserGroup == false)
						return 0;
					if (obj2 instanceof UserGroup == false)
						return 0;
					
					UserGroup ent1 = (UserGroup)obj1;
					UserGroup ent2 = (UserGroup)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof UserGroup == false)
						return 0;
					if (obj2 instanceof UserGroup == false)
						return 0;
					
					UserGroup ent1 = (UserGroup)obj1;
					UserGroup ent2 = (UserGroup)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof UserGroup == false)
						return 0;
					if (obj2 instanceof UserGroup == false)
						return 0;
					
					UserGroup ent1 = (UserGroup)obj1;
					UserGroup ent2 = (UserGroup)obj2;

					
					String s1 = ent1.getWhl_id().toString();
					String s2 = ent2.getWhl_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WalletType.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WalletType == false)
						return 0;
					if (obj2 instanceof WalletType == false)
						return 0;
					
					WalletType ent1 = (WalletType)obj1;
					WalletType ent2 = (WalletType)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WalletType == false)
						return 0;
					if (obj2 instanceof WalletType == false)
						return 0;
					
					WalletType ent1 = (WalletType)obj1;
					WalletType ent2 = (WalletType)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WalletType == false)
						return 0;
					if (obj2 instanceof WalletType == false)
						return 0;
					
					WalletType ent1 = (WalletType)obj1;
					WalletType ent2 = (WalletType)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhiteLabel.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhiteLabel == false)
						return 0;
					if (obj2 instanceof WhiteLabel == false)
						return 0;
					
					WhiteLabel ent1 = (WhiteLabel)obj1;
					WhiteLabel ent2 = (WhiteLabel)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhiteLabel == false)
						return 0;
					if (obj2 instanceof WhiteLabel == false)
						return 0;
					
					WhiteLabel ent1 = (WhiteLabel)obj1;
					WhiteLabel ent2 = (WhiteLabel)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhiteLabel == false)
						return 0;
					if (obj2 instanceof WhiteLabel == false)
						return 0;
					
					WhiteLabel ent1 = (WhiteLabel)obj1;
					WhiteLabel ent2 = (WhiteLabel)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("is_blocked"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhiteLabel == false)
						return 0;
					if (obj2 instanceof WhiteLabel == false)
						return 0;
					
					WhiteLabel ent1 = (WhiteLabel)obj1;
					WhiteLabel ent2 = (WhiteLabel)obj2;

					
					Boolean v1 = new Boolean(ent1.getIs_blocked());
					Boolean v2 = new Boolean(ent2.getIs_blocked());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlAccount.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("integration_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getIntegration_code();
					String s2 = ent2.getIntegration_code();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("status"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getStatus();
					String s2 = ent2.getStatus();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("url"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getUrl();
					String s2 = ent2.getUrl();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("description"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getDescription();
					String s2 = ent2.getDescription();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("is_valid"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					Boolean v1 = new Boolean(ent1.getIs_valid());
					Boolean v2 = new Boolean(ent2.getIs_valid());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("is_active"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					Boolean v1 = new Boolean(ent1.getIs_active());
					Boolean v2 = new Boolean(ent2.getIs_active());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("create_date"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					return 0;	
					
					
				}
			};
			}//if
			
			if (order.equals("whl_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getWhl_id().toString();
					String s2 = ent2.getWhl_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("casino_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccount == false)
						return 0;
					if (obj2 instanceof WhlAccount == false)
						return 0;
					
					WhlAccount ent1 = (WhlAccount)obj1;
					WhlAccount ent2 = (WhlAccount)obj2;

					
					String s1 = ent1.getCasino_account_id().toString();
					String s2 = ent2.getCasino_account_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlAccountCurrencyParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("currency_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					String s1 = ent1.getCurrency_code();
					String s2 = ent2.getCurrency_code();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					String s1 = ent1.getWhl_account_id().toString();
					String s2 = ent2.getWhl_account_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("user_group_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountCurrencyParam == false)
						return 0;
					if (obj2 instanceof WhlAccountCurrencyParam == false)
						return 0;
					
					WhlAccountCurrencyParam ent1 = (WhlAccountCurrencyParam)obj1;
					WhlAccountCurrencyParam ent2 = (WhlAccountCurrencyParam)obj2;

					
					String s1 = ent1.getUser_group_id().toString();
					String s2 = ent2.getUser_group_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlAccountLangParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountLangParam == false)
						return 0;
					if (obj2 instanceof WhlAccountLangParam == false)
						return 0;
					
					WhlAccountLangParam ent1 = (WhlAccountLangParam)obj1;
					WhlAccountLangParam ent2 = (WhlAccountLangParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountLangParam == false)
						return 0;
					if (obj2 instanceof WhlAccountLangParam == false)
						return 0;
					
					WhlAccountLangParam ent1 = (WhlAccountLangParam)obj1;
					WhlAccountLangParam ent2 = (WhlAccountLangParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("lang"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountLangParam == false)
						return 0;
					if (obj2 instanceof WhlAccountLangParam == false)
						return 0;
					
					WhlAccountLangParam ent1 = (WhlAccountLangParam)obj1;
					WhlAccountLangParam ent2 = (WhlAccountLangParam)obj2;

					
					String s1 = ent1.getLang();
					String s2 = ent2.getLang();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountLangParam == false)
						return 0;
					if (obj2 instanceof WhlAccountLangParam == false)
						return 0;
					
					WhlAccountLangParam ent1 = (WhlAccountLangParam)obj1;
					WhlAccountLangParam ent2 = (WhlAccountLangParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountLangParam == false)
						return 0;
					if (obj2 instanceof WhlAccountLangParam == false)
						return 0;
					
					WhlAccountLangParam ent1 = (WhlAccountLangParam)obj1;
					WhlAccountLangParam ent2 = (WhlAccountLangParam)obj2;

					
					String s1 = ent1.getWhl_account_id().toString();
					String s2 = ent2.getWhl_account_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlAccountParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountParam == false)
						return 0;
					if (obj2 instanceof WhlAccountParam == false)
						return 0;
					
					WhlAccountParam ent1 = (WhlAccountParam)obj1;
					WhlAccountParam ent2 = (WhlAccountParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountParam == false)
						return 0;
					if (obj2 instanceof WhlAccountParam == false)
						return 0;
					
					WhlAccountParam ent1 = (WhlAccountParam)obj1;
					WhlAccountParam ent2 = (WhlAccountParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountParam == false)
						return 0;
					if (obj2 instanceof WhlAccountParam == false)
						return 0;
					
					WhlAccountParam ent1 = (WhlAccountParam)obj1;
					WhlAccountParam ent2 = (WhlAccountParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_account_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlAccountParam == false)
						return 0;
					if (obj2 instanceof WhlAccountParam == false)
						return 0;
					
					WhlAccountParam ent1 = (WhlAccountParam)obj1;
					WhlAccountParam ent2 = (WhlAccountParam)obj2;

					
					String s1 = ent1.getWhl_account_id().toString();
					String s2 = ent2.getWhl_account_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlCategory.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("name"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					String s1 = ent1.getName();
					String s2 = ent2.getName();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("component_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					String s1 = ent1.getComponent_code();
					String s2 = ent2.getComponent_code();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_category_id_parent"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					String s1 = ent1.getWhl_category_id_parent().toString();
					String s2 = ent2.getWhl_category_id_parent().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategory == false)
						return 0;
					if (obj2 instanceof WhlCategory == false)
						return 0;
					
					WhlCategory ent1 = (WhlCategory)obj1;
					WhlCategory ent2 = (WhlCategory)obj2;

					
					String s1 = ent1.getWhl_id().toString();
					String s2 = ent2.getWhl_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlCategoryLangParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryLangParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryLangParam == false)
						return 0;
					
					WhlCategoryLangParam ent1 = (WhlCategoryLangParam)obj1;
					WhlCategoryLangParam ent2 = (WhlCategoryLangParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryLangParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryLangParam == false)
						return 0;
					
					WhlCategoryLangParam ent1 = (WhlCategoryLangParam)obj1;
					WhlCategoryLangParam ent2 = (WhlCategoryLangParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("lang"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryLangParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryLangParam == false)
						return 0;
					
					WhlCategoryLangParam ent1 = (WhlCategoryLangParam)obj1;
					WhlCategoryLangParam ent2 = (WhlCategoryLangParam)obj2;

					
					String s1 = ent1.getLang();
					String s2 = ent2.getLang();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryLangParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryLangParam == false)
						return 0;
					
					WhlCategoryLangParam ent1 = (WhlCategoryLangParam)obj1;
					WhlCategoryLangParam ent2 = (WhlCategoryLangParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_category_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryLangParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryLangParam == false)
						return 0;
					
					WhlCategoryLangParam ent1 = (WhlCategoryLangParam)obj1;
					WhlCategoryLangParam ent2 = (WhlCategoryLangParam)obj2;

					
					String s1 = ent1.getWhl_category_id().toString();
					String s2 = ent2.getWhl_category_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlCategoryParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryParam == false)
						return 0;
					
					WhlCategoryParam ent1 = (WhlCategoryParam)obj1;
					WhlCategoryParam ent2 = (WhlCategoryParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryParam == false)
						return 0;
					
					WhlCategoryParam ent1 = (WhlCategoryParam)obj1;
					WhlCategoryParam ent2 = (WhlCategoryParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryParam == false)
						return 0;
					
					WhlCategoryParam ent1 = (WhlCategoryParam)obj1;
					WhlCategoryParam ent2 = (WhlCategoryParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_category_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCategoryParam == false)
						return 0;
					if (obj2 instanceof WhlCategoryParam == false)
						return 0;
					
					WhlCategoryParam ent1 = (WhlCategoryParam)obj1;
					WhlCategoryParam ent2 = (WhlCategoryParam)obj2;

					
					String s1 = ent1.getWhl_category_id().toString();
					String s2 = ent2.getWhl_category_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlCurrency.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCurrency == false)
						return 0;
					if (obj2 instanceof WhlCurrency == false)
						return 0;
					
					WhlCurrency ent1 = (WhlCurrency)obj1;
					WhlCurrency ent2 = (WhlCurrency)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("currency_code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCurrency == false)
						return 0;
					if (obj2 instanceof WhlCurrency == false)
						return 0;
					
					WhlCurrency ent1 = (WhlCurrency)obj1;
					WhlCurrency ent2 = (WhlCurrency)obj2;

					
					String s1 = ent1.getCurrency_code();
					String s2 = ent2.getCurrency_code();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlCurrency == false)
						return 0;
					if (obj2 instanceof WhlCurrency == false)
						return 0;
					
					WhlCurrency ent1 = (WhlCurrency)obj1;
					WhlCurrency ent2 = (WhlCurrency)obj2;

					
					String s1 = ent1.getWhl_id().toString();
					String s2 = ent2.getWhl_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlWalletType.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletType == false)
						return 0;
					if (obj2 instanceof WhlWalletType == false)
						return 0;
					
					WhlWalletType ent1 = (WhlWalletType)obj1;
					WhlWalletType ent2 = (WhlWalletType)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("wallet_type_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletType == false)
						return 0;
					if (obj2 instanceof WhlWalletType == false)
						return 0;
					
					WhlWalletType ent1 = (WhlWalletType)obj1;
					WhlWalletType ent2 = (WhlWalletType)obj2;

					
					String s1 = ent1.getWallet_type_id().toString();
					String s2 = ent2.getWallet_type_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletType == false)
						return 0;
					if (obj2 instanceof WhlWalletType == false)
						return 0;
					
					WhlWalletType ent1 = (WhlWalletType)obj1;
					WhlWalletType ent2 = (WhlWalletType)obj2;

					
					String s1 = ent1.getWhl_id().toString();
					String s2 = ent2.getWhl_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		else if (ident.equals(WhlWalletTypeParam.takeIdent()))
		{
			
			if (order.equals("id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletTypeParam == false)
						return 0;
					if (obj2 instanceof WhlWalletTypeParam == false)
						return 0;
					
					WhlWalletTypeParam ent1 = (WhlWalletTypeParam)obj1;
					WhlWalletTypeParam ent2 = (WhlWalletTypeParam)obj2;

					
					Long v1 = new Long(ent1.getId());
					Long v2 = new Long(ent2.getId());
					return -v1.compareTo(v2);
					
					
				}
			};
			}//if
			
			if (order.equals("code"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletTypeParam == false)
						return 0;
					if (obj2 instanceof WhlWalletTypeParam == false)
						return 0;
					
					WhlWalletTypeParam ent1 = (WhlWalletTypeParam)obj1;
					WhlWalletTypeParam ent2 = (WhlWalletTypeParam)obj2;

					
					String s1 = ent1.getCode();
					String s2 = ent2.getCode();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("value"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletTypeParam == false)
						return 0;
					if (obj2 instanceof WhlWalletTypeParam == false)
						return 0;
					
					WhlWalletTypeParam ent1 = (WhlWalletTypeParam)obj1;
					WhlWalletTypeParam ent2 = (WhlWalletTypeParam)obj2;

					
					String s1 = ent1.getValue();
					String s2 = ent2.getValue();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
			if (order.equals("whl_wallet_type_id"))
			{
			return new Comparator<IEntity>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof WhlWalletTypeParam == false)
						return 0;
					if (obj2 instanceof WhlWalletTypeParam == false)
						return 0;
					
					WhlWalletTypeParam ent1 = (WhlWalletTypeParam)obj1;
					WhlWalletTypeParam ent2 = (WhlWalletTypeParam)obj2;

					
					String s1 = ent1.getWhl_wallet_type_id().toString();
					String s2 = ent2.getWhl_wallet_type_id().toString();
					return -s1.compareToIgnoreCase(s2);
					
					
				}
			};
			}//if
			
		}//if
	
		return null;
	}//function

}//class

