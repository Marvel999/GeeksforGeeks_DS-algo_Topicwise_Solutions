package LikedList_In_Java.Creating_Custum_LinkedList;

import javax.xml.soap.Node;

public class TriversingLinkedlist {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
    void printlist(){
        Node n=head;
        while (n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }

    public static void main(String[] args){
        TriversingLinkedlist tvl=new TriversingLinkedlist();
        tvl.head=new Node(10);
        Node second=new Node(11);
        Node third=new Node(20);
        tvl.head.next=second;
        second.next=third;
        tvl.printlist();

    }
}
