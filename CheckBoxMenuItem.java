package first;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.event.KeyEvent;
import java.util.EventObject;

import javax.swing.AbstractButton;  
import javax.swing.Icon;  
import javax.swing.JCheckBoxMenuItem;  
import javax.swing.JFrame;  
import javax.swing.JMenu;  
import javax.swing.JMenuBar;  
import javax.swing.JMenuItem;  

public class CheckBoxMenuItem {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Menu Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar();
		
		// File Menu, F - Mnemonic
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menubar.add(fileMenu);
		
		// File->Open, O - Mnemonic
		JMenuItem menuItem1 = new JMenuItem("Open", KeyEvent.VK_O);
		fileMenu.add(menuItem1);
		
		JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Option_1");
		caseMenuItem.setMnemonic(KeyEvent.VK_C);
		fileMenu.add(caseMenuItem);
		
		// Create an ActionListener for the checkbox menu item
		ActionListener checkBoxListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbstractButton aButton = (AbstractButton) e.getSource();
				boolean selected = aButton.isSelected();
				String newLabel;
				
				if (selected) {
					newLabel = "Value-1";
				} else {
					newLabel = "Value-2";
				}
				
				aButton.setText(newLabel);
			}
		};
		
		// Add the ActionListener to the checkbox menu item
		caseMenuItem.addActionListener(checkBoxListener);
		
		frame.setJMenuBar(menubar); // Change setMenuBar to setJMenuBar
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}

