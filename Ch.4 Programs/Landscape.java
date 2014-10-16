import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * The background landscape that provides contrast for the overlaying shapes on top of it
 * 
 * @author Nic Mills
 * @version 10/7/2014
 */
public class Landscape
{
    /** Specifies the Upper Left X coordinate of the framing rectangle used to draw ellipses*/
    private double topLeftX;
    
    /** Specifies the Upper Left Y coordinate of the framing rectangle used to draw ellipses*/
    private double topLeftY;
    
    /** Specifies the Width of the framing rectangle used to draw ellipses*/
    private double width;
    
    /** Specifies the Height of the framing rectangle used to draw ellipses*/
    private double height;

    /**
     * Constructor for objects of class Horizon
     * @param initLeftX The Upper Left X coordinate of the framing rectangle used to draw ellipses
     * @param InitLeftY The Upper Left Y coordinate of the framing rectangle used to draw ellipses
     * @param initWidth The Width of the framing rectangle used to draw ellipses
     * @param initHeight The Height of the framing rectangle used to draw ellipses
     */
    public Landscape(double initLeftX, double initLeftY, int initWidth, int initHeight)
    {
        height = initHeight;
        width = initWidth*2;
        topLeftX = initLeftX;
        topLeftY = initLeftY/2;
    }

    /**
     * Draws an ellipse that is only partially showns by the frame and appears to be a semi-circle
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.GREEN);
        Ellipse2D.Double horizon = new Ellipse2D.Double(topLeftX,topLeftY,width,height);
        g2.draw(horizon);
        g2.fill(horizon);
        
    }
}
