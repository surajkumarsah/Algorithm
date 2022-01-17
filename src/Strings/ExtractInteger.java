package Strings;

public class ExtractInteger {

    public static void main(String []args){
        String str = "Hello0 Suraj123, How are You234 a911b";

        extractInteger(str.toCharArray());
    }

    private static void extractInteger(char[] str) {

        String tillNow = "";

        for(int i=0; i<str.length; i++){

            if(str[i] - '0' >=0 && str[i] - '0' <=9){
                tillNow += str[i];
            }
            else{
                if(tillNow.length() > 0){
                    System.out.print(Integer.parseInt(tillNow)+ " ");
                    tillNow = "";
                }
            }
        }
    }
}
