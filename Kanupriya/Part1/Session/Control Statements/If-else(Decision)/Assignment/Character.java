class Character{
    public static void main(String[] agrs)
    {  
     char c='r';
     if( c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')
     {
        System.out.println("Vowel");
     }

else if(c == 'b' ||c == 'c' ||c == 'd' ||c == 'f' ||c == 'g' ||c == 'h' ||c == 'j' ||c == 'k' ||c == 'l' ||c == 'm' ||c == 'n' ||c == 'p' ||c == 'q' ||c == 'r' ||c == 's' ||c == 't' ||c == 'v' ||c == 'w' ||c == 'x' ||c == 'y' ||c == 'z')
     {
        System.out.println("Consonant");
     }

else
     {
        System.out.println("Invalid");
     }

}
}