import java.util.Scanner;
public class W6dot1 {
    /**
     *
     * W06 Assignment: Program 6.1
     * Write a short Java program that does the following:
     *
     * Tells the user what the program does.
     * Prompts the user to an investment amount, for example, 1000
     * Gets the user's input and saves it. If the user's input is not a positive, non-zero value, display an error message, then loop back and prompt for a new value. Stay in this loop until you have a valid value.
     * Prompts the user to enter an annual interest rate between 0 and 100. For example, 9 would be 9%.
     * Gets the user's input and saves it. If the user's input is not positive or if it is greater than 100, display an error message, then loop back and prompt for a new value. Stay in this loop until you have a valid value.
     * Using a method that you have written, calculate and display the future value of the investment
     *   for a period of 10 years. The formula for computing the future value of an investment is
     *      futureValue = investmentAmount x (1 + monthlyInterestRate)numberOfYears * 12
     *
     * @param args
     */
    public static void main(String[] args) {
        //Intro
        System.out.println("Given an investment amount and an annual interest rate, this program \n" +
                "will calculate the future value of the investment for a period of\n" +
                "ten years.");

        // user's input...
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive, non-zero value for the investment: ");
        double invested = input.nextDouble();
        System.out.print("Enter an annual interest rate, between 0 and 100: ");
        double annualInterestRate = input.nextDouble();

        // Calculate monthly rate by dividing annual by 12 and divide by 100 to make it to percentage
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        // Display table
        System.out.println("Years    Future Value");

        // loop from 1 to 10
        for(int i = 1; i <= 10; i++){
            //Display results
            System.out.printf("%3d", i);
            System.out.printf("%15.2f\n", futureInvestmentValue(invested, monthlyInterestRate, i));

        }
        System.out.print("\nGoodbye" +"\t"  + "Friends");
    }


    private static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

    }
}
