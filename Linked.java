class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
  
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;

    }
}
    
    public class Linked {
        public static void main(String[] args) {
            // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
    
            Solution solution = new Solution();
            
            // Remove the 2nd node from the end (which is the node with value 4)
            int n = 2;
            ListNode updatedHead = solution.removeNthFromEnd(head, n);
            
            // Print the updated linked list
            ListNode current = updatedHead;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
        }
    }
    
    
   
    

