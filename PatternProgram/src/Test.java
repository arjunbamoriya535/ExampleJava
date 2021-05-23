
public class Test {
	public static void main(String[] args) 
		
		{
		for(int i=1;i<=4;i++)//lines
		{
			for(int j=1;j<=4-i;j++)//spaces
			{
			System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)//star
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			for(int k=4;k>i;k--)
			{
				System.out.print(" ");
			}

			for(int l=4;l>i;l--)
			{
				System.out.print(" ");
			}
			for(int m=0;m<i;m++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
			
		for(int i=0;i<=3;i++)
		{
			for(int j=3;j>i;j--)
			{
				System.out.print("*");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}

			for(int l=0;l<i+2;l++)
			{
				System.out.print(" ");
			}
			for(int m=3;m>i;m--)
			{
				System.out.print("*");
			}
				System.out.println();
		}


		for(int i=4;i>=1;i--)//lines
		{
			for(int j=1;j<=4-i;j++)//spaces
			{
			System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)//star
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		}
}