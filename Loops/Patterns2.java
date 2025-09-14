package Loops;


public class Patterns2 {

    public static void printStarODd(int n){

        System.out.println("Printing Odd Pattern ");

        for(int i = 1 ;i<=n ;i++){

            for(int j = 1 ;j<=n ;j++){

                if((j&1) == 1){
                    System.out.print("* ");
                } 

                else{
                    System.out.print("  ");
                }
            }

            System.out.println();

        }
        System.out.println();

    }

    public static void printStartsOnlyAtBorders(int n){

        System.out.println("Printing Stars At Border");

        for(int i =0 ; i < n ;i++){

            for(int j = 0 ; j < n ; j++){

                if(i==0 || j==n-1 || i==n-1 ||j==0 ){

                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();

        }
        System.out.println();
    }


    public static void printPyramid(int n) {

        System.out.println("Printing Pyramid Pattern");

        int width = 2 * n - 1; 

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < width; col++) {

                
                if (col >= (n - row - 1) && col <= (n + row - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

public static void PrintStarTriagleLeft2 ( int size )
 {
    System.out.println("print triangle at Left");

    for ( int row =1; row <= size ; row ++)
    {
        for ( int col =1; col <= row ; col ++)
        {
             System.out.print( " * " ) ;
        }
            System . out . println () ;
        }
    System.out.println();
 }  

public static void PrintStarTriagleExp2 ( int size )
 {
    System.out.println("Print Traigle Inverted and left alligned");
    for ( int row = size ; row >= 1; row--)
    {
        for ( int col = row ; col >= 1; col--)
        {
            System.out.print ( " * " ) ;
        }
        System . out . println () ;
    }
 }


 public static void printInvertedPyramid(int rows) {

    System.out.println("Print Inverted Pyramid ");

    for (int i = rows; i >= 1; i--) {

        for (int space = 0; space < rows - i; space++) {
            System.out.print("  ");
        }

       
        for (int star = 0; star < (2 * i - 1); star++) {
            System.out.print("* ");
        }

    
        System.out.println();
    }
}

 public static void main(String[] args) {
        
        printStarODd(7);

        printStartsOnlyAtBorders(7);

        printPyramid(7);

        PrintStarTriagleLeft2(7);

        PrintStarTriagleExp2(7);

        printInvertedPyramid(7);


    }
}
