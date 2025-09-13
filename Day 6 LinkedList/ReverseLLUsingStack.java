public class ReverseLLUsingStack {
    public ListNode head; // Reference to the head of the linked list

    // Node class for the linked list
    public static class ListNode {
        public int data; // Data stored in the node
        public ListNode next; // Reference to the next node

        public ListNode(int data) { // Constructor
            this.data = data;
            this.next = null;
        }
    }

    // Display the linked list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Insert a node at the end of the list
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public ListNode reverseUsingStack(){
        if(head==null) return null;
        ListNode temp=head;
        java.util.Stack<Integer> stack=new java.util.Stack<>();
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=stack.pop();
            temp=temp.next;
        }return head;
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        ReverseLLUsingStack rll = new ReverseLLUsingStack();
        rll.head=new ListNode(1);
         ListNode second=new ListNode(2);
         ListNode third=new ListNode(3);
         ListNode fourth=new ListNode(4);
         ListNode fifth=new ListNode(5);
         rll.head.next=second;
         second.next=third;
         third.next=fourth;
         fourth.next=fifth;
        //  rll.display();

        // // Add nodes to the linked list
        // rll.insertLast(1);
        // rll.insertLast(3);
        // rll.insertLast(2);
        // rll.insertLast(4);

        System.out.print("Original Linked List: ");
        rll.display();

        // Reverse the linked list
        rll.reverseUsingStack();

        System.out.print("Reversed Linked List: ");
        rll.display();
    }
}










    // import java.util.ArrayDeque;
    // import java.util.Deque;
    
    // public void reverseUsingDeque() {
    //     if (head == null) return; // No action needed for an empty list
    
    //     ListNode temp = head;
    //     Deque<Integer> stack = new ArrayDeque<>(); // Using Deque as a stack
    
    //     // Step 1: Push all node data to the stack
    //     while (temp != null) {
    //         stack.push(temp.data); // Push onto the stack
    //         temp = temp.next;
    //     }
    
    //     // Step 2: Pop values from the stack and update the linked list
    //     temp = head;
    //     while (temp != null) {
    //         temp.data = stack.pop(); // Pop from the stack
    //         temp = temp.next;
    //     }
    // }
    