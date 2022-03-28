package HackerRank;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChar {

    public static void main(String[] args){
        String s = "abcabcbb";
        int lc = 0, c = 0;

        Set<Character> str = new HashSet<>();
        char t = ' ', t1 = ' ';

        for(int i=0; i<s.length(); i++){

            if(i==0){
                str.add(s.charAt(0));
                lc++; c = lc;
            }else{
                t = s.charAt(i);
                t1 = s.charAt(i-1);


                if(t == t1){
                    if(c>lc){
                        str.clear();
                        lc=0;
                    }

                }

                str.add(s.charAt(i));
            }

        }

        System.out.println(str.size());

    }

}
