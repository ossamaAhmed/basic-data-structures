
public class DiscussionDirector
{
	public static void main (String[]args)
	{
		Agent x=Agent.generateAgent();
		Agent y=Agent.generateAgent();
		Discuss(x,y);
	}
	public static void Discuss(Agent x,Agent y)
	{
		x.sayHello();
		if(Math.random()*100>50)
		{
			System.out.println(y.sayHelloto(x));
			System.out.println(x.getName()+" :Fine, where are you from? ");
			y.sayCityBorn();
			System.out.println(x.dontLikePeople(y));
			if(Math.random()*100>30)
			{
				System.out.println(y.getName()+" :I love your groove");
				System.out.println(x.getName()+" :Well thank you, but I don't know your name");
				System.out.println(y.getName()+" :Hello "+x.getName()+" my name is "+y.getName());
				System.out.println(x.getName()+" :Sorry "+y.getName()+" ,I have to go");
			}
			else
			{
				System.out.println(y.getName()+" :This is so fascinating");
			}
			
		}
		else
		{
			System.out.println(y.notFeelingGood(x));
			if(Math.random()*100>80)
			{
				System.out.println(x.iDoNotCare(y));
				if(Math.random()*100>90)
				{
					System.out.println(y.getName()+" :Well I am sorry I am canadian");
				}
				else
				{
					System.out.println(y.rudeMajor());
				}
				System.out.println(x.getName()+" :Sorry I have to go");
			
			}
			else
			{
				System.out.println(x.whyAreYouNotFeelingGood(y));
				System.out.println(y.iJustLeftHome());
				System.out.println(x.bornAndLive());
				if(Math.random()*100>70)
				{
					System.out.println(y.getName()+" :Sorry I can't speak with people from "+x.getCityBorn());
				}
				else
				{
					System.out.println(y.getName()+" :This is so fascinating");
				}
			}
		}
	}

}
