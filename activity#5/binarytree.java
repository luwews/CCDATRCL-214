public class binarytree {

        public static void main(String[] args) throws Exception {
          
          nodes prestree = new nodes("tree");
          
          nodes group1 = new nodes("wood");
         
          nodes group2 = new nodes("wood1");

          nodes branch = new nodes("branch");
         
          nodes fruit = new nodes("branch1");
        
          nodes leaf = new nodes("leaf");
          
          nodes flower = new nodes("leaf1");
        
          prestree.left = group1;
          prestree.right = group2;
  
          group1.left = branch;
          group1.right = fruit;
  
          
          group2.left = leaf;
          group2.right = flower;

System.out.println("inorder:");
traverseInOrder(prestree);
System.out.println( "\npreoder:");
traversePreOrder(prestree);



          System.out.println("\ntraverse:");
          traversePostOrder(prestree);

        }
          
    static void traverseInOrder(nodes node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
        
            traverseInOrder(node.right);
           
        }
    }

         
    static void traversePreOrder(nodes node) {
        if (node != null) {
            System.out.print("<" + node.data);
            traversePreOrder(node.left);
           
            traversePreOrder(node.right);
        }
}
           
    static void traversePostOrder(nodes node) {
        if (node != null) {
            traversePostOrder(node.left);
           
            traversePostOrder(node.right);
            
            System.out.print(">" + node.data);
        }
}

}
