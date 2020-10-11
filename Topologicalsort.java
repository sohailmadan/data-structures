
import java.io.*; 
import java.util.*; 
public class Graph { 
 public void addEdge(int v,int u,ArrayList<ArrayList<Integer>> adj){
     adj.get(v).add(u);
 }
 public void topologicalsort(int v,ArrayList<ArrayList<Integer>> adj){
     Stack<Integer> stack = new Stack<Integer>();
     boolean []visited = new boolean[v];
     for(int i=0;i<v;i++){
         if(!visited[i]){
             topologicalsortutil(i,visited,adj,stack);
         }
     }
     while(stack.size()!=0){
         System.out.print(stack.pop());
     }
 }
 public void topologicalsortutil(int i,boolean []visited,ArrayList<ArrayList<Integer>> adj, Stack<Integer>stack){
     visited[i]=true;
     for(int k=0;k<adj.get(i).size();k++){
         if(!visited[k]){
             topologicalsortutil(k,visited,adj,stack);
         }
         
     }
     stack.push(i);
 }
 
    public static void main(String args[]) 
    { 
        Graph g= new Graph();
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
          g.addEdge(5, 2,adj); 
        g.addEdge(5, 0,adj); 
        g.addEdge(4, 0,adj); 
        g.addEdge(4, 1,adj); 
        g.addEdge(2, 3,adj); 
        g.addEdge(3, 1,adj); 
        g.topologicalsort(v,adj);
    } 
}
