import java.util.Arrays;
public class Quick{
    public void quicksort(int[]arr,int start,int end){
         if(start<end){
            int pivotindex = partition(arr,start,end);
           
            quicksort(arr,start,pivotindex-1);
            quicksort(arr,pivotindex+1,end);
         }
    }
    public static int partition(int []arr,int start , int end){
        int pivot = arr[end];
        int i = start;
        int temp=0;
        for(int j = start; j<=end-1;j++){
            if(arr[j] < pivot){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        arr[end]=arr[i];
        arr[i]=pivot;
        return i;
    }
    
    public static void main(String[]args){
        Quick q = new Quick();
        int []arr={1,45,67,23,43,98,12};
        q.quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
