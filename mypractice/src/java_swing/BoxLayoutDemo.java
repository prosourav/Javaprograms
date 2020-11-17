package java_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo extends JFrame{
	private Container c;
	private JButton buttons[];
	private BoxLayout box;
	
	BoxLayoutDemo(){
		initcomponents();
	}
	public void initcomponents() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("FlowLayouts");
		
		c = this.getContentPane();
		box = new BoxLayout(c,BoxLayout.X_AXIS);
		c.setLayout(box);
		c.setBackground(Color.lightGray);
		
		buttons= new JButton[9];
		
		for(int i=0;i<9;i++) {
			buttons[i]=new JButton(""+(i+1));
			c.add(buttons[i]);
			c.add(Box.createHorizontalStrut(10));
		}
	}
	
	
	public static void main(String args[]) {
		
		BoxLayoutDemo frame = new BoxLayoutDemo();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setBounds(100,50,500,400);
	}
}
