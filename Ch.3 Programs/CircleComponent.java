
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


/**
 * This component draws a circle.
 */
public class CircleComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Circle circle1 = new Circle(250,250, 100, 100);
        circle1.draw(g2);
    }
}