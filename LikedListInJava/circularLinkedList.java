package LikedListInJava;

import LikedListInJava.Creating_Custum_LinkedList.searching_in_LinkedList;

import java.util.Scanner;

public class circularLinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
                temp.next = temp;
            } else {
                tail.next = temp;
                tail = temp;
                tail.next=temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            Node temp=head;
            for (int i = 0; i <size;i++ ) {

                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
            System.out.println(tail.next.data);
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
            Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val) {
         Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
                tail.next=temp;
            }

            size++;
        }

        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = new Node();
                node.data = val;

              Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;

                temp.next = node;
                size++;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
               Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }

                tail = temp;
                tail.next = null;
                size--;
            }
        }

        public void removeAt(int idx) {
            if(idx>=size||idx<0){
                System.out.println("Invalid arguments");
            }
            else if(idx==0){
                removeFirst();
            }
            else if(idx==size-1){
                removeLast();
            }

            else{
                Node temp=head;
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }

                temp.next=temp.next.next;
                size--;
            }
        }

        boolean search(int val){
            Node temp=head;
            while (temp!=null){
                if(temp.data==val){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }

        int countValue(int val){
            Node temp=head;
            int count=0;
            while (temp!=null){
                if(temp.data==val){
                    count++;
                }
                temp=temp.next;
            }
            return count;
        }
        int maxList(){
            int max=Integer.MIN_VALUE;
            Node temp=head;
            while (temp!=null){
                max=Math.max(max,temp.data);
                temp=temp.next;
            }
            return max;
        }



        int minList(){
            int min=Integer.MAX_VALUE;
            Node temp=head;
            while (temp!=null){
                min=Math.min(min,temp.data);
                temp=temp.next;
            }
            return min;
        }


         void circular(){
            tail.next=head;
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.circular();
//        list.display();
//        System.out.println(list.search(10));
//        System.out.println(list.getAt(1));
//        System.out.println(list.maxList()+"    "+list.minList());

        list.display();

    }
}
