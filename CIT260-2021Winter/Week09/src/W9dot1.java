import java.util.Scanner;

public class W9dot1 {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        //program info
        System.out.println("This program creates a point at (0,0) and a point at the coordinates \n" +
                "entered by you. It then computes and displays the distance from (0,0)\n" +
                "to the point defined by you, using three different methods.");
        //user input
        Scanner input= new Scanner(System.in);

        //variables for user
        int xCoord;
        int yCoord;

        //retrieves input for variables
        System.out.print("Enter the x coordinate of a point: ");
        xCoord= input.nextInt();
        System.out.print("Enter the y coordinate of a point: ");
        yCoord= input.nextInt();

        //objects
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(xCoord,yCoord);

        //output with methods
        System.out.printf("Using method 1, the distance from (0,0) to (" + xCoord+ "," +yCoord+") is "
                + "%.2f%n",p1.distance(xCoord,yCoord));
        System.out.printf("Using method 2, the distance from (0,0) to (" + xCoord+ "," +yCoord+") is "
                + "%.2f%n",p1.distance(p2));
        System.out.printf("Using method 3, the distance from (0,0) to (" + xCoord+ "," +yCoord+") is "
                + "%.2f%n",MyPoint.distance(p1,p2));
        System.out.print("Goodbye");
    }


}
