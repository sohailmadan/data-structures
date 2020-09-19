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
    public Node delete(Node n ,int data){
        if(n==null){
            return n ;
        }
        if(n.key > data){
                n.left = delete(n.left,data);            
        }
        else if(n.key < data){
                n.right = delete(n.right,data);
        }
        else{
            if(n.left==null){
                return n.right;
            } 
            else if(n.right==null){
                return n.left;
            }
            else{
                n.key=findmin(n.right);
                n.right=delete(n.right,n.key);
            }
        }
        return n;
    }
    public int findmin(Node n){
        int min = n.key;
        while(n.left !=null){
            min=n.left.key;
            n = n.left;
        }
        return min;
    }
    public boolean searchelement(Node n,int data){
        
        while(n !=null){
            if(n.key > data){
                n = n.left;
            }
            else if(n.key < data){
                n = n.right;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
      
      Binarysearchtree bst = new Binarysearchtree();
      Node root = null;
      root = bst.insert(root,5);
      root = bst.insert(root,4);
      root = bst.insert(root,3);
      root = bst.insert(root,8);
      
      root = bst.insert(root,6);
      root = bst.insert(root,9);
        bst.delete(root,5);
        
      bst.preordertraverse(root);
        if(bst.searchelement(root,4)){
            System.out.println("Element found" );
        }else{
            System.out.println("Element not found");
        }

    }
}
