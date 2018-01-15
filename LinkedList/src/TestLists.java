
public class TestLists {
	
	private LinkedList L;
	
	public static void main(String[] args) {
		LinkedList L = new LinkedList(5);
		L.addToTail(5);
		L.addToTail(3);
		L.addToTail(7);
		L.addToTail(8);
		L.addToTail(1);
		
		L.showLL();
		System.out.print("Delete the first Node value that is 5 \n");
		L.deleteNode(5);
		L.showLL();
		System.out.print("Delete index 3 to head \n");
		L.deleteNodeIndex(3);
		L.showLL();
		System.out.print("Move index 2 to head \n");
		L.moveNodeToBeginning(2);
		L.showLL();
		
		L.addToTail(1);
		L.addToTail(2);
		L.addToTail(3);
		System.out.print("Append 1,2,3 to tail and swap index 1 and 4 \n");
		L.swapNodeValue(1, 4);
		L.showLL();
		
		System.out.print("Append to head \n");
		
		L.addToHead(8);
		L.showLL();
		
		
	}
	
	
}
