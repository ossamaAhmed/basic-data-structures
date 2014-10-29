/*Sam Ahmed
 * 260549558
 */
import java.util.Scanner ;
public class MathTrick 
{
	public static void main (String []args )
	{
		Scanner Reader=new Scanner(System.in);
		int num=0;
		int FirstDigit_1=0;
		int SecondDigit_1=0;
		int ThirdDigit_1=0;
		int ReversedNumber_1=0;
		//Difference variables for reversing
		int Difference=0;
		int FirstDigit_2=0;
		int SecondDigit_2=0;
		int ThirdDigit_2=0;
		int ReversedNumber_2=0;
		int Sum=0;
		System.out.println("Here we come, let the Math magic begins!!!");
		System.out.println("Hey there!! Please enter any 3 digit decreasing number below !!");
		num=Reader.nextInt();
		ThirdDigit_1=num%10;
		FirstDigit_1=num/100;
		SecondDigit_1=(num-(FirstDigit_1*100))/10;
		ReversedNumber_1=(ThirdDigit_1*100)+(SecondDigit_1*10)+(FirstDigit_1);
		System.out.println("The Reversed number is :"+ReversedNumber_1);
		Difference=num-ReversedNumber_1;
		System.out.println("The Difference between the two numbers is: "+Difference);
		ThirdDigit_2=Difference%10;
		FirstDigit_2=Difference/100;
		SecondDigit_2=(Difference-(FirstDigit_2*100))/10;
		ReversedNumber_2=(ThirdDigit_2*100)+(SecondDigit_2*10)+(FirstDigit_2);
		System.out.println("The Difference reversed is: "+ReversedNumber_2);
		Sum=Difference+ReversedNumber_2;
		System.out.println("The total sum is: "+Sum);
		
		
		
	}

}
