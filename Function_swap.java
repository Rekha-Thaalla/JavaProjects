package java_programs;

public class Function_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x=10;
    int y=20;
    swapFunction(x, y);
	}
    
	public static void swapFunction(int a, int b) {
		System.out.println("Original values, a=" + a + " b="+ b );
		int c=a;
		a=b;
		b=c;
		System.out.println("Duplicate values, a=" + a + " b="+ b );
	}
}
