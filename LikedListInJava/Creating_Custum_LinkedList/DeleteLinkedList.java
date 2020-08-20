package LikedList_In_Java.Creating_Custum_LinkedList;


public class DeleteLinkedList {

    public CreatingLinkedlist.Node dete(int position , CreatingLinkedlist.Node head){
        CreatingLinkedlist.Node n=head;
        if(head!=null){
            int i=0;
            while (i<position-1){
                n=n.next;
                i++;
            }
            n.next=n.next.next;

        }
        return head;
    }



    public static  void main(String[] args){
        CreatingLinkedlist cll=new CreatingLinkedlist();
        DeleteLinkedList dll=new DeleteLinkedList();
        cll.head=new CreatingLinkedlist.Node(10);
        CreatingLinkedlist.Node first =new CreatingLinkedlist.Node(12);
        CreatingLinkedlist.Node second=new CreatingLinkedlist.Node(11);
        cll.head.next=first;
        first.next=second;
        second.next=null;
        cll.printlist();
        dll.dete(1,cll.head);
        System.out.println(" ");
        cll.printlist();

    }
}
