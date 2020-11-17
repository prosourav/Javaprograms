package myproject;
import java.util.Scanner;
public class Second_largest {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter size of the array: ");
    int n = input.nextInt();
    int arr[]=new int[n]; 
    System.out.println("Enter values for the array: ");
    for(int i=0;i<n;i++) {
     arr[i]=input.nextInt();
	}
    method(arr,n);

}
	public static void method(int a[],int b) {
	int lar,lar2;
	lar=lar2=Integer.MIN_VALUE;
	for(int i=0;i<b;i++) {
		if(a[i]>lar) {
			lar2=lar;
			lar=a[i];
			}
		else if((a[i]>lar2)	&& (a[i]<lar)) {
			lar2=a[i];
			
			}
		}
	
	System.out.println("largest value in the array: "+lar);
	System.out.println("Second largest value in the array: "+lar2);
	}
}