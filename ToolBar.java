package first;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class ToolBar {

    public static void main(String[] args) {
        JFrame myframe = new JFrame("ToolBar Example");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = myframe.getContentPane();

        JToolBar toolbar = new JToolBar();
        toolbar.setRollover(true);

        JButton button = new JButton("File");
        toolbar.add(button);
        toolbar.addSeparator();
        toolbar.add(new JButton("Edit"));
        toolbar.add(new JComboBox<>(new String[]{"Opt-1", "Opt-2", "Opt-3", "Opt-4"}));

        contentPane.add(toolbar, BorderLayout.NORTH);

        JTextArea textArea = new JTextArea();
        JScrollPane mypane = new JScrollPane(textArea);
        contentPane.add(mypane, BorderLayout.CENTER);

        myframe.setSize(450, 450);
        myframe.setVisible(true);
    }
}
