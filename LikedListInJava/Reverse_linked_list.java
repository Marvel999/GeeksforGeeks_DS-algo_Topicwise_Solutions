package LikedListInJava;

public class Reverse_linked_list {
    class ReverseLL
    {
        // This function should reverse linked list and return
        // head of the modified linked list.
        Ankit_LinkedList.Node reverseList(Ankit_LinkedList.Node head)
        {
            if(head == null)
                return null;

            Ankit_LinkedList.Node prev = null;
            Ankit_LinkedList.Node tmp = head;
            Ankit_LinkedList.Node ahead = tmp.next;

            while(tmp != null)
            {
                ahead = tmp.next;   // Take the next node as ahead
                tmp.next = prev;    // Link current node to its previous
                prev = tmp;         // update prev as the current node
                tmp = ahead;        // update tmp
            }

            return prev;

        }
    }
}
