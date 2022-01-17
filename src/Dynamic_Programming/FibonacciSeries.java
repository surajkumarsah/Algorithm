package Dynamic_Programming;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String []args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = input.nextInt();
        fib(num);
    }

    private static void fib(int num) {
        int fib[] = new int[num+2];
        fib[0] = 0; fib[1] = 1;

        for(int i=2; i<=num; i++){
            fib[i] = fib[i-1] + fib[i-2];
            System.out.print(
              fib[i-2]+"\t"
            );
        }

    }
}
