package first;
import javax.swing.*;

public class Spinner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("Spinner");
		SpinnerModel value = new SpinnerNumberModel(5,0,10,	1);
		
		JSpinner spinner = new JSpinner(value);
		spinner.setBounds(100,100,50,30);
		f.add(spinner);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);

	}

}
