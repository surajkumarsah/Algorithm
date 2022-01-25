package Amazon_Practice;


/*
We have to determine that is binary tree a binary search tree.
 */

import java.util.LinkedList;
import java.util.Queue;

class NodeBST{
    int data;
    NodeBST left, right;

    NodeBST(int item){
        data = item;
        left = right = null;
    }
}

class BinarySearchTree{
    NodeBST root;

//    public void addElementToTree(){
//
//        Queue<NodeBST> queue = new LinkedList<NodeBST>();
//        queue.add(root);
//
//        while(!queue.isEmpty()){
//
//            NodeBST tempNode = queue.poll();
//            System.out.print(tempNode.data+" ");
//
//            if (tempNode.left != null)
//                queue.add(tempNode.left);
//
//            if (tempNode.right != null)
//                queue.add(tempNode.right);
//
//        }
//    }

    public int checkForBST(){

        Queue<NodeBST> queue = new LinkedList<NodeBST>();
        queue.add(root);

        while(!queue.isEmpty()){
            NodeBST nodeBST = queue.poll();

            if ((nodeBST.left != null)){
                if((nodeBST.data > nodeBST.left.data))
                    queue.add(nodeBST.left);
                else
                    return 0;
            }

            if((nodeBST.right != null)){
                if ((nodeBST.data < nodeBST.right.data))
                    queue.add(nodeBST.right);
                else
                    return 0;
            }
            }
        return 1;
    }


}


public class IsBinarySearchTree {

    public static void main(String[] args){

        BinarySearchTree bst = new BinarySearchTree();

        bst.root = new NodeBST(5);
        bst.root.left = new NodeBST(3);
        bst.root.right = new NodeBST(6);
        bst.root.left.left = new NodeBST(10);
        bst.root.left.right = new NodeBST(4);

//        bst.addElementToTree();

        if(bst.checkForBST() == 1){
            System.out.println("Binary Search Tree");
        }else{
            System.out.println("Not a Binary Search Tree");
        }
    }

}
