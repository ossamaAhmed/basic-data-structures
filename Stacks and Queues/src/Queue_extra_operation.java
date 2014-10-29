import java.util.*;

public class Queue_extra_operation 
{
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.toString());
		Stack<Integer> copy=copyStack(s);
		System.out.println(copy.toString());
		System.out.println(s.toString());
	}
	
	public static <T> void reverseQueue(Queue<T> q)
	{
		Stack<T> s=new Stack<T>();
		int size=q.size();
		for(int i=0;i<size;i++)
		{
			T element=q.remove();
			s.push(element);
		}
		for(int i=0;i<size;i++)
		{
			T element=s.pop();
			q.add(element);
		}
	}
	public static <T>Stack<T> copyStack(Stack<T> s)
	{
		Stack<T> copy=new Stack<T>();
		Queue<T> q=new LinkedList<T>();
		int size=s.size();
		for(int i=0;i<size;i++)
		{
			T element=s.pop();
			copy.push(element);
		}
		for(int i=0;i<size;i++)
		{
			T element=copy.pop();
			q.add(element);
		}
		for(int i=0;i<size;i++)
		{
			T element=q.remove();
			s.push(element);
			copy.push(element);
		}
		return copy;
	}

	

}
