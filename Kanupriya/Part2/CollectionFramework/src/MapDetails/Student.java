package MapDetails;

import java.util.ArrayList;

public class Student {

	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	public static void main(String [] args) {
		
	ArrayList a = new ArrayList();
	Student s=new Student(1,"dev");
	Student s1=new Student(2,"devi");
	
	a.add(s);
	a.add(s1);
	
//	for(Student p:a) {
//		System.out.println(s);
//		System.out.println(s1); // here the arraylist of made of student time 
//	}
	
//	for(Object i:a) { // Object p=s; , Object p=s1;
//		 
//		Student p=(Student)i; // downcasting beacuse when calling i.name we are calline child properties using parents ref 
//		System.out.println(p.name);
//		System.out.println(p.roll);
//	}
//	
//	System.out.println(a.get(0)); // using index we are 
	
	for(int i=0;i<a.size() ;i++) {
		Object o= a.get(i); // arraylist is generic type we need to store it inside object 
		//now we cannot access using parent ref the child student so downcatsing 
		Student n=(Student) o;
		System.out.println(n.name);
		
	}
// see classcastexception in this 
}
}
