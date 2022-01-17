package Greedy_Algorithm;

public class Prims_MST_Algorithm {

    public static final int V = 5;

    void primMST(int graph[][]){

        int parent[] = new int[V];
        int key[] = new int[V];
        boolean mstSET[] = new boolean[V];

        for (int v=0; v<V; v++){
            key[v] = Integer.MAX_VALUE;
            mstSET[v] = false;
        }

        key[0] = 0;
        parent[0] = -1;


        for(int count=0; count < V-1; count++){
            int u = minKey(key, mstSET);
            mstSET[u] = true;

            for (int v=0; v<V; v++){
                if(graph[u][v] != 0 && mstSET[v] == false && graph[u][v] < key[v]){
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph);
    }

    private void printMST(int[] parent, int[][] graph) {

        System.out.println(" Edge\t\tWeight");
        for (int i=1; i<V; i++) {
            System.out.println(parent[i]+ "\t" +i +"\t\t  "+graph[i][parent[i]]);
        }
    }

    private int minKey(int[] key, boolean[] mstSET) {
        int min = Integer.MAX_VALUE;
        int min_index = -1;

        for (int v=0; v<V; v++){
            if (mstSET[v] == false && key[v] < min){
                min = key[v];
                min_index = v;
            }
        }

        return min_index;
    }


    public static void main(String []args){

        Prims_MST_Algorithm psa = new Prims_MST_Algorithm();

        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };

        psa.primMST(graph);

    }


}
