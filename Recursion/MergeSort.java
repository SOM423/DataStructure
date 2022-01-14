public static void merge(int[] arr,int start,int mid,int end)
	{
		//Build temp array to avoid modifying ext array.
		int[] temp = new int[end - start +1];
		
		int i=start, j=mid+1,k=0;
		
		//while both the Subarray Having values then try merging them.
		
		while(i<=mid && j<=end)
		{
			if(arr[i] <= arr[j])
			{
			 temp[k] = arr[i];	
			 i++;
			 k++;
			}
			else
			{
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		//Add rest of the Values from left subarray into result
		while(i<=mid)
		{
			temp[k]=arr[i];
			k++;i++;
		}
		
		// Adding rest of the values from right subarray into result
		while(j<=end)
		{
			temp[k]=arr[j];
			k++;j++;
		}
		
		for(i=start;i<=end;i++)
		{
			arr[i] = temp[i - start];
		}
	}
