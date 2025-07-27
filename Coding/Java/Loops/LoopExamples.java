import java.util.Scanner;
public class LoopExamples {
    // •	11. Write a Java program using a for loop to print numbers from 1 to 10.
    public static void printOneToTen(){
        for(int i=1;i<=10;i++){
            System.out.println("Number: " + i);
        }
    }
	// •	12. Write a Java method using a while loop to count down from 5 to 1.
	public static void countDown5To1(){
        int i=5;
        while(i>=1){
            System.out.println("Number: " + i);
            i--;
        }
    }
    // •	13. Write a Java method that keeps asking for input until the word 'exit' is entered.
	public static void exitDemo(){
        Scanner sc = new Scanner(System.in);
        String input="";
        while (true) { 
        System.out.println("Eneter for the Input");
        input=sc.next();
          if(input.equalsIgnoreCase("exit")){
            break;
          }
        }
    }
    // •	14. Create a Java method using a for loop to print even numbers from 2 to 20.
	public static void printEven(){
        for(int i=2;i<=20;i++){
            if((i&1)==0)System.out.println("Number: "+ i);
        }
    }
    // •	15. Write a Java method that prints a list of names using a for-each loop.
	public static void printList(){
        String [] names={"karan","Veeresh","Rudresh","Bassu","Nandish"};
        for (String name: names ){
            System.out.println(name);
        }
    }
    // •	16. Simulate a do-while loop in Java that continues asking for a number until it's negative.
	public static void doWhileDemo(){
        Scanner sc =new Scanner(System.in);
        int number=0;
        do { 
            System.out.println("Eneter a Number");
            number = sc.nextInt();
            
        } while (number>=0);
    }
    // •	17. Write a Java method with a nested loop to print a pattern of stars (5 rows, increasing per row).
    public static void printPattern(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
	
    // •	18. Write a Java method that breaks a loop when a number is divisible by 7.
    public static void sevenDivisibilityDemo(){
        for(int i = 1; i<=20;i++){
            if((i%7)==0){
                System.out.println("Found Number Divisible by 7: "+ i);
                break;
            }
        }
      
    }
	// •	19. Create a Java program using continue to skip odd numbers from 1 to 20.
    public static void skipOdd(){
        for(int i =1; i<=20;i++){
            if((i&1)==1){
                continue;
            }
            System.out.println("NUmber :" + i);
        }
      
    }
	
    // •	20. Write a Java method to loop over two arrays simultaneously and print the elements together.
    public static void loopOnTwoArrays(){
        String [] names={"karan","Veeresh","Rudresh","Bassu","Nandish"};
        char [] section ={'B','B','A','C','b'};
        for(int i = 0 ;i< names.length;i++){
            System.out.println("The Student "+ names[i]+" is from "+section[i]+ "Section");

        }
    }
   
    public static void main(String[] args) {
        printOneToTen();
        countDown5To1();
        exitDemo();       
        printEven();
        printList();
        doWhileDemo();    
        printPattern();
        sevenDivisibilityDemo();
        skipOdd();
        loopOnTwoArrays();
    }
}