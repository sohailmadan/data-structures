public class Ratmaze{
    static int n;
    
    public void printsol(int[][]sol){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+sol[i][j] +" ");
            }
            System.out.println();
        }
    }
    public boolean issafe(int[][]maze,int x,int y){
        return (x>=0 && y>=0 && y<n && x<n && maze[x][y]==1);
    }
    public boolean solvemaze(int[][]maze){
        int [][]sol=new int[n][n];
        if(solvemazeutill(maze,0,0,sol)==false){
            return false;
        }
        printsol(sol);
        return true;
    }
    public boolean solvemazeutill(int[][]maze,int x,int y,int [][]sol){
        if(x==n-1 && y==n-1 && maze[x][y]==1 ){
            sol[x][y]=1;
            return true;
        }
        if(issafe(maze,x,y)){
            sol[x][y]=1;
            if(solvemazeutill(maze,x+1,y,sol)){
                return true;
            }
             if(solvemazeutill(maze,x,y+1,sol)){
                return true;
            }
            
        sol[x][y]=0;
        return false;
        }
        return false;
    }
    public static void main(String[]args){
        Ratmaze r = new Ratmaze();
        int maze[][] = { { 1, 0, 0, 0 }, 
                         { 1, 1, 0, 1 }, 
                         { 0, 1, 0, 0 }, 
                         { 1, 1, 1, 1 } };
       n=maze.length;
        r.solvemaze(maze);                 
    }
        
    
}
