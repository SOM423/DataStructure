public void pairwiseSwap(LinkedList ll)
	{
		Node current = ll.head;
		while(current != null && current.next != null)
		{
			int temp = current.value;
			current.value = current.next.value;
			current.next.value = temp;
			
			current = current.next.next;
		}
	}
