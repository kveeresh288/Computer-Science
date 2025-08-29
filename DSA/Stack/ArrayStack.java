package DSA.Stack;

public class ArrayStack {
    
    int stack[];
    int top;

    public ArrayStack(int size) {

        this.stack = new int[size];
        this.top=-1;

    }

    public void push(int value){

        if(this.top == stack.length-1){
            System.out.println("The Stack is Full Cant't Push ("+value+")");
            return;
        }

        stack [ ++this.top ] = value;
        return;
    }

    public int pop(){

        if(this.top == -1){

            System.out.println("The Stack is Empty Cant't Pop()");
            return -1;
        }

        int val = this.stack[this.top--];

        return val;
    }


    public int getCount(){
        return this.top+1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public int peek(){
        
        if(this.top == -1)return this.top;

        return this.stack[this.top];

    }
    

}
