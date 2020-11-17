package oop;

public class Main_method {
public static void main(String args[]) {
	Dog husky = new Dog();
    Dog lab = new Dog();
    
    husky.legs = 4;
    husky.eyes = "blue";
    husky.sleep();
    husky.description();
    
    lab.legs = 4;
    lab.eyes = "black";
    lab.description();
    
    
    Cat catty = new Cat(); 
    Cat mini = new Cat();
    catty.eyes=2;
    catty.legs=4;
    catty.play();
    catty.descripetion();
    
    mini.eyes=2;
    mini.legs=0;
    mini.play();
    mini.descripetion();
}
}
