public class Tsp{
    public int tsputil(int[][] graph,boolean []v,int curpos,int n,int count,int cost,int ans){
        if(count==n && graph[curpos][0]>0){
            ans = Math.min(ans,cost+graph[curpos][0]);
            return ans;
            
        }
        for(int i=0;i<n;i++){
            if(v[i]==false && graph[curpos][i]>0){
                v[i]=true;
                ans = tsputil(graph,v,i,n,count+1,cost+graph[curpos][i],ans);
                v[i]=false;
            }
        }
        return ans;
    }
    
    public static void main(String []args){
        int n=4;
        int[][] graph = {{0, 10, 15, 20}, 
                         {10, 0, 35, 25}, 
                         {15, 35, 0, 30}, 
                         {20, 25, 30, 0}};
        boolean []v = new boolean[n];
        Tsp t=new Tsp();
        v[0]=true;
        int cost=0;
        int ans =Integer.MAX_VALUE;
        ans = t.tsputil(graph,v,0,n,1,cost,ans);
        System.out.println(ans);
    }
}
