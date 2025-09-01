package DSA.Queue;
//import DSA.LinkedList.Node;

public class QueueUsingLinkedList {
    
    Node Rear;
    Node Front;

    public QueueUsingLinkedList() {
        this.Rear = this.Front = null;
    }

    public void enqueue(int val){

        Node newNode = new Node(val);

        if( this.Front == null ){
            this.Front = this.Rear = newNode;
            return;
        }


        this.Rear.next = newNode;
        this.Rear = newNode;

    }

    public void dequeue(){


        if( this.Front == null){
            System.out.println("Queue is Empty");
            return;
        }

        this.Front = this.Front.next;

        if (this.Front == null) {  // Single Node Case 
            this.Rear = null;
        }
    }

    public int peek(){

        if(this.Front == null){
            return -1;
        }

        return this.Front.data;
    }

    public void printQueue(){

        if(this.Front == null ){
            System.out.println("Queue is Empty");
            return;
        }

        Node cur = Front;

        System.out.print("Front | ");

        while(cur!=null){

            System.out.print(cur.data+" | ");
            cur=cur.next;

        }

        System.out.print("Rear ");

        System.out.println();

    }
 
}
