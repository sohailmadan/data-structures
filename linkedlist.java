public class Mylinkedlist {
    Node head;
  static  class Node {  
    int data; 
    Node next;  
    }
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next !=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show(){
         Node n = head;
          while(n!=null){
                System.out.println("data "+n.data);
                n = n.next;
            }
    }    
    public static void main(String args[]) {
        Mylinkedlist m = new Mylinkedlist();
        m.insert(6);
        m.insert(4);
        m.insert(88);
        m.insert(12);
        m.show();
    }
}
