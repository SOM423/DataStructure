public static boolean isPalindrom(String str)
	{
		if(str.length()==0 || str.length()==1)
		{
			return true;
		}
		
		if(str.charAt(0) == str.charAt(str.length() -1))
		{
			return isPalindrom(str.substring(1, str.length() -1));
		}
		return false;
		
	}
