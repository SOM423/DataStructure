public class ReverseUsingRecursion {

	public static void main(String[] args) {


		
		String str ="somesh";
		
		String string =reverse(str);
		
		System.out.println(string);


	}
	
	public static String reverse(String str)
	{
		if(str==null || str.length()<=1)
		{
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0); 			//recursively calling reverse method so second parameter should not mix with reverse method.
	}

}
