package com.nst.leetcode.simple;


public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}
	
	
	static long factorial(int n){
		long prod=n;
		for(int i=n-1;i>1;i--){
			prod*=i;
		}
		return prod;
	}
	
	public static void main(String[] args) {
		new Car().display();
	}

}

