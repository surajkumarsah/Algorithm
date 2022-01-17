package Recursive_Programming;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String []args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = input.nextInt();

        System.out.print(fib(num));
    }

    private static int fib(int num) {
        if(num <= 1){
            return num;
        }else{
            return fib(num - 1) + fib(num - 2);
        }
    }
}
