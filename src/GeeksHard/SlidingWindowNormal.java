package GeeksHard;

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
