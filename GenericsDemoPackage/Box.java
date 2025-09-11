package GenericsDemoPackage;

public class Box<T> {

    private T value; //generic variable of type 

    //instead of Writting this below code
    // private int value ;
    // private float value ;
    // private String value;

    Box(T value){
        this.value = value;
    }

    public void setVal(T newVal){
        this.value = newVal;
    }

    public T getValue(){
        return this.value;
    }
    
}
