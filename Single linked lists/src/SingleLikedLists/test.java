package SingleLikedLists;

public class test {
    
    public static void main(String[] args) {
    SingleLinkedList l = new SingleLinkedList();
	l.insertFirst("Ann");
//	System.out.println("List after inserting Ann");
//	l.print();
	l.insertFirst("Bob");
	l.insertFirst("Max");
	l.insertFirst("Lily");
	l.insertFirst("john");
	l.insertFirst("Trottier");	
//        System.out.println("List after inserting Bob");
//	l.print();
	l.insertFirst("Cathy");
    System.out.println("List");
	l.print();
	
	try{
	System.out.println();
	System.out.println("We remove lily ");
	l.removeAfter("Ann");
	System.out.println();
	l.print();
	}catch(Exception e)
	{
		System.out.println("There is nothing before Cathy");
	}
    }

	//we try with first and last element again
	
	
	//dont need all of the rest to test new methods
//	try{
//	    System.out.println("Removed last element: " + l.removeLast());
//	    System.out.println("List after removal: ");
//	    l.print();
//	} catch (EmptyListException e) {
//	    System.out.println(e);
//	}
//
//	System.out.println("Is Bob still in the list?");
//	System.out.println(l.find("Bob"));
//
//        try{
//            System.out.println("Removed first element: " + l.removeFirst());
//            System.out.println("List after removal: ");
//            l.print();
//        } catch (EmptyListException e) {
//            System.out.println(e);
//        }
//
//	System.out.println("Is Bob still in the list?");
//	System.out.println(l.find("Bob"));
//	
	
    }
