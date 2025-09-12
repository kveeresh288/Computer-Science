package Loops;

public class Patterns {

    public static void printStart1Line(int count){

        for(int i = 0 ; i < count ; i++){

            System.out.print("* ");

        }

    }

    public static void printstartMultiLine(int count){

        for(int i = 0 ; i < count ; i++){

            if( i%10 == 0) System.out.println();

            System.out.print("* ");

        }

        System.out.println();

    }


    public static void printstartMultiLine2(int count){

        

        for(int i = 0 ; i < (count/10) ; i++){

            for(int j=0 ; j<10 ;j++) {
                System.out.print("* ");
            }

            System.out.println();

        }



    }

    public static void printGrid(int count){

        

        for(int i = 0 ; i < count ; i++){

            for(int j=0 ; j < count ;j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        System.out.println();

    }

    public static void gridPrintUsingArray(int [] nums ){

        for(int i = 0;i < nums.length; i++ ){

            for(int j = 0 ; j < nums[i] ; j++){

                System.out.print( "* ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        int nums[] = {2,4,5,7,6,8,10,3};

        gridPrintUsingArray(nums);
        
        printStart1Line(100);

        System.out.println();

        printstartMultiLine(100);

        System.out.println();

        printstartMultiLine2(100);

        System.out.println();

        System.out.println("Grid ");

       

   
    }
}
