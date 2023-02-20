package com.trianglearea;
import java.lang.Math;
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
       System.out.println("Area:" + triangle_area(side,side1,side2));
        triangle_class(side, side1, side2);
    }

    private static void triangle_class(double side, double side1, double side2) {

        if (side == side1 && side1 == side2) {

            System.out.println("this triangle is equilateral");
        } else if (side == side1  ||  side1 == side2) {
            System.out.println("this triangle is isosceles");

        } else {
            System.out.println("this triangle is scalene");

        }



    }

    private static double triangle_area(double side, double side1, double side2) {
        double semi_perimeter=(side+side1+side2)/2;
        double inside_the_root= semi_perimeter*(semi_perimeter-side)*(semi_perimeter-side1)*(semi_perimeter-side2);
        double area= Math.sqrt(inside_the_root);
        return area;
    }


}
