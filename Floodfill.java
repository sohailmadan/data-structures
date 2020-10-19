public class Floodfill{
    public int[][]fill(int[][]image,int sr,int sc,int newcolor){
        if(image[sr][sc]==newcolor){
            return image;
        }
        fillutil(image,sr,sc,image[sr][sc],newcolor);
        printimage(image);
        return image;
    }
    public void fillutil(int[][]image,int i,int j,int color,int newcolor){
        if(i<0 || i>image.length-1 || j<0 || j>image.length-1 || image[i][j] !=color){
            return;
        }
        image[i][j]=newcolor;
        fillutil(image,i+1,j,color,newcolor);
        fillutil(image,i-1,j,color,newcolor);
        fillutil(image,i,j+1,color,newcolor);
        fillutil(image,i,j-1,color,newcolor);
    }
    public void printimage(int[][]image){
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                    System.out.print(image[i][j]+" ");
                
            }
            System.out.println();
        
        }
    }    
    public static void main(String[]args){
        Floodfill f=new Floodfill();
        int[][]image={{1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 1, 1, 1, 1, 1, 0, 0},
                      {1, 0, 0, 1, 1, 0, 1, 1},
                      {1, 2, 2, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 2, 2, 0},
                      {1, 1, 1, 1, 1, 2, 1, 1},
                      {1, 1, 1, 1, 1, 2, 2, 1},
                      };
        f.fill(image,3,1,3);
    }    
}
