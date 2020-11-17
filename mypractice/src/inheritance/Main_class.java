package inheritance;

public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Teacher t  = new Teacher();
      t.name = "Anisul";
      t.eat();
      t.walk();
      t.teach();
    System.out.println("\n");  
      Singer s = new Singer();
      s.name = "Arijit";
      s.eat();
      s.walk();
      s.sing();
	}

}
