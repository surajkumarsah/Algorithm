package HackerRank;

import javax.xml.soap.Node;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumber {

    public static void main(String[] args){

        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();

        l1.add(2); l1.add(4); l1.add(3);
        l2.add(5); l2.add(6); l2.add(4);

        Iterator i = l1.listIterator();

        while(i.hasNext()){
            System.out.print(i.next());
        }

    }

}
