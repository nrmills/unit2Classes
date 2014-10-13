import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky
{
    private double width;
    private double height;

    /**
     * Constructor for objects of class Sky
     */
    public Sky(double initWidth, double initHeight)
    {
        width = initWidth;
        height = initHeight;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLUE);
        Rectangle2D.Double skybox = new Rectangle2D.Double(0,0,width,height);
        g2.draw(skybox);
        g2.fill(skybox);
    }
}
