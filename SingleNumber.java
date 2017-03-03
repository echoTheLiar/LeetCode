package LeetCode;
/**
 * Given an array of integers, 
 * every element appears twice except for one. 
 * Find that single one.
 */
public class SingleNumber {
	public static int singleNumber(int[] A) {
        int result = 0; 
        for (int i : A) 
        	result ^= i ; 
        return result ;
    }
	public static void main(String args[]){
		int a[] = {41,61,55,44,55,41,8,61,8};
		System.out.println("singleNumber = "+singleNumber(a));
	}
}
