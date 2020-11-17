package encapsulation;

public class Encapsulation_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student obj = new Student();
      obj.setAge(35);
      System.out.println("Your age is set: "+obj.getAge());
      obj.setName("Rohan Roy");
      System.out.println("Your name is set: "+obj.getName());
	}

}
