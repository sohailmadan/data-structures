import java.util.*;
public class Mygraph {
    public void addedge(ArrayList<ArrayList<Integer>> adj,int u, int v){
        adj.get(u).add(v);
       
    }
    
    
    public boolean dfscyclic(int v,ArrayList<ArrayList<Integer>> adj,int s){
        boolean []visited= new boolean[v];
        boolean []rstack = new boolean[v];
       return  dfscyclicutil(visited,adj,s,rstack);
        
    }
    public boolean dfscyclicutil(boolean[]visited,ArrayList<ArrayList<Integer>> adj,int s,boolean[]rstack){
        
        if(rstack[s]){
            return true;
        }
        
        if(visited[s]){
            return false;
        }
        visited[s]=true;
        rstack[s]=true;
        System.out.println(s);
        for(int i=0;i<adj.get(s).size();i++){
            
           int n = adj.get(s).get(i);
           if(dfscyclicutil(visited,adj,n,rstack)){
                 return true;
           }
          
        }
        rstack[s]=false;
         
        
        return false;
    }
    public static void main(String args[]) {
     Mygraph m = new Mygraph();
     int v = 5;
     ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
     for(int i=0;i<v;i++){
         adj.add(new ArrayList<Integer>());
     }
      m.addedge(adj,0, 1); 
      m.addedge(adj,0, 4); 
        m.addedge(adj,1, 2); 
        m.addedge(adj,2, 3); 
        m.addedge(adj,2, 4); 
        m.addedge(adj,3, 1); 
        m.dfscyclic(v,adj,2);
        System.out.println("is graph cyclic "+ m.dfscyclic(v,adj,1));
    }
}
