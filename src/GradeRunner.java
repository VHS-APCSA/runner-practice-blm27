
public class GradeRunner {

	public static void main(String[] args) 
	{
		Grade person = new Grade("Freshman");
		System.out.println(person.graduate("B"));
		System.out.println("Person 1 is a " + person.getGrade() + "\n");
		
		Grade person2 = new Grade("Sophmore");
		System.out.println(person2.graduate("D"));
		System.out.println("Person 2 is a " + person2.getGrade() + "\n");
		
		Grade person3 = new Grade("Junior");
		System.out.println(person3.graduate("010320250232"));
		System.out.println("Person 3 is a " + person3.getGrade() + "\n");
		
		
	}

}
