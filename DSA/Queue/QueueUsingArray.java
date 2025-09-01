package DSA.Queue;

public class QueueUsingArray {
    
    int size;
    int front;
    int rear;

    int[] queue;

    public QueueUsingArray(int size) {

        this.size = size;
        this.front = this.rear = -1;

        this.queue = new int[size];

    }

    public void enqueue(int val){

        if(this.rear == this.size-1){

            System.out.println("Queue is full can't Add ("+val+")");
            return;
        }

        System.out.println("Added ("+val+")");
        this.queue[++rear] = val;
        if( front == -1 ) this.front = rear;

    }

    public int dequeue(){

        if(front == -1 ){
            System.out.println("Queue is Empty ");
            return -1;
        }

            System.out.println("Removed ("+this.queue[front]+")");

        if( this.front == this.rear ) {
            int val = queue[front];
            this.front = this.rear = -1;
            return val;
          
        }

        return this.queue[front++];
    }

    public int peek(){

        if(front == -1) return front;

        return this.queue[front];
    }


  public void printQueue(){

    if(this.front == -1){
        
        System.out.println("Queue is Empty ");
        return;
    }

        
    System.out.print("Front | ");

    for(int i = this.front; i<=rear ;i++){

       System.out.print(this.queue[i]+" | ");

    }

    System.out.print("Rear ");

    System.out.println(); 

  }

}
