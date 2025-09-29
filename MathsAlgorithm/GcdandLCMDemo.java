package MathsAlgorithm;

public class GcdandLCMDemo {

     public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

      // LCM using formula: (a * b) / gcd(a, b)
      public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
   public static void main(String[] args) {
            int a = 12, b = 18;
    
            System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
            System.out.println("LCM of " + a + " and " + b + " = " + lcm(a, b));
        } 
    
}


