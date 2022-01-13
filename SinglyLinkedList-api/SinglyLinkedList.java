public class SinglyLinkedList {

	public Node head;
	public Node tail;
	public int size;
	
	public static void main(String[] args) {

		SinglyLinkedList sLL = new SinglyLinkedList();
		sLL.createSinglyLL(5);
		System.out.println(sLL.head.value);
		sLL.insertInLinkedList(6, 0);
		System.out.println(sLL.head.value);
		sLL.insertInLinkedList(7, 2);
		sLL.insertInLinkedList(1, 4);
		sLL.travarseSinglyLinkedList();
		sLL.searchNode(6);
		sLL.deletionOfNode(2);
		sLL.travarseSinglyLinkedList();
		sLL.deleteSLL();
		sLL.travarseSinglyLinkedList();
		
		
	}
	
	//Creation in LL --> O(1)
	public Node createSinglyLL(int nodeValue)
	{
		head = new Node();
		
		Node node =new Node();
		node.next = null;
		node.value=nodeValue;
		head = node;
		tail = node;
		size = 1;
		
		return head;
	}
	
	// Insertion in LL --> O(N)
	public void insertInLinkedList(int nodeValue, int location)
	{
		Node node = new Node();
		node.value = nodeValue;
		if(head ==null)
		{
			createSinglyLL(nodeValue);
			return;
		}
		else if(location == 0)
		{
			node.next =head;
			head = node;
		}
		
		else if(location >=size)
		{
			node.next = null;
			tail.next = node;
			tail = node;
		}
		else
		{
			Node tempNode = head;
			int index=0;
			while(index < location -1)
			{
				tempNode=tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}
		size ++;
	}
	
	
	
	//Traversing in LL --> O(N)
	public void travarseSinglyLinkedList()
	{
		if(head ==null)
		{
			System.out.println("SLL Does not exists.........");
		}
		else
		{
			Node tempNode = head;
			
			for(int i=0; i<size; i++)
			{
				System.out.print(tempNode.value);
				if(i != size -1)
				{
					System.out.print("-->");
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println();
	}
	
	//Searching in LL  --> O(N)
	
	boolean searchNode(int nodeValue)
	{
		if(head !=null)
		{
			Node tempNode = head;
			for(int i=0;i<size;i++)
			{
				if(tempNode.value == nodeValue)
				{
					System.out.print("Found the Value at the Location: "+i +"\n");
					return true;
				}
				tempNode = tempNode.next;  
			}
		}
		System.out.println("Value Does not Exists.........");
		return false;
	}
	
	//Deletion of the node from Singly LL
	
	public void deletionOfNode(int location)
	{
		if(head == null)
		{
			System.out.println("The SLL Does not Exists...........");
			return;
		}
		else if(location ==0)
		{
			head = head.next;
			size --;
			if(size ==0)
			{
				tail = null;
			}
		}
		else if (location >=size)
		{
			Node tempNode =head;
			for(int i=0; i<size-1;i++)
			{
				tempNode =tempNode.next;
			}
			if(tempNode == head)
			{
				head=tail=null;
				size--;
				return;
			}
			tempNode.next = null;
			tail = tempNode;
			size --;
		}
		else
		{
			Node tempNode = head;
			for(int i=0; i<location -1;i++)
			{
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
		
	}
	
	//Delete Entire SLL
	
	public void deleteSLL()
	{
		head=null;
		tail=null;
		System.out.println("SLL Deleted Succesfully............");
	}
	
	
	

}

class Node
{
	public int value;
	public Node next;
}
