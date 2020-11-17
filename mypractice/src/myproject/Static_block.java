package myproject;

public class Static_block {
	// static block always run before main.
static {
	System.out.println("This is inside static block . ");
}
   public static void main(String args[]) {
	System.out.println("This is inside main function.");
}


}
