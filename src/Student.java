

public class Student {
	
	protected String indexNo;
	
	public final String Show()
	{
		String details;
		details="Index No.: "+this.indexNo;
	
		return details;
	}
	public String getindexNo()
	{
		return indexNo;
	}
	public void setindexNo(String indexNo)
	{
		this.indexNo = indexNo;
	}
	
}
