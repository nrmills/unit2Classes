import java.lang.Math;
import java.util.Scanner;

/**
 * Write a description of class Rectangle here.
 * 
 * @author Nic Mills 
 * @version 9/29/2014
 */
public class Rectangle
{
    /** description of instance variable x (add comment for each instance variable) */
    private double leg1;
    private double leg2;

    /**
     * Default constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        Scanner inputLeg1 = new Scanner(System.in);
        System.out.print("\nPlease enter the length of the 1st leg: ");
        this.leg1 = inputLeg1.nextInt();
        Scanner inputLeg2 = new Scanner(System.in);
        System.out.print("\nPlease enter the length of the 2nd leg: ");
        this.leg2 = inputLeg2.nextInt();
        
    }

    public String calculate()
    {
        double area = this.leg1 * this.leg2;
        double perimeter = this.leg1*2 + this.leg2*2;
        double hypotLength = Math.hypot(this.leg1, this.leg2);
        String returnStatement = "The area of the rectangle specified was "+area+
        " units, the perimeter was "+perimeter+ " units long, and the length of the hypotenuse was "+hypotLength+ " units";
        return returnStatement;
    }

}
