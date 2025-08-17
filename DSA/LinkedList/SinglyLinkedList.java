package DSA.LinkedList;
//import DSA.LinkedList.Node.java;


public class SinglyLinkedList {

    Node head;
    int size = 0;
    SinglyLinkedList() {
        this.head=null;
        System.out.println("New Singly Linked list Object is Created");
    }

    public void insertAtBegining(int data){

        //newnode creation
        Node newNode = new Node(data);
        //works even if head is null
        newNode.next = this.head;
        this.head = newNode; //update Head 
        //update size
        this.size++;
        
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
            this.size++;
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
        this.size++;

        

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

        if (position == this.size + 1) {
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

        this.size++;

    }

    public void deleteAtFront(){

        if(this.head==null){
            System.out.println("List Is Empty ");
            return;
        }

        if(this.head.next==null){
            this.head=null;
            this.size--; //decrement size 
            return;
        }

       this.head = this.head.next;
       this.size--; //decrement size 

    }

    public void deleteAtEnd(){

        if(this.head==null){
            System.out.println("List Is Empty ");
            return;
        }

        if(this.head.next==null){
            this.head=null;
            this.size--; //decrement size 
            return;
        }

       Node prev = head;

       while(prev.next.next != null){
        prev = prev.next;
       }

       prev.next = null;

       this.size--; //decrement size 
    }

    public boolean search(int key){

        // if( this.head == null) {
        //     System.out.println("List is Empty Key Cant be Found");
        //     return false ;
        // }

        Node cur = head ;
        
        while (cur!=null) { 

            if(cur.data == key){
                System.out.println("Key Found");
                return true;
            }
            cur = cur.next;   
        }

        System.out.println("Key is Not Found");
        return false;

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

           
        System.out.println("Deleting at front...");
        this.deleteAtFront();
        this.printAllNodesData();
        System.out.println("Size: " + size);

       
        System.out.println("Deleting at end...");
        this.deleteAtEnd();
        this.printAllNodesData();
        System.out.println("Size: " + size);

        
        System.out.println("Searching for 20...");
        this.search(20);  // should be found if still present

        System.out.println("Searching for 99...");
        this.search(99);  // not in list

    }
    
}
