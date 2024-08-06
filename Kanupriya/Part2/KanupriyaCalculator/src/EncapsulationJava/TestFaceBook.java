package EncapsulationJava;

public class TestFaceBook {

      public static void main(String [] args) {
    	  
    	  FaceBookJava Fb = new FaceBookJava(12,"fb",new UserJava("Kanupriya",24,"Nov2002"));
    		Fb.U.printDet();
      }
	// This is the driver class for the facebook class and the user class 
      // we will create an object for the facebook class to call it and will store its obj ref and then we will make 
      //object for the class user for calling it inside the formal arguments of the facebook object 
      // we are here calling the object user from taking the obj ref of facebook and with the help of this we are calling the 
      // print method inside the user method 
	
}
// this is we making has relationship as the class user is only executed using obj ref of the another class that is fb;