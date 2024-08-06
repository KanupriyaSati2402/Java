package EncapsulationJava;

public class UserJava {

	UserJava(String userName,int userId,String password){
		this.userName=userName;
		this.userId=userId;
		this.password=password;
		
	}
	String userName;
	int userId;
	String password;
	
	public void printDet() {
		System.out.println(userName);
		System.out.println(userId);
		System.out.println(password);
	}
	//this is the user class which we need to execute under facebook class 
	//constructor is made with the same name as the classname and it is non static in nature and than using this as we want to
	// diff between the local and non static variables 
	// then we will make a method that will be used to print the details of the user class , 
	// aggigation is done with method 
	// composition can be done by constructor 
	// variable initialization -- method and constructor 
	
}
