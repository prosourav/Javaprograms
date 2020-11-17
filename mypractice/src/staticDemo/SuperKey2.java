package staticDemo;

class human{  
void eat(){System.out.println(" human eating...");}  
}  
class ram extends human{  
void eat()
{System.out.println(" ram eating bread...");   
super.eat();  
  
}  
}  
public class SuperKey2{  
public static void main(String args[]){  
ram d=new ram();
d.eat();
  
}} 
