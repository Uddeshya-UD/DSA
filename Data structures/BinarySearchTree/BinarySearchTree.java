package BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTree {

    class Node {

        int data;
        Node left;
        Node right;
        
        Node(int d){
            data = d;
            left = right = null;
        }
        
    }

    private Node root;

    BinarySearchTree(){
        this.root = buildTree();
    }

    public Node buildTree(){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        Node root = null;

        while(d!=-1){
            root = insert(this.root,d);
            d = sc.nextInt();
        }
        return root;
    }

    Node insert(Node root , int key){
        if(root==null){
            return new Node(key);
        }
        if(key<=root.data){
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }


        return root;

    }

}
