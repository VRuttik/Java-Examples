package first;
import javax.swing.*;
import java.awt.*;

public class Pannel {

    Pannel(){
        
        JFrame f = new JFrame("Panel Example");
        
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200); // Changed height to 200
        panel.setBackground(Color.black);
        
        JButton b1 = new JButton("Button 1");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.yellow);
        
        JButton b2 = new JButton("Button 2");
        // Corrected the following line from b1.setBounds to b2.setBounds
        b2.setBounds(140, 100, 80, 30); // Adjusted the x-position
        b2.setBackground(Color.green);
        
        panel.add(b1);
        panel.add(b2);
        
        f.add(panel);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Pannel();
    }
}
