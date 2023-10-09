public class LinearEquation {
    private int x; //This variable represents the x-coordinate of the first coordinate
    private int y; //This variable represents the y-coordinate of the first coordinate
    private int xOne; //This variable represents the x-coordinate of the second variable
    private int yOne; //This variable represents the y-coordinate of the second variable
    //constructor
    public LinearEquation(int xVal, int yVal, int secondXVal, int secondYVal){
        x = xVal;
        y = yVal;
        xOne = secondXVal;
        yOne = secondYVal;
    }
    //Methods
    public double slopeLine(){
        return (double) (yOne - y) / (xOne - x);
    } //returns slope of the line
    public double yInt(){
        double roundedYInt = Math.round((y-(x * slopeLine())) *100.0) / 100.0;
        return roundedYInt;
    } // returns y-intercept(rounded)
    public String slopeInt(){
        double slope = slopeLine();
        String slopeFraction = String.format("%d/%d", (int)(yOne - y), (int)(xOne - x));
        double roundedYInt = Math.round(yInt() * 100.0) / 100.0;
        return "y = " + slopeFraction + "x + " + roundedYInt;
    } //returns the slope intercept(rounded)
    public double distancePoint() {
        double roundedDistance = Math.round(Math.sqrt((yOne - y) * (yOne - y) + (xOne - x) * (xOne - x)) * 100.0) / 100.0;
        return roundedDistance;
    } //returns the distance between points(rounded)
    public double getYFromX(double xVal) {
        return Math.round((slopeLine() * xVal + yInt()) * 100.0) / 100.0; //returns the y value after user inputs x into the equation
    }

    public String toString() {
        String s0 = "First Coordinate: (" + x + "," + y + ")\n";
        String s1 = "Second Coordinate: (" + xOne + "," + yOne + ")\n";
        String s2 = "Slope of Line: " + slopeLine() + "\n";
        String s3 = "Y-intercept: " + yInt() + "\n";
        String s4 = "Slope-Intercept Form: " + slopeInt() + "\n";
        String s5 = "Distance between points: " + distancePoint() + "\n";
        return s0 + s1 + s2 + s3 + s4 + s5;
    }
}
