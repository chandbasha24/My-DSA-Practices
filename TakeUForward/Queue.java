import java.util.NoSuchElementException;
public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    public Queue(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }

    private class ListNode{
        private int data;
        private ListNode next; 
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0; 
    }

public void Enqueue(int data){  //enqueue........
    ListNode temp=new ListNode(data);
    if(isEmpty()){
        front=temp;
    }
    else{
        rear.next=temp;
    }
    rear=temp;
    length++;
}
public int Dequeue(){    //dequeue.........
    if(isEmpty()){
        throw new NoSuchElementException("queue is empty;");
    }
    int result=front.data;
    front=front.next;
    if(front==null){
        rear=null;
    }
    length--;
    return result;
}
public int first(){
    if(isEmpty()){
        throw new NoSuchElementException("queue is empty;");
    }
    return front.data;
}
public int Last(){
    if(isEmpty()){
        throw new NoSuchElementException("queue is empty;");
    }
    return rear.data;
}
public void print(){
    if(isEmpty()){
        return;
    }
    ListNode current=front;
    while(current!=null){
        System.out.print(current.data + " -->");
        current=current.next;
    }System.out.println(" null");
}
    public static void main(String args[]){
        Queue queue=new Queue();
        queue.Enqueue(10);
        queue.Enqueue(87);
        queue.Enqueue(97);
        // queue.print();
        // queue.Dequeue();
        queue.print();
        System.out.println(queue.first());
        System.out.println(queue.Last());


    }
}
