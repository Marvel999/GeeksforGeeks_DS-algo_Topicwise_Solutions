package LikedListInJava;
//Floyd's cycle finding algoritm.
public class loop_detection_in_list {

    public static boolean detectLoop(Ankit_LinkedList.Node head){
        Ankit_LinkedList.Node f=head;
        Ankit_LinkedList.Node s=head;
        // while(temp.next!=null){
        //     temp=temp.next;
        // }
        while(f!=null && s!=null && f.next!=null){

            f=f.next.next;
            s=s.next;

            if(f==s){
                return true;
            }

        }
        return false;
        //  if(temp.next==null){
        //      return true;
        //  }else{
        //      return false;
        //  }

    }
}
