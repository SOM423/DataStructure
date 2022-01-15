public class Solution
{
	public Node mergeList(Node A,Node B)
	{
	
		if(A == null)
		{
			return B;
		}
		if(B == null)
		{
			return A;
		}
		
		if(A.value < B.value)
		{
			A.next = mergeList(A.next , B);
			return A;
		}
		else
		{
			B.next = mergeList(A, B.next);
			return B;
		}
	}
}
