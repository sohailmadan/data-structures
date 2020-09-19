class Node{
    int key;
    Node left, right;
    
}
public class Binarysearchtree {
    Node root;
    public void inordertraverse(Node node){
        if(node !=null){
         
            inordertraverse(node.left);
            System.out.println("key "+ node.key);
            inordertraverse(node.right);
            
           
            
        }
    }
    
    public void preordertraverse(Node node){
        if(node !=null){
           
            System.out.println("key "+ node.key);
            preordertraverse(node.left);
            preordertraverse(node.right);
            
            
        }
    }
    public void postordertraverse(Node node){
        if(node !=null){
          
            postordertraverse(node.left);
            
            postordertraverse(node.right);
            System.out.println("key "+ node.key);            
        }
    }
    public static void main(String args[]) {
      
      Binarytree tree = new Binarytree();
      tree.root= new Node(1);
      tree.root.left= new Node(2);
      tree.root.right= new Node(3);
      tree.root.left.left= new Node(4);
      tree.root.left.right= new Node(5);
      tree.root.right.left= new Node(6);
      tree.root.right.right= new Node(7);
      System.out.println("IN order traverse begin");
      tree.inordertraverse(tree.root);
      System.out.println("IN order traverse end");
      System.out.println("pre order traverse begin");
      tree.preordertraverse(tree.root);
      System.out.println("pre order traverse end");
      System.out.println("post order traverse begin");
      tree.postordertraverse(tree.root);
      System.out.println("post order traverse end");

    }
}
