package java_swing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowDemo extends JFrame implements ActionListener{
	private Container c;
	private JButton Previousbuttons,Nextbuttons;
	private JPanel panel;
	private ImageIcon icon;
	private JLabel label;
	private CardLayout card;
	 SlideShowDemo(){
		 initcomponents();
		 showimage();
	 }
	 public void showimage() {
		 String[] imagename = {"13.png","19.jpg"};
		 for(String n:imagename) {
		 icon = new ImageIcon("src/pic/"+n);
		 Image img = icon.getImage();
		 Image newImage = img.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
		 icon = new ImageIcon(newImage);
		 label = new JLabel(icon);
		 panel.add(label);
		 }
	 }
	 
	 
	public void  initcomponents() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,600,450);
		this.setTitle("SlideShow Demo");
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.green);
		
		card = new CardLayout();
		
		panel = new JPanel(card);
		panel.setBounds(10,10,560,380);
		c.add(panel);
		
		Previousbuttons = new JButton("Previous");
		Previousbuttons.setBounds(10,400,100,50);
		c.add(Previousbuttons);
		
		Nextbuttons = new JButton("Next");
		Nextbuttons.setBounds(450,400,100,50);
		c.add(Nextbuttons);
		
		Nextbuttons.addActionListener(this);
		Previousbuttons.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
	if(e.getSource() ==	Nextbuttons) {
	card.next(panel);
	}
	if(e.getSource() ==	Previousbuttons) {
		card.previous(panel);
	}
	}
	
 public static void main(String args[]) {
	 SlideShowDemo frame = new  SlideShowDemo();
	 frame.setVisible(true);
 }

}
