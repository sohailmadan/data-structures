import java.util.*;
public class Graphcolor{
    int V;
    List<ArrayList<Integer>>adj= new ArrayList<>();
    Graphcolor(int v){
        V=v;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        
    }
    public void addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public void greedyColoring(){
        int []result = new int[V];
        boolean []available = new boolean[V];
        for(int i=0;i<V;i++){
            available[i]=true;
            result[i]=-1;
        }
        result[0]=0;
        for(int u=1;u<V;u++){
            for(int i=0;i<adj.get(u).size();i++){
                if(result[adj.get(u).get(i)]!=-1){
                    available[result[adj.get(u).get(i)]]=false;
                }
            }
            int cr=0;
            for(cr=0;cr<V;cr++){
                if(available[cr]){
                    break;
                }
            }
            result[u]=cr;
              for(int i=0;i<V;i++){
                available[i]=true;
            }
        }
        for(int k=0;k<V;k++){
            System.out.println("color for vertex  "+k+" = "+ result[k] );
        }
    }
    
    public static void main(String[]args){
        
        Graphcolor g2 = new Graphcolor(5); 
         g2.addEdge(0, 1); 
        g2.addEdge(0, 2); 
        g2.addEdge(1, 2); 
        g2.addEdge(1, 4); 
        g2.addEdge(2, 4); 
        g2.addEdge(4, 3); 
        System.out.println("Coloring of graph "); 
        g2.greedyColoring(); 
    }    
}
