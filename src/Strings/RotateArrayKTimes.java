package Strings;

public class RotateArrayKTimes {

    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = arr.length;
        int k=2;
        reverseIntKTimes(arr, n, k);
    }

    private static void reverseIntKTimes(int[] arr, int n, int k) {

        //reverse all array
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        //reverse k-times
        for(int j=0; j<k/2; j++){
            int temp = arr[j];
            arr[j] = arr[k-j-1];
            arr[k-j-1] = temp;
        }


        for(int i=0; i<(k+n)/2; i++){
            int temp = arr[(i+k)%n];
            arr[(i+k)%n] = arr[(n-i+k-1)%n];
            arr[(n-i+k-1)%n] = temp;
        }

        System.out.print("Output : ");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }

        System.out.println("");

    }
}
