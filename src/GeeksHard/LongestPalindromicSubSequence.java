package GeeksHard;

public class LongestPalindromicSubSequence {

    public static void getLongestPalindromicSubSequence(String str){
        int n = str.length();
        int i, j, c1;
        int L[][] = new int[n][n];

        for(i=0; i<n; i++){
            L[i][i] = 1;
        }

        for(c1=2; c1<=n; c1++){
            for(i=0; i<n-c1+1; i++){
                j = i+c1-1;

                if((str.charAt(i) == str.charAt(j)) && c1 == 2)
                    L[i][j] = 2;

                else if (str.charAt(i) == str.charAt(j))
                    L[i][j] = L[i+1][j-1] + 2;

                else
                    L[i][j] = max(L[i][j-1], L[i+1][j]);

            }
        }

        System.out.println(L[0][n-1]);

    }

    private static int max(int x, int y) {
        return (x > y) ? x : y;
    }


    public static void main(String[] args){
        String str = "GEEKSFORGEEKS";
        String str1 = "BABKBAB";

        getLongestPalindromicSubSequence(str);
    }
}
