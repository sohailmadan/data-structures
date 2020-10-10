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
        m.printgraph(adj); 
    }
}
