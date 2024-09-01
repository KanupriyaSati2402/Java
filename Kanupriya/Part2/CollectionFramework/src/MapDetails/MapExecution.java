package MapDetails;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapExecution {

	public static void main(String [] args) {
	HashMap<Integer,String> H = new HashMap();
	H.put(1 ,"Hello");
	H.put(2, "Kanupriya");
	H.put(3, "sati");
	H.put(4, "!");
	
	Collection c=H.values();   // There are four methods to iterate in map set list 
	for(Object i:c) {
		System.out.println(i);
	}
	
	Iterator i = c.iterator();
	while(i.hasNext()) { // used to check the values is there or is null at null it will stop 
		System.out.println(i.next());
	}
	
	
}}
