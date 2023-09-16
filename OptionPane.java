package first;
import javax.swing.*;

public class OptionPane {

	JFrame f;
	
	OptionPane(){
		f = new JFrame();
		//JOptionPane.showMessageDialog(f,"Hello, Welcome to India.");
		JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new OptionPane();
	}

}
