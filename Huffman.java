import java.util.*;
class Huffman{
    int data;
    char c;
    Huffman left;
    Huffman right;
}
  class Mycomparator implements Comparator<Huffman>{
        public int compare(Huffman a,Huffman b){
            return a.data-b.data;
        }
    }
public class Coding{
    public static void printarr(Huffman root,String s){
        if(root.left==null && root.right==null && Character.isLetter(root.c)){
             System.out.println(root.c + ":" + s); 
  
            return; 
        }
        printarr(root.left, s + "0"); 
        printarr(root.right, s + "1");
    }
    public static void main(String[]args){
        int n = 6; 
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
        int[] charfreq = { 5, 9, 12, 13, 16, 45 }; 
        PriorityQueue<Huffman>pq=new PriorityQueue<>(new Mycomparator());
        for(int i=0;i<charArray.length;i++){
            Huffman f =new Huffman();
            f.left=null;
            f.right=null;
            f.c=charArray[i];
            f.data = charfreq[i];
            pq.add(f);
        }
        Huffman root = null;
        while(pq.size() >1){
            Huffman left = pq.poll();
            Huffman right = pq.poll();
            Huffman f = new Huffman();
            f.c='-';
            f.data=left.data+right.data;
            f.left=left;
            f.right=right;
            root=f;
            pq.add(f);
            
        }
        printarr(root,"");
        
    }
}
