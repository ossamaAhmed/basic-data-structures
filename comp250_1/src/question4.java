
public class question4 
{
	public static void main (String[]args)
	{
		Poly x=new Poly(3);
		x.setCoefficient(0, 2);
		x.setCoefficient(1, 5);
		x.setCoefficient(2, 7);
		x.setCoefficient(3, 8);
		Poly y=new Poly(2);
		y.setCoefficient(0, 2);
		y.setCoefficient(1, 6);
		y.setCoefficient(2, 8);
		try
		{
		Poly mul=x.multiplyByConstant(3);
		Poly der=x.getDerivative();
		der.displayPoly();
		}
		catch(Exception e)
		{
			System.out.println("OOPs");
		}





		
	}

}
