
public class question1 
{
	public static void main(String[] args)
	{
		int[] a = {1,3,6,12,8,100,4,0,-1,1,3,100};
		int[] b = {1,3,100,3,3,3,-1,1,12,3,1,-1,-1,-1,-1,1,3,5,1,2,100};
		int duplicates=0;
		int j;
	    boolean flag = true;   // set flag to true to begin first pass
	    int temp;   //holding variable
	    while (flag)
	    {
	           flag= false;    //set flag to false awaiting a possible swap
	           for( j=0; j < a.length -1;  j++ )
	           {	                   
	        	   if ( a[ j ] > a[j+1] )   // change to > for ascending sort
	               {
	                  	temp = a[ j ];                //swap elements
	                    a[ j ] = a[ j+1 ];
	                    a[ j+1 ] = temp;
	                    flag = true;              //shows a swap occurred  
	               } 
	           } 
	    }
	    int duplicate=a[0]+1;
	    for(int i=0;i<a.length;i++)
	    {
	    	for(j=0;j<b.length;j++)
	    	{
	    		if(a[i]==b[j])
	    		{
	    			if(a[i]==duplicate)
	    			{
	    				break;
	    			}
	    			else
	    			{
	    				duplicates++;
	    				duplicate=a[i];
	    			}
	    		}
	    	}
	    }
	    System.out.println(duplicates);
	}
}
