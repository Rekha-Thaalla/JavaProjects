package java_programs;

public class Functions_return {
    public static void main(String[] args) {
	
    Functions_return obj= new Functions_return();
    int x=30;
    int y=20;
    int get_result=obj.add(x, y);
    System.out.println(get_result); 
	}
    
	public int add(int num1, int num2) {
	int result= num1+num2; 
	return result;
	}
}
