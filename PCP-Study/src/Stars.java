public class Stars
{
   //-----------------------------------------------------------------
   //  Prints a triangle shape using asterisk (star) characters.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      final int MAX_ROWS = 5;

      for (int row = 1; row <= MAX_ROWS; row++)
      {
         for (int star = 1; star <= 5-row; star++)
            System.out.print(" ");
         for(int star = 2; star<=row*2 ; star++)
        	 System.out.print("*");

         System.out.println();
      }
      for(int row = 1; row <=MAX_ROWS; row++ ) {
    	  for(int star = 3; 5-row <= star ;star--) 
    		  System.out.print(" ");
    		  for(int star = 10; row*2<=star; star--)
    			  System.out.print("*");
    		  
    		  System.out.println();
    	  }
      }
   }
