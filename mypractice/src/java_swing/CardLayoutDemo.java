package java_swing;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo extends JFrame implements ActionListener{
	private Container c;
	private JButton buttons1,buttons2;
	private CardLayout cl;
	
	CardLayoutDemo(){
		initcomponents();
	}
	public void initcomponents(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,400,400);
		this.setTitle("CardLayout Demo");
		
		c = this.getContentPane();
		cl = new CardLayout(10,10);
		c.setLayout(cl);
		
		buttons1 = new JButton("1");
		buttons2 = new JButton("2");
		
		c.add(buttons1,"first");
		c.add(buttons2,"Second");
		
		buttons1.addActionListener(this);
		buttons2.addActionListener(this);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			cl.next(c);
			//c1.show(c,"Second");
			//c1.first(c);
			//c1.last(c);
		}
	
	
public static void main(String args[]) {
		
	CardLayoutDemo frame = new  CardLayoutDemo();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setBounds(100,50,500,400);
	}

}
