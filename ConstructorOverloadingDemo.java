package programs;

class B
{
	int num1;
	int num2;
	String operation;
	
	
	public B()
	{
		num1=0;
		num2=0;
		operation="Nothing";
		System.out.println(num1 + " : " + num2 + " : " + operation);
	}
	public B(int i)
	{
		num1=i;
		num2=0;
		operation="Nothing";
		System.out.println(num1 + " : " + num2 + " : " + operation);
	}
	public B(int i, int j)
	{
		num1=i;
		num2=j;
		operation="Nothing";
		System.out.println(num1 + " : " + num2 + " : " + operation);
	}
	public B(int i, int j, String op)
	{
		num1=i;
		num2=j;
		operation=op;
		System.out.println(num1 + " : " + num2 + " : " + operation);
	}
}
public class ConstructorOverloadingDemo
{

	public static void main(String[] args) 
	{
		B obj= new B();
		B obj1= new B(5);
		B obj2= new B(5,6);
		B obj3= new B(5,6,"Add");
		
	}

}

