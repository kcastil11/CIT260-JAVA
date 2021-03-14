public class W5dot1 {
    /**
     *
     * W05 Assignment: Program 5.1
     * Write a short Java program that does the following:
     *
     * Tells the user what the program does.
     * Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the following table.
     * Outputs a goodbye message.
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        //program info
        System.out.println("This program is going to show you kilograms equivalent in Pounds.");
        //table headings
        System.out.println("\tkilograms\tPounds\n" +
                "-----------------------------");
        //variables
        final short SIZE= 30;
        //loop
        for(int i =0; i <= SIZE; i++){

            //skip if even
            if(i % 2 ==0){
                continue;
            }
            //kil to pounds
            double pounds= (i *2.2);
            //outcome
            System.out.printf("\t"+ i +"\t\t\t" +"%.1f%n",pounds);
        }
        System.out.print("\nGoodbye" +"\t"  + "Friends");
    }
}

