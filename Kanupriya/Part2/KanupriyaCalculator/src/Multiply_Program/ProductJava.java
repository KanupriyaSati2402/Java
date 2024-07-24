package Multiply_Program;

public class ProductJava {

    public static void Multi(int a,int b) {
    	System.out.println(a*b);
    }
    public static void main(String[] args) {
    	Multi(10,2);
    }
}

/*
 
Initialiser
--single line 
int a=5; -- non static single line 
static ab=7; -- static single line 
(can be static or non static )

--multi line
static{
syso("hello")
}
// this is static multiline , it is a non callable statment , and it has no name 

no need to give name or any keyword
{
// will exceute after static multiline initializer if there 
}

KEY POINTS

--static will execute only once per class loading process 
-- we can take any number of static and non static initializer 
-- main se phele static will be executed and non static when we will create a object 
-- we can use loop , we can call from it we can call it , every thing that can happen inside method can be done with it 
-- no return type , no methodname , no need to call, will automatically excutes (diff from method)
-- static and non static both are executed at different time 
--static before main method 
-- ns when we will create a object 
-- we will make object inside main method (A a=new A());
-- the number of times we will create objects it will be called 
--ns will execute once for every object loading process 

*/