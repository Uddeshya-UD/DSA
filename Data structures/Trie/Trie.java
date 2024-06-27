package Trie;

public class Trie {
    private TrieNode root ;

    public Trie(){
        root = new TrieNode();
        System.out.println("Trie has been created");
    }

    /*
     * 
     *   Insertion Algo
     * 
     *   A .  create a node " Current " --> root 
     * 
     *   B .  Looping over the " word "
     *      
        *    1 . create node that will fetch children of current " name equal to ch"
        *    2 . if ch is not found in current , then create a new node and put it in the children map of current
        *    3 . Point new node as current     
     *     
     */

    public void insert(String word){
        TrieNode current = root;

        for(int i=0 ; i<word.length();i++){
            char ch = word.charAt(i);

            TrieNode node = current.children.get(ch);
            if(node == null){
                node = new TrieNode();
                current.children.put(ch, node);
            }

            current = node;
        }

        current.endOfString = true;
        System.out.println("Successfully inserted "+word+ "in trie");

    }


    public boolean search(String word){
        TrieNode currentNode = root;

        for(int i=0 ;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if(node == null){
                System.out.println("Word : "+word+"Does not exist in the trie");
                return false;       
            }

            currentNode = node;
        }
        if(currentNode.endOfString == true){
            System.out.println("Word : "+word+" exists in the trie");
                return true; 
        } else {
                 System.out.println("Word : "+word+" Does not exist in the trie but it's a prefix of another string");
        }
        return currentNode.endOfString;
    }

}
