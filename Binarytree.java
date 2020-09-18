class Node{
    int key;
    Node left, right;
    public Node(int data){
        key = data;
        left = right = null;
    }
}
public class Binarytree {
    Node root;
    public void traverse(Node node){
        if(node !=null){
            traverse(node.left);
            System.out.println("key "+ node.key);
            traverse(node.right);
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
      tree.traverse(tree.root);
      
    }
}
