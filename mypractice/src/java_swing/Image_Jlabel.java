package java_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image_Jlabel extends JFrame {
	private Container c;
	private JLabel imgLabel;
	private ImageIcon img;
	
	Image_Jlabel()
	{
		initComponents();
	}
	
	public void initComponents() {
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.pink);
		
		img = new ImageIcon(getClass().getResource("image.png"));
		imgLabel = new JLabel(img);
		imgLabel.setBounds(50, 30, img.getIconWidth(), img.getIconHeight());
		c.add(imgLabel);
	}
	
	public static void main(String args[]) {
		 Image_Jlabel frame = new  Image_Jlabel();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setBounds(200,50,500,400);
	}

}
