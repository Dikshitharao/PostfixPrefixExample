package com.blogger.java;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 2;
		int b = 1;
		System.out.println(++a + b++);/*++a increments the value of 'a' by 1 and then assigns that value to 'a'. 
		                                b++ first assigns the value to 'b' and then increments it by 1. 
		                                Therefore now 'a' will be 3 and 'b' will be 1 at this statement and the answer thus will be 4.*/
		System.out.println(b);// The value of b will be 2
		System.out.println(a);
		System.out.println(a-- + --b);/*a-- will first assign the value so the value will be 3 
		                                but later it decrements it by 1. --b will decrement the value of 'b' by 1
		                                and thus the value of 'b' will be 1. therefore the output will be 3+1=4.*/

	}

}
