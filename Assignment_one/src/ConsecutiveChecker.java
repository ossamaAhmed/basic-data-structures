/*Sam Ahmed
 * 260549558
 */
import java.util.Scanner;
public class ConsecutiveChecker 
{
	public static void main (String []args )
	{
		Scanner Reader=new Scanner(System.in);
		int num=0;
		int FirstDigit=0;
		int SecondDigit=0;
		int ThirdDigit=0;
		int FourthDigit=0;
		boolean isOneDigitConsecutive=false;
		boolean isTwoDigitConsecutive=false;
		boolean isThreeDigitConsecutive=false;
		boolean isFourDigitConsecutive=false;
		boolean isItConsecutive=false;
		System.out.println("Please enter a positive integer number");
		num=Reader.nextInt();
		FirstDigit=num/1000;
		SecondDigit=(num-(FirstDigit*1000))/100;
		FourthDigit=num%10;
		ThirdDigit=(num%100)/10;
		System.out.print("Is the number is consecutive?  ");
		isOneDigitConsecutive=(FirstDigit==0) && (SecondDigit==0) && (ThirdDigit==0);
		isTwoDigitConsecutive=(FirstDigit==0) && (SecondDigit==0) && ((ThirdDigit == (FourthDigit-1)) || (ThirdDigit==(FourthDigit+1)));
		isThreeDigitConsecutive=(FirstDigit==0) && ((SecondDigit == (ThirdDigit-1)) || (SecondDigit==(ThirdDigit+1))) && ((ThirdDigit==(FourthDigit-1)) || (ThirdDigit==(FourthDigit+1)));
		isFourDigitConsecutive=((FirstDigit==(SecondDigit-1)) || (FirstDigit==(SecondDigit+1))) && ((SecondDigit==(ThirdDigit-1)) || (SecondDigit == (ThirdDigit+1))) && ((ThirdDigit==(FourthDigit-1)) || (ThirdDigit==(FourthDigit+1)));
		isItConsecutive=isOneDigitConsecutive || isTwoDigitConsecutive || isThreeDigitConsecutive || isFourDigitConsecutive;
		System.out.print(isItConsecutive);
		
	}
}
