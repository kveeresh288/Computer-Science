package DSA.LinkedList;

public class StackLL {
    
    int size;
    int count;

    Node top;

    public StackLL(int size ){

        this.size = size;
        this.count = 0;

        top = null;
    }

    public void push(int value){

        if(count == size){
            System.out.println("The Stack is Full Can't Push ELement ("+value+") ");
            return;
        }
        
        Node newNode = new Node(value);

        if(count == 0){
            top = newNode;   
        }

        else{
            newNode.next = top ;
            top = newNode;
        }

        this.count++;
    }

    public int pop(){

        if(count == 0){
            System.out.println("Stack is Empty Can't Pop ");
            return -1;
        }

       int value = top.data;
       top = top.next;

       this.count--;

       System.out.println("Popped ("+value+")");

       return value;

    }

    public int peek(){

        if(count == 0){
            System.out.println("Stack is Empty ");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int getCount(){
        return count;
    }


   public void testStackOperations(){ 
    
        System.out.println("--- Stack Operations Test ---\n");

        // Initially empty
        System.out.println("Is stack empty? " + this.isEmpty());
        System.out.println("Peek: " + this.peek());
        System.out.println("Pop: " + this.pop());

        System.out.println("\n--- Pushing elements ---");
        this.push(10);
        this.push(20);
        this.push(30);
        System.out.println("Count after pushes: " + this.getCount());

        // Overflow case
        this.push(40);

        // Peek current top
        System.out.println("Top element (peek): " + this.peek());

        System.out.println("\n--- Popping elements ---");
        System.out.println("Pop: " + this.pop()); // 30
        System.out.println("Pop: " + this.pop()); // 20
        System.out.println("Pop: " + this.pop()); // 10

        // Underflow case
        System.out.println("Pop: " + this.pop());

        System.out.println("\nIs stack empty now? " + this.isEmpty());
        System.out.println("Final Count: " + this.getCount());

   }
}
