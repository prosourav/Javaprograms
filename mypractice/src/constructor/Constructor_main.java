package constructor;

public class Constructor_main {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle(2,1);
		Vehicle scooty = new Vehicle(1,1);
		Vehicle eRickshaw = new Vehicle(1,1,"black");
System.out.println("Number of wheels on the bike: "+bike.wheels);  //if we use static keyword it will Vehicle.wheels
System.out.println("Number of head lights on the bike: "+bike.headlights);
System.out.println("Number of engine on the bike: "+bike.engine);
System.out.println();
System.out.println("Number of wheels on the scooty: "+scooty.wheels);
System.out.println("Number of head lights on the scooty: "+scooty.headlights);
System.out.println("Number of engine on the scooty: "+bike.engine);
System.out.println();
System.out.println("Number of wheels on the eRickshaw: "+eRickshaw.wheels);
System.out.println("Number of head lights on the eRickshaw: "+eRickshaw.headlights);
System.out.println("Number of engine on the eRickshaw: "+eRickshaw.engine);
System.out.println("Colour of engine on the eRickshaw: "+eRickshaw.colour);
	

	}

}
