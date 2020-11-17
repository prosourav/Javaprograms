package myproject;
import java.util.Scanner;
public class Fibonacci {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.println("Enter last number of the Series: ");
int n=input.nextInt();
int n1=1,n2=2,fibo;
fibo=n1+n2;
for(int i=1;i<=n;i++) {
	System.out.println(+n1);
	n1=n2;
	n2=fibo;
	fibo=n1+n2;
	
}

}
}
