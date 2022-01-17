package Recursive_Programming;

public class LongestCommonSubsequence {

    int max(int p, int q){
        return Math.max(p, q);
    }

    int lcs(char []x, char []y, int n, int m){
        if(n==0 || m==0)
            return 0;
        if (x[n-1] == y[m-1])
            return 1 + lcs(x, y, n-1, m-1);
        else
            return max(lcs(x, y, n-1, m), lcs(x, y, n, m-1));
    }

    public static void main(String []args){

        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "ABCDGH", s2 = "AEDFHR";

        int n = s1.length();
        int m = s2.length();

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();

        System.out.print("Length of LCS: "+lcs.lcs(X, Y, n, m));
    }
}
