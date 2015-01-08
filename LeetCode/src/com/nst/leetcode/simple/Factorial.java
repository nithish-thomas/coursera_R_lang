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
		System.out.println(factorial(5));
	}

}

class Vehicle{
	int speed=10;
	
	public void display(){
		System.out.println(speed);
	}
}

class Car extends Vehicle{
	int speed=40;
	
	@Override
	public void display() {
		super.speed=50;
		System.out.println(speed);
	}
}