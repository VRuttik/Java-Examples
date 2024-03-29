package first;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChooserAction extends JFrame implements ActionListener {
    
    JFrame f;
    JButton b;
    JTextArea ta;
    
    ColorChooserAction() {
        
        f = new JFrame("Color Chooser");
        b = new JButton("Pick Color");
        b.setBounds(200, 250, 100, 30);
        ta = new JTextArea();
        ta.setBounds(10, 10, 300, 200);
        b.addActionListener(this);
        
        f.add(b);
        f.add(ta);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(this, "Choose a Color", Color.WHITE);
        ta.setBackground(c);
    }
    
    public static void main(String[] args) {
        new ColorChooserAction();
    }
}

