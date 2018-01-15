
public class LinkedList {

	public Node head;
	public int listLength;
	
	public LinkedList(int val) {
		head = new Node(val);
		listLength = 0;
	}
	
	public void addToTail(int d) {
		Node end = new Node(d);
		Node current = head;
		
		while (current.next != null) {
			current = current.next;
		}
		current.next = end;
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
	
	public void moveNodeFromAToB(int i, int j) {
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
		
		current1.value = current2.value;
	
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
