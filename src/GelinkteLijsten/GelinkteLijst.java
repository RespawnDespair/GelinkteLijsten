package GelinkteLijsten;

public class GelinkteLijst {
	
	
	/**
	 * Alleen de gelinkte lijst heeft toegang tot de node
	 */
	private class Node {
		//Dit is de data die je opslaat
		Object data;
		
		// referenties/pijlen naar de volgende en vorige nodes
		Node next;
	}	
	
	
	private Node head;
        private Node tail;
	private int size;
	
	
	public GelinkteLijst() {
            size = 0;
	}
	
	
	Object getFirst() {
		return head.data;
	}
	
	
	Object getLast() {
		return tail.data; // dummy
	}	
	
	/**
	 * Voeg toe aan de voorkant
	 */
	void insertFirst(Object o) {
            Node newNode = new Node();
            newNode.data = o;
            newNode.next = head;
            head = newNode;
            size++;
            if (size==1)
            {
                tail = head;
            }
        }

	/**
	 * Voeg toe aan de achterkant
	 */
	void insertLast(Object o) {
            Node newNode = new Node();
            newNode.data = o;
            newNode.next = null;
            
            if (head == null)
            {
                head = newNode;
                head.next = null;
                tail = newNode;
                tail.next = null;
            }
            else
            {
                tail.next = newNode;
                tail = newNode;
            }
            
            size++;
            
            if (size==1)
            {
                head = tail;
            }
        }
	
	/**
	 * Voeg toe voor een ander element
	 */
	void insertBefore(Object o, Object before) 
        {
            Node current = head;
            while (current.next != null)
            {
                if (current.next.equals(before))
                {
                    Node newNode = new Node();
                    newNode.data = o;
                    newNode.next = current.next;
                    current.next = newNode;
                    
                    if (head == newNode.next)
                    {
                        head = newNode;
                    }
                }
                current = current.next;
            }
            
            size++;
        }
	
	/**
	 * Voeg toe na een ander element
	 */
	void insertAfter(Object o, Object after) 
        {
            Node current = head;
            while (current.next != null)
            {
                if (current.equals(after))
                {
                    Node newNode = new Node();
                    newNode.data = o;
                    newNode.next = current.next;
                    current.next = newNode;
                    
                    if (newNode.next == null)
                    {
                        tail = newNode;
                    }
                }
                current = current.next;
            }
            
            size++;
        }

	
	/**
	 * Verwijder een element
	 * @param data
	 */
	void remove(Object data) {
            if (head.data.equals(data))
            {
                head = head.next;
            }
            else
            {
                // niet head, dus kijken of het de next is
                Node current = head;
                while (!current.next.data.equals(data))
                {
                    current = current.next;
                }
                if (current.next != null && current.next.data.equals(data))
                {
                    if (current.next == tail)
                    {
                        tail = current;
                    }
                    current.next = current.next.next;
                }
            }
        }
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isFirst(Node current) {
		return head.equals(current); 
	}
	
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isLast(Node current) {
		return tail.equals(current); 
	}
	
	
	/**
	 * Het aantal elementen in de gelinkte lijst
	 * @return
	 */
	int getSize() {
		return size;
	}
}
