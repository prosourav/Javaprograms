package java_swing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NewFrame extends JFrame{
	private Container c;
	private JLabel label;
	NewFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(420,50,400,400);
        this.setTitle("New Frame");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);
       
        
        label = new JLabel("Hello everyOne");
        label.setBounds(50,50,350,250);
        c.add(label);
	}
	
	
public static void main(String args[]) {
	
	NewFrame frame = new NewFrame();
	frame.setVisible(true);
		
	
}
}
