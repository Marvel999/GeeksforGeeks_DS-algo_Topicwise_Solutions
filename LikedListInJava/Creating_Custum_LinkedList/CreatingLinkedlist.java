package LikedList_In_Java.Creating_Custum_LinkedList;

import javax.xml.soap.Node;
import java.lang.reflect.Array;

//public class CreatingLinkedlist {
//    Node head;
//
//    static class Node{
//        int data;
//        Node next;
//        Node(int d){ data=d;
//        next=null;
//        }
//    }
//// triversing linkedlist
//
//   public void  printlist(){
//        Node n= head;
//        while (n!=null){
//            System.out.println(n.data+" ");
//            n=n.next;
//        }
//    }
//
//
//    public static void main(String[] args){
//        CreatingLinkedlist linkedlist=new CreatingLinkedlist();
//        linkedlist.head=new Node(10);
//        Node second=new Node(20);
//        Node third=new Node(30);
//        linkedlist.head.next=second;
//        second.next=third;
//        third.next=null;
//        System.out.println(linkedlist.head.data);
//        linkedlist.printlist();
//    }
//
//}

class CreatingLinkedlist{
    Node head;
    static  class  Node{
        int data;
        Node next;
        Node(int d){
            data=d;
           next=null;
        }
    }

    void printlist(){
        Node n=head;
        while (n != null){
            System.out.print(" "+n.data);
            n=n.next;
        }
    }

    public static void main(String[] args){
        CreatingLinkedlist cll=new CreatingLinkedlist();
        cll.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        cll.head.next=second;
        second.next=third;
        third.next=null;
        System.out.println(cll.head.data);
        cll.printlist();
    }
}
