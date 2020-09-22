public class Arrayrotation {
    public void rotatearray(int[]arr,int d){
        int temp;
        while(d > 0){
            temp=arr[0];
            for(int i =0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
            d--;
        }
    }
    public void printarray(int[]arr){
        for(int j : arr){
            System.out.println(j);
        }
    }
    public static void main(String args[]) {
      int[]arr= {1,2,3,4,5,6,7,8};
      Arrayrotation s = new  Arrayrotation();
      s.rotatearray(arr,2);
      s.printarray(arr);
    }
}
