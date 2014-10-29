//Sam ahmed
//260549558
public class Question2 
{
	public static void main(String[] args)
	{
		int x=14;
		int y=8;
		int radius=5;
		drawCircle(x,y,radius);
		
	}
	public static void drawCircle(int x,int y, int radius)
	{
		double num;
		int radiusSquared;
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<20;j++)
			{
				num=(Math.pow((i-x),2)+Math.pow((j-y), 2)) ;
				radiusSquared=radius*radius;
				if(num>=radiusSquared-4 && num <= radiusSquared+4)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.println("");
		}
		
	}
}
