
public class DivisibilityDemo{
    // Function to find that number 
    // divisible by 3 or not
    static boolean check3(String str)
    {
        // Compute sum of digits
        int n = str.length();
        int digitSum = 0;
        for (int i=0; i<n; i++)
            digitSum += (str.charAt(i)-'0');
     
        // Check if sum of digits is 
        // divisible by 3.
        return (digitSum % 3 == 0);
    }
    // Function to find that number
    // is divisible by 4 or not
   static boolean check4(String str)
    {
        int n = str.length();

        // Empty string
        if (n == 0) return false;
            
        // If there is single digit
        if (n == 1) return ((str.charAt(0) - '0') % 4 == 0);
            
        // If number formed by last two digits is
        // divisible by 4.
        int last = str.charAt(n - 1) - '0';
        int second_last = str.charAt(n - 2) - '0';
        return ((second_last * 10 + last) % 4 == 0);
    }


    // Function to find that number divisible by 6 or not
    static boolean check6(String str)
    {
        int n = str.length();
     
        // Return false if number is not divisible by 2.
        if ((str.charAt(n-1) -'0')%2 != 0)
           return false;
     
        // If we reach here, number is divisible by 2.
        // Now check for 3.
     
        // Compute sum of digits
        int digitSum = 0;
        for (int i=0; i<n; i++)
            digitSum += (str.charAt(i)-'0');
     
        // Check if sum of digits is divisible by 3
        return (digitSum % 3 == 0);
    }

    public static boolean isDivBy7(int n)
    {
        if (n == 0 || n == 7)
            return true;

        while (n >= 10) {
            int lastD = n % 10;
            n = n / 10;
            n = Math.abs(n - 2 * lastD);
        }

        return n == 0 || n == 7;
    }

    static boolean check9(String s) {
        // Compute sum of digits
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
            sum += (s.charAt(i) - '0');

        // Check if sum of digits is divisible by 9.
        return (sum % 9 == 0);
    }

    public static boolean divBy11(String s) {
        int n = s.length();
        int oddDigSum = 0, evenDigSum = 0;

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            
            // check for even index
            if (i % 2 == 0)
                oddDigSum += digit;
            else
                evenDigSum += digit;
        }
        // Check divisibility by 11 
        // using digit sum difference
        return (oddDigSum - evenDigSum) % 11 == 0;
    }

    static boolean isDvisibleBy12(String num){
    // if number greater than 3
    if (num.length() >= 3) { 
 
        // find last digit
        int d1 = (int)num.charAt(num.length() - 1);
 
        // no is odd
        if (d1 % 2 != 0)
            return false;
 
        // find second last digit
        int d2 = (int)num.charAt(num.length() - 2);
 
        // find sum of all digits
        int sum = 0;
        for (int i = 0; i < num.length(); i++)
            sum += num.charAt(i);            
         
        return (sum % 3 == 0 &&
               (d2 * 10 + d1) % 4 == 0);            
    }
     
    else {
         
        // if number is less than
        // or equal to 100
        int number = Integer.parseInt(num);
        return (number % 12 == 0);
    }

}

 // Function to check divisibility by 13
 static boolean divBy13(String s) {
    int len = s.length();

    // Special case: if the number is "0" 
    if (len == 1 && s.charAt(0) == '0') {
        return true;
    }
    // Make the length a multiple of 3 by padding zeros at the end
    if (len % 3 == 1) {
        s += "00";
        len += 2;
    } else if (len % 3 == 2) {
        s += "0";
        len += 1;
    }

    int sum = 0;
    int p = 1;

    // Traverse from right to left in steps of 3 digits
    for (int i = len - 1; i >= 0; i--) {
        int group = 0;
        group += s.charAt(i--) - '0';
        group += (s.charAt(i--) - '0') * 10;
        group += (s.charAt(i) - '0') * 100;

        sum += group * p;
        p *= -1;
    }

    sum = Math.abs(sum);
    return sum % 13 == 0;
}

// function to check if a large number is divisible by 15
public static boolean isDivisible15(String S)
{
    // length of string
    int n = S.length();
    
    // check divisibility by 5
    if (S.charAt(n - 1) != '5' && 
        S.charAt(n - 1) != '0')
        return false;
        
    // Sum of digits
    int sum = 0;
    for(int i = 0; i < S.length(); i++)
        sum += (int)S.charAt(i);
        
        // if divisible by 3
        if(sum % 3 == 0)
            return true;
        else
            return false;
}

 // Returns true if n is divisible by 29  // else returns false.
   
    static boolean isDivisible29(long n)
    {
        // add the lastdigit*3 to renaming   // number until number comes only  // 2 digit

        while (n / 100 > 0) {
            
            int last_digit = (int)n % 10;
            n /= 10;
            n += last_digit * 3;
        }

        // return true if number is
        // divisible by 29 another
        return (n % 29 == 0);
       
    }

    public static void main(String[] args) {

        System.out.println("🔹 Divisibility Checking : ");
        String str = "1332";
        System.out.println("\nNumber: " + str + " → Divisible by 3? " + (check3(str) ? "Yes" : "No"));
        String str4 = "76952";
        System.out.println("\nNumber: " + str4 + " → Divisible by 4? " + (check4(str4) ? "Yes" : "No"));
        String str6 = "1332";
        System.out.println("\nNumber: " + str6 + " → Divisible by 6? " + (check6(str6) ? "Yes" : "No"));
        int n = 371;
        System.out.println("\nNumber: " + n + " → Divisible by 7? " + (isDivBy7(Math.abs(n)) ? "Yes" : "No"));
        String s = "69354";
        System.out.println("\nNumber: " + s + " → Divisible by 9? " + (check9(s) ? "Yes" : "No"));
        String s1 = "76945";
        System.out.println("\nNumber: " + s1 + " → Divisible by 11? " + (divBy11(s1) ? "Yes" : "No"));
        String num = "12244824607284961224";
        System.out.println("\nNumber: " + num + " → Divisible by 12? " + (isDvisibleBy12(num) ? "Yes" : "No"));
        String s2 = "2911285";
        System.out.println("\nNumber: " + s2 + " → Divisible by 13? " + (divBy13(s2) ? "Yes" : "No"));
        String S = "15645746327462384723984023940239";
        System.out.println("\nNumber: " + S + " → Divisible by 15? " + (isDivisible15(S) ? "Yes" : "No"));
        String S1 = "15645746327462384723984023940235";
        System.out.println("\nNumber: " + S1 + " → Divisible by 15? " + (isDivisible15(S1) ? "Yes" : "No"));
        long n2 = 348;
        System.out.println("\nNumber: " + n2 + " → Divisible by 29? " + (isDivisible29(n2) ? "Yes" : "No"));
            
    }

}


