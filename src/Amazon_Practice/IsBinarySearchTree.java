package Amazon_Practice;


/*
We have to determine that binary tree is a binary search tree.

BST: left of the tree of each branch should be less than the root and right of the tree of each branch should be greater than the root data.


                    5
                   / \
                  3   6         Not a binary search tree.
                 / \
                10  4

*Queue<NodeBST> queue: It consists list of queue.
 and check left of the node and right of the node, if not null keep add into the queue.
*queue.poll(): extract list of one element and put into the queue.



*/


//Done

import java.util.LinkedList;
import java.util.Queue;

//Node to create an object that consists data of int type and left and right of Node type.
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

    public int checkForBST(){

        Queue<NodeBST> queue = new LinkedList<NodeBST>();
        queue.add(root);

        //Need to keep running until and unless it(queue) will empty
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
