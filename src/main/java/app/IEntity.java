package app;

import java.util.Map;

public interface IEntity {
	Long getId();
	void setId(Long aid);
	String getIdent();
	String getType();	
	String getFullInfo();
	String getUrlEdit();
	void fill(Map<String, String[]> values);
	void fillDefaults();
}
