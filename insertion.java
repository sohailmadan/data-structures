public class insertion {
    public static void insertionsort(int[]a){
        for(int i=0;i<a.length;i++){
            int current =a[i];
            int j=i-1;
            while(j>=0 &&current<=a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
            
        }
        
        
    }
    public static void printarray(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
            
        }
        
    }
    public static void main(String[]args){
        int[]a={5,9,6,7,2,48,96,75};
        insertionsort(a);
         printarray(a);
        
    }
}

