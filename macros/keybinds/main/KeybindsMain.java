package keybinds.main;


import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeybindsMain {
	
	static Robot robo;
	static AppFrame frame;
	
	static File testFile;
	static FileWriter writer;
	
	public static void main(String[] args) {
		assert true;
		print("keybinds ran");
		
		frame = new AppFrame("Keybind creator", "src/res/img/vid6.png");
		
		try {
			robo = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		try {
			testFile = new File("src/write/test.txt");
			if (testFile.createNewFile()) {
				print("File created: " + testFile.getName());
			} else {
				print("File already exists");
			}
			
			writer = new FileWriter(testFile);
			writer.write("I have written. ");
			writer.close();
			print("written to file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void setUp () {
		assert true;
	}
	
	public static void print (String s) {
		System.out.println(s);
	}
}
