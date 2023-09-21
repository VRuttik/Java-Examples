package first;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class FileChooser3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFileChooser jf = new JFileChooser("C", FileSystemView.getFileSystemView());
		jf.showSaveDialog(null);
	}

}
