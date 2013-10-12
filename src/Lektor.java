
public class Lektor {
	
	protected String title;
	
	public final String Show()
	{
		String details;
		details="Title: "+this.title;
	
		return details;
	}
	public String gettitle()
	{
		return title;
	}
	public void settitle(String title)
	{
		this.title = title;
	}
	
}
