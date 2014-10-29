import SingleLinkedLists.*;

public class TestSingleLinkedList {
    
    public static void main(String[] args) {
	
	SingleLinkedLists l = new SingleLinkedLists();
	l.insertFirst("Ann");
	System.out.println("List after inserting Ann");
	l.print();

	l.insertFirst("Bob");
        System.out.println("List after inserting Bob");
	l.print();

	l.insertLast("Cathy");
        System.out.println("List after inserting Cathy last");
	l.print();

	try{
	    System.out.println("Removed last element: " + l.removeLast());
	    System.out.println("List after removal: ");
	    l.print();
	} catch (EmptyListException e) {
	    System.out.println(e);
	}

	System.out.println("Is Bob still in the list?");
	System.out.println(l.find("Bob"));

        try{
            System.out.println("Removed first element: " + l.removeFirst());
            System.out.println("List after removal: ");
            l.print();
        } catch (EmptyListException e) {
            System.out.println(e);
        }

	System.out.println("Is Bob still in the list?");
	System.out.println(l.find("Bob"));
    }
}