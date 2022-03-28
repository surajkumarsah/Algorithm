package Amazon_Practice;

/*
Given a dic of words and an input string tell whether the input
string can be completely segmented into dictionary words.
 */

//Done

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DictionaryWordProblem {

    private static final Set<String> dictionary = new HashSet<>();

    public static void main(String[] args){

        String temp_dictionary[] = {"mobile","samsung","sam","sung",
                "man","mango","icecream","and",
                "go","i","like","ice","cream"};

        for(String temp: temp_dictionary)
            dictionary.add(temp);

        // sample input cases
        System.out.println(wordCheck("ulikesamsung"));
        System.out.println(wordCheck("iiiiiiii"));
        System.out.println(wordCheck(""));
        System.out.println(wordCheck("ilikelikeimangoiii"));
        System.out.println(wordCheck("samsungandmango"));
        System.out.println(wordCheck("samsungandmangok"));

//        if (wordCheck(str)){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }
    }


    public static boolean wordCheck(String str){

//        System.out.println(str);

        if (str.length() == 0)
            return true;

        for (int i=1; i<=str.length(); i++){
            if (dictionary.contains(str.substring(0, i)) && wordCheck(str.substring(i, str.length())))
                return true;
        }

        return false;
    }
}
