package java_swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaDemo extends JFrame{
	private Container c;
	private JTextArea t;
	private Font f;
	private JScrollPane s;
	TextAreaDemo(){
		initComponents();
	}
	public void initComponents() {
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.green);
		
		f = new Font("Arial",Font.BOLD,18);
		
		t = new JTextArea();
		t.setBounds(50,50,300,200);
		t.setFont(f);
		t.setForeground(Color.lightGray);
		t.setBackground(Color.BLUE);
		t.setLineWrap(true);
		t.setWrapStyleWord(true);
		c.add(t);
		s = new JScrollPane(t);
		s.setBounds(50,50,300,200);
		c.add(s);
		
	}
public static void main(String args[]) {
	TextAreaDemo frame = new TextAreaDemo();
	frame.setVisible(true);
	frame.setBounds(100,50,500,400);
	frame.setTitle("TextArea Demo");
	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
