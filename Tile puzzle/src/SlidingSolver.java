import java.util.*;

public class SlidingSolver
{
	private static final int MAX_DISTANCE = 20;
	private PriorityQueue<TileBoard>p;

	/* You may add instance and class variables and methods as you see fit */

	/*
	 * Constructs a SlidingSolver with the given input board.
	 */
	public SlidingSolver(String initialBoard)
	{
		//creating the priority queue
		p=new PriorityQueue<TileBoard>(10,new TileBoardComparator());
		TileBoard t=new TileBoard(initialBoard);
		//adding the intial board to be the head 
		p.add(t);
	}

	/*
	 * Solves the puzzle by performing an A* search over the puzzle space.
	 */
	public SlidingSolution solvePuzzleAStar()
	{
		List<TileBoard> tile;
		//iterator to loop over the priority queue 
		Iterator<TileBoard> it;
		//terminating conditing if it reached the goal
		while (!TileBoard.isSameAsGoal(p.peek()))
		{
			tile=TileBoard.getNextBoards(p.peek());
			p.remove();
			for(int i=0;i<tile.size();i++)
			{
				it=p.iterator();
				//checking for smiliar TileBoard already in the queue
				while(it.hasNext())
				{
					TileBoard current= it.next();
					if(tile.get(i).equals(current))
					{
						//removing the Tile board if it has a bigger hueristic value
						if(evaluateHeuristic(tile.get(i))<evaluateHeuristic(current))
						{
							it.remove();
						}
					}
				}
				p.add(tile.get(i));
			}
			//terminating conditing if it reached max distance
			if(TileBoard.getNumMoves(p.peek())>MAX_DISTANCE)
			{
				break;
			}
		}
		if(TileBoard.isSameAsGoal(p.peek()))
		{
			return new SlidingSolution(p.peek().getMoves(),100);
		}
		return SlidingSolution.NO_RESPONSE;
	}

	/*
	 * Evaluates the given board.
	 */
	private int evaluateHeuristic(TileBoard p)
	{
		return TileBoard.getNumMoves(p) + TileBoard.calcManhattanDistance(p);
	}

	class TileBoardComparator implements Comparator<TileBoard>
	{
		public int compare(TileBoard a, TileBoard b)
		{
			if(evaluateHeuristic(a)>evaluateHeuristic(b))
			{
				return 1;
			}
			else if(evaluateHeuristic(a)<evaluateHeuristic(b))
			{
				return -1;
			}
			return 0;
		}
	}
}