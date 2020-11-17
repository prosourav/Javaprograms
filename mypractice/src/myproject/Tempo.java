package myproject;
import java.util.Scanner;
public class Tempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
System.out.println("Hello world i am gonna start java");
System.out.println("say something: ");
String a=input.nextLine();
System.out.println(a);
int b=13,d=12;
swap(b,d);
System.out.print(" value of b and d : "+b+" and "+d);
	}

static void swap(int a,int b) {
	int tem=a;
	a=b;
	b=tem;
	System.out.println("value of b and d: "+a+" and "+b);
}
}