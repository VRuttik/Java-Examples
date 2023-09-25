package first;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane; // Added to enable scrolling

public class EditorPane {

    JFrame myFrame = null; // Fixed variable name and initialized as null

    public static void main(String[] args) {
        // Create an instance of EditorPane and call the test method
        EditorPane editor = new EditorPane();
        editor.test();
    }

    private void test() {
        myFrame = new JFrame("EditorPane Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400, 200);

        // Create a JEditorPane and set its content type and text
        JEditorPane myPane = new JEditorPane();
        myPane.setContentType("text/plain");
        myPane.setText("Sleeping is necessary for a healthy body. " +
                "But sleeping at unnecessary times may spoil our health, wealth, and studies. " +
                "Doctors advise that sleeping at improper timing may lead to obesity during the student's days.");

        // Wrap the JEditorPane in a JScrollPane for scrolling
        JScrollPane scrollPane = new JScrollPane(myPane);
        myFrame.setContentPane(scrollPane); // Set the content pane to the JScrollPane
        myFrame.setVisible(true);
    }
}
