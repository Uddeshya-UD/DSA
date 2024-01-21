package Tree;

import java.util.Scanner;

class Node {

    int data;
    Node left;
    Node right;
    
    Node(int d){
        data = d;
        left = right = null;
    }
    
}

public class BinaryTree {

    Node root;

    BinaryTree(){
        Scanner sc = new Scanner(System.in);
        root = createTree(sc);


    }

    Node createTree(Scanner sc){
        int data = sc.nextInt();

        //base case
        if(data==-1){
            return null;
        }

        //Recursive case
        Node n = new Node(data);
        n.left = createTree(sc);
        n.right = createTree(sc);
        return n;
    }

    void display(){
        System.out.println("Pre-order");
        PreOrder.preOrder(root);
        System.out.println("In-Order");
        InOrder.inOrder(root);
        System.out.println("Post-Order");
        PostOrder.postOrder(root);
    }

}

