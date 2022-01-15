package LinkedListProblems;


public class Main {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		LinkedList llb = new LinkedList();
		ll.createSinglyLL(1);
		ll.insertNode(2);
		ll.insertNode(7);
		ll.insertNode(4);
		ll.insertNode(5);
		ll.insertNode(9);
		llb.createSinglyLL(6);
		llb.insertNode(8);
		llb.traverseLL();;
		Solution sol = new Solution();
	  Node abc =sol.mergeList(ll.head, llb.head);
	  ll.traverseSLL();
		
	}

}
