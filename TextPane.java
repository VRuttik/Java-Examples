package first;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class TextPane {

    public static void main(String[] args) throws BadLocationException {
    	
        JFrame frame = new JFrame("Text Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = frame.getContentPane();
        JTextPane pane = new JTextPane();
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true);

        pane.setCharacterAttributes(attributeSet, true);
        pane.setText("Welcome");

        attributeSet = new SimpleAttributeSet();
        StyleConstants.setItalic(attributeSet, true);
        StyleConstants.setForeground(attributeSet, Color.red);

        Document doc = pane.getStyledDocument();
        doc.insertString(doc.getLength(), "To Java", attributeSet);

        attributeSet = new SimpleAttributeSet();
        StyleConstants.setForeground(attributeSet, Color.blue);
        doc.insertString(doc.getLength(), " World", attributeSet);

        JScrollPane scrollpane = new JScrollPane(pane);
        cp.add(scrollpane, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
