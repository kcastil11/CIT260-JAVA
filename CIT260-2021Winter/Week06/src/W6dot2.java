public class W6dot2 {
    /**
     *
     * W06 Assignment: Program 6.2
     * Write a short Java program that contains the following two methods:
     *
     *     public static double celsiusToFahrenheit(double tempCelsius)
     *     public static double fahrenheitToCelsius(double tempFahrenheit)
     *
     * Your program should
     *
     * Tell the user what the program does.
     * Invoke the above two methods to compute and display the table shown below.
     * Output a goodbye message.
     *
     * @param args
     */


    public static void main(String[] args){

        // Displays the table
        System.out.println("   Celsius   |   Fahrenheit   ");


        for (double celsius = 40.0; celsius >= 31.0; celsius--){

            // Displays results and calls celsiusToFahrenheit method
            System.out.printf("%8.1f", celsius);
            System.out.printf("%15.1f\n", celsiusToFahrenheit(celsius));

        }
        // Displays 2nd table
        System.out.println("================================");
        System.out.println(" ");
        System.out.println("   Celsius   |   Fahrenheit   ");

        for(double fahrenheit = 120.0; fahrenheit >= 30.0; fahrenheit-=10){

            // Displays results and calls fahrenheitToCelsius method
            System.out.printf("%8.1f", fahrenheit);
            System.out.printf("%15.2f\n",fahrenheitToCelsius(fahrenheit));

        }
        System.out.print("\nGoodbye" +"\t"  + "Friends");

    }
    /** Conversion from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius){

        return (9.0 / 5) * celsius + 32;

    }

    /** Conversion from fahrenheit to celsius */
    public static double fahrenheitToCelsius(double fahrenheit){

        return (5.0 / 9) * (fahrenheit - 32);


    }

}
