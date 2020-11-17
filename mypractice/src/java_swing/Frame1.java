package java_swing;
import javax.swing.JFrame;
public class Frame1 {
public static void main(String args[]) {
	
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//frame.setSize(600,500);
	//frame.setLocation(400,100);
	frame.setBounds(400,100,600,500);
	frame.setTitle("Frame Demo");
	frame.setResizable(false);
}
}