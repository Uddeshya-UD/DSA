package Tree;

public class PreOrder {
    
    public static void preOrder(Node root){
        // base case
        if(root == null){
        return;
    }
    System.out.println(root.data);
    preOrder(root.left);
    preOrder(root.right);
}
}
