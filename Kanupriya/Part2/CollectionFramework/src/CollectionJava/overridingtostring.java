package CollectionJava;

public class overridingtostring {

	String name ;
	int number;
	
	public overridingtostring(String name , int number) {
		this.name=name;
		this.number=number;
	}
	public String toString () {
		return name+" "+number;
	}
	
	public static void main(String [] args) {
		overridingtostring  STR = new overridingtostring ("kanupriya",8378676);
		System.out.println(STR);
		
	}}
