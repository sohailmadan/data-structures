public class Queenproblem{
    int n =4;
    public void printsolution(int [][]board){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public boolean issafe(int[][]board,int row,int col){
        for(int i=0;i<col;i++){
            if(board[row][i]==1){
                return false;
            }
        }
        
        for(int i=row,j=col;j>=0 && i>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        
        for(int i=row,j=col;j>=0 && i<n;i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public boolean solvenqutil(int [][]board,int col){
        if(col>=n){
            return true;
        }
        for(int i=0;i<n;i++){
            if(issafe(board,i,col)){
                board[i][col]=1;
                if(solvenqutil(board,col+1)==true){
                    return true;
                }
                board[i][col]=0;
            }
            
        }
        return false;
    }
    public boolean solvenq(){
        int[][]board={
            { 0, 0, 0, 0 }, 
            { 0, 0, 0, 0 }, 
            { 0, 0, 0, 0 }, 
            { 0, 0, 0, 0 }};
        if(solvenqutil(board,0)==false){
            System.out.println("solution does not exist");
            return false;
        }
        
        printsolution(board);
        return true;
        
    }
    public static void main(String[]args){
        Queenproblem q = new Queenproblem();
        q.solvenq();
    }
}
