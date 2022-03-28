package Amazon_Practice;

public class SpiralMatrix_Iterative_Approach {

    public static void main(String []args){
        int [][] x = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        int m = x.length;
        int n = x[0].length;

        printSpiralOrder(x, m, n);
    }

    private static void printSpiralOrder(int[][] x, int m, int n) {

        int rowStart = 0, colEnd = n-1, rowEnd = m-1, colStart = 0;

        while((rowStart < rowEnd) && (colStart < colEnd)){

            for(int i=colStart; i<=colEnd; i++){
                System.out.print(x[rowStart][i]+" ");
            }
            rowStart=rowStart+1;

            for(int i=rowStart; i<=rowEnd; i++){
                System.out.print(x[i][colEnd]+" ");
            }
            colEnd=colEnd-1;

            if(rowStart<rowEnd){
                for(int i=colEnd; i>=colStart; i--){
                    System.out.print(x[rowEnd][i]+" ");
                }
                rowEnd=rowEnd-1;
            }

            if(colStart<colEnd){
                for(int i=rowEnd; i>=rowStart; i--){
                    System.out.print(x[i][colStart]+" ");
                }
                colStart=colStart+1;
            }

        }
    }
}
