package programs;

class Casio
{
	public void add(int a, int b)
	{
	
	  System.out.println(a+b);
	}

	public void add(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
}

public class MethodOverloadingDemo 
{

	public static void main(String[] args) 
	{
	
		Casio obj= new Casio();
		obj.add(4,5);
		obj.add(4,5,6);
		obj.add(4.5,5.5);
		
	}

}
