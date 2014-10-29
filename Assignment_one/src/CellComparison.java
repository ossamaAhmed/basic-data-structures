/*Sam Ahmed
 * 260549558
 */
import java.util.Scanner ;

public class CellComparison 
{
	public static void main (String []args )
	{
		int MonthsUsed=0;
		int MinutesPerMonth=0;
		int IphoneCost=500;
		int PlanARate=50;
		int PlanBRate=25;
		double PlanAMinRate=0.1;
		double PlanBMinRate=0.05;
		double PlanACost=0;
		double PlanBCost=0;
		Scanner Reader=new Scanner(System.in);
		System.out.println("Hey Marvin!! Please enter how many month will you use the phone you want to purchase? ");
		MonthsUsed=Reader.nextInt();
		System.out.println("Please enter how many minutes on average you will talk per month?");
		MinutesPerMonth=Reader.nextInt();
		//calculating PlanA Cost
		PlanACost=(PlanARate+(MinutesPerMonth*PlanAMinRate))*MonthsUsed;
		PlanBCost=IphoneCost+((PlanBRate+(MinutesPerMonth*PlanBMinRate))*MonthsUsed);
		System.out.println("Under the A plan you will pay in "+MonthsUsed+" the following ammount: "+PlanACost);
		System.out.println("Under the B plan you will pay in "+MonthsUsed+" the following ammount: "+PlanBCost);
	}
	
}
