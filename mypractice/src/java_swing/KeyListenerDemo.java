package java_swing;

/*import java.awt.*;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyListenerDemo extends JFrame {
	private Container c;
	private JTextField tf;
	private JTextArea ta;

	KeyListenerDemo(){
		initComponents();
	}

public void initComponents() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setBounds(100,50,500,500);
	this.setTitle("Key Listener Demo");
	
	c = this.getContentPane();
	c.setLayout(null);
	
	tf = new JTextField();
	tf.setBounds(50,50,150,50);
	c.add(tf);
	
	ta = new JTextArea();
	ta.setBounds(50,110,150,300);
	ta.setBackground(Color.GRAY);
	c.add(ta);
	
	  tf.addKeyListener(new KeyListenerDemo(){
		
		public void keyTyped(KeyEvent ke) { 
			ta.append("Key typed: "+ke.getKeyChar()+"\n");
		}
		public void keyPressd(KeyEvent ke) { 
			ta.append("Key pressed: "+ke.getKeyChar()+"\n");
		}
		public void keyReleased(KeyEvent ke) {
			ta.append("Key released: "+ke.getKeyChar()+"\n");
		}
	  });
}

public static void main(String args[]) {
	KeyListenerDemo frame = new KeyListenerDemo();
	frame.setVisible(true); 
	
}
}*/