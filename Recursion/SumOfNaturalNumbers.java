public static int SumOfNaturalNumbers(int number)
	{
		if(number <=1)
		{
			return number;
		}
		
		return number + SumOfNaturalNumbers(number -1);
	}
