package java_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JcomboBox extends JFrame {
	
	private Container c;
	private JComboBox jc;
	private JLabel l;
	private JButton b;
	private String[] languege = {"c","c++","java","js","python"};
	 JcomboBox(){
		 initComponents();
	 }
	
	public void initComponents() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)	;
	this.setBounds(100,100,500,500);
	this.setTitle("ComboBox Demo");
	
	c = this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.cyan);
	
	jc = new JComboBox(languege);
	jc.setBounds(50,150,100,50);
	jc.setEditable(true);
	c.add(jc);
	
	b = new JButton("select");
	b.setBounds(50,250,80,50);
	c.add(b);
	
	//jc.setSelectedIndex(3);
	jc.setSelectedItem("java");
	jc.addItem("golang");
	//jc.removeItem("c");
	
	l = new JLabel();
	l.setBounds(160,150,200,50);
	c.add(l);
	
	b.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String s = jc.getSelectedItem().toString();
			l.setText("You have selected: "+s);
		}
		
	});
	
	}
	
 public static void main (String args[]) {
	 JcomboBox frame = new JcomboBox();
	 frame.setVisible(true);
 }
}
