package java_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {
	private Container c;
	private JButton buttons[];
	private  FlowLayout flayout;
	
	FlowLayoutDemo(){
		initComponents();
	}
	public void initComponents() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("FlowLayouts");
		
		c = this.getContentPane();
		flayout = new FlowLayout();
		flayout.setHgap(10);
		flayout.setVgap(5);
		c.setLayout(flayout);
		c.setBackground(Color.lightGray);
		
		buttons= new JButton[9];
		
		for(int i=0;i<9;i++) {
			buttons[i]=new JButton(""+(i+1));
			c.add(buttons[i]);
		}
	}
	
	
	
	public static void main(String args[]) {
		
	FlowLayoutDemo frame = new FlowLayoutDemo();
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// frame.setBounds(100,50,500,400);
}
}