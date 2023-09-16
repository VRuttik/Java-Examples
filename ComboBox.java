package first;
import javax.swing.*;

public class ComboBox {

	JFrame f;
	
	ComboBox(){
		
		f = new JFrame("ComboBox");
		String country[] = {"India","Aus","U.S.A","England","Japan"};
		JComboBox cb = new JComboBox(country);
		cb.setBounds(50,50,90,20);
		
		f.add(cb);
		f.setLayout(null);
		f.setSize(400,500);
		f.setVisible(true);
 	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ComboBox();
	}

}
