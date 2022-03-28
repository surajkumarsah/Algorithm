package HackerRank;

import java.util.*;

public class ArrayFrequency {



    public static void main(String[] args){
        List<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);

        Map<Integer, Integer> h = new HashMap<>();

        for(int i=0; i<arr.size(); i++){

            if(h.containsKey(arr.get(i))){
                h.put(arr.get(i), h.get(arr.get(i)) + 1);
            }else{
                h.put(arr.get(i), 1);
            }
        }

        int key = Collections.max(h.entrySet(), Map.Entry.comparingByValue()).getKey();


        System.out.println(key);
    }
}
