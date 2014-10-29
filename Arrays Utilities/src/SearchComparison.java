import java.util.Arrays;


public class SearchComparison 
{
	public static void main (String[] args)
	{
		/*int[]a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=i;
		}
		System.out.println(binarySearch(a,0));*/
		/*StopWatch watch = new StopWatch();
		watch.start();
		for (int i = 0; i < 100; i++)
		{
		System.out.println("I'm going to test how fast it is to print this 100 times");
		}
		watch.stop();
		System.out.println("It took " + watch.getTimeNano() + " nanoseconds to complete that task");*/
		for(int n=10;n<=500000000;n*=2)
		{
			StopWatch watch=new StopWatch();
			//testing random method
			watch.start();
			int[] array=ArrayUtilities.generateRandom(n);
			watch.stop();
			long timeGenerateArray=watch.getTimeMicro();
			//testing linearsearch
			watch.start();
			ArrayUtilities.linearSearch(array,-1);
			watch.stop();
			long timeLinearSearch=watch.getTimeMicro();
			//testing bubble sort
			long timeBubbleSort;
			if(n<100000)
			{
			watch.start();
			ArrayUtilities.sort(array);
			watch.stop();
			timeBubbleSort=watch.getTimeMicro();
			}
			else
			{
				timeBubbleSort=0;
			}
			//testing the binary search 
			watch.start();
			ArrayUtilities.binarySearch(array,-1);
			watch.stop();
			long timeBinarySearch=watch.getTimeMicro();
			//testing copy method 
			watch.start();
			int[]array2=ArrayUtilities.copy(array);
			array=null;
			System.gc();
			watch.stop();
			long timeCopy=watch.getTimeMicro();
			//testing the sort 
			watch.start();
			Arrays.sort(array2);
			watch.stop();
			long timeSort=watch.getTimeMicro();
		
			//deleting arrays 
			array2=null;
			System.gc();
			
			//printin the result
			System.out.println(n+","+timeGenerateArray+","+timeLinearSearch+","+timeCopy+","+timeBubbleSort+","+timeSort+","+timeBinarySearch);
			
		}
		
	}

}
