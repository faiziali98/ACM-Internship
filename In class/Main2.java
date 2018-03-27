class Student
{
	 int roll;
	 double gpa;
	 String name;
	
	public Student()

	{
		
	} 

	public void setGpa(double x)
	{
		gpa=x;
		System.out.println(x);
	}
	public void setRoll(int x)
	{
		roll=x;
		System.out.println(x);
	}
	public void setName(String x) 
	{
		name=x;
		System.out.println(x);
	}


}

public class Main2
{
	public static void main(String args[])
	{ 
		Student a=new Student() ;
		double k=3.72;
		a.setRoll(17100152);
		a.setGpa(k);
		a.setName("Faizan");
	}
}