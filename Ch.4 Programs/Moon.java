import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.Color;

/**
 * A Moon Shape that has multiple different colorations depending on the phase of the moon
 * 
 * @author Nic Mills
 * @version 10/6/2014
 */
public class Moon
{
    /** Specifies the Upper Left X coordinate of the framing rectangle used to draw the Moon Shape*/
    private double topLeftX;
    
    /** Specifies the Upper Left Y coordinate of the framing rectangle used to draw the Moon Shape*/
    private double topLeftY;
    
    /** Specifies the Width of the framing rectangle used to draw the Moon Shape*/
    private double width;
    
    /** Specifies the Height of the framing rectangle used to draw the Moon Shape */
    private double height;
    
    /** Specifies the starting degree of the arc that represents the shadow cast on the moon shape*/
    private double start;
    
    /** Specifies the extent to which the ending point will go past the start i.e.
     *if the starting angle was 40, and the extent was 150, the first point of the arc would be 40 degrees
     *and the second, last closing point would be at 190 degrees
     */
    private double extent;
    
    /** Specifies whether the moon shape is full or at another phase*/
    private boolean isFull;

    /**
     * Constructor for objects of class Moon
     */
    public Moon(double initLeftXValue, double initLeftYValue, double initWidth, double initHeight,
    double initStart, double initExtent, boolean initIsFull)
    {
        topLeftX = initLeftXValue*.75;
        topLeftY = initLeftYValue*.25;
        width = initWidth;
        height = initHeight;
        start = initStart;
        extent = initExtent;
        boolean isFull = initIsFull;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon1 = new Ellipse2D.Double(topLeftX, topLeftY, width, height);
        if (isFull == true)
        {
            g2.setColor(Color.YELLOW);
            g2.draw(moon1);
        }
        else
        {
            Color moonColor = new Color(255,255,85);
            g2.setColor(moonColor);
            g2.draw(moon1);
            g2.fill(moon1);
            Arc2D.Double mPhase = new Arc2D.Double(topLeftX,topLeftY,width,height,start,extent,Arc2D.PIE);
            g2.setColor(Color.BLACK);
            g2.draw(mPhase);
            g2.fill(mPhase);
            
        }
    }
}
