package Dynamic_Programming;

public class FloydWarshallAlgorithm {


    public static void main(String []args){

        int INF = 24556778;

        int graph[][] = new int[][]{
                {0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, INF, 0, 1},
                {INF, INF, INF, 0}
        };
//        System.out.println(graph.length);

        fwa(graph, graph.length);
    }

    private static void fwa(int[][] graph, int V) {

        int dist[][] = new int[V][V];
        int i, j, k;

        for (i=0; i<V; i++){
            for(j=0; j<V; j++){
                dist[i][j] = graph[i][j];
            }
        }

        for (k=0; k<V; k++){
            for (i=0; i<V; i++){
                for(j=0; j<V; j++){

                    if(dist[i][j] > dist[i][k] + dist[k][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        printGraph(dist);

    }

    private static void printGraph(int[][] dist) {

        int INF = 24556778;
        int V = dist.length;

        for (int i=0; i<V; i++){
            for (int j=0; j<V; j++){
                if (dist[i][j] == INF){
                    System.out.print("INF  ");
                }
                else{
                    System.out.print(dist[i][j]+"    ");
                }
            }
            System.out.println("");
        }


    }
}
