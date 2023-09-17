package first;
import javax.swing.*;

public class Menu {

	JMenu menu, submenu;
	JMenuItem i1,i2,i3,i4,i5;
	
	Menu(){
		
		JFrame f = new JFrame("Menu Example");
		
		JMenuBar mb = new JMenuBar();
		menu  = new JMenu("Menu");
		submenu = new JMenu("Sub Menu");
		
		i1 = new JMenuItem("Item1");
		i2 = new JMenuItem("Item2");
		i3 = new JMenuItem("Item3");
		i4 = new JMenuItem("Item4");
		i5 = new JMenuItem("Item5");
		
		menu.add(i1);menu.add(i2);menu.add(i3);
		submenu.add(i4);submenu.add(i5);
		menu.add(submenu);
		mb.add(menu);
		
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Menu();

	}
}
