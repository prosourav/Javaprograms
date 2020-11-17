package myproject;

public class DataType_Convert {

	public static void main(String[] args) {
	String asString="2019";
	int a=2012;
	int AsInteger=Integer.parseInt(asString);
    System.out.println("Asinteger: "+(AsInteger+2));
    double Asdouble=Double.parseDouble(asString);
    System.out.println("Asinteger: "+(Asdouble+2));
    String year=Integer.toString(a);
    System.out.println("After convert to String: "+year+"2");
    
    
 
    	String s1="sourav";    
    	char[] ch=s1.toCharArray();    
    	for(int i=0;i<ch.length;i++){    
    	System.out.println("char at "+i+" index is: "+ch[i]);   
    	}  
    	}
	}


