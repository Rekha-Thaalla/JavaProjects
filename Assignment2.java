package java_programs;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int rows=4;
		int columns=4;
		print_rectangle(rows,columns);
	}
		
		static void print_rectangle(int k, int l)
	    {
	        
	        
		for(int i=1; i<=k; i++)
		{
			for(int j=1; j<=l; j++)
			{
				if (i == 1 || i == k || j== 1 || j == l)
					 
                    
                    System.out.print("$");
				else
                    System.out.print(" ");
           
				
			}
			
			System.out.println();
		}
	}

}
