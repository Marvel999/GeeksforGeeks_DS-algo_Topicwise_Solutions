package LikedListInJava.Creating_Custum_LinkedList;

import java.util.Scanner;

public class count_value_in_list {
    public static class Node {
        int data;
        searching_in_LinkedList.Node next;
    }

    public static class LinkedList {
        searching_in_LinkedList.Node head;
        searching_in_LinkedList.Node tail;
        int size;

        void addLast(int val) {
            searching_in_LinkedList.Node temp = new searching_in_LinkedList.Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (searching_in_LinkedList.Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
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
                searching_in_LinkedList.Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val) {
            searching_in_LinkedList.Node temp = new searching_in_LinkedList.Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
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
                searching_in_LinkedList.Node node = new searching_in_LinkedList.Node();
                node.data = val;

                searching_in_LinkedList.Node temp = head;
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
                searching_in_LinkedList.Node temp = head;
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
                searching_in_LinkedList.Node temp=head;
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }

                temp.next=temp.next.next;
                size--;
            }
        }

        boolean search(int val){
            searching_in_LinkedList.Node temp=head;
            while (temp!=null){
                if(temp.data==val){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
        int countValue(int val){
            searching_in_LinkedList.Node temp=head;
            int count=0;
            while (temp!=null){
                if(temp.data==val){
                    count++;
                }
                temp=temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        searching_in_LinkedList.LinkedList list=new searching_in_LinkedList.LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(40);
        list.addLast(40);
        list.display();
        System.out.println(list.search(10));
        System.out.println(list.getAt(1));
        System.out.println(list.countValue(40));

    }
}
