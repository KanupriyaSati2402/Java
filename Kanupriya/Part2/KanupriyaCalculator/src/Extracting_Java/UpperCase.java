package Extracting_Java;

public class UpperCase {
	
	public static void GetLower(char c) {
		if( c >=65 && c<=90) {
    		char d= (char)( c+32);
    		System.out.println(d);
    	}
    	else 
    	System.out.println(c);
    	
	}
	public  void IsUpperCase(char c) {
		if( c >=65 && c<=90) 
    	System.out.println("Yes");
    	
    	else 
    	System.out.println("No");	
	}
	 public static void main(String[] args) {
	    	GetLower('A');
	    	UpperCase Up=new UpperCase();
	    	Up.IsUpperCase('G');
	    }
}
