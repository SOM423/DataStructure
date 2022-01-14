	public static int binarySearch(int[] A,int left,int right,int valueTobeSearch)
	{
		if(left > right)
		{
			return -1;
		}
		
		int mid = (left + right)/2;
		
		if(valueTobeSearch == A[mid])
		{
			return mid;
		}
		
		if(valueTobeSearch < A[mid])
		{
			return binarySearch(A, left, mid-1, valueTobeSearch);
		}
		 
		return binarySearch(A, mid+1, right, valueTobeSearch);
	}
