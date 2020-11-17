package initialisation;


class Teacher{  
int rollno;  
String name;  
float fee;  
Teacher(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  } 
  
public class Demo2{  
public static void main(String args[]){  
Teacher s1=new Teacher(111,"ankit",5000f);  
System.out.println("Roll: "+s1.rollno+"Name: "+s1.name+"fee: "+s1.fee);
Teacher s2=new Teacher(112,"sumit",6000f);  
System.out.println("Roll: "+s2.rollno+"Name: "+s2.name+"fee: "+s2.fee);
}}  


