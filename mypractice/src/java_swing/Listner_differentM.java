package java_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Listner_differentM extends JFrame {
private Container c;
private JButton redButton,blueButton,greenButton;
	
Listner_differentM(){
	initComponents();
}
	
	public void initComponents() {
		
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Listener Demo");
	this.setBounds(100,100,600,500);
	
	c = this.getContentPane();
	c.setLayout(null);
	
	redButton = new JButton("Red");
	redButton.setBounds(50,50,100,50);
	c.add(redButton);
	
	blueButton = new JButton("Blue");
	blueButton.setBounds(50,150,100,50);
	c.add(blueButton);
	
	greenButton = new JButton("Green");
	greenButton.setBounds(50,250,100,50);
	c.add(greenButton);
	
	redButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			c.setBackground(Color.red);
		}
	});
	blueButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			c.setBackground(Color.blue);
		}
	});
	greenButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			c.setBackground(Color.green);
		}
	});
}
public static void main(String args[]) {
	Listner_differentM frame = new Listner_differentM ();
	frame.setVisible(true);
	
	
}
}
