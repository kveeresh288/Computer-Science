package Operators;

class Operatorsdemo{
    // 1. Write a method that adds two integers and returns the result.
    public static int addTwo(int a,int b){
        return a+b;
    }
    // 2. Create a program that subtracts the smaller number from the larger of two inputs.
    public static int subtractLargefromSmall(int a,int b){
        if(a>b)return a-b;
        return b-a;
    }
    // 3. Write a method that multiplies two float numbers and prints the result.
    public static void multiply(float a ,float b){
        float result = a*b;
        System.out.println(result);
    }
    // 4. Create a method that divides two integers and returns the quotient.
    public static int getQuotient(int a,int b){
        return a/b;
    }
    // 5. Write a program to calculate the remainder of two numbers using `%`.
    public static int getRemainder(int a,int b){
        return a%b;
    }
    // 6. Create a method that accepts three integers and returns their total sum.
    public static int getThreeDigitSum(int a,int b,int c){
        return a+b+c;
    }
    // 7. Write a program that takes two numbers and returns both the quotient and remainder.
    public int[] getQuotientAnsRemainder(int a,int b){
        return new int[] {a/b,a%b};
    }
    // 8. Write a function that finds the average of three marks and returns it.
    public static int averageOfThree(int a,int b,int c){
        return (a+b+c)/3;
    }
    // 9. Develop a method that squares a number using the multiplication operator.
    public static int getSquare(int x){
        return x*x;
    }
    // 10. Write a method that swaps two numbers without using a third variable (using + and - operators).
    public static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+ b);
    }
    static int a=5,b=7;
    public static void main(String[] args) {
        // 1. Add two integers
        int sum = addTwo(10, 5);
        System.out.println("Sum: " + sum);
    
        // 2. Subtract smaller from larger
        int diff = subtractLargefromSmall(3, 10);
        System.out.println("Difference: " + diff);
    
        // 3. Multiply two floats
        System.out.print("Product: ");
        multiply(2.5f, 4.0f);
    
        // 4. Get quotient
        int quotient = getQuotient(20, 4);
        System.out.println("Quotient: " + quotient);
    
        // 5. Get remainder
        int remainder = getRemainder(17, 3);
        System.out.println("Remainder: " + remainder);
    
        // 6. Sum of three numbers
        int total = getThreeDigitSum(10, 20, 30);
        System.out.println("Sum of 3 numbers: " + total);
    
        // 7. Get quotient and remainder
        Operatorsdemo obj = new Operatorsdemo();
        int[] result = obj.getQuotientAnsRemainder(22, 5);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    
        // 8. Average of three marks
        int avg = averageOfThree(80, 90, 100);
        System.out.println("Average: " + avg);
    
        // 9. Square of a number
        int square = getSquare(6);
        System.out.println("Square: " + square);
    
        // 10. Swap two numbers without a third variable
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        System.out.print("After Swap : ");
        swap(a, b); // this won't actually swap because Java is pass-by-value
        
    }
}