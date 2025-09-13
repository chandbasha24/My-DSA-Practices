public class SingleLinkedList{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }


    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }



    public void display(){   //display.............
         ListNode current= head;
         while(current!=null){
             System.out.print(current.data+ "-->");
             current=current.next;
         }
         System.out.print("null");
         System.out.println("");
    }

    public void insertFirst(int value){  //first.......
    ListNode newNode=new ListNode(value);
    newNode.next=head; 
    head=newNode;
   
    }


    public void insertLast(int value){
        ListNode newNode= new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current =head;
        while(null!=current.next){
            current=current.next;
        }
        current.next=newNode;
       
    }

    public void insertparticular(int position,int value){  //insert at anywhere 
      ListNode node=new ListNode(value);
      if(position==1){
        node.next=head; 
        head=node;

      }
      else{
        ListNode previous=head;
        int count=1;   //
        while(count<position-1){
            previous=previous.next;
            count++;
        }
        ListNode current= previous.next;
        previous.next=node; // 1 to 4--
        node.next=current;  //--4 to 2--     
        
      }
    }

    public ListNode deleteFirst(){
        if(head==null){
            return head;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }


    public ListNode deleteLast(){
        if(head ==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }
    public void deleteparticular(int position){
         if(position==1){
            head=head.next;
         }
         else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;
         }
    }

    public void deleteNode(int key){
        ListNode current=head;
        ListNode temp=null;
        while(current!=null && current.data!=key){
            temp=current;
            current=current.next;
        }
        if(current==null){
            return;
        }
        temp.next=current.next;
    }

    public static void main(String[] args) {
        SingleLinkedList sll=new SingleLinkedList();  //
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third =new ListNode(8);
        ListNode fourth=new ListNode(11);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;     
        sll.display(); ///

    //     System.out.println("length " +  sll.length()); ///length

    //     sll.insertFirst(11); //insert at first
    //     sll.display();
    //    sll.insertLast(35);   //insert at last
    //    sll.display();
    //    sll.insertparticular(1, 3);
    //    sll.insertparticular(2, 5);
    //    sll.insertparticular(1, 2);
    //    sll.insertparticular(2, 4);
    //    sll.insertparticular(5, 7);
    //    sll.display();
    // //    sll.deleteparticular(4);
    // //    sll.display();
    //    sll.deleteNode(7);
    //    sll.display();


    // sll.insertLast(11);
    // sll.insertLast(8);
    // sll.insertLast(1);
    // sll.insertLast(10);
    // sll.display();
    // System.out.println(sll.deleteFirst().data);
    // sll.display();

    // System.out.println(sll.deleteLast().data);
    // sll.display();
        
    }

    
}



 