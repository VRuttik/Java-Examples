package first;
import javax.swing.*;
import java.awt.*;

public class LayeredPane extends JFrame{

	public LayeredPane() {
		super("Layered Pane Example");
		setSize(200,200);
		JLayeredPane pane = getLayeredPane();
		
		JButton top = new JButton();
		top.setBackground(Color.white);
		top.setBounds(20,20,50,50);
		
		JButton middle = new JButton();
		middle.setBackground(Color.red);
		middle.setBounds(40,40,50,50);
		
		JButton bottom = new JButton();
		bottom.setBackground(Color.cyan);
		bottom.setBounds(60,60,50,50);
		
		pane.add(bottom, new Integer(1));
		pane.add(middle, new Integer(2));
		pane.add(top, new Integer(3));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LayeredPane panel = new LayeredPane();
		panel.setVisible(true);

	}

}
