import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your first pair of coordinates: ");
        String firstCoord = s.nextLine();

        firstCoord = firstCoord.substring(1, firstCoord.length() - 1);
        String[] values = firstCoord.split(",");
        int x1 = Integer.parseInt(values[0]);
        int y1 = Integer.parseInt(values[1]);

        System.out.print("Please enter your second pair of coordinates: ");
        String secondCoord = s.nextLine();
        secondCoord = secondCoord.substring(1, secondCoord.length() - 1);
        String[] values2 = secondCoord.split(",");
        int x2 = Integer.parseInt(values2[0]);
        int y2 = Integer.parseInt(values2[1]);

        LinearEquation linear = new LinearEquation(x1, y1, x2, y2);
        System.out.println(linear);
        System.out.print("Enter a x-coordinate to solve for y: ");
        double xVal = s.nextDouble();
        double yVal = linear.getYFromX(xVal);
        System.out.println("Solved coordinate point: (" + xVal + ", " + yVal + ")");

    }}

