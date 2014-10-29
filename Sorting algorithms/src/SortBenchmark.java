import Sorting.*;
import java.util.*;
import java.lang.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SortBenchmark
{
	public static void main(String[]args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter the experiment number:");
		String experiemnt=reader.nextLine();
		System.out.println("Please enter the size of the array:");
		int size=reader.nextInt();
		Integer[] a=new Integer[size];
		Random r=new Random(0);
		for(int i=0;i<size;i++)
		{
			a[i]=r.nextInt();
		}
		long startTime;
		long endTime;
		//measuring merge sort time
		startTime=System.currentTimeMillis();
		MergeSort.sort(a);
		endTime=System.currentTimeMillis();
		long mergeSortTime=endTime-startTime;
		//measuring quick sort time
		r=new Random(0);
		for(int i=0;i<size;i++)
		{
			a[i]=r.nextInt();
		}
		startTime=System.currentTimeMillis();
		quickSort.sort(a);
		endTime=System.currentTimeMillis();
		long quickSortTime=endTime-startTime;
		//measuring selection sort time
		r=new Random(0);
		for(int i=0;i<size;i++)
		{
			a[i]=r.nextInt();
		}
		startTime=System.currentTimeMillis();
		SelectionSort.sort(a);
		endTime=System.currentTimeMillis();
		long selectionSortTime=endTime-startTime;
		try 
		{
			 File file = new File(experiemnt+"_"+size+".txt");
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(quickSortTime+"\n");
			bw.write(mergeSortTime+"\n");
			bw.write(selectionSortTime+"\n");
			bw.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	

}
