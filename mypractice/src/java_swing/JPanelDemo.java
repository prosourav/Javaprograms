package java_swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelDemo extends JFrame{
	private Container c;
	private JPanel panel1,panel2;
	private JButton b1,b2,b3;
	private JLabel label;
	JPanelDemo(){
		initcomponents();
	}
	
public void initcomponents(){
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setBounds(100,100,650,500);
	this.setTitle("Key Listener Demo");
	this.setTitle("frame Demo");	
	
	c = this.getContentPane();
	c.setLayout(null);
	
	label = new JLabel("Creating two JLabel");
	label.setBounds(30,20,200,50);
	c.add(label);
	
	b1 = new JButton("1");
	b2 = new JButton("2");
	b3 = new JButton("3");
	
	panel1 = new JPanel();
	panel1.setBounds(100,100,200,300);
	panel1.setBackground(Color.green);	
	c.add(panel1);
	panel1.add(b1);
	

	panel2 = new JPanel();
	panel2.setBounds(350,100,200,300);
	panel2.setBackground(Color.gray);	
	c.add(panel2);
	panel2.add(b2);
	}
	
	
	
 public static void main(String args[]) {
	 JPanelDemo frame = new  JPanelDemo();
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setBounds(100,50,500,400);
 }
}
