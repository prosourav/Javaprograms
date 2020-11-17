package myproject;
import java.util.Scanner;
public class Exit_function {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int j=1,i;
		while(j<10) {
		System.out.println("Enter a value: ");
		i=input.nextInt();
		if(i==0)
		System.exit(0);	
		j++;
		}}
	}
