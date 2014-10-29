package DecisionTrees;
import java.lang.Math;
import java.util.*;

public class DTNode 
{

    Instance[] a;
    double testValue;
    DTNode left, right;
    public DTNode(Instance[] b)
    {
    	a=b;
    	left=null;
    	right=null;
    	testValue=-1;
    }
   //find the best entropy and assign the test value, returns the index of the nearest value for the cutoff
   public int getTheBestEntropy()
   {
	   ArrayList<Integer> indicies=new ArrayList<Integer>();
	   ArrayList<Double> entropy=new ArrayList<Double>();
      	boolean def=a[0].getLabel();
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i].getLabel()!=def)
		   {
			   indicies.add(i-1);
			   entropy.add(calculateAverageEntropy(i-1));
			   def=a[i].getLabel();
		   }
	   }
	   int Min=findMinIndex(entropy);
	   testValue=(a[indicies.get(Min)].getAttribute()+a[indicies.get(Min)+1].getAttribute())/2;
	   return indicies.get(Min);
   }
   //find the max index of the arraylist given
   public int findMinIndex (ArrayList<Double> arr)
   {
	   int MinIndex=0;
	   double Min=arr.get(0);
	   for(int i=1;i<arr.size();i++)
	   {
		   if(arr.get(i)<Min)
		   {
			   Min=arr.get(i);
			   MinIndex=i;
		   }
	   }
	   return MinIndex;
   }
   //calculate average entropy giving the index you will cut the array after
   public double calculateAverageEntropy(int index)
   {
	   double  numberOfTrue=0;
	   double  numberOfFalse=0;
	   for(int i=0;i<index+1;i++)
	   {
		   if(a[i].getLabel()==true)
		   {
			   numberOfTrue++;
		   }
		   else
		   {
			   numberOfFalse++;
		   }
	   }
	   double leftEntropy= ((-1)*(numberOfTrue/a.length)*log2(numberOfTrue/a.length))-((numberOfFalse/a.length)*log2(numberOfFalse/a.length));
	   numberOfTrue=0;
	   numberOfFalse=0;
	   for(int i=index+1;i<a.length;i++)
	   {
		   if(a[i].getLabel()==true)
		   {
			   numberOfTrue++;
		   }
		   else
		   {
			   numberOfFalse++;
		   }
	   }  
	  double rightEntropy= ((-1)*(numberOfTrue/a.length)*log2(numberOfTrue/a.length))-((numberOfFalse/a.length)*log2(numberOfFalse/a.length));
	  return (leftEntropy*((index+1)/a.length))+(rightEntropy*((a.length-(index+1))/a.length));
   }
   //returns the entropy of a node
   public double calculateEntropy()
   {
	   double  numberOfTrue=0;
	   double  numberOfFalse=0;
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i].getLabel()==true)
		   {
			   numberOfTrue++;
		   }
		   else
		   {
			   numberOfFalse++;
		   }
	   }
	   return ((-1)*(numberOfTrue/a.length)*log2(numberOfTrue/a.length))-((numberOfFalse/a.length)*log2(numberOfFalse/a.length));
	   
   }
   //return log 2
   public double log2(double p)
   {
	   return Math.log(p)/Math.log(2);
   }
   
   //check if leaf node
   public boolean isLeaf()
   {
	   if(left==null&&right==null)
	   {
		   return true;
	   }
	   return false;
   }
   //returns true if the node is pure and returns false if the node is not 
   public boolean isNodePure()
   {
	   
	   boolean def=a[0].getLabel();
	   for(int i=1;i<a.length;i++)
	   {
			if(def!=a[i].getLabel())
			{
				return false;
			}
		}
	  
	   return true;
   }
   
    //gets the class of the node
	public boolean getClassOfNode()
	{
		  int numberOfTrue=0;
		  int  numberOfFalse=0;
		   for(int i=0;i<a.length;i++)
		   {
			   if(a[i].getLabel()==true)
			   {
				   numberOfTrue++;
			   }
			   else
			   {
				   numberOfFalse++;
			   }
		   } 
		   if(numberOfTrue>numberOfFalse)
		   {
			   return true;
		   }
		   else
		   {
			   return false;
		   }
	}
	//gets the fraction of the type you give it in this node (pf or pt)
	public double getFractionOfType(boolean val)
	{
		double  numberOfVal=0;
		   for(int i=0;i<a.length;i++)
		   {
			   if(a[i].getLabel()==val)
			   {
				   numberOfVal++;
			   }
		   } 
		   return (numberOfVal/a.length);
	}

    // You will need to insert some code here

public void print ()
{
	if(isLeaf())
	{
		System.out.print(getClassOfNode()+":"+getFractionOfType(getClassOfNode()));
	}
	else
	{
		System.out.println(testValue);
	}
}
}
