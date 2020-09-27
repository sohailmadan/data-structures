public class Myheap {
    int []h=new int[5];
    int size=0;
    public void add(int val){
        if(checkfull()){
            System.out.println("Heap is full");
            System.exit(0);
        }
        else{
            h[size]=val;
            fixheapabove(size);
            size++;
        }
    }
    public void fixheapabove(int index){
        int newvalue =h[index];
        while(index > 0 && h[index] > h[getparentindex(index)]){
            h[index] =  h[getparentindex(index)];
            index=getparentindex(index);
            h[index] = newvalue;
        }
    }
    
    public int getparentindex(int index){
        return (index-1)/2;
    }
    public boolean checkfull(){
        return size >=5?true:false;
    }
    public void printheap(){
        for(int i=0;i<5;i++){
            System.out.println(h[i]);
        }
    }
    public static void main(String args[]) {
      Myheap m = new Myheap();
      m.add(5);
      m.add(12);
      m.add(9);
       m.add(4);
        m.add(14);
      m.printheap();
      
    }
}
