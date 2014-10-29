import java.util.*;

public class TileBoard
{
	//String representation of the solution board
	private static final String goalBoard = "123456780";

	//String representation of a puzzle board
	private  String myBoard;

	//String representation of the list of moves that generated this board
	private String myMoves;

	/* You may add more attributes and methods as you see fit */

	//Constructors acts as setters also
	public TileBoard(String board)
	{
		myBoard=board;
		myMoves="";
	}
	public TileBoard(String board,String moves)
	{
		myBoard=board;
		myMoves=moves;
	}
	
	//Getters
    public String getMoves()
    {
    	return myMoves;
    }
    public String getBoard()
    {
    	return myBoard;
    }
	/*
	 * Returns a list of boards that are one move away.  This list *DOES NOT* contain the
	 * previous board, as this would undo a moving we just made
	 */
	public static List<TileBoard> getNextBoards(TileBoard b)
	{
			String newTile;
			TileBoard t;
			List<TileBoard> tile=new ArrayList<TileBoard>();
			//right move if not in the last column 
			if(b.myBoard.indexOf("0")!=2&&b.myBoard.indexOf("0")!=5&&b.myBoard.indexOf("0")!=8)
			{
				newTile=swap(b.myBoard,b.myBoard.indexOf('0'),b.myBoard.indexOf('0')+1);
				t=new TileBoard(newTile,b.myMoves+"R");
				tile.add(t);
			}
			//left move if not in the first column 
			if(b.myBoard.indexOf("0")!=0&&b.myBoard.indexOf("0")!=3&&b.myBoard.indexOf("0")!=6)
			{
				newTile=swap(b.myBoard,b.myBoard.indexOf('0'),b.myBoard.indexOf('0')-1);
				t=new TileBoard(newTile,b.myMoves+"L");
				tile.add(t);
			}
			// move up case where it is not in the first row of the tile
			if(b.myBoard.indexOf("0")>2)
			{
				newTile=swap(b.myBoard,b.myBoard.indexOf('0'),b.myBoard.indexOf('0')-3);
				t=new TileBoard(newTile,b.myMoves+"U");
				tile.add(t);
			}
			//move down case where it is not in the last row
			if(b.myBoard.indexOf("0")<6)
			{
				newTile=swap(b.myBoard,b.myBoard.indexOf('0'),b.myBoard.indexOf('0')+3);
				t=new TileBoard(newTile,b.myMoves+"D");
				tile.add(t);
			}
		return tile;
	}
	
	//swaps two characters in an existing string and returnsthe new string 
	public static String swap(String s,int a,int b)
	{
		String newString="";
		for(int i=0;i<s.length();i++)
		{
			if(i==a)
			{
				newString=newString+s.charAt(b);
			}
			else if(i==b)
			{
				newString=newString+s.charAt(a);

			}
			else
			{
				newString=newString+s.charAt(i);
			}
		}
		return newString;
	}
	/*
	 * Returns the number of moves from the initial board
	 */
	public static int getNumMoves(TileBoard b)
	{
		return b.myMoves.length();
	}

	/*
	 * Evaluates the given board using the Manhattan distance heuristic.
	 */
	//checks if the tile board reached the goal one
	public static boolean isSameAsGoal(TileBoard b)
	{
		if(b.myBoard.equals(goalBoard))
		{
			return true;
		}
		return false;
	}
	//checks if the current TileBoard is equal to the given TileBoard b in terms of the board string only 
	public  boolean isEquals(TileBoard b)
	{
		if(b.myBoard.equals(this.myBoard))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//return the row number where a number/character exists 
	public static int Rownum(int x)
	{
		int val=0;
		//both in first row 
		if(x>-1&&x<3)
		{
			val=1;
		}
		//both in second row
		else if(x>2&&x<6)
		{
			val=2;
		}
		//both in last row
		else 
		{
			val=3;
		}
		return val;
		
	}
	//returns teh col number where a number/character exists
	public static int colnum(int x)
	{
		int val=0;
		//both in first row 
		if(x==0||x==3||x==6)
		{
			val=1;
		}
		//both in second row
		else if(x==1||x==4||x==7)
		{
			val=2;
		}
		//both in last row
		else 
		{
			val=3;
		}
		return val;
		
	}
	//claculates manhattanDist using the diff in row number+diff in col numbers 
	public static int calcManhattanDistance(TileBoard b)
	{
		int manDist=0;
		char x=49;//equivilant to x='1'
		// 
		for(int i=0;i<8;i++)
		{	
			//i is the right position for character x that it should be in		
			manDist=manDist+Math.abs(Rownum(b.myBoard.indexOf(x))-Rownum(i))+Math.abs(colnum(b.myBoard.indexOf(x))-colnum(i));
			x=(char) (x+1);
		}
		return manDist;
	}
}