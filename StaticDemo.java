package programs;

class Employee
{
	int eid;
	int salary;
	static String ceo;
	
	static
	{
		Employee.ceo ="Donaiah";
		
	}
	
	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
	

}
public class StaticDemo 
{

	public static void main(String[] args) 
    {
		
		Employee rekha = new Employee();
		rekha.eid=8;
		rekha.salary=300000;
		
		Employee akshitha = new Employee();
		akshitha.eid=9;
		akshitha.salary=200000;
	
			
		rekha.show();
		akshitha.show();
	}

}
