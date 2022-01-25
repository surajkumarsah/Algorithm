package GeeksHard;

import java.util.HashMap;

/*
Frequency of Duplicate elements from the array:

Algorithm:
1. Create HashMap key and value of Integer type.
2. For loop from 0 to arr size
3. check mapscontains key if yes put array and size increment of respective value.
4. If no. put array element and value as 1.
5. Print the map and Finish.

 */


public class frequenciesOfDuplicateElementsInArray {


    public static void findFrequenciesOfDuplicateElementsInArray(int[] arr){

        HashMap<Integer, Integer> maps = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if (maps.containsKey(arr[i])){
                maps.put(arr[i], maps.get(arr[i]) + 1);
            }else{
                maps.put(arr[i], 1);
            }
        }

        System.out.println(maps);
    }

    public static void main(String[] args){
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 7, 7,1,2,3};

        findFrequenciesOfDuplicateElementsInArray(arr);
    }
}
