
package binarytrees;


public class BinaryTrees {

   
 public static void main(String[] args) {
       BinaryTree bt = new BinaryTree();
       bt.insert(100);
       bt.insert(134);
       bt.insert(116);
       bt.insert(157);
       bt.insert(48);
       bt.insert(72);
       bt.insert(23);
       bt.insert(55);
       bt.InOrder();
       bt.preOrder();
       bt.postOrder();
       bt.levelOrderTraversal();
       System.out.println(bt.contains(55));
       System.out.println(bt.contains(87));
       System.out.println(bt.contains(48));
       System.out.println(bt.contains(1009));
  
}

    
}
