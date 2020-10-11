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
    public void dfs(int v,ArrayList<ArrayList<Integer>> adj,int s){
        boolean []visited= new boolean[v];
        dfsutil(visited,adj,s);
        
    }
    public void dfsutil(boolean[]visited,ArrayList<ArrayList<Integer>> adj,int s){
        
        visited[s]=true;
        System.out.println(s);
        for(int i=0;i<adj.get(s).size();i++){
            
           int n = adj.get(s).get(i);
           if(!visited[n]){
                 dfsutil(visited,adj,n);
           }
        }
    }
    public boolean iscyclicdfs(int v,ArrayList<ArrayList<Integer>> adj){
        boolean []visited = new boolean[v];
        
         for(int i=0;i<v;i++){
                  
             if(!visited[i]){
                  
                 if(iscyclicdfsutil(i,visited,adj,-1)){
                     return true;
                 }
              
             }
         }
        return false;
    }
    public boolean iscyclicdfsutil(int v,boolean []visited,ArrayList<ArrayList<Integer>> adj,int parent){
        visited[v]=true;
      
        for(int i=0;i<adj.get(v).size();i++){
            int n =adj.get(v).get(i); 
          
            if(!visited[n]){
              if(iscyclicdfsutil(n,visited,adj,v)){
                  return true;
              }
            }
            else if(n!=parent){
                return true;
            }
        }
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
      m.addedge(adj,1, 2); 
        m.addedge(adj,2, 3); 
        m.addedge(adj,2, 0); 
        m.addedge(adj,2, 3); 
        m.addedge(adj,3, 3); 
       // m.printgraph(adj);
        m.bfs(v,adj,1);
        System.out.println("dfs starts");
        m.dfs(v,adj,2);
        System.out.println("undirected graph is cyclic "+ m.iscyclicdfs(v,adj));
    }
}
