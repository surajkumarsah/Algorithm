package Amazon_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Complexity: o(nlogn)


//sum of element using loop
//Sum of n no.: (n(n+1))/2;
//missing no.= expected sum - sum of element;

//Done

public class FindTheMissingNumber {

    public static void findTheMissingNumber(List<Integer> arr){
        int n = arr.size() + 1;
        int sumOfElement = 0, exSum;

        for(int x: arr){
            sumOfElement += x;
        }

        exSum = (n*(n+1))/2;

        System.out.println("Missing number: "+ (exSum-sumOfElement));
    }

    public static void main(String[] args){
//        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10};

        int num = 1000;
        int missing_no = (new Random()).nextInt(num);
        List<Integer> nums = new ArrayList<>();

        for(int i=1; i<=num; i++){
            if (i != missing_no){
                nums.add(i);
            }
        }


        findTheMissingNumber(nums);
    }
}
