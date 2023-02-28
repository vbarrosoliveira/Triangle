package triangleclass;
import java.util.Scanner;

//A Java method to calculate the area  of a triangle classifying them as:
//equilateral,isosceles,scalene,right

public class Main {
    public static void main(String[] args) {

        // We Declare the object
        //the first word, Scanner, is the class
        //Scanner(System.in) is the constructor
        Scanner myObj = new Scanner(System.in);

        //we initialise the variables
        double first_side = 0;
        double second_side = 0;
        double third_side = 0;


        //input for the first-side
       // a loop is created to ask for the input until the correct one (double) is passed
        int a = 0;
        while (a < 1) {
            try {
                System.out.println("Enter the first side of the triangle followed by the enter key:");
                first_side = Double.parseDouble(myObj.nextLine());

            }
            //in any other case(string,special character...)
            catch (Exception e) {
                //NumberFormatException ignore
                System.out.println("Invalid input");
                a--;
            }
            a++;
        }


        //input for the second-side
        // a loop is created to ask for the input until the correct one (double) is passed
        a = 0;
        while (a < 1) {
            try {
                System.out.println("Enter the second side of the triangle followed by the enter key:");
                second_side = Double.parseDouble(myObj.nextLine());

            }
            //in any other case(string,special character...)
            catch (Exception e) {
                System.out.println("Invalid input");
                a--;
            }
            a++;
        }

        //input for the third-side
        // a loop is created to ask for the input until the correct one (double) is passed
        a = 0;
        while (a < 1) {
            try {
                System.out.println("Enter the third side of the triangle followed by the enter key:");
                third_side = Double.parseDouble(myObj.nextLine());

            }
            //in any other case(string,special character...)
            catch (Exception e) {

                System.out.println("Invalid input");
                a--;
            }
            a++;
        }

        //Triangle myTriangle = new Triangle(side, side1, side2) explained below:
        //the first word:Triangle represents the class Triangle.java
        //myTriangle is the name of my object
        //The new keyword creates new objects
        //finally Triangle(side, side1, side2) is the constructor (see Triangle.java)

        try {
            Triangle myTriangle = new Triangle(first_side, second_side, third_side);
            System.out.println(myTriangle.getType());


        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}
