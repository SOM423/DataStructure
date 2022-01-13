public void PrintMiddle(LinkedList ll)
	{
		Node first = ll.head;
		Node last = ll.head;
		while(last !=null && last.next !=null)
		{
			first = first.next;
			last = last.next.next;
		}
		System.out.println("Middle Element is :"+first.value);
	}
