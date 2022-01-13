	public void reverseLL(LinkedList ll)
	{
		Node node = new Node();
		while(ll.head !=null)
		{
		
		node.next = ll.head.next;
		ll.head.next = node.prev;
		node.prev = ll.head;
		ll.head = node.next;
		}
		ll.head = node.prev;
	}
