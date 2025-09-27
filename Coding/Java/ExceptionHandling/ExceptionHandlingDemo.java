package Coding.Java.ExceptionHandling;
import java.io.*;

public class ExceptionHandlingDemo {
    public static void main(String[] args) throws Exception {
        readAndPrintFile("file-illa.txt");

        System.out.println("Checking Throwable");
        checkEligibilityForVoting(11);
        checkEligibilityForVoting(19);
        checkEligibilityForVoting(38);


    }

    public static void checkAge (int age) throws Exception {

        System.out.println();

        if(age<18) throw new Exception(age+ " is Not Allowed For Voting (Below 18 age) ");

        System.out.println(age + " age is Eligibile to Vote ");

    }

    public static void checkEligibilityForVoting(int age) throws Exception{

        try {
            checkAge(age);
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        finally{
            System.out.println(" Cleaning the Resources ");
        }

        System.out.println();
    }
    
    public static void readAndPrintFile(String filename) throws IOException{
        FileReader reader = null;
        try {
             reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            String content = br.readLine();

        } catch ( FileNotFoundException e ) {
            
            e.printStackTrace();
            System.out.println(e.toString());   
        }
        finally{
            System.out.println("Nothing to Clear Everything is fine: ");
            //reader.close();
        }
    }
}
