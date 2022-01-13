public void removeDupsUnsortedLL(LinkedList ll)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		Node current = ll.head;
		Node prev = null;
		while(current != null)
		{
			int curval = current.value;
			if(hs.contains(curval))
			{
				prev.next = current.next;
				ll.size --;
			}
			else
			{
				hs.add(curval);
				prev = current;
			}
			current =current.next;
		}
	}
