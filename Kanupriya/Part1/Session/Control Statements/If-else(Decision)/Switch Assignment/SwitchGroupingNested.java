class SwitchGroupingNested{

public static void main(String[] args){

char c='A';
switch(c)
{

  case 1: // grouping 
  {
   System.out.println("Veg Pizza");
       int t=4;
       switch(t){
        case 1:
        {
         System.out.println("Small");
        }

  }
  }
  case 'B','C','D','F':
  {
   System.out.println("Consonants");
  }
case 1:
case 2:
case 3:
case 4:  System.out.println("Small");
 break;
//grouping all can give same answer 

}
}