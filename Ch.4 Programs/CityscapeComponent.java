
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws the cityscape
 */
public class CityscapeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {        
        Graphics2D g2 = (Graphics2D) g;
        
        Sky s1 = new Sky(this.getWidth(),this.getHeight());
        s1.draw(g2);
        
        Landscape l1 = new Landscape(-750,this.getHeight(),this.getWidth(),this.getHeight());
        l1.draw(g2);
        
        Building b1 = new Building(0,this.getHeight(),300,200,7,6);
        Building b2 = new Building(350,this.getHeight(),200,150,5,4);
        Building b3 = new Building(550,this.getHeight(),250,150,5,4);
        Building b4 = new Building(850,this.getHeight(),200,150,7,5);
        Building b5 = new Building(1100,this.getHeight(),100,200,4,4);
        b1.draw(g2);
        b2.draw(g2);
        b3.draw(g2);
        b4.draw(g2);
        b5.draw(g2);
        
        UFO u1 = new UFO(this.getWidth(),this.getHeight(),150,75);
        u1.draw(g2);
        
        Moon m1 = new Moon(this.getWidth(), this.getHeight(),150,150,200,200,false);
        m1.draw(g2);
    }
}