import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="somesh";
		
		
		String string = reverseString(str.toCharArray()); //converting String into character array
		
		if(string.equals(str))
		{
			System.out.println("palindrome");
		}else
		{
			System.out.println("Not a Pallindrome");
		}
		
		System.out.println(string);

	}
	
	
	public static String reverseString(char[] str)
	{
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<str.length;i++) {
			
			stack.push(str[i]);
		}
		
		for(int i=0;i<str.length;i++) {
			
			str[i]=stack.peek();
			
			stack.pop();
			
		}
		
		
		return String.valueOf(str);  // converting character array to string
	}
	

}
