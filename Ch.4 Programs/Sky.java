import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * A rectangle shape that is portrayed to look like a continous sky
 * 
 * @author Nic Mills
 * @version 10/7/2014
 */
public class Sky
{
    /** The Width of the rectangle shape that represents the sky*/
    private double width;
    
    /** The Height of the rectangle shape that represents the sky*/
    private double height;

    /**
     * Constructor for objects of class Sky
     * @param initWidth The Width of the rectangle shape that represents the sky
     * @param initHeight The Height of the rectangle shape that represents the sky
     */
    public Sky(double initWidth, double initHeight)
    {
        width = initWidth;
        height = initHeight;
    }

    /**
     * Draws the blue skybox
     */
    public void draw(Graphics2D g2)
    {
        Color skyColor = new Color(0,51,102);
        g2.setColor(skyColor);
        Rectangle2D.Double skybox = new Rectangle2D.Double(0,0,width,height);
        g2.draw(skybox);
        g2.fill(skybox);
    }
}
