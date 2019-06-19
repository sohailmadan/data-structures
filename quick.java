public class quick {
    public static void quicksort(int[]a,int start,int end){
        if(start<end){
            int pivotindex=partition(a,start,end);
            quicksort(a,start,pivotindex-1);
            quicksort(a,pivotindex+1,end);
        }
    }
    public static int partition(int[]a,int start,int end){
        int pivot=a[end];
        int i =start;
        for(int j=start;j<=end-1;j++){
            if(a[j]<pivot){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
                    }
        a[end] =a[i];
        a[i] =pivot;
        return i;
        
    }
    public static void printarray(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
            
        }
        
    }
    public static void main(String[]args){
        int[]a={5,9,6,7,2,48,96,75};
        quicksort(a,0,a.length-1);
         printarray(a);
        
    }
}

