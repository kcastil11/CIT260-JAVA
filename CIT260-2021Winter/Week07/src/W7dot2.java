import java.util.Scanner;

public class W7dot2 {
    public static void main(String[] args) {
        // It tells the user about the program.
        System.out.println("This program computes the mean and the standard deviation for a set of f numbers.");
        //user input
        Scanner input = new Scanner(System.in);

        //the variables from user
        double[] x = new double[5];

        double mean = 0;
        double deviation = 0;

        //Methods
        Mean(x);
        Deviation(x,mean);

        //Data collected and place it into array
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            x[i] = input.nextDouble();
            //call out methods and push array
            mean = Mean(x);
            deviation = Deviation(x,mean);
        }
        //this displays the result from mean & deviation
        //Mean(x)
        System.out.printf("\nThe mean of this set of numbers is " +"%.2f%n",mean);
        //Deviation(x)
        System.out.printf("The standard deviation is " +"%.2f%n",deviation);
        System.out.print("Goodbye...");
    }


    /**
     *
     * This will find the average of array of numbers
     *
     *
     */

    private static double Mean(double[] x){
        double total = 0;
        //add the array of numbers
        for(double i: x){
            total += i;
        }
        //divide by number of number int the array
        double mean = total / x.length;
        return mean;

    }

    /**
     *
     * this will find the simple deviation of the array
     *
     */


    private static double Deviation(double[] x, double mean){
        double deviation;
        double devStp1 = 0;
        //subtract the number within the array to the mean
        //then multiply it to itself
        for(double i: x){
            devStp1 +=(i -mean)*(i -mean);
        }
        //divide the devStp1 by the number of numbers in the array -1
        double devStp2 = devStp1 / (x.length -1);
        deviation = Math.pow(devStp2,0.5);
        return deviation;
    }


}
