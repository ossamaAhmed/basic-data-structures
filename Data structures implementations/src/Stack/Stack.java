package Stack;

//implements stack using Arrays 
public class Stack 
{
	Object[] c;
	int indexTop;
	public Stack()
	{
		c=new Object[100];
		indexTop=-1;
	}
	public Stack(int size)
	{
		c=new Object[size];
		indexTop=-1;
	}
	public boolean isEmpty()
	{
		return (indexTop==-1);
	}
	//shorter version no need to check for size 
	public void push(Object o)
	{
		indexTop++;
		c[indexTop]=o;
	}
	/*Long version 1
	 * if indexTop<c.length
	 * 		c[indexTop]=o;
	 * else
	 * 		//throw Exception  
	 */
	/*long version 2 
	 * if indexTop<c.length
	 * 		c[indexTop]=o;
	 * else
	 * 		resize();
	 * 
	 * private void resize()
	 * {
	 * 		object[]Temp= new Object[z*c.length];
	 * 		for(int i=0;i<c.lenth;i++)
	 * 			temp[i]=c[i];
	 * 			c=temp;
	 * }
	 */
	
	

}
