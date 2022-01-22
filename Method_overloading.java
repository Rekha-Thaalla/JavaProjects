package java_programs;

public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading obj= new Method_overloading();
		int x=10;
		int y=20;
		int r=5;
		
		int area_rectangle=obj.area(x,y);
		float area_circle=obj.area(r);

		System.out.println("Area of rectangle is:" + area_rectangle);
		System.out.println("Area circle is:" + area_circle);
	}

	public int area(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	public float area(float n) {
		float result = 3.14f * n * n;
		return result;
	}
}
