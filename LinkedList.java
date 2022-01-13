
public class LinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	//public int count =0;
	
	public void createSinglyLL(int nodeValue)
	{
		
		Node node =new Node();
		node.value=nodeValue;
		node.next = null;
		head = node;
		tail = node;
		size = 1;
		
	}
	
	public void insertNode(int nodevalue)
	{
		Node newnode = new Node();
		newnode.value = nodevalue;
		newnode.next = null;
		tail.next = newnode;
		tail = newnode;
		size ++;
	}
	
	public void traverseLL()
	{
			if(head != null) 
			{
				Node tempnode = head;
				//count =0;
				for(int i=0;i<size;i++)
				{
					System.out.print(tempnode.value);
					//count++;
					if(i != size-1)
					{
						System.out.print(" --> ");
					}
					tempnode = tempnode.next;
				}
				System.out.println();
			}
			
		}
		
	
	

}
