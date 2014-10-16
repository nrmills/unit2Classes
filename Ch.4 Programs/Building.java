import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import java.awt.Color;

/**
 * A building shape that can have multiple sizes and floors
 * 
 * @author Nic Mills
 * @version 9/30/2014
 */
public class Building
{
    /** Specifies the Upper Left X coordinate of a rectangle*/
    private double topLeftX;
    
    /** Specifies the Upper Left Y coordinate of a rectangle*/
    private double topLeftY;
    
    /** Specifies the Width of a rectangle*/
    private int width;
    
    /** Specifies the Weight of a rectangle*/
    private int height;
    
    /** Specifies the Number of Floors in a given building*/
    private double numFloors;
    
    /** Specifies the Number of Windows on a floor in a given building*/
    private double windowsPerFloor;
    
    /** Specifies the amount of pixels to shift when drawing the next window in a horizontal line of windows*/
    private double shiftWindowX;
    
    /** Specifies the amount of pixels to shift down when finished drawing the horizontal line of windows on a given floor*/
    private double shiftWindowY;
    
    /** An instance variable used to store the result of the .nextInt() call to the Random class*/
    private int randNum;
    
    /**
     * Constructor for objects of class Buidling
     * 
     * 
     * @param initBottomLeftX The bottom left X coordinate of the gray outline of the building (Will be converted to upper left)
     * @param initBottomLeftY The bottom left Y coordinate of the gray outline of the building (Will be converted to upper left)
     * @param initHeight The height of the gray outline of the building
     * @param initWidth The width of the gray outline of the building
     * @param initNumFloors The amount of floors to be drawn into the outline object
     * @param initWPF The amount of windows per floor to be drawn into the outline object
     * 
     */
    public Building(double initBottomLeftX, double initBottomLeftY, int initHeight, int initWidth, int initNumFloors, int initWPF)
    {
        height = initHeight;
        width = initWidth;
        topLeftX = initBottomLeftX;
        topLeftY = initBottomLeftY-height;
        numFloors = initNumFloors;
        windowsPerFloor = initWPF;
        shiftWindowX = width/windowsPerFloor;
        shiftWindowY = height/numFloors;
    }

    /**
     * Draws the outline of the building as well its windows (either colored black or yellow, representing "lights turned off",
     * or "lights turned on", respectively)
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.GRAY);
        Rectangle2D outline = new Rectangle2D.Double(topLeftX,topLeftY,width,height);
        g2.draw(outline);
        g2.setColor(Color.GRAY);
        g2.fill(outline);
        for (int y=0; y<numFloors; y+=1)
        {
            for (int x=0; x<windowsPerFloor; x+=1)
            {
                Rectangle2D.Double window = new Rectangle2D.Double(topLeftX+12.5+(+shiftWindowX*x), topLeftY+25+(shiftWindowY*y),
                        width/windowsPerFloor-25, (height/numFloors)-20);
                Random generator = new Random();
                randNum = generator.nextInt(2);
                if (randNum == 1)
                {
                    g2.setColor(Color.YELLOW);
                    g2.draw(window);
                    g2.fill(window);
                }
                else
                {
                    g2.setColor(Color.BLACK);
                    g2.draw(window);
                    g2.fill(window);
                }
            }
        }
    }
}

