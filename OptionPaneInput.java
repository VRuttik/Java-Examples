package first;
import javax.swing.*;

public class OptionPaneInput {

	JFrame f;
	
	OptionPaneInput(){
		
		f = new JFrame();
		String name = JOptionPane.showInputDialog(f,"Enter Name");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new OptionPaneInput();

	}

}
