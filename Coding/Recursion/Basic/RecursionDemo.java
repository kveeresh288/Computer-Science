package Coding.Recursion.Basic;
public class RecursionDemo {
    // 1. Print numbers from 1 to N using recursion.
public static void Print1ToN(int n){
    if(n==0)return;
    Print1ToN(n-1);
    System.out.print(n+" ");
    return;
}
// 2. Find the sum of first N natural numbers using recursion.
public static int NaturalNumberSum(int n){
    if(n==0)return 0;
    return n + NaturalNumberSum(n-1);
}
// 3. Calculate the factorial of a number using recursion.
public static int fact(int n){
    if(n==0||n==1)return 1;
    return n * fact(n-1);
}
// 4. Reverse a string using recursion.
public static String reverse(String s){
    if(s.isEmpty())return s;
    return reverse(s.substring(1))+s.charAt(0);

}
// 5. Check if a number is a power of 2 using recursion.
public static boolean isPower2(int n){
    if(n==1)return true;
    if(n==0||n%2!=0)return false;
    return isPower2(n/2);
}

    public static void main(String[] args) {
        Print1ToN(10);
        System.out.println();
        System.out.print("First 100 natural Numbers Sum: ");
        System.out.println(NaturalNumberSum(10));
      
        System.err.println(reverse("Veer"));
        System.out.println("8 is power of 2: "+isPower2(8) );
        System.out.println("factorial of 5: "+ fact(5));
    }
}
