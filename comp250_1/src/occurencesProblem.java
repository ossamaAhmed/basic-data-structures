
public class occurencesProblem 
{
	public static void main(String[] args) 
	{
		int[]a={7,3,7,3,1,3,5,3,0};
		
		//the following part is used to sort the array using bubble sort runs in O(n^2)
		int i; //index to loop over the array for sorting
	    boolean flag = true;   //set flag to true to begin first pass
	    int temp;   
	    while (flag)
	    {
	           flag= false;    
	           for( i=0; i < a.length -1;  i++ )
	           {	                   
	        	   if ( a[ i] > a[i+1] )   
	               {
	                  	temp = a[ i ];                
	                    a[ i ] = a[ i+1 ];
	                    a[ i+1 ] = temp;
	                    flag = true;               
	               } 
	           } 
	    }
	    //end of sorting 
	    //create two arrays with the same size as a to hold the number and the correspondence 
	    //number of occurences
		int[]value={0,0,0,0,0,0,0,0,0,0,0,0};//O(n)
		int[]occurences={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//O(n)
		//use pointer to keep track of the index of the last filled place in the value array 
		int pointer=0;//O(1)
		//initialize the first element of value array by the first element in array a 
		//to start counting it's occurences
		value[0]=a[0];
		for(i=0;i<a.length;i++) //O(n)
		{
			if(a[i]==value[pointer])
			{
				occurences[pointer]=occurences[pointer]+1;
			}
			else
			{
				pointer=pointer+1;
				value[pointer]=a[i];
				occurences[pointer]=occurences[pointer]+1;
			}
		}
		//now we have each number and it's correspondence occurences in the occurences array
		//we need to find the least occurences
		int least=occurences[0];
		for(i=1;i<pointer+1;i++) //O(n)
		{
			if(occurences[i]<least)
			{
				least=occurences[i];
			}
		}
		//after finding least occurences we will find the correspondence values for it 
		System.out.println("The following numbers:");
		for(i=0;i<pointer+1;i++)//O(n)
		{
			if(occurences[i]==least)
			{
				System.out.println(value[i]);
			}
		}
		System.out.println("They have the least often ocurences which is : " +least);
	}
}


