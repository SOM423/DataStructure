public class Main {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.createSinglyLL(1);
		ll.insertNode(2);
		ll.insertNode(7);
		ll.insertNode(4);
		ll.insertNode(5);
		ll.insertNode(9);
		ll.traverseLL();
		Solution sol = new Solution();
		//sol.removeDups(ll);
		//sol.removeDupsUnsortedLL(ll);
		//sol.pairwiseSwap(ll);
		//sol.reverseLL(ll);
		//sol.reverse(ll.head);
		sol.PrintMiddle(ll);
		//sol.deleteMiddle(ll);
		//ll.head = sol.reverseSLL(ll.head);
		ll.head =sol.reverse(ll.head, 3);
		ll.traverseLL();
		
		
	}

}
