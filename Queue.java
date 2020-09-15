public class Myqueue {
    int [] queue = new int[5];
    int front;
    int rear;
    int size;
    public void enqueue(int data){
           if(!isfull()){
         queue[rear]=data;
         rear = (rear + 1) % 5;
         size = size + 1 ;
           }
           else{
            System.out.println("queue is full");
        }
     }
    public int dequeue(){
         int data =queue[front];
        if(!isempty()){
           
             front = (front +1)%5;
             size = size - 1 ;
            
        }
        else{
            System.out.println("queue is empty");
        }
         return data;
     }
     
     public boolean isfull(){
         return size ==5;
     }
     
     public boolean isempty(){
         return size ==0;
     }
    public void show(){
        for(int i = 0; i<size; i++){
            System.out.println(queue[(front+i)%5]);
        }
    }
    public static void main(String args[]) {
      Myqueue m = new Myqueue();
      m.enqueue(3);
       m.enqueue(98);
        m.enqueue(66);
          m.enqueue(44);
        m.enqueue(5);
        
      m.dequeue();
       m.enqueue(8);
          m.enqueue(99);
        m.enqueue(78);
        
      m.show();
      
    }
}
