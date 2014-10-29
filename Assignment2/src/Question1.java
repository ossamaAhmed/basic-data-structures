//Sam ahmed
//260549558

import java.util.Scanner;
public class Question1 
{
	public static void main(String[] args)
	{
		System.out.println("Please enter the word that you want to test it:");
		Scanner reader= new Scanner(System.in);
		String input=reader.next();
		System.out.println(isConsecutive(input));
	}
	public static boolean isConsecutive(String word)
	{
		boolean result=false;
		int x;
		int y;
		word=word.toUpperCase();
		for(int i=0;i<(word.length()-1);i++)
		{
			x=(int)word.charAt(i);
			y=(int)word.charAt(i+1);
			if(word.charAt(0)<word.charAt(1))
			{
				if(y==x+1 )
				{
					result=true;
				}
				else if((x==57&& y==48))
				{
					result=true;
				}
				else if ((x==90 && y==65) )
				{
					result=true;
				}
				else
				{
					result=false;
					break;
				}
				
			}
			else 
			{
				if( y==x-1)
				{
					result=true;
				}
				else if((x==48 && y==57))
				{
					result=true;
				}
				else if ((x==65&& y==90)  )
				{
					result=true;
				}
				else
				{
					result=false;
					break;
				}
			}
		}
		return result;
	}
}
