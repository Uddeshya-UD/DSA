package Tree;

public class InOrder {
    
    public static void inOrder(Node root){
        // base case
        if(root == null){
        return;
    }
    inOrder(root.left);
    System.out.println(root.data);
    inOrder(root.right);
}
}
