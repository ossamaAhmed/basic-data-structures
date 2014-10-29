package DecisionTrees;

public class DecisionTree 
{
	DTNode root;

    public DecisionTree(Instance[] instances) 
    {
    	root=new DTNode(instances);
    	Partition(root);
    }
    
    // a recursive function that partitions each node based on the best entropy
    public void Partition(DTNode n)
    {
    	if(!n.isNodePure())
    	{
	    	int cutOff=n.getTheBestEntropy();
	    	//making the left node
	    	Instance[] leftPartition=new Instance[cutOff+1];
	    	for(int i=0;i<cutOff+1.;i++)
	    	{
	    		leftPartition[i]=new Instance(n.a[i].getAttribute(),n.a[i].getLabel());
	    	}
	    	n.left=new DTNode(leftPartition);
	    	Instance[] rightPartition=new Instance[n.a.length-cutOff-1];
	    	for(int i=cutOff+1;i<n.a.length;i++)
	    	{
	    		rightPartition[i-cutOff-1]=new Instance(n.a[i].getAttribute(),n.a[i].getLabel());
	    	}
	    	n.right=new DTNode(rightPartition);
	        Partition(n.left);
	        Partition(n.right);
    	}
    	
    }
    
    public void prune(int count)
    {
    	prune(count,root);
    }
    
    public void prune (int count,DTNode n)
    {
    	boolean delete=false;
    	if(n.left.isLeaf())
    	{
    		if(n.left.a.length<count)
    		{
    			delete=true;
    		}
    	}
    	else
    	{
    		prune(count,n.left);
    	}
    	if(n.right.isLeaf())
    	{
    		if(n.right.a.length<count)
    		{
    			delete=true;;
    		}
    	}
    	else
    	{
    		prune(count,n.right);
    	}
    	if(delete)
    	{
    		deleteChildren(n);
    	}
    }
    public void deleteChildren (DTNode n)
    {
    	if(n.left.isLeaf())
    	{
    		n.left=null;
    	}
    	else
    	{
    		deleteChildren(n.left);
    		n.left=null;
    	}
    	if(n.right.isLeaf())
    	{
    		n.right=null;
    	}
    	else
    	{
    		deleteChildren(n.right);
    		n.right=null;
    	}
    }
     public void print()
    {
    	String indent="";
    	print(root,indent);
    }
    public void print(DTNode n,String s)
    {
    	System.out.print(s);
    	n.print();
    	System.out.println("");
    	s+="        ";
    	if(!n.isLeaf())
    	{
    	print(n.left,s);
    	print(n.right,s);
    	}
    }
 
	
    public boolean classify(double input) 
    {
	// Insert your code here
    	DTNode crt=root;
    	while(true)
    	{
    		if(crt.isLeaf())
    		{
    			print();
    			return crt.getClassOfNode();
    		}
    		if(crt.testValue<input)
    		{
    			crt=crt.right;
    		}
    		else
    		{
    			crt=crt.left;
    		}
    		
    	}
    }

    public int getheight(DTNode n)
    {
    	if(n.isLeaf())
    	{
    		return 1;
    	}
    	else
    	{
    		return 1+Math.max(getheight(n.right), getheight(n.left));
    	}
    }

   /* public void print() {
	// Insert your code here
    }*/
}