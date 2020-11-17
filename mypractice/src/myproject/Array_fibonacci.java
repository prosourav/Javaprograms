package myproject;
import java.util.Scanner;
public class Array_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
System.out.println("Enter size of the series: ");
int a=input.nextInt();
int arr[]=new int[a];
arr[0]=1;arr[1]=2;
for(int i=2;i<a;i++) {
	arr[i]=arr[i-1]+arr[i-2];
}
for(int i=0;i<a;i++) {
	System.out.print(" "+arr[i]);
}
	}

}
