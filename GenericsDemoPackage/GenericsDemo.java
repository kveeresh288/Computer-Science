package GenericsDemoPackage;

public class GenericsDemo {

    public static void main(String[] args) {
        
        System.out.println();
        //creation of Generic Box Class Object 

        Box<Integer> intBox = new Box<>(10);

        System.out.println("intBox.value -> "+intBox.getValue());
        intBox.setVal(20);
        System.out.println("intBox.value(AfterUpdating) -> "+intBox.getValue());

        System.out.println();

        Box<Character> charBox = new Box<>('A');

        System.out.println("charBox.value -> "+charBox.getValue());
        charBox.setVal('B');
        System.out.println("charBox.value(AfterUpdating) -> "+charBox.getValue());

        System.out.println();

        Box<String> stringBox = new Box<>("I am Veer");

        System.out.println("stringBox.value -> "+stringBox.getValue());
        stringBox.setVal(" Namaskara 🙏 My LinkedIn Family ");
        System.out.println("StringBox.value(AfterUpdating) -> "+stringBox.getValue());

        System.out.println();

        //Printing values using Generic methods

        System.out.println("Printing values using Generic methods");

        System.out.println();
        
        printValue(intBox.getValue());

        System.out.println();

        printValue(charBox.getValue());

        System.out.println();

        printValue(stringBox.getValue());

        System.out.println();

    }

    //generic methods

    public static<T> void printValue(T value){

        System.out.println("Value = "+ value);

    }
     
}
