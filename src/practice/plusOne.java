package practice;
import java.lang.reflect.Array;
import java.util.Arrays;

public class plusOne {
    public static void main(String args []){
        int[]digits={9};
        System.out.println("input = [9]");
        System.out.println(Arrays.toString(plus(digits)));
        int []digits1={2,9};
        System.out.println("input = [1,9]");
        System.out.println(Arrays.toString(plus(digits1)));
        int []digits2={1,2,3};
        System.out.println("input = [1,2,3]");
        System.out.println(Arrays.toString(plus(digits2)));
    }
    public static int [] plus(int [] digits){
        for (int i= digits.length-1;i>=0;i--){
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
//class Solution {
//    public static int[] plusOne(int[] digits) {
//        for(int i=digits.length-1;i>=0;i--){
//            if(digits[i]<9){
//                digits[i]++;
//                return digits;
//            }
//            digits[i]=0;
//        }
//        digits=new int[digits.length+1];
//        digits[0]=1;
//        return digits;
//    }
//}
