package DSA.Queue;

public class TestQueue {
    public static void main(String[] args) {

        System.out.println("Testing Linear Queue Using Array :");
        QueueUsingArray q = new QueueUsingArray(5);

        q.printQueue();

        q.enqueue(1);
        q.enqueue(2);

        q.printQueue();

        q.dequeue();

        q.printQueue();

        q.enqueue(4);
        q.enqueue(5);

        q.printQueue();

        System.out.println("Peek Element is ("+q.peek()+")");

        q.enqueue(6);

        q.printQueue();

        q.enqueue(7);

        q.printQueue();

        q.dequeue();

        System.out.println("Peek Element is ("+q.peek()+")");
        q.printQueue();

        q.dequeue();
        q.printQueue();

        q.dequeue();
        q.printQueue();

        System.out.println("Peek Element is ("+q.peek()+")");
        q.enqueue(5);

        q.printQueue();
        q.dequeue();

        System.out.println("Peek Element is ("+q.peek()+")");

        q.printQueue();
        q.enqueue(10);

        q.printQueue();

        System.out.println();

        System.out.println("Testing Circular Queue Using Array ");
        System.out.println();
        
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);

    
        cq.enqueue(30);
        cq.enqueue(40);

        System.out.println("Peek: " + cq.peek()); 
        System.out.println();

        cq.printQueue();  
        System.out.println();

        System.out.println("Dequeued: " + cq.dequeue()); 
        cq.printQueue(); 
        System.out.println(); 

        cq.enqueue(50);
        System.out.println("Peek: " + cq.peek()); 
        System.out.println();

        cq.enqueue(60); 
        

        cq.printQueue();  
        System.out.println();
        System.out.println("Peek: " + cq.peek()); 

        System.out.println();
        System.out.println("Dequeued: " + cq.dequeue()); 

        cq.printQueue();  
        System.out.println();

        cq.enqueue(90);
        cq.printQueue();
        System.out.println();
        System.out.println("Peek: " + cq.peek()); 

        System.out.println();

        cq.enqueue(100);
        cq.printQueue();
        System.out.println();

        System.out.println();

        while(cq.peek() != -1){
           
            System.out.println("Removed ("+cq.dequeue()+")");
            cq.printQueue();
            System.out.println("Peek: " + cq.peek()); 
            System.out.println();
        }

        System.out.println();

        System.out.println("Testing Queue Using LinkedList Dynamic ");
        System.out.println();

        QueueUsingLinkedList lq = new QueueUsingLinkedList();

        lq.printQueue();// list is Empty When Created
        
        lq.enqueue(10);
        lq.printQueue();
        System.out.println();

        
        lq.enqueue(20);
        lq.printQueue();
        System.out.println();


        lq.enqueue(30);
        lq.printQueue();
        System.out.println();


        lq.enqueue(40);
        lq.printQueue();
        System.out.println();


        lq.dequeue();
        lq.printQueue();
        System.out.println();

        lq.dequeue();
        lq.printQueue();
        System.out.println();


        lq.dequeue();
        lq.printQueue();
        System.out.println();


        lq.enqueue(50);
        lq.printQueue();
        System.out.println();

        lq.dequeue();
        lq.printQueue();
        System.out.println();

        lq.dequeue();
        lq.printQueue();
        System.out.println();

        lq.enqueue(60);
        lq.printQueue();
        System.out.println();

        lq.dequeue();
        lq.printQueue();
        System.out.println();

    
    }
 
}
