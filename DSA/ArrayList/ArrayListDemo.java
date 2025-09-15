package DSA.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    
    // Hetrogenous ArrayList
    public static void hetArrayList(){

        System.out.println("Array Which Supports All type of data");

        ArrayList list = new ArrayList<>();

        list.add("Veeresh"); // i added String Class Type Data 

        list.add(68); // i added Integer class type Data 

        //Type Casting Required to access (Integer - int)
        int number = (int) list.get(1); 

        System.out.println("Value at Index 1 after typeCasting "+number);

        //Type Casting
        String name = (String) list.get(0);

        System.out.println("Value at Index 0 after typeCasting "+name);

        System.out.println("Size Of the List: "+ list.size());
    }

    public static void arrayListWithGenerics(){

        System.out.println("Array Which Supports single type of data");

        System.out.println("Taking String data Type as Example");
        ArrayList<String> list = new ArrayList<>();

        list.add("Veeresh"); //  added String Class Type Data 

        list.add("Namaskara My LinkedIn Family"); 

        //Type Casting Required to access 
        String number = list.get(1); 

        System.out.println("Value at Index 1 after typeCasting: "+number);

        //Type Casting
        String name = list.get(0);

        System.out.println("Value at Index 0 after typeCasting: "+name);

        System.out.println("Size Of the List: "+ list.size());
    }

    public static void printArrayList(){

        System.out.println();
        System.out.println("Printing ArrayList ");
        // Create ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add names
        names.add("Veeresh");
        names.add("Karan");
        names.add("Pranav");
        names.add("Sachin");
        names.add("Rudresh");

        // Printing using for-each loop
        System.out.println("Names in the ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }

        // Printing directly (ArrayList has toString())
        System.out.println("\nUsing ArrayList toString():");
        System.out.println(names);

        System.out.println();

    }
    public static void main(String[] args) {
        //hetArrayList();
       // arrayListWithGenerics();
       printArrayList();

    }
}
