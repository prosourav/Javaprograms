package java_swing;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Practical extends JFrame {
	private Container c;
	private JLabel imgLabel,textLabel;
	private JTextArea ta;
	private JTextField tf;
	private JButton clearButton;
	private ImageIcon img;
	private Font f;
	private Cursor cursor;
	
	Practical(){
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.yellow);
		
  img = new ImageIcon(getClass().getResource("table.jpg"));
  f = new Font("Tahoma",Font.BOLD,20);
  
  imgLabel = new JLabel(img);
  imgLabel.setBounds(20,10,img.getIconWidth(),img.getIconHeight());
  c.add(imgLabel);
  
  textLabel = new JLabel("Enter any number: ");
  textLabel.setBounds(20,400,550, 400);
  textLabel.setForeground(Color.BLACK);
  textLabel.setFont(f);
  c.add(textLabel);
  //TextField
  tf = new JTextField();
  tf.setBounds(230,570,100,70);
  tf.setFont(f);
  tf.setHorizontalAlignment(JTextField.CENTER);
  tf.setBackground(Color.WHITE);
  c.add(tf);
  cursor = new Cursor(Cursor.HAND_CURSOR);
  
  clearButton = new JButton("clear");
  clearButton.setBounds(230,660,90,70);
  clearButton.setCursor(cursor);
  clearButton.setBackground(Color.red);
  clearButton.setFont(f);
  c.add(clearButton);
  
  ta = new JTextArea();
  ta.setBounds(600,20,300,400);
  ta.setFont(f);
  ta.setBackground(Color.orange);
  c.add(ta);
  
  tf.addActionListener(new ActionListener(){
	  public void actionPerformed(ActionEvent e)
	  { 
		  String value = tf.getText();
		  System.out.println(value);
		  if(value.isEmpty()) {
			  JOptionPane.showMessageDialog(null,"Enter number");
		  }
		  else {
			  ta.setText("");
			  int num=Integer.parseInt(tf.getText());
			  for(int i=1;i<=10;i++) {
				  int result=i*num;
				  
				  String res = String.valueOf(result);
				  String n = String.valueOf(num);
				  String loop =String.valueOf(i);
				  
				  ta.append(n+" x " +loop+ " = "+ res +"\n");
			  }  
		  }
		 
	  }
  });
  clearButton.addActionListener(new ActionListener(){
	  public void actionPerformed(ActionEvent e) {
		  ta.setText(" ");
	  }
  });
	}
public static void main(String args[]) {
	Practical frame = new Practical();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(200,50,1200,2200);
	frame.setTitle("Multiplication Table");
}
}
