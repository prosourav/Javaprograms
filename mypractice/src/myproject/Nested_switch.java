package myproject;
import java.util.Scanner;
public class Nested_switch {
public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your class: ");
	int cls=input.nextInt();
	System.out.println("Enter your section: ");
	char sec=input.next().charAt(0);
  switch(cls) {
 case 1: 
  switch(sec) {
    case 'A':System.out.println("Math,stat,English"); break;
    case 'B':System.out.println("Math,Ecomics,English"); break;
	default: System.exit(0);
    }break;
 case 2: 
  switch(sec) {
	case 'A':System.out.println("chemistry,Biology,French"); break;
	case 'B':System.out.println("Math,Physics,Accountency"); break;
	default: System.exit(0);
	 }break;
 case 3: 
  switch(sec) {
	case 'A':System.out.println("Math,pharmalogy,English"); break;
	case 'B':System.out.println("E.C.S,Ecomics,German"); break;
	default: System.exit(0);
	 }
	}
 
}}

