public class Graph{
    final static int INF = 99999, V = 4;  
    public void printdist(int [][]dist){
         for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                System.out.print(dist[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void floydWarshall(int [][]graph){
        int [][]dist=new int[V][V];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                dist[i][j]=graph[i][j];
            }
        }
        for(int k=0;k<V;k++){
               for(int i=0;i<V;i++){
                 for(int j=0;j<V;j++){
                    if(dist[i][j] > dist[i][k]+dist[k][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }         
                 }
               }
        }
        printdist(dist);
    }
    public static void main(String[]args){
        
       
        Graph g = new Graph(); 
   int graph[][] = { {0,   5,  INF, 10}, 
                          {INF, 0,   3, INF}, 
                          {INF, INF, 0,   1}, 
                          {INF, INF, INF, 0} 
                        };  
          g.floydWarshall(graph);                 
    }
}
