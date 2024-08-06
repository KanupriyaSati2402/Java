package Subtration_Program;

public class FacebookTest {

	public static void main(String [] args) {
		
		Facebook face=new Facebook("Kanupriya",123,"123kan");
		face.getName();
		face.getId();
		face.setName("Kanupriya Sati");
		face.getName();
		face.setPassword("1237676kan");
		
	}
	
	
	// The original design of this will have one more design inside it 
	// like user inside faceboook then this 
	// for there will be two design facebook and user and the concept which will connect them is relationship
	// there are two types of relationships in java-- Is-A and Has-A
	// object -- block of memory inside the heap area and ref will be inside stack area 
	// obj ref is non primitive 
	// dependency -- has relationship -- if one design having dependent relationship with another design 
	// Types of dependencies in java 
	//-- composite -- when two objects are connected to each other and won't exist without each other
	//-- to show composite dependency we have diamond (filled)
	//-- aggrigation -- can exist without each other
	//-- to show aggrigation dependency we have diamond hallow 
	//-- constructor mai user deign object dalenge (to show dependency)
	//-- the after making construction we will have to create an object for the facebook object 
	//-- and for making fb object we have to make the object of the user 
	//-- user u = new user("dev",1,123)
	//-- fb(12,"d",new user("dev",1,123))
	//-- an object which is  not stored is called anonymous object 
	
	
	//fb.u.pd()  -- classname.u(obj ref).method 
	//-- same like system.out.println()
	
	//--Print or println are non static then can be called by obj ref then can we call it by printstream class obj ref 
	//--out is static can be called by obj ref , so when we create system class obj then can we call out using system class object ref 
	//--
}
