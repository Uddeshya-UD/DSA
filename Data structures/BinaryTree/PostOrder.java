package Tree;

public class PostOrder {
    
    public static void postOrder(Node root){
        // base case
        if(root == null){
        return;
    }
    
    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.data);
}
}
