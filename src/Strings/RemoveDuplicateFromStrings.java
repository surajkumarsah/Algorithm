package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromStrings {

    public static void removeDuplicateFromString(char[] str){
        HashSet<Character> string = new LinkedHashSet<>();
        for(char x: str){
            string.add(x);
        }

        System.out.println(string);
    }

    public static void main(String[] args){

        String str = "Hellosurajkumarhowareyou?";

        removeDuplicateFromString(str.toCharArray());
    }
}
