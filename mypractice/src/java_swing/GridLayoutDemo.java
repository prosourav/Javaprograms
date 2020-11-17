package java_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame{
	private Container c;
	private JButton buttons[];
	private GridLayout g1;
	
	GridLayoutDemo(){
		initcomponents();
	}
	public void initcomponents(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,400,400);
		this.setTitle("FlowLayouts");
		
		c = this.getContentPane();
		g1 = new GridLayout(3,3);
		c.setLayout(g1);
		c.setBackground(Color.lightGray);
		
		buttons= new JButton[9];
		
		for(int i=0;i<9;i++) {
			buttons[i]=new JButton(""+(i+1));
			c.add(buttons[i]);
			//c.add(Box.createHorizontalStrut(10));
		}
	}
	
	
public static void main(String args[]) {
		
	 GridLayoutDemo frame = new  GridLayoutDemo();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setBounds(100,50,500,400);
	}
}
