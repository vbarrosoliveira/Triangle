package com.trianglearea;

import java.util.Scanner;
//A Java method to calculate the area  of a triangle classifying them as:
//equilateral,isosceles,scalene,right

public class Maint {
    public static void main(String[] args) {
        //double[] sides={3.0d,4.0d,5.0d};
        //double result_area=triangle_area(sides[0], sides[1], sides[2]);
        Scanner myObj=new Scanner(System.in);



        System.out.println("Enter each side of the triangle followed by  the enter key:" );
        double side=myObj.nextDouble();
        double side1=myObj.nextDouble();
        double side2=myObj.nextDouble();
        boolean IsItaTriagle=it_is_a_triangle(side, side1, side2);
        if (IsItaTriagle){
            System.out.println("Area:" + triangle_area(side, side1, side2));
            System.out.println("Classification:" + triangle_class(side, side1, side2));
        }
        else {System.out.println("Are you sure you entered a valid input?");
            System.out.println("1.each side must be a positive number");
            System.out.println("2.the sum of the lengths of any two sides of a triangle must be greater than to the length of the third side");

        }
    }

     private static String triangle_class ( double side, double side1, double side2){

            if (side == side1 && side1 == side2) {

                return "equilateral";
            } else if (side == side1 || side1 == side2) {
                return "isosceles";

            } else {
                return "scalene";

            }



    }

   private static String triangle_area ( double side, double side1, double side2){
            double semi_perimeter = (side + side1 + side2) / 2;
            double inside_the_root = semi_perimeter * (semi_perimeter - side) * (semi_perimeter - side1) * (semi_perimeter - side2);
            double area = Math.sqrt(inside_the_root);


            return String.format("%.2f", area);
        }
    
    private static boolean it_is_a_triangle(double side, double side1, double side2) {
        boolean TriangleIneq = side + side1 > side2 && side2 + side1 > side && side + side2 > side1;
        boolean PositiveSides=side>0 && side1 >0 && side2>0;

        if((TriangleIneq && PositiveSides))
        return TriangleIneq;
        else return false;
    }

}
