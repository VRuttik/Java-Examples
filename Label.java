package first;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {

    public static void main(String[] args) {
        
        ImageIcon image = new ImageIcon("Car.PNG");
        
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        
        JLabel label = new JLabel(); // create a label
        
        label.setText("Bro, do you have this car?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of image icon
        label.setForeground(new Color(0X00FF00)); // set font color of text
        label.setFont(new Font("Mv Boli", Font.PLAIN, 20)); // set font of text
        label.setIconTextGap(-25); // set gap from text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // sets border of label (not image + text )
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
        label.setBounds(200, 200, 550, 550); // set x, y position within frame as well as dimensions
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1000, 1000); // Set the frame size
        frame.setLayout(null); // Use absolute positioning
        frame.setVisible(true);
        frame.add(label);
    }
}

