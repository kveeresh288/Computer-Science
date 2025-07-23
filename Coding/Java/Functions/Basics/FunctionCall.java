package Java.Functions.Basics;
import java.util.Scanner;
class FunctionCall {
   public static void main(String[] var0) {
    //Find a Number Even Or Odd
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a Number1 ");
    int a = sc.nextInt();
    System.out.print("Enter a Number2 ");
    int b = sc.nextInt();
    printSumOfTwo(a,b);

   }
  static void printSumOfTwo(int number1,int number2){
    int sum = getSumOfTwo(number1,number2);
    System.out.println("The Sum of Two NUmbers: "+ sum);

  }
  static int  getSumOfTwo(int num1,int num2){
   return num1+num2;
  }
}