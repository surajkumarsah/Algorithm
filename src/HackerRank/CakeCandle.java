package HackerRank;

import java.util.*;

public class CakeCandle {

    public static int birthdayCakeCandles(List<Integer> candles) {

//        Set<Integer> s = new HashSet<>();
//        int lc = 0, mc = 0;
//
//        for(Integer candle: candles){
//            if(s.contains(candle)){
//                lc++;
//            }
//
//            if (mc < lc){
//                mc = lc;
//            }
//
//            s.add(candle);
//        }
//
//        int maxcount = 0, lcount =0;
//
//        int j=0;
//        for(Integer st : s){
//            for(Integer candle: candles){
//
//                if (Objects.equals(st, candle)){
//                    lcount++;
//                }
//            }
//
//            if (maxcount<lcount){
//                maxcount = lcount;
//            }
//
//            lcount = 0;
//
//        }
//
//
//        return maxcount;



        int n = candles.size();
        int tallest = 0;
        int frequency = 0;


        for(int i=0; i < n; i++){
            int height = candles.get(i);

            if(height > tallest){
                tallest = height;
                frequency = 1;
            }
            else if(height == tallest)
                frequency++;
        }
        // System.out.println(frequency);

        return frequency;

}


public static void main(String[] args) {

    List<Integer> candles = new ArrayList<>();
    candles.add(10);
    candles.add(90);
    candles.add(90);
    candles.add(13);
    candles.add(90);
    candles.add(75);
    candles.add(90);
    candles.add(8);
    candles.add(90);
    candles.add(43);

    System.out.println(birthdayCakeCandles(candles));

}

}
