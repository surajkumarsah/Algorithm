package Dynamic_Programming;

import java.util.Scanner;

public class EggDroppingPuzzle {


    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of egg and floor respectively: ");
        int n = input.nextInt();
        int k = input.nextInt();

        eggDropping(n, k);
    }

    private static void eggDropping(int egg, int floor) {

        int droppingMem[][] = new int[egg+1][floor+1];
        int result;

        for (int i=1; i<=egg; i++) {
            droppingMem[i][0] = 0;
            droppingMem[i][1] = 1;
        }

        for(int i=1; i<=floor; i++){
            droppingMem[1][i] = i;
        }

        for (int i=2; i<=egg; i++){
            for(int j=2; j<=floor; j++){
                droppingMem[i][j] = Integer.MAX_VALUE;
                for (int k=1; k<=j; k++) {
                    result = 1 + Math.max(droppingMem[i - 1][k - 1], droppingMem[i][j-k]);

                    if (result < droppingMem[i][j]){
                        droppingMem[i][j] = result;
                    }
                }
            }
        }

        //Print
        System.out.println(droppingMem[egg][floor]);

    }
}
