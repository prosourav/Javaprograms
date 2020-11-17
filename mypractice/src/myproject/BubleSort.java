package myproject;
import java.util.Scanner;
public class BubleSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
	int n = input.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter values of the array: ");
	for(int i=0;i<n;i++) {
	arr[i]=input.nextInt();
	}
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int tem=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tem;				
			}
		}
	}
	System.out.println("After sorting the array: ");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
  }
}