package java_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Listner_differentM2 extends JFrame implements ActionListener{
private Container c;
private JButton redButton,blueButton,greenButton;
	
Listner_differentM2(){
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
	
	redButton.addActionListener(this);
	blueButton.addActionListener(this);
	greenButton.addActionListener(this);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==redButton) {
		c.setBackground(Color.red);
	}
	else if(e.getSource()==blueButton) {
		c.setBackground(Color.blue);
	}
	else if(e.getSource()==greenButton){
		c.setBackground(Color.green);
	}	
	}
public static void main(String args[]) {
	Listner_differentM2 frame = new Listner_differentM2 ();
	frame.setVisible(true);
	
	
}


}
