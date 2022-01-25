package Amazon_Practice;
import java.util.LinkedList;
import java.util.Queue;

//Time/ Space Complexity: O(n)

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
        level_order.root = new NodeLOBT(1);
        level_order.root.left = new NodeLOBT(2);
        level_order.root.right = new NodeLOBT(3);
        level_order.root.left.left = new NodeLOBT(4);
        level_order.root.left.right = new NodeLOBT(5);

        System.out.println("Level Order traversal of binary tree is - ");
        level_order.printOrderLevel();
    }
}
