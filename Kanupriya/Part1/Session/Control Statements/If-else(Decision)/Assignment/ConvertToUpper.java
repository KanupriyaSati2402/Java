class ConvertToUpper{
public static void main(String[] args)
{
 char c ='s';
 if('A' <= c && c <= 'Z')
{
 char b = (char)(c+32);
System.out.println(b);

}
else{
char b = (char)(c-32);
System.out.println(b);

}

}

}