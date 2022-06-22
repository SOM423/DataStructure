public class ReverseStringIterator {

	public static void main(String[] args) {

		String str = "somesh";

		String string = reverse(str);
		String string1 = reverseString(str);

		System.out.println(string);
		System.out.println(string1);
	}

	// Method 1 using StringBuffer
	public static String reverse(String str) {

		StringBuffer sb = new StringBuffer(); // for Append no need to pass string as arg to Buffer Class

		for (int i = str.length() - 1; i >= 0; i--) {

			sb.append(str.charAt(i)); // read each character by character
		}
		return sb.toString();
	}

	// Method 2 Without using StringBuffer
	public static String reverseString(String str) {
		String reverse = "";
		if (str == null || str.length() < 1) {
			return str;
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}

}
