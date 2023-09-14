package first;
import javax.swing.*;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("Button Example");
		
		JButton b = new JButton("Click");
		b.setBounds(100,100,95,30);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
