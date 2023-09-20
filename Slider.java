package first;
import javax.swing.*;

public class Slider extends JFrame{
	
	Slider(){
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
		JPanel panel = new JPanel();
		panel.add(slider);
		
		add(panel);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Slider frame = new Slider();
		frame.pack();
		frame.setVisible(true);

	}

}
