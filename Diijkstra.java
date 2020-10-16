import java.util.*;
class Edge{
    int targetnode;
    int distancefromnode;
    Edge(int targetnode,int distancefromnode){
        this.distancefromnode = distancefromnode;
       this.targetnode= targetnode;
    }
}    
public class Graph{
    boolean []visited;
    int [] distance;
    
    List<List<Edge>> adj = new ArrayList<>();;
    Graph(int v){
            distance = new int[v];
        for(int i=0;i<v;i++){
            distance[i]=Integer.MAX_VALUE;
            adj.add(new ArrayList<>());
        }
    
        visited = new boolean[v];
    }
    public int findmindist(int source,int destination){
        if(source==destination){
            return 0;
        }
        PriorityQueue <Edge> minedgeheap=new PriorityQueue<>((e1,e2)->e1.distancefromnode-e2.distancefromnode);
        
        distance[source]=0;
        minedgeheap.add(new Edge(source,0));
        while(!minedgeheap.isEmpty()){
              int v = minedgeheap.poll().targetnode;
            if(visited[v]){
                continue;
            }
            visited[v]=true;
           List<Edge> childList = adj.get(v);
            for(Edge child : childList){
                
                int childdistance =child.distancefromnode;
                int childtarget = child.targetnode;
                int dist = distance[childtarget];
                if(!visited[childtarget] && childdistance + distance[v] < dist  ){
                    distance[childtarget]=childdistance + distance[v];
                    child.distancefromnode = childdistance + distance[v];
                    minedgeheap.add(child);
                }
               
                
            }
        }
        return distance[destination];
    }
    public void addEdge(int sourcenode ,int targetnode , int distancefromnode){
        adj.get(sourcenode).add( new Edge(targetnode,distancefromnode));
    }

    public static void main(String[]args){
         int nodes = 5;

    Graph a = new Graph(nodes);

    a.addEdge(0, 1, 1);
    a.addEdge(0, 2, 7);
    a.addEdge(1, 2, 5);
    a.addEdge(1, 4, 4);
    a.addEdge(4, 3, 2);
    a.addEdge(2, 3, 6);

    System.out.println(a.findmindist(0, 3));
    }
}
