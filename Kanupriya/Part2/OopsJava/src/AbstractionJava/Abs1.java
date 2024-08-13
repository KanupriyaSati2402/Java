package AbstractionJava;

interface Abs1 {
  
	abstract public void m2(); 
	// by default all the method inside interface are abstract
	default void m3() {
		// non static 
	};
	
}

//we cannot  take constructor inside it 

// design changed because of the client requirment

//in interface method is by default abstract and public (remove it or write it )
//we cannot define concrete method inside interface method 
//in jdk 1.8 we can define variable that is static , final and public and variable should be initialized
//public static final int a=10; 

//the members we put inside intreface are by default public in nature , 
//and by default static / final  ( only variable but)

// we can take static method inside the interface 
// we can create the main method too ( as it is a static )

// we can pass main method without 
// public NS Concrete cannot be defined inside interface 
// we can define if it has access modifier is default  , and we will make it using keyword which is allowed only inside the interface



// Interface types and predefined interfaces 
// types regular -- more than one abstract method 
// functional  -- only one abstract method 
// marker -- the empty one is marker 







