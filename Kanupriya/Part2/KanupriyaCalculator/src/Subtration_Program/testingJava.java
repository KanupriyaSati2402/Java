package Subtration_Program;

public class testingJava {

	public static void main(String [] args) {
		DataHidingJava Obj=new DataHidingJava("Kanupriya",4,"Female","JFS","Delhi","123");
//	    Obj.getName();
//	    Obj.getGender();
//	    Obj.getId();
//	    Obj.getCourse();
//	    Obj.getAddress();
	    
	    //updating using this keyword
	    Obj.setName("ABCD");
	    Obj.getName();
	    Obj.setCourse("PFS");
	    Obj.getCourse();
	    Obj.setAddress("Uk");
	    Obj.getAddress();
	    Obj.getPassword("7th7868h");
	    
	}
}

//the process in which we have method and data inside one class then it is called encapsulation.
//the process of binding the state and behaviour for hiding data 
//used for hiding data 
//data private and method public 

//getter and setter
