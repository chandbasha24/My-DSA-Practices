
public class MergeTwoSortedLists {
    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode tail= dummy;
        while(l1!=null && l2!=null) {
            if(l1.data<=l2.data){
                tail.next=l1;
                l1=l1.next;
            }
            else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        if(l1==null){
            tail.next=l2;
        }
        else{
            tail.next=l1;
        }
        return dummy.next;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        // Traverse and print the linked list
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeTwoSortedLists obj = new MergeTwoSortedLists();
obj.head=new ListNode(1);
        obj.head.next=new ListNode(2);

        // Creating first sorted linked list: 1 -> 3 -> 5 -> null
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Creating second sorted linked list: 2 -> 4 -> 6 -> null
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Printing the input lists
        System.out.println("First sorted linked list:");
        printList(list1);

        System.out.println("Second sorted linked list:");
        printList(list2);

        // Merging the two sorted linked lists
        ListNode mergedList = obj.mergeTwoLists(list1, list2);

        // Printing the merged linked list
        System.out.println("Merged sorted linked list:");
        printList(mergedList);
    }
}
