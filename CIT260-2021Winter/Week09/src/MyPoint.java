public class MyPoint {
    private int x;
    private int y;

    /**
     * No-arg constructor. Creates Point that defaults to (0,0)
     */
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructs a point using provided x and y values
     *
     * @param x desired x-value of a Point
     * @param y desired y-value of a Point
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-value for the Point
     *
     * @return the x-value for the Point
     */
    public int getX() {
        return this.x;
    }

    /**
     * Gets the y-value for the Point
     *
     * @return the y-value  for the Point
     */
    public int getY() {
        return this.y;
    }

    /**
     * Sets the x-value for the Point
     *
     * @param x the x-value for the Point
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y-value for the Point
     *
     * @param y the y-value for the Point
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Builds a string representation of a Point in standard format
     *
     * @return the x-y-coordinate representation of a String
     */
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    /**
     * Calculates the distance between a Point and given x and y values
     *
     * @param xCoord the x coordinate of another point
     * @param yCoord the y coordinate of another point
     * @return the distance between a point and the coordinates provided
     */
    public double distance(int xCoord, int yCoord) {
        double deltaX = Math.abs(this.x - xCoord);
        double deltaY = Math.abs(this.y - yCoord);
        double aSquared = Math.pow(deltaX, 2);
        double bSquared = Math.pow(deltaY, 2);

        return Math.sqrt(aSquared + bSquared);
    }

    /**
     * Calculates the distance between a Point and another provided Point
     *
     * @param point the other Point to calculate distance from
     * @return the distance between the Point and the provided Point
     */
    public double distance(MyPoint point) {
        return this.distance(point.getX(), point.getY());
    }

    /**
     * Calculates the distance between two points
     *
     * @param point1 The first Point
     * @param point2 The second Point
     * @return the distance between the two points
     */
    public static double distance(MyPoint point1, MyPoint point2) {
        return point1.distance(point2);
    }
}
