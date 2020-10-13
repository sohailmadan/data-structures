import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Edge{
    int targetnode;
    int distancefromnode;
     Edge(int targetnode,int distancefromnode ){
        this.targetnode = targetnode;
        this.distancefromnode=distancefromnode;
    }
}
public class Graph{
    int nodes;
    List<ArrayList<Edge>> adj=new ArrayList<>();
     boolean[] visited;
     Graph(int nodes){
        this.nodes = nodes;
         visited =  new boolean[nodes];
        for(int i=0;i<nodes;i++){
            adj.add(new ArrayList<>());
        }
    }
    public void addEdge(int source,int targetnode,int distancefromnode){
        adj.get(source).add(new Edge(targetnode,distancefromnode));
        adj.get(targetnode).add(new Edge(source,distancefromnode));
    }

public int mst(){
    int minimumcost =0;
   
    for(int i=0;i<nodes;i++){
        if(!visited[i]){
            visited[i]=true;
            minimumcost += mstutil(i);
        }
    
    }
    return minimumcost;
}
public int mstutil(int source){
 
     int mincost=0;
     visited[source]=true;
     PriorityQueue<Edge>minedgeheap =new PriorityQueue<>((e1,e2)->e1.distancefromnode-e2.distancefromnode);
     int sourcesize = adj.get(source).size();
     for(int i=0;i<sourcesize;i++){
         minedgeheap.add(adj.get(source).get(i));
     }
     while(!minedgeheap.isEmpty()){
         
        Edge minedge =minedgeheap.poll();
        if(visited[minedge.targetnode]){
           continue;
        }
         visited[minedge.targetnode]=true;
            mincost +=minedge.distancefromnode;
         int targetsize = adj.get(minedge.targetnode).size();
         for(int i=0;i<targetsize;i++){
             minedgeheap.add(adj.get(minedge.targetnode).get(i));
         }
     }
     return mincost;
}
  public static void main(String[] args) {
    int nodes = 5;

    Graph a = new Graph(nodes);

    a.addEdge(0, 1, 6); 
    a.addEdge(0, 3, 4); 
    a.addEdge(1, 2, 10);
    a.addEdge(1, 3, 7);
    a.addEdge(1, 4, 7);
    a.addEdge(2, 3, 8);
    a.addEdge(2, 4, 5);
    a.addEdge(3, 4, 12);
    
    System.out.println(a.mst());
  }
}
