package com.tcs.String;

public class AllPallindromicSubstrings {

	public static void main(String[] args) {

		String str = "aabas";

		printPalindromicSubstrings(str);

	}

	public static void printPalindromicSubstrings(String str) {

		for (int i = 0; i < str.length(); i++) {
			String subStr = "";

			for (int j = i; j < str.length(); j++) {
				subStr += str.charAt(j);

				if (checkPalindrom(subStr)) {
					System.out.println(subStr);
				}
			}
		}
	}

	private static boolean checkPalindrom(String subStr) {

		String reverse = "";

		for (int i = subStr.length() - 1; i >= 0; i--) {
			reverse += subStr.charAt(i);
		}
		if (reverse.equalsIgnoreCase(subStr))
			return true;
		else
			return false;
	}

}
