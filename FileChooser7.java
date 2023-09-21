package first;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class FileChooser7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\VRuttik\\");
		JFileChooser jf = new JFileChooser(f, FileSystemView.getFileSystemView());
		jf.showSaveDialog(null);

	}
