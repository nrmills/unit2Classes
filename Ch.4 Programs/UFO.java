import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;

/**
 * A UFO shape that has a black lower body, and an oblong, green ellipse shape layered on top
 * 
 * @author Nic Mills
 * @version 10/6/2014
 */
public class UFO
{
    /** Specifies the Upper Left X coordinate of the framing rectangle used to draw ellipses*/
    private double topLeftX;

    /** Specifies the Upper Left Y coordinate of the framing rectangle used to draw ellipses*/
    private double topLeftY;

    /** Specifies the width of the framing rectangle used to draw ellipses*/
    private int width;

    /** Specifies the height of the framing rectangle used to draw ellipses*/
    private int height;

    /**
     * Constructor for objects of class UFO
     * 
     * 
     * @param initLeftXValue The unmodified value of the upper left X coordinate of the framing rectangle used to draw ellipses
     * @param initLeftYValue The unmodified value of the upper left Y coordinate of the framing rectangle used to draw ellipses
     * @param initWidth The width of the framing rectangle used to draw ellipses
     * @param initHeight the height of the framing rectangle used to draw ellipses
     */
    public UFO(double initLeftXValue, double initLeftYValue, int initWidth, int initHeight)
    {
        topLeftX = initLeftXValue/4;
        topLeftY = initLeftYValue/4;
        width = initWidth;
        height = initHeight;
    }

    /**
     * Draws both the lower and upper ellipses that comprise the body of the UFO shape
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
