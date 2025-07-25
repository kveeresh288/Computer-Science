package Coding.Java.ConditionalStatements;


public class ConditiobnalStatementsExample{
    //  •   Write a Java method to check if a number is even or odd using if-else.
    public static void checkEvenOrOdd(int number){
        if(number%2==0)System.out.println(number+" is a Even NUmber");
        else System.out.println(number+" is a Odd NUmber");
    }
    // 	•	Create a method that prints “Teenager” if age is between 13 and 19, else print “Not Teenager”.
    public static void checkAge(int age){
        if(age >= 13 && age <= 19 )System.out.println("TeenAger");
        else System.out.println("Not a TeenAger");
    }
    // 	•	Write a method to return the maximum of three numbers using if-elif-else.
    public static int maxOf3(int a,int b ,int c){
        if(a>b&&a>c) return a;
        else if(b>a && b>c) return b;
        else return c;
    }
    // 	•	Check eligibility for a driving license: age ≥ 18 and vision_score ≥ 7.
    public static void checkEligibility(int age,int vision_score){
        if(age>=18 && vision_score>=7)System.out.println("Eligible");
        else System.out.println("Not Eligible");
    }
    // 	•	Implement hiring rule logic: candidate is selected only if
    // 	•	coding ≥ 4, problem-solving ≥ 4, fundamentals ≥ 4, communication ≥ 3, cgpa ≥ 7
    public static boolean isEligible(int coding,
    int problem_solving ,
    int fundamentals,
    int communication ,
    int cgpa){
        if(coding >= 4 && 
        problem_solving >= 4 && fundamentals >= 4 && 
        communication >= 3 && cgpa >= 7)return true;
        return false;
    }
// 	•	Create a method that checks whether a number is divisible by 2, 3, both, or none.
    public static boolean isDivisible(int a){
    if(a%2 == 0 && a%3 == 0)return true;
    return false;

}
// 	•	Check if a number lies within a given range [10, 20]. Print appropriate message.
public static boolean isRange(int n){
    if(n>=10&&n<=20)return true;
    return false;
}
// 	•	Using or operator, check if either marks in English or Maths is ≥ 90 → print “Merit”.

public static void checkMerit(int englishMarks, int mathMarks) {
    if (englishMarks >= 90 || mathMarks >= 90) {
        System.out.println("Merit Student ");
    } else {
        System.out.println("Not eligible for merit category.");
    }
}
// 	•	Create a nested if structure to check: if student passes internal → check if CGPA ≥ 8 → print scholarship message.
public static void checkScholarship(boolean passedInternal, double cgpa) {
    if (passedInternal) {
        if (cgpa >= 8.0) {
            System.out.println("Scholarship Granted 🎓");
        } else {
            System.out.println("Passed internals, but not eligible for scholarship.");
        }
    } else {
        System.out.println("Did not pass internal exams.");
    }
}
// 	•	Write a method that takes a Boolean variable eligible and prints “Allowed” if not false. Use ! operator.
public static void checkEligibility(boolean eligible) {
    if (!eligible) {
        System.out.println("Not Allowed ");
    } else {
        System.out.println("Allowed ");
    }
}
    public static void main(String[] args) {
        System.out.println("--- 1. Even or Odd ---");
        checkEvenOrOdd(5);

        System.out.println("\n--- 2. Teenager Check ---");
        checkAge(16);

        System.out.println("\n--- 3. Max of 3 Numbers ---");
        int max = maxOf3(12, 25, 19);
        System.out.println("Maximum: " + max);

        System.out.println("\n--- 4. Driving License Eligibility ---");
        checkEligibility(20, 8);

        System.out.println("\n--- 5. Hiring Criteria ---");
        boolean selected = isEligible(5, 4, 4, 3, 8);
        System.out.println(selected ? "Selected for Job" : "Not Selected");

        System.out.println("\n--- 6. Divisibility by 2 and 3 ---");
        System.out.println("Is 12 divisible by 2 and 3? " + isDivisible(12));

        System.out.println("\n--- 7. Range Check (10–20) ---");
        System.out.println("Is 15 in range? " + isRange(15));

        System.out.println("\n--- 8. Merit Check ---");
        checkMerit(88, 95);

        System.out.println("\n--- 9. Scholarship Check ---");
        checkScholarship(true, 8.4);

        System.out.println("\n--- 10. Boolean Condition Check ---");
        checkEligibility(true);
    }
}