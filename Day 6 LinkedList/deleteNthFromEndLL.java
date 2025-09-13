
public class deleteNthFromEndLL {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void display() { // Display the linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null\n");
    }

   

    // public void deleteNode(int key) { // Delete a node by value
    //     ListNode current = head;
    //     ListNode temp = null;
    //     while (current != null && current.data != key) {
    //         temp = current;
    //         current = current.next;
    //     }
    //     if (current == null) {
    //         return;
    //     }
    //     temp.next = current.next;
    // }

    public ListNode deleteNthFromEnd(int n) { // Delete the Nth node from the end
       ListNode Dummy=new ListNode(0);
       Dummy.next=head;
       ListNode fast=Dummy;
       ListNode slow=Dummy;
       for(int i=1;i<=n;i++){
        fast=fast.next;
       }
       while(fast.next!=null){
        fast=fast.next;
        slow=slow.next;
       }
       slow.next=slow.next.next;
       return Dummy.next;
    }

    public static void main(String[] args) {
        deleteNthFromEndLL sll = new deleteNthFromEndLL();

        // Creating the linked list
        sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Display original linked list
        System.out.print("Original List: ");
        sll.display();

        // Delete the Nth node from the end and display the updated list
        sll.deleteNthFromEnd(2);
        System.out.print("After Deleting 3rd Node from End: ");
        sll.display();
    }
}
