import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
 * A Tree shape that is drawn in the hills that dominate the lower background
 * 
 * @author Nic Mills
 * @version 10/15/2014
 */
public class Tree
{
    /** Specifies the Upper Left X coordinate of the rectangle, representing the tree-trunk
       Used Also to determine placement of tree branches*/
    private double topUpperLeftX;
    
    /** Specifies the Upper Left Y coordinate of the rectangle, representing the tree-trunk
       Used Also to determine placement of tree branches*/
    private double topUpperLeftY;
    
    /** Specifies the Width of the rectangle representing the tree-trunk*/
    private int width;
    
    /** Specifies the Height of the rectangle representing the tree-trunk*/
    private int height;
    
    /** Specifies the amount of branches grown onto the tree-shape*/
    private int branchNum;
    
    private int dx;
    
    private int dy;

     /**
     * Constructor for objects of class Tree
     * 
     * 
     * @param initUpperLeftXValue The Upper Left X coordinate of the rectangle, representing the tree-trunk
     * @param initUpperLeftYValue The Upper Left Y coordinate of the rectangle, representing the tree-trunk
     * @param initWidth The Width of the rectangle representing the tree-trunk
     * @param initHeight The Height of the rectangle representing the tree-trunk
     * @param initBranchNum The amount of branches grown onto the tree-shape
     */
    public Tree(double initUpperLeftXValue, double initUpperLeftYValue, int initWidth, int initHeight,int initBranchNum)
    {
        topUpperLeftX = initUpperLeftXValue;
        topUpperLeftY = initUpperLeftYValue;
        width = initWidth;
        height = initHeight;
        branchNum = initBranchNum;
    }

    /**
     * Draws a tree shape
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLACK);
        Rectangle2D.Double trunk = new Rectangle2D.Double(topUpperLeftX,topUpperLeftY,width,height);
        Color trunkColor = new Color(102,51,0);
        Color branchColor = new Color(0,153,0);
        g2.draw(trunk);
        g2.setColor(trunkColor);
        g2.fill(trunk);
        g2.setColor(branchColor);
        //Draw the Branches
        for (int x=0; x < branchNum; x+=1)
        {
            Random generator = new Random();
            dx = generator.nextInt(width*2);
            dy = generator.nextInt(height*2);
            Ellipse2D.Double branch = new Ellipse2D.Double(topUpperLeftX-(width-(dx+1)),topUpperLeftY-((height/(dy+2))+height/2),width+10,height);
            g2.draw(branch);
            g2.fill(branch);
            
        }
    }
}
