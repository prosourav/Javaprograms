package java_swing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ActionDemo3 extends JFrame {
	private Container c;
	private JTextField tf;
	private JButton bt;
	ActionDemo3(){
		c =this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.gray);
		tf = new JTextField();
		tf.setBounds(50,50,150,50);
		c.add(tf);
		bt = new JButton("Clear");
		bt.setBounds(50,110,80,50);
		c.add(bt);
		
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
			}
		});
	}
	
	
  public static void main(String args[]) {
	  ActionDemo3 frame = new ActionDemo3();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,50,500,400);
		frame.setTitle("Button ActionListener");
}
  }

