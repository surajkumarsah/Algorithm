package Amazon_Practice;

class IsLands{

    static final int Row = 5, Col = 5;

    int countIsLands(int[][] mat){
        boolean visited[][] = new boolean[Row][Col];
        int count = 0;

        for(int i=0; i<Row; i++){
            for(int j=0; j<Col; j++){
                if(mat[i][j] == 1 && !visited[i][j]){
                    DFS(mat, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private void DFS(int[][] mat, int row, int col, boolean[][] visited) {

        //Row and col neighbour....
        int[] rowNbr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colNbr = {-1, 0, 1, -1, 1, -1, 0, 1};
        visited[row][col] = true;

        for(int k=0; k<8; k++){
            if(isSafe(mat, row+rowNbr[k], col+colNbr[k], visited)){
                DFS(mat, row+rowNbr[k], col+colNbr[k], visited);
            }
        }
    }

    private boolean isSafe(int[][] mat, int row, int col, boolean[][] visited) {
        return ((row >= 0) && (row < Row) && (col >= 0) && (col < Col) && mat[row][col] == 1 && !visited[row][col]);
    }


}

public class NumberOfIsLand {

    public static void main(String[] args){
        int[][] m = new int[][]{
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        IsLands i = new IsLands();
        System.out.print("Number of IsLand is: "+i.countIsLands(m));
    }

}
