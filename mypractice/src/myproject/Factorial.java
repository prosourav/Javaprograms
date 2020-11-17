package myproject;
import java.util.Scanner;
public class Factorial {
	 static int facto(int x) {
		if(x==1) 
	return x;
		else
	return x * facto(x-1);
}

public static void main(String []args) {
	Scanner input=new Scanner(System.in);
System.out.println("Enter the number you want to see factorail of: ");
int a=input.nextInt();
int b=facto(a);
System.out.println(b);	
}}