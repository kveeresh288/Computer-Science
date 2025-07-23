package Java.Functions.Basics;

import java.util.Scanner;
class ReturnTypeDemo {
   
   public static void main(String[] var0) {

    //Find a Number Even Or Odd
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a Number : (Odd | Even ) ");
    int a = sc.nextInt();
    findEvenOrOdd(a);
    System.err.println("The NUmber is a "+findEvenOrOdd2(a));

   }
   static String findEvenOrOdd2(int a){
    return (a&1)==1?"Odd Number":"Even Number";
}

   static void findEvenOrOdd(int a){
        System.out.println((a&1)==1?"Odd Number":"Even Number");
   }
  
}