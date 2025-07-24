package Functions.Basics;
import java.util.*;

public class EasyFunctionsCode{

    // Write a method in Java that returns "Hello" and takes no input.
    public static String GetHello(){
        return "Hello";
    }
     // Declare a method that takes a String name and returns a greeting.
     public static String GetGreeting(String name){
        return "Namaste "+ name;
    }
    // Write a method that takes two integers and returns their sum.
    public static int getSum(int num1,int num2){
        return num1+num2;
    }
    // Create a method that returns the square of an integer.
    public static int getSquare(int x){
        return x*x;
    }
    // Write a method that returns area of a rectangle given width and height.
    public static int getRectArea(int len,int breadth ){
        return len*breadth;
    }

     // Declare a method that accepts three floats and returns their average.
     public static double getAveOf3( double num1, double num2, double num3){
        return (num1+num2+num3)/3;
     }

    // Create a method that takes an array of integers and returns their sum.
    public static int getArraySum(int[] nums){
        int sum=0;
        for(int num : nums){
            sum+=num;
        }
        return sum;
    }
    // Write a method that checks if a number is even.
    public void evenOrOdd(int num){
        String result = ((num&1)==1)?"Odd NUmber":"Even Number";
        System.out.println("The Number "+num+" is a "+result);
    }
    // Define a method that returns a string repeated n times.
    public static String getRepeatedStriing(String s,int n){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(s);
        }
        return sb.toString();
    }
    //Write a method merges two arrays
   public static int[] mergeTwoArray(int [] arr1,int []arr2){
    int p=0;
    int mergedArr[]=new int[arr1.length+arr2.length];
    for(int i=0;i<arr1.length;i++){
        mergedArr[p++]=arr1[i];
    }
    for(int i=0;i<arr2.length;i++){
        mergedArr[p++]=arr2[i];
    }
    return mergedArr;
   }
    // Write a method that returns the maximum element from an array.
    public static int findMaximumNumArray(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max)max=num;
        }
        return max;
    }
     // Write a method to reverse a string.
     public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        int right=s.length()-1;
        int left=0;
        while (left < right) {
        
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        return sb.toString();

     }
    // Create a method that checks if a string is a palindrome.

     public static boolean isPalindrom(String s){
        if(s.equals(reverse(s)))return true;
        return false;
     }

     // Write a method to calculate factorial of a number.
    static Map<Integer,Integer>factMap=new HashMap<>();
    public static int findFact(int n){
        if(n==0||n==1)return 1;
        if(factMap.containsKey(n))return factMap.get(n);
        int fact = n*findFact(n-1);
        factMap.put(n,fact);
        return fact;
    }
    // Define a method that returns the nth Fibonacci number.
  
    public static int findFib(int n){
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int [] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(GetHello());
        System.out.println(GetGreeting("Veeresh"));
        System.out.println("Sum of (5,7) is: "+getSum(5,7));
        System.out.println("Square of 5 : "+getSquare(5));
        System.err.println("Area of Rectangle(5,6): "+getRectArea(5, 6));
        System.out.println("Average of 3 (2.3 , 3.56 , 6.443): "+ getAveOf3(2.3,3.56,6.433));
        int arr[]={3,5,7,8,3,7,1};
        System.out.println("Sum of Integer Arraya Elements: "+ getArraySum(arr));
        System.out.println("Get a Repeated String (Namaste 3 Times): ");
        System.out.println(getRepeatedStriing("Namaste",3));
        int arr1[]={1,2,3,5,6,7};
        int arr2[]={5,7,9,2};
        System.out.println("Merging arr1:" + Arrays.toString(arr1) +" ans arr2: "+ Arrays.toString(arr2));
        int[] merged=mergeTwoArray(arr1,arr2);
        System.out.println("Merged Array is: "+ Arrays.toString(merged));
        System.out.println("Maximum Elements in arr1: "+Arrays.toString(arr1)+" is "+findMaximumNumArray(arr1));
        String myname ="Veeresh K";
        System.out.print("String BEfore Reverse "+myname+" string After Reverse: "+ reverse(myname));
        System.out.println("String ABBA is Palindrom "+ isPalindrom("ABBA"));
        System.out.println("Factorial of 5 is : "+ findFact(5));
        System.out.println("Factorial of 4 is : "+ findFact(4));
        System.out.println("9 th fibonacci Number is: "+findFib(9));
    }
    
}
