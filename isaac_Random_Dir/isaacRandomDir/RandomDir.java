package isaacRandomDir;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class RandomDir {
	
	static Random rand;
	static JFrame frame;
	static JPanel panel;
	static Timer timer;
	static JTextField tf;
	static JLabel l;
	static JButton b;
	static Robot robot;
	
	static int newDelay;
	static int delaySecs;
	static int currPress;
	static boolean isPaused;
	public static final int DEF_DELAY = 2;
	static final int[] ARROWS = {KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT, KeyEvent.VK_UP, KeyEvent.VK_DOWN};
	
	static URL url;
	static Toolkit kit;
	static Image img;
	
	public static void main (String[] args) {
		assert true;
		delaySecs = DEF_DELAY;
		currPress = 0;
		isPaused = false;
		
		rand = new Random();
		frame = new JFrame("Isaac Random Dir");
		
		panel = new JPanel();
		frame.add(panel);
		
		tf = new JTextField(delaySecs);
		tf.setVisible(true);
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				delaySecs = Integer.parseInt(tf.getText());
				updateStuff();
			}
		});
		//tf.setText("Direction change delay");
		
		l = new JLabel("Current delay: " + delaySecs + "    New Delay: ");
		
		b = new JButton("Pause");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonActionPerformed(e);
				
			}
		});
		
		panel.add(l);
		panel.add(tf);
		panel.add(b);
		
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		timer = new Timer(delaySecs * 1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				run();
			}
		});
		
		timer.setRepeats(true);
		timer.start();
	}
	
	public static void run () {
		assert true;
		if (!isPaused) {
			try {
				robot.keyRelease(ARROWS[currPress]);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			currPress = rand.nextInt(4);
			robot.keyPress(ARROWS[currPress]);
			System.out.println("" + currPress);
		}
	}
	
	public static void updateStuff () {
		l.setText("Current delay: " + delaySecs + "    New Delay: ");
		timer.setDelay(delaySecs * 1000);
		tf.setText("");
	}
	
	private static void buttonActionPerformed (ActionEvent evt) {
		if (isPaused) {
			b.setText("Pause");
		} else {
			b.setText("Start");
		}
		
		isPaused = !isPaused;
	}
}
