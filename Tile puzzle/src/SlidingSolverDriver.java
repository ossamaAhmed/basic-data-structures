public class SlidingSolverDriver
{

	public static void main(String[] args)
	{
		String puzzle = "876543021";
		TileBoard t=new TileBoard(puzzle);
		//System.out.println(TileBoard.calcManhattanDistance(t));
		SlidingSolution solution = new SlidingSolver(puzzle).solvePuzzleAStar();
		if (solution==SlidingSolution.NO_RESPONSE)
		{
			System.out.println("A solution is non existent");
		}
		else
		{
			System.out.println(solution.getMoves());
			System.out.println(solution.getMoves().length());
		}
	}

}







