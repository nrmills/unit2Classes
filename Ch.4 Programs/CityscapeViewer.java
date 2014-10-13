import javax.swing.JFrame;

public class CityscapeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(1000,1000);
        frame.setTitle("CityScape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CityscapeComponent component = new CityscapeComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}