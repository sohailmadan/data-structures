import java.util.*;
public class Rerrangearray{
    public void rearrange(int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i && arr[i]!=-1){
                int x = arr[i];
                System.out.println("i "+arr[x]);
                
                while(arr[x]!=x && arr[x]!=-1){
                    int y = arr[x];
                    
                    arr[x]=x;
                    
                    x=y;
                    

                }
                
                
                arr[x]=x;
                if(arr[i]!=i){
                    arr[i]=-1;
                }
            }
        }
    }
    public static void main(String args[]) {
      Rerrangearray r = new Rerrangearray();
      int []arr={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
      r.rearrange(arr);
      System.out.println(Arrays.toString(arr));
    }
}
