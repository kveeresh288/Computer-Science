package DSA.LinkedList;
//import DSA.LinkedList.Node.java;

public class SinglyLinkedList {

    Node head;

    SinglyLinkedList() {
        this.head=null;
        System.out.println("New Singly Linked list Object is Created");
    }

    public void insertAtBegining(int data){
        //newnode creation
        Node newNode = new Node(data);
        //works even if head is null
        newNode.next = this.head ;
        this.head = newNode; //update Head 
        
    }
    
    public void printAllNodesData(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        System.out.print("Head ->");

        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }

        System.out.print("null");
        System.out.println();

    }

    public void insertAtEnd(int data){

        if(head == null ){
            head = new Node(data);
            System.out.println("List Was Empty, made new node as Head ");
            return;
        }

        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        
        temp.next = new Node(data);
        System.out.println("Inserted Node at end ("+data+")");

    }
    
    public void testAllOperations(){

        this.insertAtBegining(3);
        this.insertAtBegining(2);
        this.insertAtBegining(1);
        
        this.printAllNodesData();

        this.insertAtEnd(4);
        this.insertAtEnd(5);
        this.insertAtEnd(6);

        this.printAllNodesData();

    }
    
}
