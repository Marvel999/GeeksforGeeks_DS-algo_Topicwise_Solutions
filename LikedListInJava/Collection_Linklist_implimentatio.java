package LikedList_In_Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Collection_Linklist_implimentatio {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<String> linkedlist=new LinkedList<>();
        List<String> arraylist=new ArrayList<>();
        arraylist.add("Manish");
        for(int i=0;i<5;i++)
        linkedlist.add(sc.nextLine());
        System.out.println(linkedlist);
        System.out.println(linkedlist.addAll(arraylist));
        System.out.println(linkedlist);
        arraylist.add(0,"Raju");
        System.out.println(arraylist);
        linkedlist.set(2,"Hii");
        System.out.println(linkedlist);
    }

}
