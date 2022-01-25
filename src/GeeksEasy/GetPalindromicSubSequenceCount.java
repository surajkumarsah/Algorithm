package GeeksEasy;

public class GetPalindromicSubSequenceCount {

    public static void getPalindromicSubSequenceCount(char[] str){
        int count = 0;
        for(int i=0; i<str.length/2; i++){
            if (str[i] == str[str.length - i - 1]){
                count++;
            }
        }

        System.out.println(count);
    }


    public static void main(String []args){
        String str = "geeksforgeeks";

        getPalindromicSubSequenceCount(str.toCharArray());
    }
}
