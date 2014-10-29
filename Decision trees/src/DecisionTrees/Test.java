package DecisionTrees;

public class Test
{
	public static void main(String[] args)
	{
		Instance[] example=new Instance[7];
		example[0]=new Instance(1,true);
		example[1]=new Instance(3,true);
		example[2]=new Instance(4,false);
		example[3]=new Instance(5,false);
		example[4]=new Instance(6,true);
		example[5]=new Instance(7,false);
		example[6]=new Instance(8,false);
		DTNode n =new DTNode(example);
		DecisionTree a=new DecisionTree(example);
		a.print();

	}

}
