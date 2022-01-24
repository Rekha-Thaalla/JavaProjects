package programs;
class A
{
	int num1;
	int num2;
	int result;
	
	public A()
	{
	  num1=5;
	  num2=5;
	 
	}
	
	public A(int n)
	{
		num1=n;
		num2=n;
	}
	
	public A(int d,int e)
	{
		num1= d;
	    num2= e;
	}
}

public class ConstuctorDemo 
{

	public static void main(String[] args)
	{

		A obj= new A(7,8);
		
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
