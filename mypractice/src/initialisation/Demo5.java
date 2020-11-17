package initialisation;
class Demo5{  
int rollno;  
String name;  
float fee;  
Demo5(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
display();
}  
void display(){
	System.out.println(rollno+" "+name+" "+fee);}  
 
  

public static void main(String args[]){  
Demo5 s1=new Demo5(111,"ankit",5000f);  
Demo5 s2=new Demo5(112,"sumit",6000f);  
 
}}  
