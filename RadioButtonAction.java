package first;
import javax.swing.*;    
import java.awt.event.*;    

class RadioButtonAction extends JFrame implements ActionListener{
	
JFrame f;
JRadioButton rb1,rb2;    
JButton b;

RadioButtonAction(){      
	f = new JFrame();
	
rb1=new JRadioButton("Male");    
rb1.setBounds(100,50,100,30);      
rb2=new JRadioButton("Female");    
rb2.setBounds(100,100,100,30);    
ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);bg.add(rb2);    
b=new JButton("click");    
b.setBounds(100,150,80,30);    
b.addActionListener(this);    
f.add(rb1);f.add(rb2);f.add(b);    
f.setSize(300,300);    
f.setLayout(null);    
f.setVisible(true);    
}    
public void actionPerformed(ActionEvent e){    
if(rb1.isSelected()){    
JOptionPane.showMessageDialog(this,"You are Male.");    
}    
if(rb2.isSelected()){    
JOptionPane.showMessageDialog(this,"You are Female.");    
}    
}    
public static void main(String args[]){    
new RadioButtonAction();    
}
}
