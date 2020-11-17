package java_swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
public class Label_demo extends JFrame {
	private Container c;
	private JLabel userLabel,userLabel2;
	//private Font f;
	
	Label_demo(){
		initComponents();
	}
	public void initComponents() {
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		Font f = new Font("Arial",Font.BOLD,14); 
		
		userLabel = new JLabel();
		userLabel.setText("Enter your user name: ");
		userLabel.setBounds(50,20,250,50);
		userLabel.setFont(f);
		userLabel.setForeground(Color.RED);
		userLabel.setOpaque(true);
		userLabel.setBackground(Color.orange);
		userLabel.setToolTipText("This is a tooltiptext");
		c.add(userLabel);
		
		String s = userLabel.getToolTipText();
		System.out.println(" "+s);
		
		userLabel2 = new JLabel("Enter your password:");
		userLabel2.setBounds(50,70,150,50);
		userLabel2.setFont(f);
		c.add(userLabel2);
	}
	
	public static void main(String args[]) {
		 Label_demo frame = new Label_demo();	
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setBounds(200,40,400,300);
		 frame.setTitle("Label Demo");
		 
	}

}
