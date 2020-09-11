public class MyClass {
    public static void main(String args[]) {
    int []a= {7,8,5,1,4,2,3};
        for(int k=0;k<a.length;k++){
        int temp = 0;
        int minvalue = a[k];
        int minindex =k;
        for(int j=k;j<a.length;j++){
            if(minvalue > a[j]){
                minvalue=a[j];
                minindex = j;
            }
        }
        if(minvalue < a[k]){
            temp = a[k];
            a[k]=minvalue;
            a[minindex]=temp;
        }
        
        }
        for(int p=0;p<a.length;p++){
            System.out.println(a[p]);
        }
        
    }
}
