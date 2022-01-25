package GeeksHard;

/* *****Sliding Window Problem:*****
You have to find out the greatest element in the given k(steps/ window).

Algorithm:
1. For loop from 0 to n-k; where n=no. of element and k = sliding window
2. for loop from 1 to <k.
3. Compare the elements with the max element and if max element then put to the
4. Print max after second loop.
5. Finish.

Thank you.

*/



public class SlidingWindowNormal {

    public static void slidingWindowNormal(int[] arr, int n, int k){

        int max, j;
        //iterate n-k times
        for(int i=0; i<=n-k; i++){

            max = arr[i];
            //iterate k times
            for(j=1; j<k; j++){
                if(arr[j+i] > max){
                    max = arr[j+i];
                }
            }

            System.out.print(max + " ");
        }
    }

    public static void main(String []args){

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k=4;
        int n = arr.length;

        slidingWindowNormal(arr, n, k);
    }
}
