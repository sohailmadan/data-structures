import java.util.*;
public class Mygraph {
    public void addedge(ArrayList<ArrayList<Integer>> adj,int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    public void printgraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    public void bfs(int v,ArrayList<ArrayList<Integer>> adj,int s){
        boolean []visited = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<Integer>();
    
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0){
            s=queue.poll();
            System.out.println(s);

             for(int j=0;j<adj.get(s).size();j++){
                int n = adj.get(s).get(j);
                if(!visited[n]){
                        queue.add(n);
                        visited[n]=true;
                }
            }
        }
    }
    
    public static void main(String args[]) {
     Mygraph m = new Mygraph();
     int v = 5;
     ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
     for(int i=0;i<v;i++){
         adj.add(new ArrayList<Integer>());
     }
        m.addedge(adj, 0, 1); 
        m.addedge(adj, 0, 4); 
        m.addedge(adj, 1, 2); 
        m.addedge(adj, 1, 3); 
        m.addedge(adj, 1, 4); 
        m.addedge(adj, 2, 3); 
        m.addedge(adj, 3, 4); 
       // m.printgraph(adj);
        m.bfs(v,adj,1);
    }
}
