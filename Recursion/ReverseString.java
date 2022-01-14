public String reverseString(String str)
	{
		if(str.equals(""))
		{
			return str;
		}
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}
