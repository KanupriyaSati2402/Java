package ObjectJava;

public class ObjectJava {
     String name ="Kanupriya Sati";
     int id=8;
     long phoneno = 7895872411L;
     
     ObjectJava(String s,int n,int m){ // made construction to call it parametirezed
    	 this.name=s;
    	 this.id=n;
    	 this.phoneno=m;
     }
     //when local variable and ns variable having the same name to diff the ns v from local v we use the this keyword with non static variable 
     public void printDetails() {
    	 String name ="dev";
    			System.out.println(name); // to access the outer one use this keyuword for reference 
    	        System.out.println(id);
    	        System.out.println(phoneno);
     }
     public void updateName(String name) { // convention is to give same name to the local variable as the non static one
    	 this.name =name; // taking the input to update the name 
    	 // but this will get fixed and will not go out of the scope 
    	 // for this we use this keyword to tell that which one is non static 
     }
     public static void main(String [] args) {
    	 ObjectJava obj1=new  ObjectJava("dev",55,432423);
    	 ObjectJava obj2=new  ObjectJava("kanu",55,998767); // default constructor is removed because we have declare our constructor 
    	 ObjectJava obj3=new  ObjectJava("kanu",55,998767);
    	 obj1.printDetails();
    	 obj2.printDetails();
    	 obj3.printDetails();
    	 
    	 obj1.name="kanupriya";//using directly 
    	 obj1.id=50;
    	 obj2.name="mantasha";
    	 obj1.printDetails();
    	 obj2.printDetails();
    	 obj3.printDetails(); // using method 
    	 obj1.updateName("dev");
    	 obj1.printDetails();
    	 
    	 
    	 //using in construction
    	 
    	 
     }
}
