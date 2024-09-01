package Wrapper;

public class WrapperClass {

	public static void main (String [] args) {
		
      String s=new String("hi");
      Byte b= new Byte((byte) 1);
      Short a=new Short( (short) 3);
      Integer i =new Integer(4);
      Long l =new Long(6565l);
      Float f = new Float(3.56f);
      Double d = new Double(5.8786d);
      Boolean v= new Boolean(true);
      Character x = new Character('a');
		
		/*
		Byte b=20; // they all are made non static 
		Short s=30;
		Integer i=40; // this line is auto boxing (we are not using the constructor) -- converting primitve into corresponding non primitve is called auto boxing 
		Long l=5028776l; // ref will be stores and we cannot print the ref 
		Float f=2.4f; // for toString() we dont get ref we get only the data this is inside object class 
		Double d=2.444d;
		Boolean v=true;
		Character c='h';*/
		System.out.println(s);
		System.out.println(b);
		System.out.println(i);
		System.out.println(a);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(v);
		System.out.println(x);
	}
	//Integer i=new Integer(5);
	// we provide security to it by converting as there is no security in primitive 
	//primitive into non primitive this process is called boxing 
}
// auto unboxing 
//Integer i=5;
//int a =i;
//sopln(a);


//string to primitive 


