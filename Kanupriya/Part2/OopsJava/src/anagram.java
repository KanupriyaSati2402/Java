import java.util.*;
public class anagram {
  public static void  main(String[] args) {
	  String str1 = "race";
	  String str2 = "cera";
	  int [] arr = new int[26];
	  for(int i=0; i<str1.length(); i++)
		  arr[str1.charAt(i)-'a']++;
	  for(int i=0; i<str2.length(); i++) {
		  arr[str2.charAt(i)-'a']--;
	  } 
	  boolean check = true;
	  for(int i : arr) {
		  if(i!=0) {
			  check = false;
			  break;
		  }
	  }
	  if(check==true)
		  System.out.println("is anagram");
	  else
		  System.out.println("not a anagram");
  }
}
