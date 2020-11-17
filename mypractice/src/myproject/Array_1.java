package myproject;
import java.util.Scanner;
public class Array_1 {
public static void main(String args[]) {
Scanner input =new Scanner(System.in);
int arr[]=new int[10];
System.out.println("Enter array size: ");
int size=input.nextInt();
for(int i=0;i<size;i++) {
	System.out.println("Give values for index: "+i);
 arr[i]=input.nextInt();
}
for(int i=0;i<size;i++) {
	System.out.print(arr[i]+"\t");
}
}
}