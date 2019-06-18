public class Bubble{
    public static void bubblesort(int[]a){
        
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                
                }
                else{
                    a[j]=a[j];
                }
        }
    
    }
    }
    public static void printarray(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
    }
    public static void main(String[]args){
        int[]a={4,3,9,87,45,76,1,10,12};
        bubblesort(a);
        printarray(a);
    }
}