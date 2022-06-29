public class PallindromicNumber {

	public static void main(String[] args) {
		int num = 121;
		System.out.println(isPalindrome(num));
	}

	public static boolean isPalindrome(int x) {

		int sum = 0;
		int n = x;
		int rem = 0;

		while (n > 0) {
			rem = n % 10;
			n = n / 10;

			sum = sum * 10 + rem;
		}
		if (sum == x)
			return true;
		else
			return false;

	}

}
