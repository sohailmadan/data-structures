class Node{
    int key;
    Node left, right;
    
}
public class Binarysearchtree {
    public Node createnewnode(int data){
        Node n = new Node();
        n.key = data;
        n.left =null;
        n.right =null;
        return n;
    }
    public Node insert(Node node,int data){
        if(node==null){
            return createnewnode( data);
        }
        if(data>node.key ){
            node.right = insert(node.right,data );
        }
        else{
            node.left= insert(node.left,data );
        }
        return node;
        
    }
     public void preordertraverse(Node node){
        if(node !=null){
           
            System.out.println("key "+ node.key);
            preordertraverse(node.left);
            preordertraverse(node.right);
            
            
        }
    }
    // public function delete(Node n ,int data){
    //     if(n==null){
    //         return ;
    //     }
    //     if(n.key > data){
    //             delete(n.left,data);            
    //     }
    //     elseif(n.key < data){
    //         delete(n.right,data);
    //     }
    //     else{
            
    //     }
    // }
    
    public static void main(String args[]) {
      
      Binarysearchtree bst = new Binarysearchtree();
      Node root = null;
      root = bst.insert(root,5);
      root = bst.insert(root,4);
      root = bst.insert(root,3);
      root = bst.insert(root,8);
      
      root = bst.insert(root,6);
      root = bst.insert(root,9);
      bst.preordertraverse(root);

    }
}
