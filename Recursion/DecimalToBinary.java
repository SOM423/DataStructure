//initially remRes Should be Pass as ""
	public static String convertBinary(int decimal, String remRes)
	{
		if(decimal == 0)
		{
			return remRes;
		}
		
		 remRes = remRes + decimal % 2;
		 return convertBinary(decimal/2, remRes);
	}
