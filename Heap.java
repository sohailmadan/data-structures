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
    public boolean checkempty(){
        return size==0?true:false;
    }
    public int getchildindex(int index,boolean left){
        int tmp = left==true?1:2;
        return index*2+tmp;
    }
    public int delete(int index){
           int deletevalue=0;
        if(checkempty()==true){
            System.out.println("Heap is empty");
            System.exit(0);
        }
     
        else{
            int parentindex = getparentindex( index);
             deletevalue  =h[index]; 
            h[index] = h[size-1];
            size--;
            if(h[index] >h[parentindex] ){
                fixheapabove(index);
            }else{
                fixheapbelow(index);
            }
        }
        return deletevalue;
    }
    public void fixheapbelow(int index){
        int lchild = getchildindex(index,true);
        int rchild = getchildindex(index,true);
        int largest = index;
        
        
         while(index < size ){
                if(lchild <= size-1 && h[lchild]>h[largest]){
                    largest = lchild;
                }
                if(rchild <= size-1 && h[rchild]>h[largest]){
                    largest = rchild;
                }
            if(h[largest] > h[index]){
                int temp = h[largest];
                h[largest] = h[index];
                h[index]=temp;
                index = largest;
            }
            else{
                break;
            }
         }
        
    }
    public int getparentindex(int index){
        return (index-1)/2;
    }
    public boolean checkfull(){
        return size >=5?true:false;
    }
    public void printheap(){
        for(int i=0;i<size;i++){
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
        m.delete(2);
      m.printheap();
      
    }
}
