package java_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
	private JLabel userLabel,passLabel;
	private JTextField tf;
	private JPasswordField pf;
	private JButton loginButton,clearButton;
	private Container c;
	private Font f;
	LoginFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//(JFrame.DISPOSE_ON_CLOSE
		this.setBounds(100,50,420,350);
		this.setTitle("Login Demo");
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);
		
		f = new Font("Arial",Font.BOLD,16);
		
		userLabel = new JLabel("Username:");
		userLabel.setBounds(50,50,150,50);
		userLabel.setFont(f);
		c.add(userLabel);
		
		tf = new JTextField();
		tf.setFont(f);
		tf.setBounds(170,50,200,50);
		c.add(tf);
		
		passLabel = new JLabel("Password:");
		passLabel.setBounds(50,120,150,50);
		passLabel.setFont(f);
		c.add(passLabel);
		
		pf = new JPasswordField();
		pf.setFont(f);
		pf.setBounds(170,120,200,50);
		c.add(pf);
		
		
		loginButton = new JButton("Login");
		loginButton.setBounds(170,190,90,50);	
		loginButton.setFont(f);
		c.add(loginButton);
		
		clearButton = new JButton("Clear");
		clearButton.setBounds(280,190,100,50);	
		clearButton.setFont(f);
		c.add(clearButton);
		
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String userName = tf.getText();
				String password = pf.getText();
				if(userName.equals("sourav") && password.equals("123")) {
					JOptionPane.showMessageDialog(null,"You have succsessfully loged in");
					dispose();
					NewFrame frame = new NewFrame();
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid username or password");
				}
			}
		
		});
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				pf.setText("");
				
			}
		
		});
	}
	public static void main(String args[]) {
	LoginFrame frame = new LoginFrame();
	frame.setVisible(true);
}
}