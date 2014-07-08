package app;

public class Link 
{
	private String Ident;
	public String Name;
	public String Label;
	public String Child;
	public String Master;
	public String Description;
	public Long master_id = 0L;
	public Long child_id = 0L;
		
	public void Normalize()
	{
		Ident = String.format("%s_%s", Child, Name).toLowerCase();
	}//function

	public void Reset()
	{
		master_id = 0L;
		child_id = 0L;
	}//function

	public String getUri()
	{
		return String.format("/links/%s/%s", Ident, master_id.toString());
	}//method

	public String getCaption()
	{
		String className = Objestry.getSimple(Child);
		if (Label != null)
			return String.format("%s (%s)", className, Label);
		else
			return className;
	}//method
	
	public String getIdent() {	return Ident;}
	public Long getChild_id() {	return child_id;}
	public void setChild_id(Long child_id) {this.child_id = child_id;}
	public void setMaster_id(Long master_id) {	this.master_id = master_id;	}
	public void setName(String name) {	Name = name;}
	public String getName() {return Name;}
	public String getLabel() {return Label;	}

	public boolean isStarted()
	{
		return (Master == null || Master.length() == 0);
	}//method
	
	public boolean fromMaster(String aMaster)
	{
		return (Master != null &&  Master.equals(aMaster));
	}
	
}//class
