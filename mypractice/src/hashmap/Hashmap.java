package hashmap;
import java.util.HashMap;
public class Hashmap {
 public static void main(String args[]){
	 //put and get is important
	 HashMap<Integer,String> customer = new HashMap <Integer,String>();
	 
	 customer.put(12,"Virat");
	 customer.put(13,"Sachin");
	 customer.put(14,"Rohit");
	 customer.put(15,"Sewag");
	 customer.put(16,"Zahir");
	 customer.put(17,"Dhawan");
	 
	 System.out.println(customer.get(12));
	 System.out.println(customer.get(13));
	 System.out.println(customer.get(14));
	 System.out.println(customer.get(15));
	 System.out.println(customer.get(16));
	 System.out.println(customer.get(17));
 }
}
