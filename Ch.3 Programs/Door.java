
/**
 * Write a description of class Door here.
 * 
 * @author Nic Mills, Nikhil Sivapatham 
 * @version 9/17/2014
 */
public class Door
{
    /** This variable shows whether the door is open or closed */
    private String state;
    private String name;
    public Door(boolean isClosed, String initialName)
    {
        if (isClosed == false)
        {
            this.state = "Open";
        }

        else
        {
            this.state = "Closed";
        }
        this.name = initialName;
    }
    
    public void open()
    {
        this.state = "Open";
    }
    
    public void close()
    {
        this.state = "Closed";
    }

    public String getName()
    {
        return this.name;
    }
    
    public String getState()
    {
        return this.state;
    }
    
    public void setName(String newName)
    {
       this.name=newName;
    }
   
    public void setState(String newState)
    {
        this.state=newState;
    }

}
