package inheritance;

public class Teacher extends Person {
	public void teach() {
		System.out.println("Teacher "+name+" is teaching.");
	}
	//method overRidding
	public void eat() {
		//using super keyword for accessing parent class
		super.eat();
		System.out.println("Teacher "+name+ "is eating.");
	}
}
