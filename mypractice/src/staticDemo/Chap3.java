package staticDemo;

class emp{
    static String ceo="Reddy";
	int id;
    int salary;
    
    public void show() {
    	System.out.println(ceo+" : "+id+ " : "+":"+salary);
    }
}

public class Chap3 {
 public static void main(String args[]) {
	 emp sourav = new emp();
	 sourav.id=01;
	 sourav.salary=15000;

	 
	 emp sumit = new emp();
	 sumit.id=02;
	 sumit.salary=16000;
//	 sumit.ceo="jana";
	 
	 sumit.show();
	 sourav.show();
 
 }
}
