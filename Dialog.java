package first;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Dialog {

	private static JDialog d;
	
	Dialog(){
		
		JFrame f = new JFrame();
		d = new JDialog(f, "Dialog Example", true);
		d.setLayout(new FlowLayout());
		JButton b = new JButton("OK");
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dialog.d.setVisible(false);
			}
		});
		
		d.add(new JLabel ("Click button to continue"));
		d.add(b);
		d.setSize(400,400);
		d.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Dialog();
	}
}
