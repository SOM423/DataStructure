public void removeDups(LinkedList ll)
	{
		Node current = ll.head;
		while(current !=null && current.next !=null)
		{
			if(current.value == current.next.value)
			{
				current.next = current.next.next;
				ll.size--;
			}
			else
			{
				current = current.next;
			}
			
		}
	}

