public class MyClass {
    public void binarysearch(int[]a,int key,int first,int last,int mid){
        while(first<=last){
         
          if(a[mid]==key){
              System.out.println(mid);
              break;
          }
          else if(a[mid] > key){
              last = mid-1;
          }
          else{
              first=mid+1;
          }
           mid = (last+first)/2;
           if(first > last){
               System.out.print("Element not found");
           }
      }
    }
    public static void main(String args[]) {
      int []a = {1,2,5,6};
      int first = 0;
      int key =4;
      int last = a.length-1;
      int mid = (last+first)/2;
       MyClass b = new MyClass();
       b.binarysearch(a,key,first,last,mid);
    }
}
