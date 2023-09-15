import javax.swing.*;

public class TextArea
{
    TextArea(){
        JFrame f= new JFrame();
        JTextArea area=new JTextArea("Hello,World!");
        area.setBounds(50,80, 270,270);
        f.add(area);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new TextArea();
    }
}
