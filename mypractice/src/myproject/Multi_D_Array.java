package myproject;
import java.util.Scanner;
public class Multi_D_Array {
public static void main(String args[]) {
int arr[][]=new int[3][3];	
int arr2[][]=new int[3][3];	
int arr3[][]=new int[3][3];	
Scanner input = new Scanner(System.in);
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.printf("Enter value for arr" +i+" "+j +" :");
		arr[i][j]=input.nextInt();
	}
	System.out.println();
}
System.out.println("Matrix A:");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.print(" "+arr[i][j]);
	}
	System.out.println();
}
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.printf("Enter value for arr" +i+" "+j +" :");
		arr2[i][j]=input.nextInt();
	}
	System.out.println();
}
System.out.println("Matrix B:");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.print(" "+arr2[i][j]);
	}
	System.out.println();
}


for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		arr3[i][j]=arr[i][j]+arr2[i][j];
	}
}
System.out.println("Matrix C: ");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.print("  "+arr3[i][j]);
	}
	System.out.println();
}
}
}
