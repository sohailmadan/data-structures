public class Mystack {
    int [] stack = new int[5];
    int top=0;
    public void push(int data){
           if(!isfull()){
               stack[top]=data;
               top++;
           }
           else{
            System.out.println("stack is full");
        }
     }
    public int pop(){
         int data=0;
        if(!isempty()){
           
            top =top -1; 
             data = stack[top];
             stack[top]=0;
            
        }
        else{
            System.out.println("queue is empty");
        }
         return data;
     }
     
     public boolean isfull(){
         return top >=5;
     }
     public int peek(){
         return stack[top-1];
     }
     
     public boolean isempty(){
         return top ==0;
     }
    public void show(){
        for(int i = 0; i<stack.length; i++){
            System.out.println(stack[i]);
        }
    }
    public static void main(String args[]) {
      Mystack m = new Mystack();
     m.push(37);
     m.push(39);
     m.push(11);
     m.push(22);
     m.push(44);
     m.push(3);
     m.pop();
      m.pop();
      m.show();
      
    }
}
