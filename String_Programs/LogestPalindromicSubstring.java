public class LogestPalindromicSubstring {

	public static void main(String[] args) {
String str="forgeeksskeegfor";
		
		String string=printSubstring(str);
		
		System.out.println(string);
		
		
	}
	
	public static String printSubstring(String str) {
		int maxLength=0;
		String maxSubstr="";
		for(int i=0;i<str.length();i++)
		{
			String substr="";
			for(int j=i;j<str.length();j++)
			{
				substr += str.charAt(j);
				if(checkPalindrom(substr) && substr.length() > maxLength)
				{
					maxLength=substr.length();
					maxSubstr=substr;
				}
			}
		}
		return maxSubstr;
	}
	
	
	public static boolean checkPalindrom(String str) {
		
		String reverse="";
		
		if(str==null || str.length() <1)
		{
			return true;
		}
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse += str.charAt(i) ;
		}
		if(reverse.equalsIgnoreCase(str))
			return true;
		else
			return false;
			
	}

}
