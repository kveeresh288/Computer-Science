package DSA.LinkedList;

public class CircularDoublyList {
    
    Dnode head;
    Dnode tail;

    int size;

    CircularDoublyList(){

        System.out.println("Circular Doubly Linked List is Created ");
        this.head= this.tail = null;

        this.size = 0 ;
    }

    public void insertAtBeginning(int data){

        Dnode newNode = new Dnode(data);

        if( this.head == null){

            this.head = newNode;
            this.tail = this.head;

            this.tail.next = head;
            this.tail.prev = head;

            this.size++;
            return;
        }

        newNode.next = this.head ;
        head.prev = newNode ;

        this.head = newNode;
        this.head.prev = this.tail;
        this.tail.next = this.head;

        this.size++;
    }

    public void insertAtEnd(int data ){

        Dnode newNode = new Dnode(data);

        if( this.head == null){

            this.head = newNode;
            this.tail = this.head;

            this.tail.next = head;
            this.tail.prev = head;

            this.size++;
            return;
        }

        this.tail.next = newNode;

        newNode.prev = this.tail;
        newNode.next =this.head;

        this.tail = newNode;
        this.head.prev = this.tail;

        this.size++;

    }

    public  void insertAtPosition(int insertPosition, int data){

        if( insertPosition <= 0 || insertPosition > this.size+1){

            System.out.println("Invalid Insert Position Can't Insert("+data+")");
            return;
        }

        if(insertPosition == 1){
            this.insertAtBeginning(data);
            return;
        }

        if(insertPosition == this.size+1){
            this.insertAtEnd(data);
            return;
        }

        Dnode cur = this.head;
        int pos = 1 ;

        while( pos < insertPosition-1 ){
            cur = cur.next;
            pos++;
        }

        Dnode newNode = new Dnode(data);

        newNode.next = cur.next;
        newNode.prev = cur;

        cur.next.prev = newNode;
        cur.next = newNode;
        
        this.size++;
       
    }


    public void print(){

        System.out.println();

        if(this.head == null ){
            System.out.println("List is Empty ");
            return;
        }

        Dnode cur = this.head;
        System.out.print("Head ");

        do{ 
            System.out.print(" <--> "+ cur.data);
            cur=cur.next;
            
        } while (cur!=this.head);

        System.out.println(" <--> Head ");

        System.out.println();
    }
    

    public void Search( int key ){

        if(this.head == null ){
            System.out.println("List is Empty key Can't be found");
            return;
        }

        Dnode cur = this.head;

        do{ 

            if(cur.data == key){
                System.out.println("Key( "+key +" ) " +"is Found ");
                return;
            }

            cur=cur.next;
            
        } while (cur!=this.head);

        System.out.println("Key( "+key +" ) " +"is Not Found ");
    }


    public void deleteAtFront(){

        if(this.head == null ){
            System.out.println("list is empty Can't Delete ");
            return;
        }

        if(this.head == this.tail){

            System.out.println("Deleted At Head : "+this.head.data);
            this.head = this.tail = null;
            this.size--; 
            return;
        }



        System.out.println("Deleted At Head : "+this.head.data);

        this.head = this.head.next;
        this.head.prev = this.tail;
        this.tail.next = this.head;

        this.size--;
    }

    public void deleteAtEnd(){

        if(this.head == null ){
            System.out.println("list is empty Can't Delete ");
            return;
        }

        if(this.head == this.tail){

            System.out.println("Deleted At Tail : "+this.tail.data);
            this.head = this.tail = null;
            this.size--; 
            return;
        }



        System.out.println("Deleted At Tail : "+this.tail.data);

        this.tail.prev.next = this.head;
        this.tail = this.tail.prev;
        this.head.prev = this.tail;


        this.size--;
    }


    public void deleteAtPosition( int delPos ){

        if(delPos <=0 || delPos > this.size ){
            System.out.println("Invalid Delete Position ");
            return;
        }

        if(delPos == 1){
            this.deleteAtFront();
            return;
        }

        if(delPos == this.size){
            this.deleteAtEnd();
            return;
        }

        Dnode cur = this.head;

        int pos = 1 ;

        while (pos < delPos-1) { 

            cur = cur.next;
            pos++;
      }

      System.out.println("Deleted at Position "+delPos+" ("+cur.next.data+") ");

      cur.next = cur.next.next;
      cur.next.prev = cur;

      this.size--;

    }

    public void testAllOperations() {
        System.out.println("\n--- Testing Circular Doubly Linked List Operations ---");
    
        // Print empty list
        this.print();
    
        // Insert at Beginning
        this.insertAtBeginning(10);
        this.print();
    
        this.insertAtBeginning(5);
        this.print();
    
        // Insert at End
        this.insertAtEnd(20);
        this.print();
    
        this.insertAtEnd(25);
        this.print();
    
        // Insert at Position (Valid)
        this.insertAtPosition(3, 15); // between 10 and 20
        this.print();
    
        this.insertAtPosition(1, 1); // new head
        this.print();
    
        this.insertAtPosition(this.size + 1, 30); // new tail
        this.print();
    
        // Insert at Position (Invalid)
        this.insertAtPosition(-1, 99);
        this.insertAtPosition(this.size + 5, 99);
    
        // Search Keys
        this.Search(15);   // present
        this.Search(100);  // not present
    
        System.out.println();
        System.out.println("--- Testing Delete Operations ---");

        // Delete at Front
        this.deleteAtFront();
        this.print();
    
        // Delete at End
        this.deleteAtEnd();
        this.print();
    
        // Delete at Position (middle)
        if (this.size >= 3) {
            this.deleteAtPosition(3);
            this.print();
        }
    
        // Delete at Position (first)
        this.deleteAtPosition(1);
        this.print();
    
        // Delete at Position (last)
        this.deleteAtPosition(this.size);
        this.print();
    
        // Invalid delete positions
        this.deleteAtPosition(-1);
        this.deleteAtPosition(this.size + 5);
    
        // Delete remaining nodes
        while (this.size > 0) {
            this.deleteAtFront();
            this.print();
        }
    
        // Try delete on empty list
        this.deleteAtFront();
        this.deleteAtEnd();
        this.deleteAtPosition(1);
    
        System.out.println("\n--- All operations tested successfully ---");
    }
}
