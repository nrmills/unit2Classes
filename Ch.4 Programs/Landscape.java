import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Write a description of class Horizon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Landscape
{
    private double topLeftX;
    private double topLeftY;
    private double width;
    private double height;

    /**
     * Constructor for objects of class Horizon
     */
    public Landscape(double initLeftX, double initBottomLeftY, int initWidth, int initHeight)
    {
        height = initHeight;
        width = initWidth*2;
        topLeftX = initLeftX;
        topLeftY = initBottomLeftY/2;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.GREEN);
        Ellipse2D.Double horizon = new Ellipse2D.Double(-500,500,width,height);
        g2.draw(horizon);
        g2.fill(horizon);
        
    }
}
