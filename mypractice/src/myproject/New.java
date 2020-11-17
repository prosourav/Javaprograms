package myproject;

public class New {
   int age;
   String city;
   New(int age,String city){
	   this.age=age;
	   this.city=city;
	   display();
   }
   public void display() {
	   System.out.println(age +" and "+city);
   }
}
