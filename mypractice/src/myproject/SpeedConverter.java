package myproject;
import java.util.*;
public class SpeedConverter {	
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
	    System.out.println("Enter the value in Kilometers: ");
	    int kilometers=input.nextInt();
	    double miles= toMilesPerHour(kilometers);
	    System.out.println(+kilometers+"="+miles);
	}
static double toMilesPerHour(int kilometersPerHour){
    if( kilometersPerHour<0){
        return -1;
    }
    else{
      double MilesPerHour=(double)kilometersPerHour*62137;
      double rounded=Math.round(MilesPerHour);
      return rounded;
    }
}
}