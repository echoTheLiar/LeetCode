package LeetCode;
/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class ReverseInteger {
    public static int reverse(int x) {
        int bitCount = 1;
        int temp;
        int i;
        int reverseResult = 0;
        int originalX;
        int beforeReverse;
        int overflow = 0;
        int multiResult;
        originalX = x;
        if(originalX < 0){
            x = -x;
        }
        temp = x;
        while(temp/10 != 0){
            bitCount++;
            temp = temp/10;
        }
        for(i = 0;i < bitCount;i++){
            temp = x%10;
            beforeReverse = reverseResult;
            multiResult = temp*(int)Math.pow(10,bitCount-i-1);
            //判断乘法是否溢出
            if(temp!=0 && Integer.MAX_VALUE/temp < (int)Math.pow(10,bitCount-i-1)){
                overflow = 1;
                break;
            }
            reverseResult = beforeReverse + multiResult; 
            //判断加法是否溢出，前提是加数与被加数都大于0
            if(reverseResult < 0){
                overflow = 1;
                break;
            }
            
            x = x/10;
        }
        if(overflow == 1){
            return 0;
        }
        if(originalX < 0){
            reverseResult = -reverseResult;
        }
        return reverseResult;
    }
    public static void main(String args[]) {
		System.out.println(reverse(1563847412));
	}

}
