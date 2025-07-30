package Functions;

import java.util.Scanner;

public class Practice {

    public static int getSum(int num1,int num2){
        return num1+num2;
    }
    public static void invoke_getSum(){
        System.out.println("Invoking getSum(4,6): Result =  "+getSum(4,6));
    
    }

    public static void swap(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public static void swap1(int[] arr){
        // int temp = arr[0];
        // arr[0] = arr[1];
        // arr[2] = temp;
        arr[0]=arr[0]+arr[1]-(arr[1]=arr[0]);
    }

    public static void invoke_swap(){
            System.out.println("Invoking Swap(10,20)");

            int[] swapArr=new int[2];
            swapArr[0]=10;
            swapArr[1]=20;
            System.out.println("Before Swap "+ "a = "+swapArr[0]+" b = "+swapArr[1]);
            swap1(swapArr);
            System.out.println("After Swap "+ "a = "+swapArr[0]+" b = "+swapArr[1]);
    
    }
    public static void isEven(int n){
        System.out.println("Entered Number "+n+" is: "+((n&1)==0?"Even":"Odd"));
    }
    public static void invoke_isEven(){
        System.out.println("Invoking isEven(11)");
        isEven(11);
    }
    public static boolean isDigit(String s){
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9')return false;
        }
        return true;
    }
    public static void invoke_isDigit(){
        System.out.println("Invoking is Digit for ''123'': "+ isDigit("123"));
        System.out.println("Invoking is Digit for ''12bA'': "+ isDigit("12bA"));
    }
    public static void greet(){
        System.out.println("Eneter Name For Greeting");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("namaste "+ s);
        input.close();
    }

    public static void printAscii(String s){
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            System.out.println( ch +" Ascii = "+ (int) ch );
        }
    }
    public static void invoke_printAscii(){
        printAscii("Hello Veeresh");
    }
    public static int getStringLen(String s){
        int c = 0;
        // for(char ch : s.toCharArray()){
        //     c++;
        // }
        return s.toCharArray().length;
    }

    public static int getVowelsCount(String s){
        int c =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  ) {
                c++;
            }
        }
        return c;
    }
    

    static String reveseString(String input){
    StringBuilder output = new StringBuilder();

    for (int index = input.length()-1 ; index >= 0; index--)
    {
        output.append(input.charAt(index));
    }

    return output.toString();
    }


    static String reveseStringV2(String input) {
        char[] inputArray = input.toCharArray();
        
        int leftIndex = 0;
        int rightIndex = input.length()-1;
        
        while(leftIndex < rightIndex)
        {
            char temp = inputArray[leftIndex];
            inputArray[leftIndex] = inputArray[rightIndex];
            inputArray[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }

        String output = new String(inputArray);
        System.out.println(output);

        return output;
    }

    static void invoke_reverseString()
    {
        String input1 = "Linked In";
        String output1 = reveseStringV2(input1);

        System.out.println("Input " + input1 + " Output " + output1);
    }

    public static void main(String[] args) {
        invoke_getSum();
        invoke_swap();
        invoke_isEven();
        invoke_isDigit();
        //greet();
        invoke_printAscii();
        System.out.println("Get String Length of: ''Veeresh'' = "+ getStringLen("Veeresh"));
        System.out.println("Get Vowels Count in: 'Veeresh' : "+ getVowelsCount("Veeresh"));
        invoke_reverseString();
    }
}

