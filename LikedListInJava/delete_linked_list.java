package LikedListInJava;

public class delete_linked_list {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
            next=null;
        }
    }

    void printlist(){
       Node n= head;
       while (n!=null){
           System.out.print(n.data+" ");
           n=n.next;
       }
    }

    void push(int new_data){
        Node new_node= new Node(new_data);
        new_node.next=head;
        head=new_node;

    }

     void insertInbetween(Node prev,int new_data){
        Node new_node=new Node(new_data);
        new_node.next=prev.next;
        prev.next=new_node;
     }

     void insertInEnd(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=null;
        if(head==null){
            head=new_node;
            return;
        }
       else {
            Node n = head;
            while (n.next != null)
                n = n.next;
            n.next = new_node;
            return;
        }
     }
    void deleteList(){
        head=null;
        // all the think done by garbage collection
    }


    public static void main(String[] args){
        delete_linked_list iel=new delete_linked_list();
        iel.head=new Node(11);
        Node second=new Node(12);
        Node third=new Node(13);
        iel.head.next=second;
        second.next=third;

        third.next=null;
        iel.push(10);
        iel.insertInbetween(iel.head,20);
        iel.insertInEnd(0);

        iel.printlist();

    }
}
