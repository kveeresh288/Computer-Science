package Functions;

import java.util.Arrays;
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

    public static int getArrSum(int[] arr){
        int sum=0;
        for(int i:arr)sum+=i;
        return sum;
    }
    
    public static void invoke_getArrSum(){
        int arr [] = {2,4,5,6,7};
        System.out.println("Array Elements [2,4,5,6,7] sum : "+ getArrSum(arr));
    }

    public static boolean isPalindrome(String s){
        int st=0; int end = s.length()-1;
        while (st<end){
            if(s.charAt(st)!=s.charAt(end))return false;  
            st++;
            end--;
        }
       
        return true;
    }

    public static void invoke_isPalindrome(){
        System.out.println("String ''malayalam'' is palindrome : "+ isPalindrome("malayalam"));
    }

    public static void printMinMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i: arr){
            if(max<i)max=i;
            if(min>i)min=i;
        }
        System.out.println("Min value in array is "+ min );
        System.out.println("Max value in array is "+ max );
    }
    public static void invoke_printMinMax(){
        int arr[] = {3,5,7,-2,6,9,2};
        System.out.println(Arrays.toString(arr));
        printMinMax(arr);
    }

    public static int binarySearch(int[] arr,int key){
        int st = 0 ;
        int  end = arr.length-1; 
        while (st<=end) { 
            int mid = st+((end-st)/2);
            if(arr[mid]==key)return mid;
            if(arr[mid]>key)end=mid-1;
            else st = mid+1;
        }
        return -1;
    }

    public static void invoke_binarySearch(){
        int arr[]= {1,4,6,8,12,32,67,90};
        System.out.println("Key 32 found at position "+ (binarySearch(arr, 32)+1));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }
        return merged;
    }
    public static void invoke_mergeArrays(){
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        System.out.println("arr1 : "+ Arrays.toString(array1));
        System.out.println("arr2 : "+ Arrays.toString(array2));
        int[] mergedArray = mergeArrays(array1, array2);
        System.out.print("Merged Array: ");
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int findSecoundLarge(int arr[]){
        if(arr.length<2)return -1;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                smax=max;
                max=num;
            }
            else if(num>smax && num<max){
                smax=num;
            }
        }
        return smax;
    }

    public static void invoke_findSecoundLarge() {
        int[] arr = {10, 5, 8, 20, 20, 15};

        int result = findSecoundLarge(arr);
        System.out.println("Second Largest Element: " + result);
    }
    public static void printUnique(int[] arr){
        for(int i = 0;i<arr.length;i++){
            boolean isDuplicate = false ;
            for(int j = 0 ; j < arr.length;j++){
                if(arr[i]==arr[j] && i != j){
                    isDuplicate=true;
                    break;
                }
            }
        if(!isDuplicate)System.out.print(arr[i]+" ");
        }
    }
    public static void invoke_printUnique() {
        int[] arr = {4, 5, 3, 4, 2, 5, 7};
        System.out.print("Unique elements: ");
        printUnique(arr);
        System.out.println(); 
    }

    public static void printCommonElements(int[] arr1 , int arr2[]){
        for(int i = 0; i< arr1.length;i++){
            boolean isFound = false ;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    isFound=true;
                    break;
                }
            }
            if(isFound)System.out.println(arr1[i] +" ");
        }

    }

    public static void invoke_printCommonElements() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 6, 7, 2};

        System.out.println("Common elements between arr1 and arr2:");
        printCommonElements(arr1, arr2);
    }

    public static int getCountOfWords(String s){

        if(s.length()==0)return 0;

        int count = 0;

        char prev = s.charAt(0) ;
        for(int i = 0 ; i<s.length() ; i++){

            char ch = s.charAt(i);

            if(ch == ' ' || ch == '\t' || ch == '\n'){

                if(prev != ' ' && prev != '\t' && prev != '\n' ){
                    count++;
                }

            }
            prev = ch ;
               
        }

        if (prev == ' ' || prev == '\t' || prev == '\n')  return count;
       
        return count + 1;
    }

    public static void printBinary(int number){

        int mask = 1; // 1 is aleardy present at 1st bit or house 
        mask = mask << ((Integer.BYTES * 8) - 2); // leave 1 bit for sign and 1 bit for already standing in first house 
        
        System.out.println("Binary Represntation of "+ number );

        while(mask>0){

            if ((number & mask) == 0) {
                System.out.print("0 ");
            } else {
                System.out.print("1 ");
            }
            mask = mask >> 1 ;
        }
        System.out.println();
        System.out.println();
    }

    public static void invoke_printBinary() {
        int a = 10;
        int b = -10;
        int c = 0;
        int d = 255;

        printBinary(a);
        printBinary(b);
        printBinary(c);
        printBinary(d);
    }

    public static void removespaces(String s){

        StringBuilder sb = new StringBuilder();

        for(int i =0 ; i<s.length();i++){

            char ch = s.charAt(i);

            if(ch == ' ')continue;

            sb.append(ch);
        }

        System.out.println ("After Removing spaces ");

        System.out.println(sb.toString());
    }

    public static void invoke_removespaces() {
        String input1 = "My Name Is K Veeresh";
        String input2 = "  Remove all  spaces!  ";

        removespaces(input1);  
        removespaces(input2);  
    }

    public static void invoke_getCountOfWords() {
        String str = "  Namaskara My LinkedIn Family  ";
        int wordCount = getCountOfWords(str);
        System.out.println("Input string: \"" + str + "\"");
        System.out.println("Word count: " + wordCount);
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
        invoke_getArrSum();
        invoke_isPalindrome();
        invoke_printMinMax();
        invoke_binarySearch();
        invoke_mergeArrays();
        invoke_findSecoundLarge();
        invoke_printUnique();
        invoke_printCommonElements();
        invoke_getCountOfWords();
        invoke_printBinary();
        invoke_removespaces();
    }
}

