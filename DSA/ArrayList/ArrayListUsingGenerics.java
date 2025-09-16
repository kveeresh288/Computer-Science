package DSA.ArrayList;

public class ArrayListUsingGenerics<K> {

    private int size;
    private K[] array;

    @SuppressWarnings("unchecked")

    ArrayListUsingGenerics(){

        this.size = 0; 
        this.array = (K[]) new Object[10];

    }

    public boolean isFull(){

        return this.size == this.array.length;

    }

    public boolean isEmpty(){

        return this.size == 0;
    }

    public void allocateSpace(){

        @SuppressWarnings("unchecked")
        K[] newArray = (K[]) new Object[this.array.length*2];

        for(int i = 0 ;i < size; i++){
            newArray[i] = this.array[i];
        }

        this.array = newArray;

    }

  
    public void add(K data){

        if(isFull()){
            this.allocateSpace();
        }

        array[this.size++]= data;
        
    }


    public void addAtPos(int pos, K data){

        if (pos < 0 || pos > this.size) {
            throw new IndexOutOfBoundsException("Invalid position: " + pos);
        }
        
        if (pos == this.size) {  
            this.add(data);
            return;
        }
        

        if(isFull()){
            this.allocateSpace();
        }

        for(int i = this.size ; i > pos ;i--){

            this.array[i]=this.array[i-1];
        }

        this.array[pos]=data;
        this.size++;
        
    }

    public void addFirst(K data){

        if(isFull()){
            this.allocateSpace();
        }

        for(int i = this.size ; i>0 ;i--){

            this.array[i]=this.array[i-1];
        }

        this.array[0]=data;
        this.size++;
        
    }

    public K get(int index){

        if(isEmpty()){

            System.out.println("ArrayList is Empty ");

            return null;

        }

        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Invalid position: " + index);
        }

        return this.array[index];
    }
	
    public K set(int index, K data){

        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Invalid position: " + index);
        }

        K old = this.array[index];
        this.array[index] = data;
        return old;
    }


    public K remove (){

        if(isEmpty()){
            System.out.println("The ArrayList is Empty");
            return null;
        }

        K data = this.array[ --this.size ];
        this.array[this.size] = null; 
        
        return data;

       
    }

    public K removeAtPos(int index){

        if(isEmpty()){

            System.out.println("ArrayList is Empty ");

            return null;
        }

        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Invalid position: " + index);
        }

        K data = this.array[index];

        for(int i = index ; i<this.size-1 ; i++){

            this.array[i] = this.array[i+1];
        }

        this.array[--size] = null;
        
        return data;

    }
	

    public int size(){

        return this.size;
    }


    public void print() {

        System.out.print("[");
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i]);
            if (i < this.size - 1) System.out.print(", ");
        }

        System.out.println("]");
    }

    public boolean contains(K data) {

        for (int i = 0; i < this.size; i++) {
            if (data == null) {
                if (this.array[i] == null) return true;
            } else {
                if (data.equals(this.array[i])) return true;
            }
        }
        return false;
    }
    
    public int indexOf(K data) {
        for (int i = 0; i < this.size; i++) {
            if (data == null) {
                if (this.array[i] == null) return i;
            } else {
                if (data.equals(this.array[i])) return i;
            }
        }
        return -1;
    }

    public void clear(){

        for (int i = 0; i < this.size; i++) {
            this.array[i] = null;
        }
        this.size = 0;
    }
}
