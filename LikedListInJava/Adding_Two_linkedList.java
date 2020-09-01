package LikedListInJava;
class Solution{

    //Reverse the list
    static Node reverseList (Node head) {
        if(head.next == null) return head;

        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }

    static Node addLists(Node first, Node second){


        Node firstListTemp = reverseList(first);
        Node secondListTemp = reverseList(second);


        Node newHead = null;
        Node prev = null;

        int carry = 0;

        while (firstListTemp != null || secondListTemp != null) {

            int data = (firstListTemp != null ? firstListTemp.data : 0) +
                    (secondListTemp != null ? secondListTemp.data : 0) + carry;

            if(data >= 10){
                carry = 1;
                data = data % 10;

            }else carry = 0;

            if(newHead == null) {
                newHead = new Node(data);
                prev = newHead;

            }else {
                prev.next = new Node(data);
                prev = prev.next;
            }


            firstListTemp = (firstListTemp != null ? firstListTemp.next : null);
            secondListTemp = (secondListTemp != null ? secondListTemp.next : null);

        }

        if(carry != 0)
            prev.next = new Node(carry);

        return reverseList(newHead);


    }
}
public class Adding_Two_linkedList {

}
