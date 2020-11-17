package java_swing;
import javax.swing.JFrame;
public class Frame2 extends JFrame {
	Frame2(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50,100,400,500);
		setTitle("This is title");
		
	}
public static void main(String args[]) {
	Frame2 f = new Frame2();
	f.setVisible(true);
}
}
