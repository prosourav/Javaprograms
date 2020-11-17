package polymorphism;

public class Main_pol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d = new Dog();
        Pet p = d;    //this is call up casting.
        Animal a = d; //this is call  implicit casting.
        
        d.walk();
        p.walk();
        
        
        
	}

}
