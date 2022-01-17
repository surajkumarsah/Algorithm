package Dynamic_Programming;

public class LongestCommonSubsequence {

    int max(int a, int b){
        return Math.max(a, b);
    }

    int lcs(char []x, char []y, int n, int m){

        int L[][] = new int[n+1][m+1];

        for (int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0 || j==0)
                    L[i][j] = 0;
                else if(x[i-1] == y[j-1])
                    L[i][j] = 1 + L[i-1][j-1];
                else
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
            }
        }

        return L[n][m];
    }

    public static void main(String []args){
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "AGGTAB", s2 = "GXTXAYB";
        int n = s1.length();
        int m = s2.length();

        char x[] = s1.toCharArray();
        char y[] = s2.toCharArray();

        System.out.print("Length of LCS: "+lcs.lcs(x, y, n, m));

    }
}
