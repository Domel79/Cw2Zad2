

public abstract class Person {

	protected String name;
	protected String surname;
	protected String sex;
	protected String DoB;
	
	public final String Show()
	{
		String details;
		details="Name: "+this.name;
		details+="Surname: "+this.surname;
		details+="Sex: "+this.sex;
		details+="Date of Birth: "+this.DoB;
		details+=showDetails();
		
		return details;
	}
	
	protected abstract String showDetails();
	
	public String getname()
	{
		return name;
	}
	public void setTitle(String name)
	{
		this.name = name;
	}
	public String getsurname()
	{
		return surname;
	}
	public void setsurname(String surname)
	{
		this.surname = surname;
	}
	public String getsex()
	{
		return sex;
	}
	public void setsex(String sex)
	{
		this.sex = sex;
	}
	public String getDoB()
	{
		return DoB;
	}
	public void setDoB(String DoB)
	{
		this.DoB = DoB;
	}
	
	
	
}
