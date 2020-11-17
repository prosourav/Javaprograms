package myproject;

import java.util.Scanner;

public class Array_2 {

	public static void main(String args[]) {
	int a[]	= new int[5];
	int j,l=0,v=0;
Scanner in = new Scanner(System.in);
	System.out.println("Enter size of the array: ")	;
	int size=in.nextInt();
	System.out.println("Enter value for the array:");
	for(int i=0;i<size;i++) {
		System.out.println("Enter value for index: "+i);
		a[i]=in.nextInt();	
	}
	System.out.println("Enter the number you are looking for: ");
	j=in.nextInt();
	for(int i=0;i<size;i++) {
		v++;
		if(j==a[i]) {
			l++;
			break;
		}}
		if(l>0) {
			System.out.println("Number is found at: "+v);
		}
		else {
			System.out.println("Number is not found");
		}
		
	}
}