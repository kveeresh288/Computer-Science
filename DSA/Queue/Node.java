package DSA.Queue;

public class Node {
    
    int data;
    Node next;

    Node(int data) {

        this.data = data;
        this.next = null;

        System.out.println("New Node Object is Created ("+data+")");
    }
}
