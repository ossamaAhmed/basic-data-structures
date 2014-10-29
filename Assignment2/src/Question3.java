//Sam ahmed
//260549558

public class Question3 
{
	public static void main(String[] args)
	{
		int x=14;
		int y=8;
		int radiusA=4;
		int radiusB=1;
		drawAnElipse(x,y,radiusA,radiusB);
	}
	public static void drawAnElipse(int posX, int posY, int radiusA, int radiusB)
	{
		double num;
		for(int i=0;i<25;i++)
		{
			for(int j=0;j<25;j++)
			{
				num=(((Math.pow(((i-posX)/radiusB),2)+Math.pow(((j-posY)/radiusA), 2))));
				if(num>0.5&& num <1.5 )
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
