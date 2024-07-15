class NumberofMonths{

public static void main(String[] args)
{
 int a=6;
 if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)
{
System.out.println("31 days");
}
else if(a==4 || a==6 || a==11 || a==9)
{
System.out.println("30 days");
}
else if(a==2){
 System.out.println("28 or 29 days");
}
else{
System.out.println("Invalid");
}
}


}