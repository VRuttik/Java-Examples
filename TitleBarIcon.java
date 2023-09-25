package first;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TitleBarIcon {

	TitleBarIcon(){
		
		JFrame f = new JFrame();
	    Image icon = Toolkit.getDefaultToolkit().getImage("Blue.jpg");
	    f.setIconImage(icon);
	    f.setLayout(null);
	    f.setSize(400,400);
	    f.setVisible(true);
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TitleBarIcon();

	}
}
