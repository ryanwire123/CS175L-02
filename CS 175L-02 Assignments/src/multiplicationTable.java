
public class multiplicationTable {

	   public static void main(String[] args)
	   {  
	     
	     
	      // Print table body

	      for (int x = 1; x <= 10; x++)
	      {
	         // Print table row
	         
	         for (int n = 1; n <= 10; n++)
	         {
	            System.out.printf("%4d" , x*n);
	         }
	         System.out.println();
	      }
	   }
	}
