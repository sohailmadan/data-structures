import java.util.*; 

class Edge implements Comparable<Edge>{
    int src;
    int dest;
    int weight;
     public int compareTo(Edge compareEdge) 
        { 
            return this.weight-compareEdge.weight; 
        } 
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
    
    public void KruskalMST(){
      Edge result[] = new Edge[V];   
        int e = 0;  
        int i = 0;  
        int []parent = new int[V];
        for (int j=0; j<V; ++j) 
            parent[j]=-1;
        for (int k=0; k<V; ++k) 
            result[k] = new Edge();
            
          Arrays.sort(edge);
          while(e<V-1){
              int x = find(parent,edge[i].src);
              int y = find(parent,edge[i].dest);
              if(x!=y){
                  result[e]=edge[i];
                  graphunion(parent,x,y);
                  e++;
              }
              i++;
          }
          System.out.println("Following are the edges in " +  
                                     "the constructed MST"); 
        for (i = 0; i < e; ++i) 
            System.out.println(result[i].src+" -- " +  
                   result[i].dest+" == " + result[i].weight); 
    }
       
    
    public static void main(String args[]) {
    int v=4;
    int e=5;
    Graph graph= new Graph(v,e);
   graph.edge[0].src = 0; 
        graph.edge[0].dest = 1; 
        graph.edge[0].weight = 10; 
  
        
        graph.edge[1].src = 0; 
        graph.edge[1].dest = 2; 
        graph.edge[1].weight = 6; 
  
        
        graph.edge[2].src = 0; 
        graph.edge[2].dest = 3; 
        graph.edge[2].weight = 5; 
  
        
        graph.edge[3].src = 1; 
        graph.edge[3].dest = 3; 
        graph.edge[3].weight = 15; 
  
        
        graph.edge[4].src = 2; 
        graph.edge[4].dest = 3; 
        graph.edge[4].weight = 4;
        graph.KruskalMST(); 
    } 
    
}
