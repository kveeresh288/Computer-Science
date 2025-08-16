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

        size++;
        
    }
    
    int size = 0;

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
            size++;
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
        size++;

        

    }

    public void insertAtPosition(int position,int data){

        if(position<=0){
            System.out.println("Invalid Position "); 
            return;
        }

        if(position == 1) {
            insertAtBegining(data);
            return;
        }

        if (position == size + 1) {
            insertAtEnd(data);
            return;
        }

        Node cur = head;
        int curPos = 1 ;

        while(curPos < position-1 && cur!=null){
            cur = cur.next;
            curPos++;
        }//loop to travel prev node of insertposition

        if(cur == null) {
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = cur.next;
        cur.next = newNode;

        size++;

    }

    public void testAllOperations(){

        this.insertAtBegining(3);
        this.insertAtBegining(2);
        this.insertAtBegining(1);
        
        this.printAllNodesData();

        System.out.println("Size "+size);

        this.insertAtEnd(4);
        this.insertAtEnd(5);
        System.out.println("Size "+size);

        this.insertAtEnd(6);
        this.printAllNodesData();
        System.out.println("Size "+size);

        this.insertAtPosition(4, 20);
        this.printAllNodesData();

        this.insertAtPosition(1, -1);
        this.insertAtPosition(0, 2);
        this.printAllNodesData();

        this.insertAtPosition(20, 999);
        this.insertAtPosition(size, 12 );
        this.printAllNodesData();
        System.out.println("Size "+size);

        this.insertAtPosition(size+1, 55 );
        this.printAllNodesData();
        System.out.println("Size "+size);


    }
    
}
