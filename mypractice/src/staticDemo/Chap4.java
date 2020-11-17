package staticDemo;

public class Chap4 {
 public static void main(String args[]) {
	 cal.calculate();
	 something();
	 b d= new b();
	 d.wow();
	 
 }
 static void something() {
	 System.out.println("I am showing");
 }
}
class cal{
	public static void calculate() {
	System.out.println("I am calculateing");
	}
}
class b {
	public void wow() {
		System.out.println("wow");
	}
}