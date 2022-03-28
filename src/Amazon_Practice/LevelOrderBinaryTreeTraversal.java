package Amazon_Practice;
import java.util.LinkedList;
import java.util.Queue;

//Time/ Space Complexity: O(n)

/*
We have to determine that binary tree is a binary search tree.

LOT: LOT can print the elements in levels like below
L0: 5,
L1: 3, 6
L2: 10, 4

                    5
                   / \
                  3   6
                 / \
                10  4

*Queue<NodeBST> queue: It consists list of queue.
 and check left of the node and right of the node, if not null keep add into the queue.
*queue.poll(): extract list of one element and put into the queue.


 */

//Done

class NodeLOBT{
    int data;
    NodeLOBT left, right;

    public NodeLOBT(int item){
        data = item;
        left = right = null;
    }
}

class BinaryTree{
    NodeLOBT root;

    void printOrderLevel(){
        Queue<NodeLOBT> queue = new LinkedList<NodeLOBT>();
        queue.add(root);

        while(!queue.isEmpty()){
            NodeLOBT tempNode = queue.poll();
            System.out.print(tempNode.data+ " ");

            if (tempNode.left != null){
                queue.add(tempNode.left);
            }

            if (tempNode.right != null){
                queue.add(tempNode.right);
            }

        }
    }
}


public class LevelOrderBinaryTreeTraversal {

    public static void main(String[] args){
        BinaryTree level_order = new BinaryTree();
        level_order.root = new NodeLOBT(5);
        level_order.root.left = new NodeLOBT(3);
        level_order.root.right = new NodeLOBT(6);
        level_order.root.left.left = new NodeLOBT(10);
        level_order.root.left.right = new NodeLOBT(4);

        System.out.println("Level Order traversal of binary tree is - ");
        level_order.printOrderLevel();
    }
}
