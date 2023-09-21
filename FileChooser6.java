package first;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class FileChooser6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFileChooser jf = new JFileChooser("C:\\Users", FileSystemView.getFileSystemView());
		jf.showSaveDialog(null);

	}

}
