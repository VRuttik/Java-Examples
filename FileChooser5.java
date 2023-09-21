package first;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class FileChooser5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        JFileChooser jf = new JFileChooser("C:\\Users\\VRuttik\\TY"); // Use double backslashes in the path
        jf.showSaveDialog(null);

    }
}
