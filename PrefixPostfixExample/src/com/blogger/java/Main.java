package com.blogger.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 2;
	     int a = 2;
	     int r = 0;
	     System.out.println(++x);//Prefix-Prefix first performs the operation then assigns the value.
	     System.out.println(x++);//Postfix-Postfix first assigns the value and then perform the operation.
	     r = x+a;//to check if postfix incremented the value of x or no.
	     System.out.println(r);//Observe the output of this line, it should give output as 6 i.e. x+a -> 4+2
	     
	     int b = x++;/*When you print the value of b it will be 4 and not 5, but the value will be incremented next
	                   time when you use x it's value will be 5.
	                   Postfix first assigns the value and then perform the operation.*/
	     
	     int z = ++r;//when you print z the value should be 7. Prefix first performs the operation and then assigns it.
	     
	     System.out.println(b);
	     System.out.println(z);
	     
	     System.out.println(x+2);//should be 5+2=7

	}

}
