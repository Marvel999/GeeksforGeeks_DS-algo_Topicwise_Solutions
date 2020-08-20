package LikedListInJava;

public class Ankit_LinkedList {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
         void  addFirst(int val){
            Node node=new Node();
            node.data=val;
            node.next=null;
            if(size==0){
            head=tail=node;
            }else {
               node.next=head;
               head=node;
            }
           size++;
         }

        void  addLast(int val){
            Node node=new Node();
            node.data=val;
            node.next=null;
            if(size==0){
            head=tail=node;
            }else {
                tail.next=node;
                tail=node;
            }
            size++;
        }

        void  addAt(int val,int idx){
            Node node=new Node();
            node.data=val;
            node.next=null;
            if(idx<0||idx>=size){
                System.out.println("wrong input");
            }
            else if(idx==0){
              addFirst(val);
            }
            else if(idx==size-1){
                addLast(val);
            }else {
                Node temp=head;
                for (int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next=node;
                size++;
            }
        }


        void display(){
             Node temp=head;
             while (temp !=null){
                 System.out.println(temp.data);
                 temp=temp.next;
             }
        }

    }

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.addAt(100,1);
        list.display();
        System.out.println(list.size);
    }


}
