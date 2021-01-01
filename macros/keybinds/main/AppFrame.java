package keybinds.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class AppFrame extends JFrame {
	
	JPanel panel;
	BufferedImage img;
	ImageIcon ic;
	JMenuBar menu;
	
	JButton add, del, left, right, confirm, cancel, key, keyPress, mouseClick, delay, mouseMove;
	public static final Dimension MENU_DIM = new Dimension(50, 27);
	public static final Dimension BODY_DIM = new Dimension(100, 50);
	public static final String[] MENU_NAMES = {"new", "del", "<", ">"};
	public static final String[] MENU_TT = {"Create a new macro", "Delete the current macro", "Previous macro", "Next Macro"};
	public static final String[] BODY_NAMES = {"Confirm", "Cancel", "Key Press", "Key Hold", "Mouse Click", "Mouse Move", "Delay"};
	
	public AppFrame (String title, String imgPath) {
		super(title);
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(200, 200));
		panel.setAlignmentY(CENTER_ALIGNMENT);
		this.add(panel);
		
		try {
			img = ImageIO.read(new File(imgPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ic = new ImageIcon(img);
		this.setIconImage(ic.getImage());
		
		menu = new JMenuBar();
		menu.setOpaque(true);
		menu.setBackground(new Color(100, 20, 20));
		menu.setPreferredSize(new Dimension(200, 30));
		this.setJMenuBar(menu);
		
		setUpButtons(new JButton[]{add, del, left, right}, menu);
		setUpButtons(new JButton[] {confirm, cancel, key, keyPress, mouseClick, mouseMove, delay}, panel);
		
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		
	}
	
	public static void setUpButtons (JButton[] b, JMenuBar m) {
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton(MENU_NAMES[i]);
			b[i].setPreferredSize(MENU_DIM);
			b[i].setToolTipText(MENU_TT[i]);
			m.add(b[i]);
		}
	}
	
	public static void setUpButtons (JButton[] b, JPanel p) {
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton(BODY_NAMES[i]);
			b[i].setPreferredSize(BODY_DIM);
			p.add(b[i]);
		}
	}
	
}
