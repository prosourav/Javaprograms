package java_swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
public class TextfieldDemo extends JFrame {
	private Container c;
	private JTextField tf1,tf2;
	TextfieldDemo(){
		initComponent();
	}
	public void initComponent() {
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GREEN);
		
	    Font f=new Font("Arial",Font.ITALIC + Font.BOLD,18);
	    
		tf1 = new JTextField();
		tf1.setBounds(50,50,200,50);
		tf1.setFont(f);
		tf1.setForeground(Color.green);
		tf1.setBackground(Color.BLUE);
		c.add(tf1);
		
		tf2 = new JTextField("sourav");
		tf2.setBounds(50,110,200,50);
		tf2.setFont(f);
		tf2.setForeground(Color.LIGHT_GRAY);
		tf2.setBackground(Color.BLUE);
		c.add(tf2);
	}
	
	
	
	public static void main(String args[]) {
		TextfieldDemo frame = new TextfieldDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,50, 500, 400);
		frame.setTitle("JTextField Demo");
	}

}
