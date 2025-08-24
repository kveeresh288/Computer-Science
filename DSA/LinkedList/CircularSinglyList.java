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


    public boolean Search(int key){

        System.out.println();

        if (this.Head == null) {
            System.out.println("The SingleCircularListIsEmpty: Key Not Found");
            return false;
        }

        Node cur = this.Head;

       do{
            if( cur.data == key){
                System.out.println(key +" Key Found");
                return true;

            }
            cur = cur.next;
           

        }while (cur != Head);

       
        System.out.println(key +" Key Not Found ");
        return false;

    }


    public void deleteAtBeginnig(){

        if( this.Head == null ){
            System.out.println("Circular Singly Linked List Is Empty: ");
            return;
        }

        if (this.Head == this.Tail) {
            this.Head = this.Tail = null;
            this.size--;
            return;
        }

        this.Head = this.Head.next;
        this.Tail.next = Head;
        this.size--; 
        
    }

    public void deleteAtEnd(){

        if( this.Head == null ){
            System.out.println("Circular Singly Linked List Is Empty: ");
            return;
        }

        if (this.Head == this.Tail) {
            this.Head = this.Tail = null;
            this.size--;
            return;
        }

        Node cur  = this.Head;

        while(cur.next != this.Tail){
            cur = cur.next;
        }

        cur.next = this.Head;
        this.Tail = cur; 
        this.size--;

    }

    public void deleteAtPositon(int delPosition){

        if(delPosition <= 0 || delPosition > this.size){
            System.out.println("Invalid Delete Position ");
            return;
        }

        if(delPosition == 1){
            this.deleteAtBeginnig();
            return;
        }

        if(delPosition == this.size){
            this.deleteAtEnd();
            return;
        }

        Node cur = Head;
        int pos = 1 ;

        while(pos < delPosition - 1){
            cur = cur.next;
            pos++;
        }

        cur.next=cur.next.next;
        this.size--;

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


        System.out.println("\n Testing Search:");
        this.Search(3);  
        this.Search(99); 
        this.Search(6);  
        this.Search(100);

        System.out.println("\n Testing Deletions:");

        this.deleteAtBeginnig();
        this.printList();

        this.deleteAtEnd();
        this.printList();

        this.deleteAtPositon(3);
        this.printList();

        this.deleteAtPositon(2);
        this.printList();

        this.deleteAtPositon(size); 
        this.printList();

        this.deleteAtPositon(-1); 
        this.deleteAtPositon(size+1); 


        System.out.println("\n All Operations Tested!");

    }
}
