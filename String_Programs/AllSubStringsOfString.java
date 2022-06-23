public class AllSubStringsOfString {

	public static void main(String[] args) {

		String str = "abcd";

		printSunstrings(str);

	}

	public static void printSunstrings(String str) {

		for (int i = 0; i < str.length(); i++) {
			String substr = "";

			for (int j = i; j < str.length(); j++) {
				substr += str.charAt(j);
				System.out.println(substr);
			}
		}
	}

}
