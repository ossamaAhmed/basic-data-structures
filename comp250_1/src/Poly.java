
public class Poly {

	double[] coefficients;


	public Poly() {
		coefficients = new double[1];
		coefficients[0] = 0;
	}
	
	public Poly(int degree) {
		coefficients = new double[degree+1];
		for (int i = 0; i <= degree; i++)
			coefficients[i] = 0;
	}
	
	
	public Poly(double[] a) {
		coefficients = new double[a.length];
		for (int i = 0; i < a.length; i++)
			coefficients[i] = a[i];
	}
	
	public int getDegree() {
		return coefficients.length-1;
	}
	
	public double getCoefficient(int i) throws Exception{
	    if (i >= coefficients.length)
		throw new Exception("Bad Poly");
		return coefficients[i];
	}
	
	public void setCoefficient(int i, double value) {
		coefficients[i] = value;
	}
	
	public Poly add(Poly p) {
		int n = getDegree();
		int m = p.getDegree();
		Poly result = new Poly(Poly.max(n, m));
		int i;

		try{
			for (i = 0; i <= Poly.min(n, m); i++) 
				result.setCoefficient(i, coefficients[i] + p.getCoefficient(i));
			if (i <= n) {
				//we have to copy the remaining coefficients from this object
				for ( ; i <= n; i++) 
					result.setCoefficient(i, coefficients[i]);
			} else {
				// we have to copy the remaining coefficients from p
				for ( ; i <= m; i++) 
					result.setCoefficient(i, p.getCoefficient(i));
			}
		} catch (Exception e) {
		}
		return result;
	}
	
	public void displayPoly () {
		for (int i=0; i < coefficients.length; i++)
			System.out.print(" "+coefficients[i]+"*X^"+i);
		System.out.println();
	}
	
	private static int max (int n, int m) {
		if (n > m)
			return n;
		return m;
	}
		
	private static int min (int n, int m) {
		if (n > m)
			return m;
		return n;
	}
	public Poly multiply(Poly p) throws Exception
	{
		Poly result= new Poly(getDegree()+p.getDegree());
		double subResult;
		for(int i=0;i<getDegree()+1;i++)
		{
			for(int j=0;j<p.getDegree()+1;j++)
			{
				subResult=coefficients[i]*p.getCoefficient(j);
				result.setCoefficient((i+j), subResult+result.getCoefficient(i+j));
			}
		}
		return result;
	}
	public Poly multiplyByConstant(int x) throws Exception
	{
		Poly constantPoly=new Poly(0);
		constantPoly.setCoefficient(0, x);
		Poly result=multiply(constantPoly);
		return result;
	}
	
	public void checkZeros()
	{
		int leadingZeros=0;
		double[]copy;
		for(int i=coefficients.length-1;i>-1;i--)
		{
			if(coefficients[i]==0)
				leadingZeros++;
			else
				break;
			
		}
		if(leadingZeros>0)
		{
			copy=new double[coefficients.length-leadingZeros];
			for(int i=0;i<copy.length;i++)
			{
				copy[i]=coefficients[i];
			}
			coefficients=new double[copy.length];
			for(int i=0;i<copy.length;i++)
			{
				coefficients[i]=copy[i];
			}
			
		}
	}
	public Poly getDerivative()
	{
		Poly derivative=new Poly(getDegree()-1);
		double value;
		for(int i=1;i<getDegree()+1;i++)
		{
			value=i*coefficients[i];
			derivative.setCoefficient(i-1, value);
			
		}
		return derivative;
		
	}

	
}