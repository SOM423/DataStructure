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

OR


        public Node reverseSLL(Node head)
	{
		Node cur = head;
		Node prev = null;
		while(cur !=null)
		{
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
	}
