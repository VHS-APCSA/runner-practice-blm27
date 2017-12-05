
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
	public int graduate(String mark)
	{
		if(mark.equals("A") || mark.equals("B") || mark.equals("C"))
		{
			if(grade.equals("Freshman"))
			{
				grade = "Sophomore";
			}
			else if(grade.equals("Sophomore"))
			{
				grade = "Junior";
			}
			else if(grade.equals("Junior"))
			{
				grade = "Senior";
			}
			else
			{
				grade = "Freshman";
			}
			return 1;
		}
		else if(mark.equals("D") || mark.equals("F"))
		{
			return 0;
		}
		else
		{
			return -1;
		}

	}
	//public int graduate(String mark)//
	{
		//if(mark.equals("A") || )//
		{
			//if(grade.equals("freshman"))
		}
	}

}
