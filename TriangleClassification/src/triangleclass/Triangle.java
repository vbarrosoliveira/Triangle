package triangleclass;
import java.awt.*;

public class Triangle {

    /*The methods or data members declared as protected can be accessed from
      Within the same class.
    Subclasses of the same packages.
    Different classes of the same packages.
    Subclasses of different packages.

     */
    protected double first_side ;
    protected double second_side;
    protected double third_side=0;

    private String area;  //private variables can only be accessed within the same class
    private String classification;

    //constructor Triangle(the constructor name must match the class name)
    //A constructor in Java is a special method that is used to initialize objects.

    public Triangle(double premiereLongueur, double sideb, double side2) {

        //3 different ways of declaring the parameters inside the constructor

        this.first_side = premiereLongueur;  //required
        second_side= sideb;   //required
        setThird_side(side2);   //required

        //and then it tests if the input is valid (optional)
        ValidInput();
    }

    //this method returns the area
    private  String triangle_area (){
        double semi_perimeter = (first_side + second_side + third_side) / 2;
        double inside_the_root = semi_perimeter * (semi_perimeter - first_side) * (semi_perimeter - second_side) * (semi_perimeter - third_side);
        double area = Math.sqrt(inside_the_root);
        return String.format("%.2f", area);
    }
   //the set method
    private void setThird_side(double side) {

            this.third_side = side;

    }
//if input is valid the method returns area and classification
    private void ValidInput( ) {
        if (it_is_a_triangle()) {
            area = triangle_area();
            classification = triangle_class();
        } else {
            throw new RuntimeException("Sorry, this is not a triangle");
        }
    }

    //this method returns the triangle classification
    private String triangle_class (){
        if (first_side == second_side && second_side == third_side) {
            return "equilateral";
        } else if (first_side == second_side || second_side == third_side) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
    //are the inputs valid, in the sense that, do they really form a triangle?
    //a boolean that answers the question and then send it to the ValidInput method
    private boolean it_is_a_triangle() {
        boolean TriangleIneq = first_side + second_side > third_side && third_side + second_side > first_side && first_side + third_side > second_side;
        boolean PositiveSides=first_side>0 && second_side >0 && third_side>0;

        if((TriangleIneq && PositiveSides))
            return true;  //if triangle ineq is satisfied and all sides are positive numbers
        else return false;  //otherwise
    }

    public String getType() {
        return " Triangle's area : " + area + "\n Triangle's classification :"  + classification;
    }

}
