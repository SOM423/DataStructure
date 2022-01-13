public void deleteMiddle(LinkedList ll)
	{
		Node first = ll.head;
		Node last = ll.head;
		int count =0;
		while(last !=null && last.next !=null)
		{
			first=first.next;
			last=last.next.next;
			count ++;
		}
		Node tempnode = ll.head;
		for(int i=0;i<count-1;i++)
		{
			tempnode = tempnode.next;
		}
		tempnode.next =tempnode.next.next;
		ll.size--;
		
	}
