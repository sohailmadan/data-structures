public class sort{
    public static void selectionsort(int []a){
        for (int i=0;i<a.length-1;i++){
            int smallest = i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[smallest]){
                    smallest=j;
                }
                
            }
            int temp =a[i];
            a[i]=a[smallest];
            a[smallest]=temp;
        }
        
    }
    
    public static void printsortedarray(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
      
    }
    public static void main (String[]args){
        int[]a={5,98,6,45,78,12,36,2};
        selectionsort(a);
        printsortedarray(a);
        
        
    }
} 