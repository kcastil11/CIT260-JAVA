public class W5dot2 {
    /**
     * W05 Assignment: Program 5.2
     * Write a short Java program that does the following:
     *
     * Tells the user what the program does.
     * Uses a loop to display a table of all of the numbers from 100 to 1000 that are divisible by both 5 and 6.
     * The numbers must be separated by exactly one space and there must be 10 numbers per line.
     * Displays a goodbye message.
     *
     *
     * @param args
     */

    public static void main(String[] args){
        //program display
        System.out.println("This program displays all of the numbers from 100 to 1000\n" +
                "that are divisible by both 5 and 6.\n");
        //variables
        int numCount= 0;
        boolean linecount;
        final short COUNT=1000;
        //counting loop
        for(int i =100; i<=COUNT; i++){
            linecount= false;
            if(i %5 ==0 && i %6 ==0){
                System.out.print(i +" ");
                numCount++;
                linecount= true;
            }
            //10 numbers per line and output
            if( numCount %10 ==0 && linecount){
                System.out.println();
            }
        }
        System.out.print("\nGoodbye" +"\t"  + "Friends");
    }
}
