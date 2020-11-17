package java_swing;
import javax.swing.JOptionPane;
public class ShowconfirmDialog {
public static void main(String args[]) {
	int choice=JOptionPane.showConfirmDialog(null,"Do you want to quit?","Input",JOptionPane.YES_NO_OPTION);
	if(choice==JOptionPane.YES_OPTION) {
		System.exit(0);
	}
	else {
		System.out.println("You want to continue.");
	}
}
}
