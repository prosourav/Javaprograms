package exceptionhandling;

public class Demo1 {
    public static void main(String args[] ){
	 //the code you think might get exception you should into try block
    	try {
    		int a=10,b=0,result=a/b;
    		System.out.println(": "+result);
    	}
    	catch(ArithmeticException e){
    		System.out.println("Exception : "+e);	
    	}
    	//In (Exception) every exception will be detected catch
    	catch(Exception e1){
    		System.out.println("Exception : "+e1);	
    	}
    	finally{
    		System.out.println("if you want to exicute remaining code then keep into finally block : ");
    	}
    }
}
