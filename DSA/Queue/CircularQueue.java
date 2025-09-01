package DSA.Queue;

public class CircularQueue {
    
    int front ;
    int rear ;
    int size;
    int queue[];

    public CircularQueue(int size) {

        this.front = this.rear = -1;
        this.size = size;
        this.queue = new int[this.size];
    }

    public void enqueue(int val){

        if(rear == -1 ){

            this.front = this.rear = 0;
            this.queue[this.front] = val;
            return;
        }

        if( ( this.rear + 1 ) % this.size  == this.front ){
            System.out.println("Queue is Full cant Insert ("+val+")");
            return;    
        }

        this.rear = ( this.rear + 1 ) % this.size ;
        queue[rear]=val;
        return;

    }

    public int dequeue(){

        if(front == -1){

            System.out.println("Queue is Empty Cant Delete ");
            return -1;
        }

        int val = this.queue[front];

        if(this.rear == this.front ){

           
            this.rear = this.front = -1;
            return val;

        }

        this.front = (this.front + 1) % this.size;

        return val;
    }

    public int peek(){

        if(front == -1){

            System.out.println("Queue is Empty");
            return -1;
        }

        return this.queue[front];
    }

    public void printQueue(){

        if(front == -1){
            System.out.println("Queue is Empty : ");
            return;
        }

        System.out.print("Front | ");

        int i = this.front;

        while(true){

            System.out.print(this.queue[i]+" | ");
            if(i == this.rear )break;
            i = (i+1) % this.size;

        }

        System.out.print(" Rear ");
        System.err.println();

    }

}
