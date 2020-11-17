package myproject;
import java.util.Scanner;
public class Capital_Small {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);	
  System.out.println("Enter a letter: ");
char a=input.next().charAt(0);
if(a>'A' && a<'Z') {
	System.out.println("This is a capital letter.");
}
else if(a>'a' && a<'z') {
	System.out.println("This is a small lettet.");
}
else {
	System.out.println("You did something wrong");
}
}
}
