package java_swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame{
	private Container c;
	private JButton b1,b2,b3,b4,b5;
	private  BorderLayout b;
	BorderLayoutDemo(){
		initcomponenets();
	}
	
	public void initcomponenets() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("BorderLayouts");
		
		c = this.getContentPane();
		b = new BorderLayout(10,5);
		c.setLayout(b);
		
		b1 = new JButton ("1");
		b2 = new JButton ("2");
		b3 = new JButton ("3");
		b4 = new JButton ("4");
		b5 = new JButton ("5");
		
		c.add(b1,BorderLayout.NORTH);
		c.add(b2,BorderLayout.WEST);
		c.add(b3,BorderLayout.SOUTH);
		c.add(b4,BorderLayout.EAST);
		c.add(b5,BorderLayout.CENTER);
	}
	
	
	
 public static void main(String args[]) {
	 BorderLayoutDemo frame = new BorderLayoutDemo();
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setBounds(100,50,500,400);
	 
 }
}
