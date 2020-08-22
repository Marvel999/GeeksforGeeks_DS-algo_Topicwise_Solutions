package LikedListInJava;

import java.util.Collections;
import java.util.LinkedList;

public class Roteion_in_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        int last=list.getLast();
        int first=list.getFirst();
        list.removeFirst();
        list.addFirst(last);
        list.removeLast();
        list.addLast(first);
        System.out.println(list);
    }
}
