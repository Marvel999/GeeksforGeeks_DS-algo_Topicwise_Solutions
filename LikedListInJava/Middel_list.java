package LikedListInJava;

public class Middel_list {

    int getMiddle(Ankit_LinkedList.Node head)
    {
        Ankit_LinkedList.Node f=head;
        Ankit_LinkedList.Node s=head;
        while(f.next!=null && f.next.next!=null){
            f=f.next.next;
            s=s.next;
        }
        if(f.next==null){
            return s.data;
        }else {
            return s.next.data;
        }
    }
}
