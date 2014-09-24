import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A circle that can be positioned anywhere on the screen.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    private int xLeft;
    private int yTop;
    private int width;
    private int length;
    /**
     * Constructs a circle.
     */
    public Circle(int x, int y, int a, int b)
    {
        xLeft = x;
        yTop = y;
        width = a;
        length = b;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft, yTop, width, length);
        Rectangle2D.Double rect1 = new Rectangle2D.Double(xLeft,yTop, width, length);
        //System.out.println(xLeft+" "+yTop);
        //
        Ellipse2D.Double circle2 = new Ellipse2D.Double(xLeft-=50, yTop-=50, width+=100, length+=100);
        Rectangle2D.Double rect2 = new Rectangle2D.Double(xLeft,yTop, width, length);
        //System.out.println(xLeft+" "+yTop);
        //
        Ellipse2D.Double circle3 = new Ellipse2D.Double(xLeft-=50, yTop-=50, width+=100, length+=100);
        Rectangle2D.Double rect3 = new Rectangle2D.Double(xLeft,yTop, width, length);
        //System.out.println(xLeft+" "+yTop);
        
        g2.draw(circle3);
        g2.setPaint(Color.BLACK);
        g2.fill(circle3);
        g2.draw(rect3);
        //
        g2.draw(circle2);
        g2.setPaint(Color.WHITE);
        g2.fill(circle2);
        g2.draw(rect2);
        //
        g2.draw(circle1);
        g2.setPaint(Color.BLACK);
        g2.fill(circle1);
        g2.draw(rect1);
        //
    }

}
