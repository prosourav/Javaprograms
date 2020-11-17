package java_swing;
import javax.swing.JOptionPane;
public class InputmessageDialog {
public static void main(String args[]) {
// String name1 = JOptionPane.showInputDialog("Please Enter Your Name: ");
// JOptionPane.showMessageDialog(null,name1+" Welcome to real java");
 
 String f_name=JOptionPane.showInputDialog(null,"Enter your first name","This is title",JOptionPane.QUESTION_MESSAGE);
 String S_name=JOptionPane.showInputDialog(null,"Enter your Second name","This is title",JOptionPane.QUESTION_MESSAGE);
 String name=f_name+" "+S_name;
 JOptionPane.showMessageDialog(null,"Your full name is: "+ name);
}
}
