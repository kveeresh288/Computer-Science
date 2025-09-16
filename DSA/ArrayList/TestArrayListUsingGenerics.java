package DSA.ArrayList;

public class TestArrayListUsingGenerics {
    
    public static void main(String[] args) {
        ArrayListUsingGenerics<String> list = new ArrayListUsingGenerics<>();

        System.out.println("=== Testing Add Operations ===");
        list.add("A"); // add at end
        list.add("B");
        list.add("C");
        list.print(); // [A, B, C]

        list.addFirst("Start"); 
        list.print(); // [Start, A, B, C]

        list.addAtPos(2, "Middle");
        list.print(); // [Start, A, Middle, B, C]

        try {
            list.addAtPos(-1, "Invalid");
        } catch (Exception e) {
            System.out.println("Caught Exception (addAtPos -1): " + e);
        }

        try {
            list.addAtPos(100, "Invalid");
        } catch (Exception e) {
            System.out.println("Caught Exception (addAtPos 100): " + e);
        }

        System.out.println("\n=== Testing Get and Set ===");
        System.out.println("Get index 2: " + list.get(2)); // Middle
        System.out.println("Set index 2 -> 'NewMiddle': " + list.set(2, "NewMiddle"));
        list.print(); // [Start, A, NewMiddle, B, C]

        try {
            list.get(100); // invalid
        } catch (Exception e) {
            System.out.println("Caught Exception (get 100): " + e);
        }

        System.out.println("\n=== Testing Remove ===");
        System.out.println("Remove last: " + list.remove()); // C
        list.print(); // [Start, A, NewMiddle, B]

        System.out.println("Remove at pos 1: " + list.removeAtPos(1)); // A
        list.print(); // [Start, NewMiddle, B]

        try {
            list.removeAtPos(100); // invalid
        } catch (Exception e) {
            System.out.println("Caught Exception (removeAtPos 100): " + e);
        }

        // remove all elements
        list.remove();
        list.remove();
        list.remove();
        list.print(); // []

        System.out.println("Try removing from empty list:");
        list.remove(); // should print message (not exception in your version)

        System.out.println("\n=== Testing Contains & IndexOf ===");
        list.add("X");
        list.add("Y");
        list.add(null);
        list.add("Z");
        list.print(); // [X, Y, null, Z]

        System.out.println("Contains 'Y': " + list.contains("Y")); // true
        System.out.println("Contains null: " + list.contains(null)); // true
        System.out.println("Contains 'NotThere': " + list.contains("NotThere")); // false

        System.out.println("IndexOf 'X': " + list.indexOf("X")); // 0
        System.out.println("IndexOf null: " + list.indexOf(null)); // 2
        System.out.println("IndexOf 'NotThere': " + list.indexOf("NotThere")); // -1

        System.out.println("\n=== Testing Clear ===");
        list.clear();
        list.print(); // []

        System.out.println("IsEmpty after clear: " + list.isEmpty()); // true

        System.out.println("\n=== Stress Testing Resize ===");
        ArrayListUsingGenerics<Integer> nums = new ArrayListUsingGenerics<>();
        for (int i = 0; i < 25; i++) {
            nums.add(i);
        }
        nums.print(); // should print 0..24
        System.out.println("Size after resize: " + nums.size());
    }
}
