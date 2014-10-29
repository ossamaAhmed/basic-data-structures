public class question3 
{
	public static void main(String[] args)
	{
		int[] a = {1,1,1,1,2,1,1,1,1};
		int result = find_lead(a,0,a.length-1);
		System.out.println(result);	
	} 
	public static int compare(int[]a, int i, int j, int k, int l)
	{
		int sum1=0;
		int sum2=0;
		for(int x=i; x<j+1;x++)
		{
			sum1 = sum1+a[x];
		}
		for(int x=k; x<l+1; x++)
		{
			sum2 = sum2+a[x];
		}
		if(sum1 == sum2)
		{
			return 0;
		}else if(sum1 <sum2)
		{
			return -1;
		}
		else
			return 1;
	}
	public static int find_lead(int[] a,int first,int last)
	{
		if((first+last)%2 !=0)
		{
			int middle = (first + last)/2;
			if(first == last)
			{
				return first;
			}
			else if(compare(a,first,middle,middle+1,last) == -1)
			{
				return find_lead(a,middle+1,last);
			}
			else
			{
				return find_lead(a,first,middle);
			}
		}
		else
		{
			int middle = (first+last)/2;
			if(compare(a,first,middle,middle,last) == 0)
			{
				return middle;
			}
			else if(compare(a,first,middle,middle,last) == -1)
			{
				return find_lead(a,middle,last);
			}
			else
				return find_lead(a,first,middle);	
		}
	}
}