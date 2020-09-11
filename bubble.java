public class MyClass {
    public static void main(String args[]) {
    int []a= {7,8,5,1,4,2,3};
        for(int k=0;k<a.length;k++){
        int temp = 0;
      
        for(int j=0;j<a.length-1;j++){
            if( a[j] > a[j+1]){
                temp = a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
        
        }
        for(int p=0;p<a.length;p++){
            System.out.println(a[p]);
        }
        
    }
}
