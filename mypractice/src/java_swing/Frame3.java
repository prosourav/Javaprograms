package java_swing;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Frame3 extends JFrame {
	private ImageIcon icon;
	private Container c;
	
	Frame3(){
		initComponents();
	}
		
public void initComponents() {
	c=this.getContentPane();
	c.setBackground(Color.LIGHT_GRAY);
	icon = new ImageIcon(getClass().getResource("image.png"));
	this.setIconImage(icon.getImage());
}
	
	
	public static void main (String args[]) {
		Frame3 frame = new Frame3();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setBounds(400,100 ,600, 500);
		 frame.setTitle("This is title");
		 frame.setResizable(false);
		
	  }
	}