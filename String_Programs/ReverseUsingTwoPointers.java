public class ReverseUsingTwoPointers {

	public static void main(String[] args) {

		String str="somesh";
		
		String string =reverse(str);
		
		System.out.println(string);
	}
	
	public static String reverse(String str) {
		
		int n=str.length();
		char[] ch = str.toCharArray();
		char temp;
		
		for(int i=0,j=n-1; i<j;i++,j--)
		{
			temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		
		return String.valueOf(ch);
	}

}
