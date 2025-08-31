package DSA.Stack;
import DSA.LinkedList.StackLL;

public class TestArrayStack {

    public static void main(String[] args) {

        System.out.println("\n--- Testing ArrayStack ---");
        ArrayStack stackA = new ArrayStack(5);

        // Initially Empty
        System.out.println("Is Empty? " + stackA.isEmpty());
        System.out.println("Count = " + stackA.getCount());

        // Push Elements
        stackA.push(10);
        stackA.push(20);
        stackA.push(30);
        stackA.push(40);
        stackA.push(50);
        System.out.println("Count after pushes = " + stackA.getCount());

        // Try to Push when Full
        stackA.push(60);

        // Peek Top Element
        System.out.println("Peek = " + stackA.peek());

        // Pop Elements
        System.out.println("Popped = " + stackA.pop());
        System.out.println("Popped = " + stackA.pop());
        System.out.println("Popped = " + stackA.pop());

        System.out.println("Is Empty? " + stackA.isEmpty());

        // Peek after Pops
        System.out.println("Peek = " + stackA.peek());
        System.out.println("Count = " + stackA.getCount());

        // Pop Remaining
        System.out.println("Popped = " + stackA.pop());
        System.out.println("Popped = " + stackA.pop());

        // Try Pop on Empty
        System.out.println("Popped = " + stackA.pop());

        // Try Peek on Empty
        System.out.println("Peek = " + stackA.peek());

        System.out.println("Is Empty? " + stackA.isEmpty());
        System.out.println("\n--- End of Test ---");
        System.out.println();

        System.out.println("\n--- Testing LikedListStack ---");

        StackLL stackLL = new StackLL(3);

       
        // stackLL.testStackOperations();

        // System.out.println("\n--- End of Test ---");
        // System.out.println();

       
        
    }
}