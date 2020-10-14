class Edge{
    int src;
    int dest;
}

public class Graph {
    int V;
    int E;
    Edge edge[];
    Graph(int v,int e){
        V=v;
        E=e;
        edge= new Edge[E];
        for(int i=0;i<E;i++){
            edge[i]=new Edge();
        }
    }
    
    public int find(int[]parent,int i){
        if(parent[i]==-1){
            return i;
        }
        return find(parent,parent[i]);
    }
    public void graphunion(int []parent,int x,int y){
        int xparent = find(parent,x);
        int yparent = find(parent,y);
        
        parent[xparent]=yparent;
        
        
    }
    public int isCycle(Graph graph){
        int []parent = new int[V];
        for(int j=0;j<V;j++){
            parent[j]=-1;
        }
        for(int i=0;i<E;i++){
            int x =find(parent,graph.edge[i].src);
            int y =find(parent,graph.edge[i].dest);
            
            if(x==y){
                return 1;
            }
            graphunion(parent,x,y);
            
        }
        return 0;
        
        
    }
    
    public static void main(String args[]) {
    int v=3;
    int e=2;
    Graph graph= new Graph(v,e);
    graph.edge[0].src = 0; 
        graph.edge[0].dest = 1; 
  
     
        graph.edge[1].src = 1; 
        graph.edge[1].dest = 2; 
  
     
  
        if (graph.isCycle(graph)==1) 
            System.out.println( "graph contains cycle" ); 
        else
            System.out.println( "graph doesn't contain cycle" ); 
    } 
    
}
