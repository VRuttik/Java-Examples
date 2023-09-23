package first;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class ToggleButton extends JFrame implements ItemListener {

    private JToggleButton button;

    public static void main(String[] args) {
        new ToggleButton();
    }

    ToggleButton() {
        setTitle("Toggle Button Example");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setJToggleButton() {
        button = new JToggleButton("ON");
        add(button);
    }

    private void setAction() {
        button.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent eve) {
        if (eve.getStateChange() == ItemEvent.SELECTED) {
            button.setText("OFF");
        } else {
            button.setText("ON");
        }
    }
}
