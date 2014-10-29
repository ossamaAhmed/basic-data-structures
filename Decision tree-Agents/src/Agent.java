import java.util.*;
import java.io.*;

public class Agent 
{
	private char gender;
	private int[] birthday;
	private String name;
	private String cityBorn;
	private String cityNow;
	private String major;
	
	public String getCityNow()
	{
		return this.cityNow;
	}
	public String getCityBorn()
	{
		return this.cityBorn;
	}
	public String getMajor()
	{
		return this.major;
	}
	public String getName()
	{
		return this.name;
	}
	public String sayHelloto(Agent x)
	{
		return this.name+ ": hi "+x.getName()+", nice to meet you, my name is "+this.name+", how are you?";
	}
	public String notFeelingGood(Agent x)
	{
		return this.name+": Hello "+x.getName()+",I am  "+this.name+" and not feeling so good";
	}
	public String whyAreYouNotFeelingGood(Agent x)
	{
		return this.name+": "+x.getName()+",why are you not feeling so good!";
	}
	public String iDoNotCare(Agent x)
	{
		return this.name+ ": Well "+x.getName()+", I do not care because I am from "+this.cityBorn;
	}
	public String iJustLeftHome()
	{
		return this.name+ ":I just left my home town "+this.cityBorn;
	}
	public String rudeMajor()
	{
		return this.name+" :No one in my major "+this.major+" is this rude";
	}
	public String cantTalktopeople(Agent x)
	{
		return this.name+ ":+Sorry I cannot speak with people from "+x.getCityBorn();
	}
	public String dontLikePeople(Agent x)
	{
		return this.name +" :I do not like people from "+x.getCityBorn()+" because I am from "+this.getCityBorn();
	}
	public String bornAndLive()
	{
		return this.name+ ": Well me too, was from "+this.getCityBorn()+" and now I am in "+this.getCityNow();
	}
	public String getBirthday()
	{
		String line= birthday[0]+"/"+birthday[1]+"/"+birthday[2];
		return line;
	}
	public char getGender()
	{
		return this.gender;
	}
	public void sayHello()
	{
		System.out.println(this.name + " says: Hello my dear");
	}
	public void sayCityBorn()
	{
		System.out.println(this.name + " says: I am from " + this.cityBorn);
	}
	public void sayGender()
	{
		System.out.println(this.name + "says: I am a " + this.gender);
	}
	public void sayCityNow()
	{
		System.out.println(this.name + "says : I live in "+this.cityNow);
	}
	public void sayMajor()
	{
		System.out.println(this.name + "says: I am majoring in "+ this.major);
	}

	public void howOldAreYou()
	{
		int age=0;
		age=Calendar.getInstance().get(Calendar.YEAR)-birthday[2];
		if(Calendar.getInstance().get(Calendar.MONTH)-birthday[1]==0)
		{
			if(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)-birthday[0]>0)
			{
				age--;
			}
		}
		else if(Calendar.getInstance().get(Calendar.MONTH)-birthday[1]>0)
		{
			age--;
		}
		System.out.println(this.name + "says: I am "+ age+ "years old" );
	}
	public void sayName()
	{
		System.out.println(this.name + "says: My name is "+ this.name);
	}
	public void whoAreYou()
	{
		this.sayHello();
		this.sayName();
		this.sayCityBorn();
		this.sayGender();
		this.sayCityNow();
		this.sayMajor();
		this.howOldAreYou();
	}
	public static Agent generateAgent() 
	{
		Agent x=new Agent();
		x.birthday=new int[3];
		Random r=new Random();
		int index=r.nextInt(600);
		if(index%2==0)
		{
			x.gender='M';
		}
		else
		{
			x.gender='F';
		}
		try
		{
		WordList cities=new WordList("Cities.txt");
		WordList mNames=new WordList("MaleNames.txt");
		WordList fNames=new WordList("FemaleNames.txt");
		WordList majors=new WordList("Majors.txt");
		if(x.gender=='M')
		{
			x.name=mNames.getRandomWord();
		}
		else
		{
	
			x.name=fNames.getRandomWord();
		}
		x.cityBorn=cities.getRandomWord();
		x.cityNow=cities.getRandomWord();
		x.major=majors.getRandomWord();
		}
		catch(IOException e)
		{
			x.name="Sam";
			x.cityBorn="Montreal";
			x.cityNow="Montreal";
			x.major="CS";	
		}
		x.birthday[0]=r.nextInt(28)+1;
		x.birthday[1]=r.nextInt(12)+1;
		x.birthday[2]=r.nextInt(10)+1985;
		return x;
	}
	
}
