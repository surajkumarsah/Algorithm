package Dynamic_Programming;

public class KnapSack01 {


    int max(int a, int b){
        return Math.max(a, b);
    }

    int knapSack(int []wt, int []v, int size, int W){

        int i, w;
        int KS[][] = new int[size+1][W+1];

        for (i=0; i<=size; i++){
            for (w=0; w<=W; w++){

                if(i == 0 || w == 0)
                    KS[i][w] = 0;
                else if (wt[i-1] <= w)
                    KS[i][w] = max(v[i-1] + KS[i-1][w-wt[i-1]], KS[i-1][w] );
                else
                    KS[i][w] = KS[i - 1][w];
            }
        }

        return KS[size][W];
    }

    public static void main(String []args){
        int v[] = new int[]{60, 100, 120};
        int w[] = new int[]{10, 20, 30};

        int size = v.length;

        int W = 50;

        KnapSack01 ks = new KnapSack01();
        System.out.println(ks.knapSack(w, v, size, W));

    }
}
