	public Node reverse(Node head)
	{
		if(head ==null || head.next == null)
		{
			return head;
		}
		Node newHeadNode = reverse(head.next);
		
		head.next.next = head;
		head.next = null;
		return newHeadNode;
	}
