package OLAJava;
import java.util.Scanner;
public class OlaApp {
	public static void main(String [] args)
	{ 
		  
		  Ola ola=new Ola();
		  //user.addAuto(new Auto());
		 // user.a.DisplayAutoinfo();
		  
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter the choose for user 1 and for driver 2");
		  int opt=s.nextInt();
		  
		  if(opt==1)
		  {       
			  User u=new User();
			  //u.displayUserInfo();
			  System.out.println("enter the choice 1 for auto");
			  System.out.println("enter the choice 2 for bike");
			  System.out.println("enter the choice 3 for car");
			  int o=s.nextInt();
			  switch(o)
			  {
			     case 1:
			     {
			    	     System.out.println("you have selected auto");
			    	     ola.addAuto(new Auto());
			    	    System.out.println("this is auto details") ;  
			    	    ola.a.autoDetails();
			    	    System.out.println("wait for auto, auto is coming");
			    	         
			     }    
			     break;
			     case 2:
			     {
			    	 System.out.println("you have selected bike");
		    	     ola.addBike(new BikeDetails());
		    	    System.out.println("this is Bike details") ;  
		    	    ola.b.BikeDetails();
		    	    System.out.println("wait for bike, bike is coming");
			    	 
			     }
			    break;
			     case 3:
			     {
			    	 System.out.println("you have selected car");
		    	     ola.addCar(new CarDetails());
		    	    System.out.println("this is Car details") ;  
		    	    ola.c.CarDetails();
		    	    System.out.println("wait for Car, Car is coming");
			    	 
			     }
			     break;
			     default:
			     {
			    	 System.out.println("invalid");
			     }
			  }			  
		  }
		  else if(opt==2)
		  {
			  DriverDetails d=new DriverDetails();
			  System.out.println("hy "+ d.driverName+" are connecting with the user ");
			  d.DriverDeatils();
		  }
		  else 
		  {
			  System.out.println("invalid");
		  }
	}
       
}
