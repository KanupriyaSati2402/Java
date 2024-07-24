package Extracting_Java;

public class LowerCase {

    public static void GetUpper(char c) {
    	if( c >=97 && c<=122) {
    		char d= (char)( c-32);
    		System.out.println(d);
    	}
    	else 
    	System.out.println(c);
    }
    public void IsLowerCase(char c) {
    	if( c >=97 && c<=122) 
    	System.out.println("Yes");
    	else 
    	System.out.println("No");
    	
    }
    public static void main(String[] args) {
    	GetUpper('a');
    	LowerCase Low=new LowerCase();
    	Low.IsLowerCase('G');
    }
}
