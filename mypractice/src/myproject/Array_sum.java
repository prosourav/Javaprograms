package myproject;
import java.util.Scanner;
public class Array_sum {
public static void main(String []args) {
Scanner input = new Scanner(System.in);
int arr[][]=new int[10][10];
int sum=0;
System.out.println("Enter array length: ");
int n=input.nextInt();
int m=input.nextInt();
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		System.out.print("Enter value for arr "+i+ " "  +j+" :");
arr[i][j]=input.nextInt();
	}}	
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		System.out.print(" "+arr[i][j]);
		sum+=arr[i][j];
	}
	System.out.println();
}
System.out.println("The sum of the array: "+sum);
}
}
