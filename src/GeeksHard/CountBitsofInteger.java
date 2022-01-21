package GeeksHard;

public class CountBitsofInteger {

    private static void countBitsOfInteger(int num) {

        int count = 0;
        while(num > 0){
            count = count + (num & 1);

            num = num >> 1;
        }

        System.out.print("No. of Bits: "+count+ "\n");
    }

    public static void main(String[] args){
        int num = 9;
        countBitsOfInteger(num);
    }


}
