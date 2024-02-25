class BST_class { 
   
    class Node { 
        int val; 
        Node leftChild, rightChild; 
   
        public Node(int data){ 
            val = data; 
            leftChild = rightChild = null; 
        } 
    } 
  
    Node parent; 
  
   
    BST_class(){ 
        parent = null; 
    } 
   
    void deleteKey(int val) { 
        parent = delete_Recursive(parent, val); 
    } 
   
 
    Node delete_Recursive(Node parent, int val)  { 
       
        if (parent == null)  return parent; 
   
       
        if (val < parent.val)   
            parent.leftChild = delete_Recursive(parent.leftChild, val); 
        else if (val > parent.val)  
            parent.rightChild = delete_Recursive(parent.rightChild, val); 
        else  { 
   
            if (parent.leftChild == null) 
                return parent.rightChild; 
            else if (parent.rightChild == null) 
                return parent.leftChild; 
   

            parent.val = minValue(parent.rightChild); 
   

            parent.rightChild = delete_Recursive(parent.rightChild, parent.val); 
        } 
        return parent; 
    } 
   
    int minValue(Node parent)  { 
        int minval = parent.val; 
        while (parent.leftChild != null)  { 
            minval = parent.leftChild.val; 
            parent = parent.leftChild; 
        } 
        return minval; 
    } 
   
  
    void insert(int val)  { 
        parent = insert_Recursive(parent, val); 
    } 
   
 
    Node insert_Recursive(Node parent, int val) { 
       
        if (parent == null) { 
            parent = new Node(val); 
            return parent; 
        } 
      
        if (val < parent.val)     
            parent.leftChild = insert_Recursive(parent.leftChild, val); 
        else if (val > parent.val)    
            parent.rightChild = insert_Recursive(parent.rightChild, val); 
       
        return parent; 
    } 
 

    void inorder() { 
        inorder_Recursive(parent); 
    } 
   
    
    void inorder_Recursive(Node parent) { 
        if (parent != null) { 
            inorder_Recursive(parent.leftChild); 
            System.out.print(parent.val + " "); 
            inorder_Recursive(parent.rightChild); 
        } 
    } 
     
    boolean search(int val)  { 
        parent = search_Recursive(parent, val); 
        if (parent!= null)
            return true;
        else
            return false;
    } 
   

    Node search_Recursive(Node parent, int val)  { 
   
        if (parent==null || parent.val==val) 
            return parent; 
     
        if (parent.val > val) 
            return search_Recursive(parent.leftChild, val); 
     
        return search_Recursive(parent.rightChild, val); 
    } 
}
class Assignment6{
    public static void main(String[] args)  { 
     
        BST_class bst = new BST_class(); 
        bst.insert(39); 
        bst.insert(75); 
        bst.insert(35); 
        bst.insert(56); 
        bst.insert(99); 
        bst.insert(67); 
        bst.insert(71);
        bst.insert(4);
        bst.insert(68);
        bst.insert(88);
        System.out.println("Binary search tree InOrder traversal: ");
        bst.inorder(); 
        System.out.println("\nAfter deletion:");
        bst.deleteKey(35);
        bst.inorder();
        
     } 
}