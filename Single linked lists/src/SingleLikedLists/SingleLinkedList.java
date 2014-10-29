package SingleLikedLists;

import java.util.NoSuchElementException;

public class SingleLinkedList {

    Node head;

    public SingleLinkedList() 
    {
    	head = null;
    }

    public boolean isEmpty() 
    {
    	return (head == null);
    }

    // Method for inserting an object in the first position of a list
    public void insertFirst(Object o) 
    {
    	// Pack o into a Node 
    	Node n = new Node(o);

    	// put n at the beginning of the list
    	n.next = head;

    	// and modify the head of the list
    	head = n;
    }

    // Method for inserting an object in the last position of a list                                         
    public void insertLast(Object o) 
    {
    	// Pack o into a Node
    	Node n = new Node(o);

    	// If the list is empty, we simply have to change head
    	if (head == null) 
    	{
    		head = n;
    		return;
    	}
	// The list is not empty, so we have to traverse it, stopping at the last element
    	Node crt = head; 
    	while (crt.next != null) 
    		crt = crt.next;
    	crt.next = n;
    }

    // Method for printing the entire list (demonstrates traversal)
    public void print() 
    {
    	for (Node crt = head; crt != null; crt = crt.next) 
	    System.out.println(crt.content);
    }

    // Method for removing the first element in the list; the object is returned
    // Note that this is O(1), since we have a sequence of primitive operations
    public Object removeFirst() throws EmptyListException 
    {

    	if (head == null) throw new EmptyListException();
	
    	// Put a "finger" on the current head
    	Node crt = head;

    	// Move the head to the appropriate spot
    	head = head.next;

    	// Figure out what we need to return
    	Object o = crt.content;

    	// Clear out all pointer - the garbage collector will take care of this area in memory
    	crt.content = null;
    	crt.next = null;

    	// And we're done
    	return o;
    }


    // Method for removing the last element in the list; the object is returned
    // This is O(n) because we need to traverse the list
    public Object removeLast() throws EmptyListException 
    {
   
    	if (head == null) throw new EmptyListException();

    	Object o;

    	// If there is only one element, we need to modify the head of the list
    	if (head.next == null) 
    	{
    		o = head.content;
    		head.content = null;
    		head = null;
    		return o;
    	}

		// We need to go to the second-to-last element
		Node crt = head;
		while (crt.next.next != null)
		    crt = crt.next;
	
		// Now get the content
		o = crt.next.content;
		
		// Remove all references that are not needed
		crt.next.content = null;
		crt.next = null;
	
		// And we're done
		return o;
    }
    public Object removeAfter(Object O) throws Exception
    {
    	Object o;
    	if (head == null) 
    	{
    		throw new EmptyListException();
    	}
    	if(!find(O))
    	{
    		throw new NoSuchElementException();
    	}
    	else
    	{
    		Node crt=head;
    		while(!crt.content.equals(O))
    		{
    			crt=crt.next;
    		}
    		//then its a tail
    		if(crt.next==null)
    		{
        		throw new NoSuchElementException();

    		}
    		Node n=crt.next;
    		crt.next=crt.next.next;
    		o=n.content;
    		n.content=null;
    		n.next=null;
    		return o;
    	}
    	
    	
    }
    public Object removeBefore(Object O) throws Exception
    {
    	if (head == null) 
    	{
    		throw new EmptyListException();
    	}
    	if(!find(O))
    	{
    		throw new NoSuchElementException();
    	}
    	else
    	{
    		Object o;
    		Node crt=head;
    		if(crt.content.equals(O))
    		{
    			throw new NoSuchElementException();
    		}
    		if(head.next.content.equals(O))
    		{
    			Node n=head;
    			head=head.next;
    			o=n.content;
    			n.content=null;
    			n.next=null;
    			return o;
    		}
    		while(!crt.next.next.content.equals(O))
    		{
    			crt=crt.next;
    		}
    		Node n=crt.next;
    		crt.next=crt.next.next;
    		o=n.content;
    		n.content=null;
    		n.next=null;
    		return o;
    	}
    }
    // Method for finding an object in a list; returns true if the object is found
    public boolean find (Object o)
    {
    	if (head == null) return false;
	
		// We need an index in the list
		for (Node crt = head; crt != null; crt = crt.next) 
		{
		    if (o.equals(crt.content)) return true;
		}
		return false;
    }
}