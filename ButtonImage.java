package first;
import javax.swing.*;

public class ButtonImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("Button & Image");
		
		JButton b = new JButton(new ImageIcon("Blue.jpg"));
		b.setBounds(100,100,100,40);
		f.add(b);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}	

}
