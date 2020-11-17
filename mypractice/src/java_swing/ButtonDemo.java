package java_swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
public class ButtonDemo extends JFrame {
	private Container c;
	private JButton btn1,btn2;
	private Font f;
	private Cursor r;
	ButtonDemo(){
		initComponents();
	}
	public void initComponents(){
	
   c=this.getContentPane();
   c.setLayout(null);
   c.setBackground(Color.BLUE);
   r = new Cursor(Cursor.HAND_CURSOR) ;
   f = new Font("Arial",Font.BOLD,18);
   
   btn1 = new JButton("Submit");
   btn1.setForeground(Color.magenta);
   btn1.setBackground(Color.gray); 
   btn1.setCursor(r);
   btn1.setBounds(100,50,100,40);
   btn1.setFont(f);
   c.add(btn1);
   
   btn2 = new JButton("clear");
   btn2.setBounds(220,50,100,40);
   btn2.setForeground(Color.magenta);
   btn2.setBackground(Color.gray);
   btn2.setCursor(r);
   btn2.setFont(f);
   c.add(btn2);
	}
	
 public static void main(String args[]) {
	    ButtonDemo frame = new ButtonDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,50,500,400);
		frame.setTitle("Button Demo");
 }
}
