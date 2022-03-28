package Amazon_Practice;

import java.util.HashMap;
import java.util.Map;

class Nodea{
    int data;
    Nodea next, random;

    Nodea(int data){
        this.data = data;
    }
}

class CopyWithRandomPointer {

    public static void main(String[] arg){
        Nodea head = new Nodea(1);
        head.next = new Nodea(2);
        head.next.next = new Nodea(3);
        head.next.next.next = new Nodea(4);
        head.next.next.next.next = new Nodea(5);

        head.random = head.next.next.next.next;
        head.next.next.random = head.next;

        System.out.println("Original Linked List:");
        traverse(head);

        Nodea clone = cloneLinkedList(head);
        System.out.println("Cloned Linked List:");
        traverse(clone);
    }

    private static Nodea cloneLinkedList(Nodea head) {
        Map<Nodea, Nodea> map = new HashMap<>();
        cloneLinkedList(head, map);
        updateRandomPointers(head, map);
        return map.get(head);
    }

    private static void updateRandomPointers(Nodea head, Map<Nodea, Nodea> map) {
        if(map.get(head) == null){
            return;
        }
        map.get(head).random = map.get(head.random);
        updateRandomPointers(head.next, map);

    }

    //Map head with head data.....
    private static Nodea cloneLinkedList(Nodea head, Map<Nodea, Nodea> map){
        if(head == null){
            return null;
        }
        map.put(head, new Nodea(head.data));
        map.get(head).next = cloneLinkedList(head.next, map);
        return map.get(head);
    }

    private static void traverse(Nodea head) {
        if(head == null){
            System.out.println("null");
            return;
        }
        if(head.random != null){
            System.out.print(head.data + "(" + head.random.data + ") -> ");
        }else{
            System.out.print(head.data + "(" + "X" + ") -> ");
        }

        traverse(head.next);
    }
}
