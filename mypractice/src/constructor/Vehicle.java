package constructor;

public class Vehicle {
	  int wheels,headlights,engine; // static int wheels=2; if we use static way the we will access   
	  String colour;                //through class name instead of object name in main class.

 Vehicle(int noheadlights,int engine){
	wheels=2;
	headlights=noheadlights;
	this.engine=engine;//this keyword points to the variable of class
	                   // and other one is the parameter value.
}
//this is call overloading of constructor as same as method overloading
 Vehicle(int noheadlights,int engine,String colour){
    wheels=2;
	headlights=noheadlights;
	this.colour=colour;
	this.engine=engine;//this keyword points to the variable of class and other one is the parameter value.
	
}
}
