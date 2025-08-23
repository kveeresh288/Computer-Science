package DSA.LinkedList;

public class CircularSinglyList {
    
    Node Head;
    Node Tail;
    int size;

    CircularSinglyList(){
        System.out.println("Circular Singly Linked List is Created ");
        this.Head=this.Tail=null;
        this.size = 0;
    }

    public void insertAtBeginning(int data){

        Node newNode =  new Node(data);

        if(this.Head == null){
            this.Head = this.Tail = newNode;
            this.Tail.next = this.Head;
            
            this.size++;
            return;
        }

        newNode.next = this.Head;
        this.Head = newNode;
        this.Tail.next = this.Head;

        this.size++;
        return;
    }

    public void insertAtEnd(int data){

        Node newNode =  new Node(data);

        if(this.Head == null){
            this.Head = this.Tail = newNode;
            this.Tail.next = this.Head;
            
            this.size++;
            return;
        }

        newNode.next = this.Head;
        this.Tail.next = newNode;
        this.Tail = newNode;

        this.size++;

    }

    public void insertAtPosition(int insertPos , int data){

        if(insertPos <= 0 || insertPos > this.size+1 ){
            System.out.println("Invalid Position for Inserting");
            return;
        }

        if(insertPos == 1){
            insertAtBeginning(data);
            return;
        }

        if(insertPos == this.size+1){
            insertAtEnd(data);
            return;
        }

        int pos = 1;
        Node cur = this.Head;
        
        while(pos < insertPos-1){
            cur = cur.next;
            pos++;
        }

        Node newNode = new Node(data);

        newNode.next = cur.next;
        cur.next = newNode;
        this.size++;

    }

    public void printList(){

        System.out.println();

        if (this.Head == null) {
            System.out.println("The SingleCircularListIsEmpty: ");
            return;
        }

       
        if(this.Head == this.Tail){
            System.out.println("Head --> "+ this.Head.data + " --> Head  ");
            return;
        }



        System.out.print("Head --> ");
        Node cur = this.Head;

       do{
            System.out.print( cur.data + " --> ");
            cur = cur.next;

        }while (cur != Head);

        System.out.println("Head");
        System.out.println();
        return;

    }

    public void testAllOperations(){

        this.printList();

        this.insertAtBeginning(2);
        this.printList();

        this.insertAtEnd(3);
        this.printList();

        this.insertAtEnd(4);
        this.printList();

        this.insertAtPosition(size+1, 5);
        this.printList();

        this.insertAtPosition(1, 1);
        this.printList();

        this.insertAtBeginning(0);
        this.printList();

        this.insertAtEnd(6);
        this.printList();

        this.insertAtPosition(-1, 99);

        insertAtPosition(size+2, 99);

    }


}
