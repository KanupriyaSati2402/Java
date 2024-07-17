class SwitchGrouping{

public static void main(String[] args){

 char c='A';
switch(c)
{

  case 'A','E','O','I','U': // grouping 
  {
   System.out.println("Vowels");
  }
  case 'B','C','D','F':
  {
   System.out.println("Consonants");
  }

}
}

//float value are not allowed inside case 
//integer,char,string are allowed 
// in switch statement break and default are optional 
//no boolena or long values 
// for boolean values go for if and else if 