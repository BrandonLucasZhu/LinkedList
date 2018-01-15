
public class LinkedList {

	public Node head;
	public Node tail;
	public int listLength;
	
	public LinkedList(int val) {
		head = new Node(val);
		tail = null;
		listLength = 0;
	}
	
	public void addToTail(int d) {
		Node end = new Node(d);
		Node current = head;
		
		while (current.next != null) {
			current = current.next;
		}
		current.next = end;
		current.next.next = tail;
	}
	
	public void addToHead(int d) {
		Node first = new Node(d); 
		Node current = head;
		int prevHeadVal;
		//Save prev head value
		prevHeadVal = current.value;
		
		//Save linked list values after the head
		Node saveNextNode = current.next;
		
		//change head value
		current.value = first.value;
	
		first.value = prevHeadVal;
		
		current.next = first;
		//point back to the rest of the list 
		current.next.next = saveNextNode;
		
	}
	
	
	public void deleteNode(int d) {
		Node current = head;
		
		while (current.next != null) {
			if (current.next.value == d) {
				current.next = current.next.next;
			}
		current = current.next;
		}
	}
	
	public void deleteNodeIndex(int i) {
		Node current = head;
		int traverse = 0;
		
		while (traverse < i - 1) {
			current = current.next;
			traverse++;
		}
		current.next = current.next.next;
		
	}
	
	public void moveNodeToBeginning(int i) {
		Node current = head;
		int firstNode = current.value;
		
		int traverse = 0;
		
		while (traverse < i - 1) {
			current = current.next;
			traverse++;
		}
		head.value = current.next.value;
		current.next.value = firstNode;
	
	}
	
	public void swapNodeValue(int i, int j) {
		Node current1 = head;
		Node current2 = head;
		
		int traverse1 = 0;
		int traverse2 = 0;
		
		while (traverse1 < i - 1) {
			current1 = current1.next;
			traverse1++;
		}
		
		while (traverse2 < j - 1) {
			current2 = current2.next;
			traverse2++;
		}
		int saveJNodeVal = current2.next.value;
		current2.next.value = current1.next.value;
		current1.next.value = saveJNodeVal;
	
	}
	
	
	
	public void showLL() {
		Node current = head;
		
		while (current.next != null) {
			System.out.print(current.value+ " -> ");
			current = current.next;
		}
		System.out.println(current.value);
		
	}
	
	
	
	
	
		
}
