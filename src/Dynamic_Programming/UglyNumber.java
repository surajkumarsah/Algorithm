package Dynamic_Programming;

import java.util.Scanner;

public class UglyNumber {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        System.out.print("1. Test Ugly Number\n2. Nth Ugly Number\n3. Dynamic Programming\n");
        int menu = input.nextInt();

        switch (menu){
            case 1: testUglyNo(); break;
            case 2: findNthUglyNo(); break;
            case 3: dynamicPUglyNumber(); break;
            default: System.out.println("Kindly Enter Valid Key.");
        }


    }


//1st Menu:Check the ugly number
    private static void testUglyNo() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        findUglyNo(num);
    }

    private static void findUglyNo(int num){
        int n = 0;
        n = isUgly(num, 2);
        n = isUgly(n, 3);
        n = isUgly(n, 5);

        if (n == 1){
            System.out.println("Yes, It is an ugly no.");
        }else{
            System.out.println("No, It is not an ugly no.");
        }
    }

    private static int isUgly(int num, int n) {
        int count = 1;

        while(num % n == 0){
            num = num/ n;
            count++;
        }

        return num;
    }


    //2nd Menu: find nth ugly no using normal function
    private static void findNthUglyNo() {
        System.out.println("Enter the position of an ugly number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1, count = 1;

        while(n>count){
            i++;
            if (isUgly1(i)){
                count++;
            }
        }

        System.out.println(n+"th ugly no. is: "+i);
    }

    private static boolean isUgly1(int n) {
        n = isUgly(n, 2);
        n = isUgly(n, 3);
        n = isUgly(n, 5);

        return (n == 1) ? true : false;
    }


    //3rd Menu: find nth ugly no using dynamic programming
    private static void dynamicPUglyNumber() {
        System.out.println("Enter the position of an ugly number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        findDPUglyNo(n);
    }

    private static void findDPUglyNo(int n) {
        int uglyno[] = new int[n];
        uglyno[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int next_mult_of_2 = 2;
        int next_mult_of_3 = 3;
        int next_mult_of_5 = 5;
        int next_ugly_no = 1;

        for(int i=1; i<n; i++){
            next_ugly_no = Math.min(next_mult_of_2, Math.min(next_mult_of_3, next_mult_of_5));
            uglyno[i] = next_ugly_no;

            if(next_ugly_no == next_mult_of_2){
                i2++;
                next_mult_of_2 = uglyno[i2]*2;
            }if (next_ugly_no == next_mult_of_3){
                i3++;
                next_mult_of_3 = uglyno[i3]*3;
            }if (next_ugly_no == next_mult_of_5){
                i5++;
                next_mult_of_5 = uglyno[i5]*5;
            }
        }

        System.out.println("Ugly no. for "+n+"th position is: "+next_ugly_no);
    }

//    private static int min(int a, int b, int c){
//        if(a>b && a>c){
//            return a;
//        }else if (b>a && b>c){
//            return b;
//        }else{
//            return c;
//        }
//    }


}
