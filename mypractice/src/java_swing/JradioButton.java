package java_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class JradioButton extends JFrame{
	private Container c;
	private JRadioButton male,female;
	private ButtonGroup grp;
	private Font f;
	private JTextArea ta;
	JradioButton(){
		initcomponents();
	}
	public void initcomponents() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100,50,400,400);
		this.setTitle("RadioButtonDemo");
		
		f = new Font("Arial",Font.BOLD,18);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.yellow);
		
		male = new JRadioButton("male");
		male.setBounds(50,50,100,50);
		male.setBackground(Color.cyan);
		male.setSelected(true);
		male.setFont(f);
		c.add(male);
		
		female = new JRadioButton("female");
		female.setBounds(160,50,100,50);
		female.setBackground(Color.blue);
		//to disable a button
		//female.setEnabled(false);
		female.setFont(f);
		c.add(female);
		
		grp = new ButtonGroup();
		grp.add(male);
		grp.add(female);
		
		ta = new JTextArea();
		ta.setBounds(20,110,300,200);
		ta.setFont(f);
		c.add(ta);
		
		Handeler handeler = new Handeler();
		male.addActionListener(handeler);
		female.addActionListener(handeler);
		
	}
	class Handeler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(male.isSelected()) {
				ta.append("You have selected male\n");
			}
			else {
				ta.append("You have selected female\n");
			}
		};
	}
public static void main(String ags[]) {
	JradioButton button = new JradioButton();
	button.setVisible(true);
}
}
