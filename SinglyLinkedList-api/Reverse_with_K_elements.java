public static Node reverse(Node head, int k)
    {
        Node temp =head;
        Node cur = head;
        Node prev = null;
        int count =0;
            while(cur !=null && count < k)
        {
             temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            count++;
        }
        if(cur !=null)
        {
            head.next=reverse(temp,k);
        }
        return prev;
    }
	
}
