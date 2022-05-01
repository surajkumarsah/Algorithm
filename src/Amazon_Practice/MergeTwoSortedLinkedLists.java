package Amazon_Practice;


/*
Sort the elements in the two lists

 */

//Done

class Node{
    int data;
    Node next;

    Node(int d){
        this.data = d;
        next = null;
    }
}

class MergeLists{
    Node head;

    public void addToTheLast(Node node){
        if (head == null){
            head = node;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

}


public class MergeTwoSortedLinkedLists {

    public static void main(String [] args){
        MergeLists lists1 = new MergeLists();
        MergeLists lists2 = new MergeLists();

        lists1.addToTheLast(new Node(5));
        lists1.addToTheLast(new Node(10));
        lists1.addToTheLast(new Node(15));

        lists2.addToTheLast(new Node(2));
        lists2.addToTheLast(new Node(3));
        lists2.addToTheLast(new Node(20));


        lists1.head = new Gfg().sortedMerged(lists1.head, lists2.head);

        lists1.printList();

    }

}


class Gfg{
////
    Node sortedMerged(Node headA, Node headB){

        Node dummyNode = new Node(0);

        Node tail = dummyNode;

        while(true){

            if (headA == null){
                tail.next = headB;  break;
            }

            if (headB == null){
                tail.next = headA;   break;
            }

            if (headA.data <= headB.data){
                tail.next = headA;
                headA = headA.next;
            }
            else{
                tail.next = headB;
                headB = headB.next;
            }


            tail = tail.next;
        }

        return dummyNode.next;
    }
}
