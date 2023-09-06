package first;
import javax.swing.*;
import java.awt.Color; // Add the import statement for the Color class

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Create a frame

        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application.

        frame.setResizable(false); // Prevent frame from being resized.

        frame.setSize(420, 420);
        frame.setVisible(true); // Make frame visible.

        ImageIcon image = new ImageIcon("f-4.PNG"); // Create an ImageIcon

        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.black); // Use Color.WHITE for a white background.
    }
}
