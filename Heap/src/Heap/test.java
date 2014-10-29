package Heap;

public class test 
{
	public static void main(String[] args) //test stuff.
    {
    	Heap heap1 = new Heap();
    	try
    	{
    		heap1.insert("hi", 20);
        	heap1.insert("Philippe",81);
        	heap1.insert("Mark",3);
        	heap1.insert("Sam",1);
        	heap1.insert("hbh", 200);
        	heap1.insert("bhbh",5);
        	heap1.insert("kjk",400);
        	heap1.insert("uhsbbc",1200);
        	heap1.insert("fdecs",234);
        	heap1.printHeap();
        	Object value = heap1.findMax();
        	System.out.println("The max of this heap is: " + value);
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}

    }

}
