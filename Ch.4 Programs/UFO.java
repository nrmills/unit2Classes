import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;


/**
 * This class codes for an oblong ellipse shape that is characterized as a UFO
 * 
 * @author Nic Mills
 * @version 10/6/2014
 */
public class UFO
{
    /** description of instance variable x (add comment for each instance variable) */
    private double topLeftX;
    private double topLeftY;
    private int width;
    private int height;

    /**
     * Default constructor for objects of class UFO
     */
    public UFO(double initLeftXValue, double initLeftYValue, int initWidth, int initHeight)
    {
        topLeftX = initLeftXValue/4;
        topLeftY = initLeftYValue/4;
        width = initWidth;
        height = initHeight;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.GREEN);
        Ellipse2D.Double lowerBody = new Ellipse2D.Double(topLeftX,topLeftY,width,height);
        g2.draw(lowerBody);
        g2.setColor(Color.BLACK);
        g2.fill(lowerBody);
        Ellipse2D.Double upperBody = new Ellipse2D.Double(topLeftX+20+(topLeftX/width),topLeftY-(topLeftY/height),
                                    width/1.5,height/1.5);
        g2.draw(upperBody);
        g2.setColor(Color.GREEN);
        g2.fill(upperBody);
        
    }

}
