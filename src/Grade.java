
public class Grade 
{
	private String grade;
	public Grade()
	{
		grade = "";
	}
	public Grade(String grade)
	{
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void nextGrade()
	{
		if(grade.equals("freshman"))
		{
			grade = "sophomore";
		}
		else if(grade.equals("sophomore"))
		{
			grade = "junior";
		}
		else if(grade.equals("junior"))
		{
			grade = "senior";
		}
		
	}
	public int graduate(String mark)
	{
		if(mark.equals("A") || )
		{
			if(grade.equals("freshman"))
		}
	}
	
}
