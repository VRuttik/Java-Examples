package first;
import javax.swing.*;
import javax.swing.event.*;

public class SpinnerAction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("Spinner");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(250,100);
		
		SpinnerModel value = new SpinnerNumberModel(5, 0, 10,1);
		
		JSpinner spinner = new JSpinner(value);
		spinner.setBounds(100,100,50,30);
		f.add(spinner);f.add(label);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				label.setText("Value: "+((JSpinner)e.getSource()).getValue());
			}
		});

	}

}
