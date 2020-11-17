package myproject;
import java.util.ArrayList;
import java.util.Collections;
public class Array_list {
public static void main(String args[]) {
	ArrayList<Integer> number=new ArrayList<Integer>(10);
	ArrayList<Integer> number2=new ArrayList<Integer>(10);
	number.add(0,6);
	number.add(17);
	number.add(4);
	number.add(12);
	
	System.out.println(number+" ");
	
	 number.remove(0);	
	 System.out.println(number);
	 
	 number.set(2,22);
	 System.out.println(number+" ");
	 
	 Collections.sort(number);
	 System.out.println(number+" ");
	 
     int value= number.get(2);
     System.out.println("value of number 3 index: "+value);
     
	 boolean c=number.contains(4);
	 System.out.println("is number contain 4: "+c);
	 
	 int index= number.indexOf(17);
	 System.out.println("index of value 17: "+index);
	 
	 number.clear();
	 System.out.println(number);
	 
	 boolean b=number.isEmpty();
	 System.out.println("is number ArrayList empty: "+b);
	 //this is copying all element of number but as number array list is empty
	 //so number2 is empty as well.
	 number2.addAll(number);
	 System.out.println(number2);
	}
}

