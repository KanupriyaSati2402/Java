//package CallingJava;
//import java.util.Scanner;
//import Addition_Program.AdditionJava;
//import Subtration_Program.SubtrationJava;
//import Multiply_Program.ProductJava;
//import Division_Java.DisivionJava;
////import Extracting_Java.LowerCase;
////import Extracting_Java.UpperCase; // we don't have to import within same package we can call using the class name within 
//// another class we can call it
//public class Calling {
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		boolean i=true;
//		while(i) {
//		System.out.println("WELCOME to Calculator");
//		System.out.println("ENTER 1 FOR ADDITION");
//		System.out.println("ENTER 2 FOR SUBTRACTION");
//		System.out.println("ENTER 3 FOR MULTIPLICATION");
//		System.out.println("ENTER 4 FOR DIVISION");
//		System.out.println("ENTER 5 FOR EXIST");
//		int opt=s.nextInt();
//		switch(opt) {
//		case 1:
//		{
//			System.out.println("WELCOME TO ADDITION");
//			System.out.println("Enter 1 for 2 number Addition");
//			System.out.println("Enter 2 for 3 number Addition");
//			System.out.println("ENTER 5 FOR EXIST");
//			int x=s.nextInt();
//			if(x==1) {
//				System.out.println("Enter 1st number");
//				int num1=s.nextInt();
//				System.out.println("Enter 2st number");
//				int num2=s.nextInt();
//				System.out.println("Output: ");
//				AdditionJava.Add(num1,num2);
//				System.out.println(" ");
//			}
//			else if(x==2) {
//				System.out.println("Enter 1st number");
//				int num1=s.nextInt();
//				System.out.println("Enter 2st number");
//				int num2=s.nextInt();
//				System.out.println("Enter 3st number");
//				int num3=s.nextInt();
//				AdditionJava add=new AdditionJava();
//				System.out.println("Output: ");
//				add.Add2(num1, num2, num3);
//				System.out.println(" ");
//			}
//		}
//		 break;
//		case 2:
//		{
//			System.out.println("WELCOME TO SUBTRACTION");
//			System.out.println("ENTER 5 FOR EXIST");
//				System.out.println("Enter 1st number for Subtraction");
//				int num1=s.nextInt();
//				System.out.println("Enter 2st number for Subtraction");
//				int num2=s.nextInt();
//				System.out.println("Output: ");
//				SubtrationJava.Sub(num1,num2);
//				System.out.println(" ");
//		}
//		break;
//		case 3:
//		{
//			System.out.println("WELCOME TO Multiplication");
//			System.out.println("ENTER 5 FOR EXIST");
//				System.out.println("Enter 1st number for Subtraction");
//				int num1=s.nextInt();
//				System.out.println("Enter 2st number for Subtraction");
//				int num2=s.nextInt();
//				System.out.println("Output: ");
//				ProductJava.Multi(num1,num2);
//				System.out.println(" ");
//		}
//		break;
//		case 4:
//		{
//			System.out.println("WELCOME TO Division");
//			System.out.println("ENTER 5 FOR EXIST");
//				System.out.println("Enter 1st number for Division");
//				int num1=s.nextInt();
//				System.out.println("Enter 2st number for Division");
//				int num2=s.nextInt();
//				System.out.println("Output: ");
//				DisivionJava.Div(num1,num2);
//				System.out.println(" ");
//		}
//		break;
//		case 5:
//		{  
//			   i =false;  
//			   System.out.println("YOU ARE OUT !!");
//			   break ;  
//		}
//		default : 
//		{   
//			System.out.println("Invalid input , Try Again");
//		}
//	}
//	}
//}
//}
////	public static void main(String[] args) {
////		//method of addition 
////     AdditionJava.Add(2,3); 
////     // we need to give classname while calling the static method (classname.methodname)
////     
////     AdditionJava add = new AdditionJava();
////     add.Add2(2,3,4); 
////     //object.methodname(non-static)
////     // we call non static by creating a object for it and then we will call it 
////     
////     
////   //method of sub 
////     SubtrationJava.Sub(8,4);
////	
////   
////	//Method calling of multiply 
////	 ProductJava.Multi(4,4);
////    
////	//Method calling of division
////	 DisivionJava.Div(8,2);
////	
////	
////    //Method Extracting 
////	 
////	LowerCase.GetUpper('A');
////	
////	LowerCase L = new LowerCase();
////	L.IsLowerCase('c');
////	
////	UpperCase.GetLower('B');
////	
////	UpperCase U = new UpperCase();
////	U.IsUpperCase('c');
////	}
//
//
///*
//For NON-STATIC 
//1.OBJ ref -- within static and non static everywhere [but it is prefferable inside static only]
//2.directly -- non static (inside non static method only)[not only method variable also]
//3.by classname.membername -- not possible , we cannot access non static through classname 
//4.this and super keyword . membername -- 
//
//     this -- differeniate nonstatic from local variable 
//     super -- differeniate parent class from child class member
//
//for differeniating between local and global static scope member we will use this keyword , this keyword cannot be used 
//with static members
//
//
//*/