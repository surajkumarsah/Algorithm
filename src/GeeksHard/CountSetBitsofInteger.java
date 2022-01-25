package GeeksHard;

/*
Count Bits of Integer: Here, need to find out nuber of 1s contain in the binary representation.

Example:
n = 6: 110: no. of 1s = 2.
n = 20: 10100: no. of 1s = 2.
n = 13: 1101: no. of 1s = 3.


Algorithm:
1. continue loop until n>0
2. count = count + (n & 1): & - bitwise and operator.
3. n = n >> 1: right sift operator
4. Finish



&& - logical and operator
& - Bitwise and operator
<< - left shift operator
>> - right shift operator


&&:

 */

public class CountSetBitsofInteger {

    private static void countBitsOfInteger(int num) {

        int count = 0;
        while(num > 0){
            count = count + (num & 1);

            num = num >> 1;
        }

        System.out.print("No. of 1s Bit in the binary representation: "+count+ "\n");
    }

    public static void main(String[] args){
        int num = 20;
        countBitsOfInteger(num);
    }


}
