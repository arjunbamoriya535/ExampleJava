
public class PatternProgram2
{
    public static void main(String args[])
    {
       
        int i, j, c,k, space = 1;
   
        int n =5;
        space = n-1;
        for (k = 1; k <= n; k++)
    	{
    		for (c = 1; c <= space; c++)
    			System.out.print("  ");
    		space--;
    		for (c = 1; c <= 2*k-1; c++)
    			System.out.print(" *");
    		
    		System.out.print("\n");
    	}
        for(i = 0; i < n; i++)
        { 
        	
            for(j = 0; j < (2 * n); j++)
            {
                if(i >= j)  // upper left triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
                if(i >= (2 * n - 1) - j)  // upper right triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        // bottom half of the pattern
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < (2 * n); j++)
            {
                if(i + j <= n - 1)  // bottom left triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
                if((i + n) <= j)  // bottom right triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        space = 1;
        for (k = 1; k <= n; k++)
    	{
    		for (c = 1; c <= space; c++)
    			System.out.print("  ");

    		space++;
    		for (c = 1 ; c <= 2*(n-k); c++)
    			System.out.print("* ");
    		System.out.print("\n");
    	}	

    	}
    }

