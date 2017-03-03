package LeetCode;
/**
 * Given an input string, reverse the string word by word.
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 */
public class ReverseString {
	public static String reverseWords(String s) {
		StringBuffer result = new StringBuffer();
		StringBuffer temp = new StringBuffer();
		int i, flag = 0, isAllSpace = 0;
		if (s.equals("")) {
			return "";
		}
		for (i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(" ")) {
				isAllSpace++;
			}
		}
		if (isAllSpace == s.length()) {
			return "";
		}
		for (i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(" ")) {
				if (flag == 1) {
					temp.append(" ");
					temp.append(result);
					result = temp;
					flag = 0;
					temp = new StringBuffer();
				}
			} else {
				temp.append(s.substring(i, i + 1));
				flag = 1;
			}

		}
		if (!(temp.toString().equals(""))) {
			temp.append(" ");
			temp.append(result);
			result = temp;
		}
		return result.substring(0, result.length() - 1);
	}

	public static void main(String args[]) {
		String s = "   h   ";
		System.out.println(reverseWords(s));
	}
}
