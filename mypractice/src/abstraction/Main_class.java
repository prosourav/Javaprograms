package abstraction;

public class Main_class {

	public static void repairCar(Car car) {
			System.out.println("Car is repaired");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Audi a = new Audi();
       Honda h = new Honda();
       
       repairCar(a);
       repairCar(h);
	}
	

}
