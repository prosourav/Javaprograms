package myproject;
import java.util.Scanner;
public class Array_rev {
public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	int arr[]= {5,7,2,8,1,4};
	System.out.println("Before reverse:");
for(int i=0;i<6;i++) {
	System.out.print(" "+arr[i]);
}
System.out.println("\nAfter reverse:");
for(int i=5;i>=0;i--) {
	System.out.print(" "+arr[i]);
}
}
}