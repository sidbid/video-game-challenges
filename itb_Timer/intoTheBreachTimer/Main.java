package intoTheBreachTimer;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Robot;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main {
	
	static long time;
	
	public static void main (String[] args) {
		assert true;
		System.out.println("Main running");
		try {
			Robot robot = new Robot();
			robot.mouseMove(100, 1000);
			Color c = robot.getPixelColor(100, 1000);
			System.out.println(c.toString());
			
			JFrame f = new JFrame("FRAMED");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JTextArea text = new JTextArea();
			text.setText("hsdlfhlsdj");
			f.getContentPane().add(text, BorderLayout.CENTER);
			f.pack();
			f.setVisible(true);
			f.setAlwaysOnTop(true);
			while (f.isActive()) {
				loop(text);
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static void loop (JTextArea text) {
		time++;
		text.setText("Time: " + time);
	}

}
