import  java.util.Scanner;

public class W7dot1 {
    public static void main(String[] args) {
        // Information about the program
        System.out.println("This program calculates the average of five numbers.");
        //collects input from user
        Scanner input = new Scanner(System.in);

        //the variables
        double[] numbers = new double[5];
        double average = 0;

        //The CALLBACK METHOD
        Average(numbers);

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a number: ");
            numbers[i] = input.nextDouble();
            average = Average(numbers);
        }

        System.out.printf("The average of these five numbers is " +"%.2f%n",average);
        System.out.println("Goodbye classmates");

    }






    private static double Average(double[]numbers){
        //add input user array values
        double total = 0;
        for (double i: numbers){
            total += i;

        }
        //math divide by length in array
        double average = total / numbers.length;
        // result of return
        return average;
    }
}
