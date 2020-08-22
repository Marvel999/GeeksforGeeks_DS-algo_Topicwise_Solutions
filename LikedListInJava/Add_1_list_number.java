package LikedListInJava;

public class Add_1_list_number {
    public static void addOne(Ankit_LinkedList.Node head)
    {
        Ankit_LinkedList.Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        int sum=0;
        while(temp!=null){
            count--;
            int pow=(int)Math.pow(10,count);
            sum=sum+pow*temp.data;
            temp=temp.next;
        }
        // /sum=sum+1;

        // head=null;
        // Node ya=new Node();
        // ya.data=sum;
        // ya.next=null;
        // head=ya;
         System.out.println(sum+1);
//        return new Node(sum+1);

    }
}
