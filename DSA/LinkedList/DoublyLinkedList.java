package DSA.LinkedList;


public class DoublyLinkedList {

    Dnode head;
   // Dnode tail;
    int size;

    public DoublyLinkedList()
    {
        System.out.println(" Doubly Linked List is Created ");
        this.head = null;
    }

    public void InsertAtBeginning(int data)
    {
        System.out.println("Inserted NewNode("+data+")");

        Dnode newNode = new Dnode(data);

        this.size++; // increment size 

        // List is empty
        if (this.head == null)
        {
            this.head = newNode;
            return;
        }

        // There are one or more nodes 
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
    }

    public void InsertAtEnd(int data)
    {
        System.out.println("Inserted NewNode("+data+")");

        Dnode newNode = new Dnode(data);

        this.size++; // increment size 

        // List is empty
        if (this.head == null)
        {
            this.head = newNode;
            return;
        }

        // List has one or more nodes
        Dnode lastNode = this.head;

        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
        }
        
        // append the new node to the last node
        lastNode.next = newNode;
        newNode.prev = lastNode;
    }

    public void insertAtPosition(int data, int taregetPosition)
    {
        if (taregetPosition <= 0 || taregetPosition > this.size+1)
        {
            System.out.println("Invalid position");
            return;
        }

        if ( taregetPosition == 1 )
        {
            this.InsertAtBeginning(data);
            return;
        }

        if( taregetPosition == size+1 ){
            this.InsertAtEnd(data);
            return;
        }

        Dnode leftNode = this.head;

        int currentPosition = 1;
        while (currentPosition < taregetPosition -1)
        {
            if (leftNode == null)
            {
                System.out.println("Invalid target position, it's more than the number of nodes");
                return;
            }

            
            leftNode = leftNode.next;
            currentPosition = currentPosition + 1;

        }

        // lefNode is now one step away from the node with position in which we want to 
        // insert a node
        Dnode newNode = new Dnode(data);
        System.out.println("Inserted NewNode("+data+")");
       
        // Case when new node is added in between

        newNode.next = leftNode.next; // 1
        newNode.prev = leftNode; // 2
        leftNode.next.prev = newNode; // 3
        leftNode.next = newNode; // 4

        this.size++; //update size;
        
    }

    public void printAllNodes()
    {
        // List is empty
        if (this.head == null)
        {
            System.out.println("List is empty!");
            return;
        }

        Dnode currentNode = this.head;

        System.out.println("------Nodes in the list are------");
        System.out.print(" null <--> " );

        while (currentNode != null)
        {
            System.out.print("  " + currentNode.data + "  <--> ");
            currentNode = currentNode.next;
        }
        System.out.println("null \n");

    }

    public void printAllNodesReverseOrder()
    {
        // List is empty
        if (this.head == null)
        {
            System.out.println("List is empty!");
            return;
        }

        Dnode currentNode = this.head;

        System.out.println("------Nodes in the list are------");

        System.out.print(" null <--> " );
        while (currentNode.next != null)
        {
            System.out.print("  " + currentNode.data + "  <--> ");
            currentNode = currentNode.next;
        }

        System.out.println(currentNode.data+ "  <--> ");

        System.out.println("reverse order ");

        System.out.print(" null <--> " );
        while (currentNode != null)
        {
            System.out.print("  " + currentNode.data + "  <--> ");
            currentNode = currentNode.prev;
        }


        System.out.println("null \n");
    }

    public void search(int key)
    {
       // List is empty
       if (this.head == null)
       {
           System.out.println("List is empty!");
           return;
       }

       Dnode currentNode = this.head;
       
       while (currentNode != null)
       {
           if (key == currentNode.data)
           {
                // key is found
                System.out.println(key + " Key is found");
                return;
           }

           currentNode = currentNode.next;
       }

       System.out.println(key + " Key is NOT found!");
    }

    // Delete Operations

    // Delete at front 
    public void deleteAtFront(){
        if( this.head == null ) { 
            System.out.println("The List IS Empty Can't Delete: ");
            return;
        }

        if(this.head.next == null){

            this.head =null;
            this.size--; //Decrement Size ;
            return;
        }

        this.head = head.next;
        this.head.prev = null;
        this.size--;

    }

    // Delete at End
    public void deleteAtEnd(){

        if( this.head == null ) { 
            System.out.println("The List IS Empty Can't Delete: ");
            return;
        }

        if(this.head.next == null){
            this.head =null;
            this.size--; //Decrement Size ;
            return;
        }

        Dnode lastNode = head ;

        while ( lastNode .next != null) { 
            lastNode  = lastNode .next;       
        }

        lastNode .prev.next = null;
        lastNode .next = null ; //optional Clean UP
        this.size--;
    }

    // DeleteAtPosition 
    public void deleteAtPosition(int position){
        if( this.head == null ) { 
            System.out.println("The List IS Empty Can't Delete: ");
            return;
        }

        if (position == 1) {
            deleteAtFront();
            return;
        }

        if(position == this.size){
            deleteAtEnd();
            return;
        }

        if(position <= 0 || position > this.size){
            System.out.println("Invalid Position ");
            return;
        }

        int prevPosition = 1;
        Dnode temp = head;

        while (prevPosition < position - 1) { 
            temp = temp.next;
            prevPosition++;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;
        this.size--;
    }

    public void testAllOperations() {

    System.out.println("=== Testing DoublyLinkedList Operations ===");

    // Case 1: Empty list search
    this.search(5);

    // Case 2: Insert at invalid position
    this.insertAtPosition(100, -1);

    // Case 3: Insert at beginning
    this.InsertAtBeginning(1);
    this.printAllNodes();

    // Case 4: Insert at end
    this.InsertAtEnd(10);
    this.printAllNodes();

    // Case 5: Insert at valid middle position
    this.insertAtPosition(5, 2);
    this.printAllNodes();

    // Case 6: Insert at end using position (size+1)
    this.insertAtPosition(15, this.size + 1);
    this.printAllNodes();

    // Case 7: Insert at invalid large position
    this.insertAtPosition(50, 100);

    // Case 8: Print in reverse order
    this.printAllNodesReverseOrder();

    // Case 9: Search for existing element
    this.search(10);

    // Case 10: Search for non-existing element
    this.search(99);

    // ==== DELETE TEST CASES ====
    System.out.println("\n=== Testing Deletion Operations ===");

    // Case 11: Delete at front
    System.out.println("Deleting at front...");
    this.deleteAtFront();
    this.printAllNodes();

    // Case 12: Delete at end
    System.out.println("Deleting at end...");
    this.deleteAtEnd();
    this.printAllNodes();

    // Case 13: Delete at valid middle position
    System.out.println("Deleting at position 2...");
    this.deleteAtPosition(2);
    this.printAllNodes();

    // Case 14: Delete at invalid position
    System.out.println("Deleting at invalid position...");
    this.deleteAtPosition(100);

    // Case 15: Delete until list becomes empty
    System.out.println("Deleting all elements one by one...");
    while (this.size > 0) {
        this.deleteAtFront();
        this.printAllNodes();
    }

    // Case 16: Try deleting from empty list
    System.out.println("Deleting from empty list...");
    this.deleteAtFront();
    this.deleteAtEnd();
    this.deleteAtPosition(1);

    System.out.println("=== End of Testing DoublyLinkedList ===");
}

}
