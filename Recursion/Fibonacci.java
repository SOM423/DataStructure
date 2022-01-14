public static long fibonacci(long num)
	{
		if(num ==0 || num == 1)
		{
			return num;
		}
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
