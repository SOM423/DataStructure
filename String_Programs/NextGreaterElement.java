public class NextGreaterElement {

	public static void main(String[] args) {

		int n =12;
		
		int result = nextGreaterElemenmt(n);
		System.out.println(result);
	}

	
	public static int nextGreaterElemenmt(int m)
	{
		long n = m;
		int[] count = new int[10];
		int currRem=-1;
		int prevRem=-1;
		
		while(n > 0)
		{
			currRem = (int) n % 10;
			n = n/10;
			
			count[currRem]++;
			if(prevRem > currRem)
			{
				int num = currRem + 1;
				while(count[num] ==0) num++;
				count[num]--;
				n = n*10 + num;         //Fixed Element
				
				for(int i=0; i<10; i++)
				{
					while(count[i] > 0)
					{
						count[i] --;
						n = n*10 + i;
					}
				}
				return n > Integer.MAX_VALUE ? -1 : (int)n;
				
			}
			prevRem = currRem;
		}
		return -1;
	}
}
