package java_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Checkbox extends JFrame{
	private Container c;
	private JCheckBox java,python,sql;
	private ButtonGroup bg;
	private Font f;
	private JLabel label;
	
	
	
	
	
	 Checkbox(){
		 initcomponents();
	 }
	 
	 public void initcomponents() {
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 this.setBounds(200,100,500,400);
		 this.setTitle("Checkbox Demo");
		 
		 c = this.getContentPane();
		 c.setLayout(null);
		 c.setBackground(Color.LIGHT_GRAY);
		 f = new Font("Arial",Font.BOLD,16);
		 
		 java = new JCheckBox("Java",true );
		 java.setBounds(50,10,100,30);
		 java.setBackground(Color.CYAN);
	//	 java.setSelected(true);
		 java.setFont(f);
		 c.add(java);
		 
		 python = new JCheckBox("Python");
		 python.setBounds(50,60,100,30);
		 python.setBackground(Color.CYAN);
		 python.setFont(f);
		 c.add(python);
		 
		 sql = new JCheckBox("SQL");
		 sql.setBounds(50,110,100,30);
		 sql.setBackground(Color.CYAN);
		 sql.setFont(f);
		 c.add(sql);
		
		 bg = new ButtonGroup();
		 bg.add(java);
		 bg.add(python);
		 bg.add(sql);
		 
		 
		 label = new JLabel("Initial value");
		 label.setBounds(50,150,250,30);
		 label.setFont(f);
		 c.add(label);
		 
		 Handler handler = new Handler();
		 java.addActionListener(handler);
		 python.addActionListener(handler);
		 sql.addActionListener(handler);
		 
	 }
	 class Handler implements ActionListener{
     	@Override
		public void actionPerformed(ActionEvent e) {
			
			if(java.isSelected()) {
				label.setText("You have selected java");
			}
			else if(python.isSelected()) {
				label.setText("You have selected python");
			}
			else {
				label.setText("You have selected sql");
			}
		}
		 
		 
	 }
public static void main(String args[]) {
	Checkbox frame = new Checkbox(); 
	frame.setVisible(true);
}
}
