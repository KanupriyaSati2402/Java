package Subtration_Program;

public class DataHidingJava {
     
	public DataHidingJava(String name , int id, String gender,String address,String course,String password){
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.course=course;
		this.address=address;
		this.password=password;
		
	}
	
	String name ;
	private int id;
	private String gender;
	private String address;
	private String course;
	private String password;
	
	public void getName(){
		System.out.println(name);
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void getId (){
		System.out.println(id);
	}
	
	public void getGender() {
		System.out.println(gender);
	}
	
	public  void getCourse() { // datatype 
		System.out.println(course);
	}
	public void setCourse(String course) { //setter return type void
	this.course=course;
	}
	
	public  void getAddress() {
		System.out.println(address);
	}
	public void setAddress(String address) {
	  this.address=address;
	}
	
	public void getPassword(String password) {
		this.password=password;
	}
	public static void main(String [] args) {
		System.out.println("hy");
	}
	
}
