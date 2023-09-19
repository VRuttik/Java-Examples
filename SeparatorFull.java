package first;
import java.awt.*;
import javax.swing.*;

public class SeparatorFull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("Separator Example");
		f.setLayout(new GridLayout(0, 1));
		JLabel l1 = new JLabel("Above Separator");
		f.add(l1);
		
		JSeparator sep = new JSeparator();
		f.add(sep);
		JLabel l2 = new JLabel("Below Seaparator");
		f.add(l2);
		f.setSize(400,400);
		f.setVisible(true);
		
	}

}
