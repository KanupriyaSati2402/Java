class HomeWork{
	public static void main(String [] args){
	int a = 4;
	System.out.println((a>0)? "a is positive" : "a is not positive");
//2.
	int a1 = -4;
	System.out.println((a1<0)? "a1 is negative" : "a1 is not negative");
//3.
	int b = 2;
	System.out.println((b==0)? "b is zero" : "b is not zero");
//4.
	int b1 = 8;
	System.out.println((b1<10)? "b1 is less then 10" :"b1 is not less then 10");
//5.
	int b2 = 6;
	System.out.println((b2>=5)? "b2 is greater than or equal to 5" : "b2 is not greater than or equal to 5");
//6.
	int c = 9;
	System.out.println((c%3==0)? "c is divisible by 3" : "c is not divisible by 3");

//7.
	int c1 = 20;
	String result1 = (c1%3==0 && c1%2==0)? " divisible by 6" : " not divisible by 6";
	System.out.println(result1);

//8.
	char ch = 'A';
	String res  = (ch >= 'A' && ch <= 'Z') ? (ch + " is an uppercase letter.") : (ch + " is not an uppercase letter.");
	System.out.println(res);
//9.
	char ch1 = 'a';
	String res1  = (ch1 >= 'a' && ch1 <= 'z') ? (ch1 + " is an lowercase letter.") : (ch1 + " is not an lowercase letter.");
	System.out.println(res1);
//10.
	char ch2 = 'A';
	String res2  = (ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') ? (ch + " is an uppercase vowel") : (ch + " is not an uppercase vowel");
	System.out.println(res2);
//11.
	char ch3 = 'f';
	String res3  = (ch3 == 'A' || ch3 == 'E' || ch3 == 'I' || ch3 == 'O' || ch3 == 'U') ? (ch3 + " is vowel") : (ch3 + " is not vowel");
	System.out.println(res3);

//12.
	char ch4 = '$';
	String res4  = ((ch4 < 'A' || (ch4 > 'Z' && ch4 < 'a') || ch4 > 'z') &&
        (ch4 < '0' || ch4 > '9') ? (ch4 + " is a special character.") : (ch4 + " is not a special character."));
	System.out.println(res4);

//13.
	char ch5 = '9';
	String res5 = (ch5 >= '0' && ch5 <= '9') ? ch5 + " is a digit." : ch5 + " is not a digit.";
	System.out.println(res5);

//14.
	char ch6 = 'E';
	String res6  = (ch6 >= 'D' && ch6 <= 'X') ? (ch6 + " is between D and X") : (ch6 + " is not between D and X");
	System.out.println(res6);

//15.

	int a3=12;
	int b3=11;
	int c3=13;
	String result = (a3 > b3 && a3 > c3) ? "a3 is the largest" :
                (b3 > a3 && b3 > c3) ? "b3 is the largest" :
                (c3 > a3 && c3 > b3) ? "c3 is the largest" :"There is a tie";
	System.out.println(result);

}
}