package first;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Component extends JComponent {

    @Override
    public void paintComponent(Graphics g) { // Note the corrected method name "paintComponent"
        super.paintComponent(g); // Call the superclass method
        g.setColor(Color.green);
        g.fillRect(30, 30, 100, 100);
    }

    public static void main(String[] args) {
    	
        Component com = new Component();

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Component Example");

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(com);
        frame.setVisible(true);
    }
}
