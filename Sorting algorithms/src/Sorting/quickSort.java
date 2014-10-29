package Sorting;
import java.lang.*;

public class quickSort 
{
	public static <T extends Comparable<T>> void sort(T[] a) 
	{
		quicksort(a, 0, a.length-1);
	}
	private static <T extends Comparable<T>> void quicksort (T[] a, int p, int r)
	{
		if(p<r)
		{
			int q=partition(a,p,r);
			quicksort(a,p,q);
			quicksort(a,q+1,r);

		}
	}
	private static <T extends Comparable<T>> int  partition(T[] a, int p, int r)
	{
		T pivot=median(a,p,r);
		int i=p-1;
		int j=r+1;
	    while (true) 
	    {
	    	do
	    	{
	    		i++;
	    	}while ( i< r && pivot.compareTo(a[i])==1);
	    	do
	    	{
	    		j--;
	    	}while (j>p && pivot.compareTo(a[j])==-1);
	      
	        if (i < j)
	        {
                swap(a, i, j);   	
	        }
	        else
	        {
                return j;
	        }
	     }
	}
	private static <T extends Comparable<T>> void  swap(T[] a, int i, int j)
	{
		 T temp = a[i];
	     a[i] = a[j];
	     a[j] = temp;
	}
	private static <T extends Comparable<T>> T  median(T[] a,int p, int r)
	{
		 int center =(p+r)/2;
		 if(a[p].compareTo(a[center])==1 )
			 swap(a,p, center);
		 if( a[p].compareTo(a[r])==1 )
			 swap(a,p, r);
		 if( a[center].compareTo(a[r])==1 )
			 swap(a,center, r);

		 swap(a,center, r-1);           
		 return a[r-1];          
	}
	 // Main methos to test the code, using Integer Objects
    public static void main(String[] args) 
    {
        Integer[] a = new Integer[5];
        a[0] = new Integer(2);
        a[1] = new Integer(1);
        a[2] = new Integer(4);
        a[3] = new Integer(3);
        a[4] = new Integer(-1);
	// T will be instantiated to Integer as a resutl of this call
        
        quickSort.sort(a);

        
	// Print the result after the sorting
        for (int i = 0; i < a.length; i++)
            {System.out.println(a[i].toString());}

    }
	

}
