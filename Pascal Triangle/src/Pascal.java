import java.util.Scanner;

public class Pascal 
{
	
	public static void main (String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows of Pascal Triangle that you want:");
		int rows=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(pascalTriangle(i,j)+"  ");
			}
			System.out.println("");
		}
		
	}
	public static int pascalTriangle(int m,int n)
	{
		if(n==0)
		{
			return 1;
		}
		else if(m==n)
		{
			return 1;
		}
		else
		{
			return pascalTriangle(m-1,n)+pascalTriangle(m-1,n-1);
		}
	}

}
