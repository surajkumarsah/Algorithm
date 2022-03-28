package Amazon_Practice;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args){
        HashMap<Character, Integer> s = new HashMap<Character, Integer>();
        s.put('i', 1);
        s.put('V', 5);
        s.put('X', 10);
        s.put('L', 50);
        s.put('C', 100);
        s.put('D', 500);
        s.put('M', 1000);

        System.out.println("Enter the roman no.: ");
        String romanStr;
        Scanner input = new Scanner(System.in);
        romanStr = input.next();

        int l = romanStr.length();
        Integer result = s.get(romanStr.charAt(l-1));

        if(romanStr == null || romanStr.length() == 0){
            System.out.println("No Input.");
        }

        //Iterate from right to left to print the number.....
        for(int i=l-2; i>=0; i--){
            if (s.get(romanStr.charAt(i)) >= s.get(romanStr.charAt(i+1))) {
                result += s.get(romanStr.charAt(i));
            }else{
                result -= s.get(romanStr.charAt(i));
            }
        }

        System.out.println(result);
    }

}
