package myproject;
import java.util.Scanner;
public class Largest_num {
public static void main(String args[]) {
Scanner input=new Scanner(System.in);	
	System.out.println("Enter three numbers: ");
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	if(a>b && a>c) {
		System.out.println("A is the bigest number");
	}
	if(b>a && b>c) {
		System.out.println("B is the bigest number");
	}
	else {
		System.out.println("C is the bigest number");
	}
}
}
