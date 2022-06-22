
public class ReverseStringInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Somesh";
		
		String string =reverse(str);
		System.out.println(string);
		
		

	}
	
	public static String reverse(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		     sb.reverse();
	
		     return sb.toString();
	}

}
