package app;

import java.text.*; 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Html 
{
	String Id = null;
	String Class = null;
	String Name = null;
	String Type = null;
	String Value = null;
	boolean Checked = false;
	boolean Readonly = false;
	Date DateValue = null;
	IEntity EntityValue = null;
	
	public final static String CLASS_LARGE = "input-xxlarge";
	public final static String CLASS_BTN_PRIMARY = "btn primary";
	public final static String CLASS_BTN_SUCCESS = "btn success";
	
	private final static String INPUT_TEXT = "<input ";
	private final static String INPUT_HIDDEN = "<input type=\"hidden\" ";
	private final static String INPUT_CHECKBOX = "<input type=\"checkbox\" ";
	private final static String INPUT_SUBMIT = "<input type=\"submit\" ";
	private final static String A = "<A ";
	private final static String A_CLOSE = "</A>";
	private final static String FORM = "<form ";
	private final static String FORM_CLOSE = "</form>";
	private final static String OPTION = "<option ";
	private final static String OPTION_CLOSE = "</option>";
	private final static String SELECT = "<select ";
	private final static String SELECT_CLOSE = "</select> ";
	private final static String GT = ">";
	private final static String GTS = "/>";
	private final static String LT = "<";
	private final static String LTS = "</";
		
	private final static String CHECKED = " checked ";
	private final static String READONLY = " readonly ";
	private final static String SELECTED = " selected ";

	private final static String EMPTY_OPTION = "-- Choose --";
	private final static String FORM_METHOD_DEFAULT = "post";
	
	private final static String FACTION = " action=\"%s\" ";
	private final static String FCLASS = " class=\"%s\" ";
	private final static String FID = " id=\"%s\" ";
	private final static String FMETHOD = " method=\"%s\" ";
	private final static String FNAME = " name=\"%s\" ";
	private static final String FTYPE = " type=\"%s\" ";
	private final static String FVALUE = " value=\"%s\" ";
	private final static String FHREF = " href=\"%s\" ";
	
	public final static SimpleDateFormat sdf = new SimpleDateFormat(Const.FMT_DATE_FULL);
	

	public Html clear()
	{
		Id = null;
		Class = null;
		Name = null;
		Type = null;
		Value = null;
		Checked = false;
		Readonly = false;
		DateValue = null;
		EntityValue = null;
		return this;
	}//function
	
	public Html setId(String arg) {
		Id = arg;
		return this;
	}

	public Html setClass(String arg) {
		Class = arg;
		return this;
	}

	public Html setName(String arg) {
		Name = arg;
		return this;
	}

	public Html setType(String arg) {
		Type = arg;
		return this;
	}

	public Html setValue(String arg) {
		Value = arg;
		return this;
	}

	public Html setValue(Integer arg) {
		if (arg != null)
			Value = arg.toString();
		else
			Value = "0";
		return this;
	}
	
	public Html setChecked(boolean arg) {
		Checked = arg;
		return this;
	}

	public Html setReadonly(String arg) {
		Readonly = !arg.isEmpty();
		return this;
	}

	public Html setDt(Date arg) {
		DateValue = arg;
		return this;
	}

	public Html setEntity(IEntity arg) {
		EntityValue = arg;
		return this;
	}

	private void doCommon(StringBuilder sb)
	{
		if (Class != null)
			sb.append(String.format(FCLASS, Class));
		if (Id != null)
			sb.append(String.format(FID, Id));
		if (Name != null)
			sb.append(String.format(FNAME, Name));
		if (Type != null)
			sb.append(String.format(FTYPE, Type));

		if (Readonly)
			sb.append(READONLY);
	}//function
	
	private String buildSimpleTagWithValue(String begin)
	{
		StringBuilder sb = new StringBuilder(begin);
		if (Value != null)
			sb.append(String.format(FVALUE, Value));

		doCommon(sb);
		sb.append(GTS);
		return sb.toString();
	}//function
	
	public String buildText()
	{
		return buildSimpleTagWithValue(INPUT_TEXT);
	}//function

	public String buildHidden()
	{
		return buildSimpleTagWithValue(INPUT_HIDDEN);
	}//function

	public String buildSubmit()
	{
		return buildSimpleTagWithValue(INPUT_SUBMIT);
	}//function
	
	public String buildDateText()
	{
		if (DateValue != null)
			Value = sdf.format(DateValue);
		return buildSimpleTagWithValue(INPUT_TEXT);
	}//function

	public String buildCheckbox()
	{
		StringBuilder sb = new StringBuilder(INPUT_CHECKBOX);
		if (Checked)
			sb.append(CHECKED);

		doCommon(sb);
		sb.append(GTS);
		return sb.toString();
	}//function

	public String buildSelect(Link link)
	{
		List<IEntity> list;
		IEntity ent_chosen = EntityValue; 
		if (link != null)
		{
			list = (List<IEntity>) Link_List.get(link);
		}//if
		else
		{
			list = new ArrayList<IEntity>();
			if (ent_chosen != null)
				list.add(ent_chosen);
		}//else
		
		StringBuilder sb = new StringBuilder(SELECT);
		doCommon(sb);
		sb.append(GT);
		
		sb.append(OPTION);
		sb.append(String.format(FVALUE, "blank"));
		sb.append(GT);
		sb.append(EMPTY_OPTION);
		sb.append(OPTION_CLOSE);

		for (IEntity ent : list) 
		{
			sb.append(OPTION);
			sb.append(String.format(FVALUE, ent.getId().toString()));
			if (EntityValue != null &&  ent.getId().equals(EntityValue.getId()))
				sb.append(SELECTED);
			sb.append(GT);
			sb.append(ent.toString());
			sb.append(OPTION_CLOSE);
		}//for
		
		sb.append(SELECT_CLOSE);
		return sb.toString();
	}//function
	
	public String buildHref(String href, Object obj)
	{
		StringBuilder sb = new StringBuilder(A);
		sb.append(String.format(FHREF, href) );
		doCommon(sb);
		sb.append(GT);
		sb.append(obj.toString());
		sb.append(A_CLOSE);
		return sb.toString();
	}//function

	public static String takeHref(String href, Object obj)
	{
		StringBuilder sb = new StringBuilder(A);
		sb.append(String.format(FHREF, href) );
		sb.append(GT);
		sb.append(obj.toString());
		sb.append(A_CLOSE);
		return sb.toString();
	}//function

	public String buildFormOpen(String action)
	{
		StringBuilder sb = new StringBuilder(FORM);
		sb.append(String.format(FACTION, action) );
		sb.append(String.format(FMETHOD, FORM_METHOD_DEFAULT) );
		doCommon(sb);
		sb.append(GT);
		return sb.toString();
	}//function

	public static String buildFormClose()
	{
		return FORM_CLOSE;
	}//function

}//class
