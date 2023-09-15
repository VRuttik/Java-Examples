package first;
import javax.swing.*;
import java.awt.event.*;

public class FoodOrder extends JFrame implements ActionListener{
	
	JFrame f;
	JLabel l;
	JCheckBox cb1, cb2, cb3;
	JButton b;
	
	FoodOrder(){
		
		f = new JFrame("Food Order");
		
		l = new JLabel("Food Ordering System");
		l.setBounds(50,50,300,20);
		
		cb1 = new JCheckBox("Pizza @ 100");
		cb1.setBounds(100,100,150,20);
		cb2 = new JCheckBox("Burger @ 30");
		cb2.setBounds(100,150,150,20);
		cb3 = new JCheckBox("Tea @ 10");
		cb3.setBounds(100,200,150,20);
		
		b = new JButton("Order");
		b.setBounds(100,250,80,30);
		
		b.addActionListener(this);
		
		f.add(l);f.add(b);f.add(cb1);f.add(cb2);f.add(cb3);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 *
	 */
	public void actionPerformed(ActionEvent e) {
		float amount = 0;
		String msg = "";
		
		if(cb1.isSelected()) {
			amount += 100;
			msg = "Pizza: 100\n";
		}
		
		if(cb2.isSelected()) {
			amount += 30;
			msg = "Burger: 30\n";
		}
		
		if(cb3.isSelected()) {
			amount += 10;
			msg = "Tea: 10\n";
		}
		
		msg +="------------\n";
		JOptionPane.showMessageDialog(this,msg+ "Total: "+amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new FoodOrder();
	}

}
