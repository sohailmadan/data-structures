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
    public void insertatfirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    public void insertatindex(int data,int index){
        Node node = new Node();
        node.data = data;
        node.next = null;
         Node n = head;
         for(int i = 0 ;i<index-1;i++){
             n=n.next;
            
         }
     
     System.out.println(n.data);
        node.next=n.next;
           n.next = node;
    }
    public void deleteat(int index){
         if(index==0){
             head = head.next;
         }
         else{
             Node n = head;
             Node n1 = null;
             for(int i = 0 ;i<index-1;i++){
                 n=n.next;
                
             }
             n1 = n.next;
             n.next = n1.next;
             
             
         }
          
             
    }
    public void deletelast(){
          
        if (head == null || head.next == null) { 
           
        }
        else{
            Node n = head;
            while(n.next.next !=null){
                n = n.next;
            }
            n.next=null;
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
        m.insertatfirst(90);
        m.insertatindex(32,2);
         m.deleteat(0);
         m.deletelast();
        m.show();
    }
}
