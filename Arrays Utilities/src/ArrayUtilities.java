
import java.util.Arrays;
import java.util.Random;
public class ArrayUtilities 
{
	
	public static boolean linearSearch(int[] array, int target)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==target)
			{
				return true;
			}
		}
		return false;
	}
	public static boolean binarySearch(int[]array, int target)
	{
		boolean result=false;
		int left=0;
		int right=array.length-1;
		while (left<=right)
		{
			int middle=(left+right)/2;
			if(array[middle]==target)
			{
				result=true;
				return result;
			}
			else if (array[middle]<target)
			{
				left=middle+1;
			}
			else if(array[middle]>target)
			{
				right=middle-1;
			}
		}
		return result;
	}
	 public static int[] copy(int[] array)
	{
		int[] newArray=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			newArray[i]=array[i];
		}
		return newArray;
	}
	 public static void sort(int[] array) 
	 {
		 int temp;
		 for(int i=0;i<array.length;i++)
		 {
			 for(int j=i+1;j<array.length;j++)
			 {
				 if(array[i]>array[j])
				 {
					 temp=array[i];
					 array[i]=array[j];
					 array[j]=temp; 
				 }
			 }
		 }
	 }
	 public static int[] generateRandom(int n)
	 {
		 Random r = new Random(1);
		 int[]randomArray=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 randomArray[i]=r.nextInt(Integer.MAX_VALUE);
		 }
		 return randomArray;
	 }
}
