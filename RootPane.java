package first;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class RootPane {

    public static void main(String[] args) {
    	
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("File");
        bar.add(menu);
        menu.add("Open");
        menu.add("Close");
        f.setJMenuBar(bar);

        JButton button = new JButton("Press Me");
        button.setPreferredSize(new Dimension(100, 30)); // Set the preferred size here
        f.getContentPane().add(button);

        f.pack();
        f.setVisible(true);
    }
}
