package SingleLikedLists;

public class EmptyListException extends Exception 
{

    public EmptyListException() {
	super("Illegal operation in an empty list");
    }
}