public class Knighttour{
    int n =8;
    public void printsolution(int [][]sol){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public boolean issafe(int[][]sol,int x,int y){
        return x>=0 && y>=0 && y<n && x<n && sol[x][y]==-1;
    }
    public boolean solvekt(){
        int[][]sol=new int [n][n];
        for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  sol[i][j]=-1;
              }
        }
        sol[0][0]=0;
         int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        if(solvektutil(sol,0,0,1,xMove,yMove)==false){
            System.out.println("no sols");
            return false;
        }
        printsolution(sol);
        return true;
    }
    public boolean solvektutil(int[][]sol,int x,int y,int movei,int[]xMove,int []yMove){
        if(movei==n*n){
            return true;
        }
        for(int i=0;i<n;i++){
            int xmove =x + xMove[i] ;
            int ymove =y  + yMove[i] ;
            
            if(issafe(sol,xmove,ymove)){
                sol[xmove][ymove]=movei;
                if(solvektutil(sol,xmove,ymove,movei+1,xMove,yMove)==true){
                    return true;
                }
                else{
                    sol[xmove][ymove]=-1;
                }
                
            }
            
        }
        
        return false;
        
    }
    public static void main(String[]args){
        Knighttour k = new Knighttour();
        k.solvekt();
    }
}
