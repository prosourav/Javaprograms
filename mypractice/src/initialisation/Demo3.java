package initialisation;

class Creature{  
int rollno;  
String name;  
float fee;  
Creature(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
System.out.println("Roll: "+this.rollno+"Name: "+this.name+"fee: "+this.fee);
}  } 
  
public class Demo3{  
public static void main(String args[]){  
	Creature s1=new Creature(111,"ankit",5000f);  
	Creature s2=new Creature(112,"sumit",6000f);  

}}  
