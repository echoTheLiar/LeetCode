package LeetCode;
/**
 * Determine whether an integer is a palindrome. 
 * Do this without extra space.
 */
public class PalindromeInteger {
	public static boolean isPalindrome(int x) {
		int bitCount = 1;
		int i;
		int middle = 0;
		int temp;
		int div;
		if (x < 0) {
			return false;
		}
		if (x < 10) {
			return true;
		}
		temp = x;
		while (temp / 10 != 0) {
			bitCount++;
			temp = temp / 10;
		}
		if (bitCount % 2 == 0) {
			middle = bitCount / 2;
		} else {
			middle = bitCount / 2 + 1;
		}
		div = bitCount;
		for (i = bitCount; i > middle; i--) {
			int high = x / (int) (Math.pow(10, div - 1));
			int low = x % 10;
			if (high == low) {
				x = x - high * ((int) Math.pow(10, div - 1));
				x = x / 10;
				div = div - 2;
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.println(isPalindrome(123));
	}
}
