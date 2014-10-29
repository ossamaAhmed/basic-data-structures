import SingleLinkedLists.*;

//Implementing stack using linked lists 
public class stackImplementation  
{
	SingleLinkedLists l;
	public stackImplementation()
	{
		l=new SingleLinkedLists();
	}
	public boolean isEmpty()
	{
		return l.isEmpty();
	}
	public void push (Object o)
	{
		l.insertFirst(o);
	}
	public Object pop()
	{
		try
		{
		return l.removeFirst();
		}
		catch(Exception e)
		{
			System.out.println("error");
			return 1;
		}
	}
	
	
}
