import java.util.HashMap;

public class DeteckloopLL {

    public ListNode head;

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

       
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean detectLoop() {
       ListNode temp=head;
       HashMap<ListNode,Integer> nodeMap=new HashMap<>();
       while(null!=temp){
        if(nodeMap.containsKey(temp)){
            return true;
           }
           nodeMap.put(temp,1);
           temp=temp.next;
       }return false;
      

    }
    

    public static void main(String[] args) {
        DeteckloopLL sll = new DeteckloopLL();
        sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
       
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;
        // sll.display();
        // Check if there is a loop in the linked list
        if (sll.detectLoop()) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}


// if(head==null || head.next==null){
        //     return false;
        // }
        // ListNode slow=head;
        // ListNode fast = head.next;
        // while(slow!=fast){
        //     if(fast==null || fast.next==null){
        //         return false;
        //     }
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // return true;