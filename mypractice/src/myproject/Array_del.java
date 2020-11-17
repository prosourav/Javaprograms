package myproject;
import java.util.Scanner;
public class Array_del {
public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
int arr[]= {5,3,7,1,4,2};
System.out.printf("Enter the number you wanna delete: ");
int n=input.nextInt();
int j=0,k=0;
for(int i=0;i<6;i++) {
	if(n==arr[i]) {
	j=i;
	k++;
	j++;
	System.out.print("the position: "+j);
	break;}
}
if(k==1) {
for(int i=j;i<5;i++) {
arr[i]=arr[i+1];
}
System.out.print("\n");
for(int i=0;i<5;i++) {
	System.out.print(" "+arr[i]);
}}
else { 
	System.out.println("Operetion is not possible.");
	
}
}
}