public class Graph{
    int V;
    int E;
    Edge[]edge;
    class Edge{
        int weight;
        int src;
        int dest;
        Edge(){
            dest=weight=src=0;
        }
    }
    Graph(int v,int e){
        V= v;
        E=e;
        edge = new Edge[E];
        for(int i=0;i<E;i++){
            edge[i]=new Edge();
        }
    }
    
    public void printdist(int []dist){
        for(int i=0;i<dist.length;i++){
            System.out.println("dist for vertex "+i+ "  is " + dist[i]);
        }
    }
    public void BellmanFord(Graph graph,int src){
        int []dist=new int[V];
        for(int i=0;i<dist.length;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        for(int i=1;i<V;i++){
            for(int j=0;j<E;j++){
                int u = graph.edge[j].src;
                int v = graph.edge[j].dest;
                int weight = graph.edge[j].weight;
                if(dist[u] != Integer.MAX_VALUE && dist[v] > dist[u]+weight  ){
                    dist[v]=dist[u]+weight;
                }            
            }
        }
        
        for(int i=0;i<E;i++){
            int u = graph.edge[i].src;
            int v = graph.edge[i].dest;
            int weight = graph.edge[i].weight;
            if(dist[u] != Integer.MAX_VALUE &&  dist[v] > dist[u]+weight  ){
                System.out.println("graph has a negative cycle");
                return;
            }
        }
        printdist(dist);
        
        
    } 
    public static void main(String[]args){
        
         int V = 5;  
        int E = 8;  
  
        Graph graph = new Graph(V, E); 
  
         
        graph.edge[0].src = 0; 
        graph.edge[0].dest = 1; 
        graph.edge[0].weight = -1; 
  
        
        graph.edge[1].src = 0; 
        graph.edge[1].dest = 2; 
        graph.edge[1].weight = 4; 
  
        
        graph.edge[2].src = 1; 
        graph.edge[2].dest = 2; 
        graph.edge[2].weight = 3; 
  
       
        graph.edge[3].src = 1; 
        graph.edge[3].dest = 3; 
        graph.edge[3].weight = 2; 
  
       
        graph.edge[4].src = 1; 
        graph.edge[4].dest = 4; 
        graph.edge[4].weight = 2; 
  
       
        graph.edge[5].src = 3; 
        graph.edge[5].dest = 2; 
        graph.edge[5].weight = 5; 
  
       
        graph.edge[6].src = 3; 
        graph.edge[6].dest = 1; 
        graph.edge[6].weight = 1; 
  
        
        graph.edge[7].src = 4; 
        graph.edge[7].dest = 3; 
        graph.edge[7].weight = -3; 
  
        graph.BellmanFord(graph, 0); 
    }
}
