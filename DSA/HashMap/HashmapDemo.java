package DSA.HashMap;

import java.util.*;

public class HashmapDemo {

    public static void main(String[] args) {
        
        Map<Integer,String> students = new HashMap<>();

        // add Elements To the HashMap Using Put Method
        students.put(1,"Veer");
        students.put(2,"Karan");
        students.put(3,"Rudresh");
        students.put(300,"Roshan");
        students.put(25,"Nandish");
        students.put(62,"Siddu");

        System.out.println();

        System.out.println(" Students HashMap Consists of Students " );
        System.out.println(students);

        System.out.println();

        //update
        System.out.println("Updating Value For a Key 2");
        System.out.println("Before Updating: ");
        System.out.println(students);
        System.out.println("After Updating: ");

        students.put(2, "Karan Shrigiri");
        System.out.println(students);


        //search

        System.out.println("Searching Operation");
        int searchkey = 25;

        if(students.containsKey(searchkey )){
            System.out.println( "Students Map Contains key : "+ searchkey );
        }
        else{
            System.out.println( "Students Map Doesn't Contains key : "+ searchkey );
        }

        System.out.println();

        int removekey = 62;
        System.out.println("Removing Student having Key "+ removekey );

        System.out.println("Before Removing "+ students);

        String removedVal   = students.remove(removekey);  // return the Value which is Removed

        
        System.out.println("Removed "+ removedVal);

        System.out.println("After Removing "+ students);


        System.out.println("Printing Key Values of a Student HashMap");

        System.out.println("Using KeySet()");

        for (Integer key : students.keySet()) {

            System.out.println("(Key: "+key+") -> "+ "(Value: "+students.get(key)+")");
            
        }

        System.out.println("Using EntrySet<K,V>");

        for(Map.Entry<Integer,String> student : students.entrySet()){

            System.out.println("(Key: "+student.getKey()+") -> "+ "(Value: "+student.getValue()+")");
        }

    }
}
