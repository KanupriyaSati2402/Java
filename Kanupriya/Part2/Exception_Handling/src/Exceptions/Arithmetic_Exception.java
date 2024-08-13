package Exceptions;

public class Arithmetic_Exception {
//		Arithmetic_Exception ap=null;
//		ap.m1();
//		
		  String s="Kanupriya";
		  
		 
		//Arthimetic Exception
		public static void main(String [] args) {
//		    try {
//			System.out.println(26/0);
//		    }
//		    catch(ArithmeticException e) {
//            System.out.println("cant divide");
//		    System.out.println(e.getMessage());	
//		    e.printStackTrace();
//		    
//		    }
			
			//Array Exception 
//		    int arr [] = {1,34,5,2,4};
//			  
//			   try {
//				   int c=arr[9];  
//			   System.out.println(c);
//			   }
//			   catch(ArrayIndexOutOfBoundsException A) {
//				   System.out.println("This is an exception");
//				//  System.out.println(A.getMessage());
//				  A.printStackTrace();
//			   }
			//StringIndexOutofBoundException
			try {
			System.out.println(s.charAt(10));
			}
			catch(StringIndexOutOfBoundsException g) {
				System.out.println(s.getMessage());
				s.printStackTrace();
			}
		}
		    
	
			
	}





// we use try and catch while expection handling , without catch we cannot use try 
// if we dont want to write message by ourself we will use getmessage() method NS 
// it is a getter method so we need to print statement
// when we want to know the details about the expection after it is handled we will use NS Method printstacktrace() , return type void 
// we cant print it because its return type is void 



// default exception handler it is a subprocess of a complete proces , also called as thread , it is a light weight subprocess , default execption handler is its example 
////interthread communication , to go for it we have to go for some methods (wait methods) which is inside object class 
//greedy thread 
//garbage collector 
//deamon thread -- default exception handler 