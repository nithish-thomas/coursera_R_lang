package com.nst.leetcode.simple;

import java.io.FileNotFoundException;
import java.io.IOError;

public class InstantiationErrorExample {

	public InstantiationErrorExample() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		new Car().display();
	}
}


class Vehicle{
	int speed=10;
	
	ExceptionVariable var;
	{
		try {
			var=new ExceptionVariable();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new InstantiationError();
		} catch (IOError e) {
			throw new InstantiationError();
		}
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public void display(){
		System.out.println(speed);
	}
}

class Car extends Vehicle{
	Car(){
		speed=40;
	}
	
}

class ExceptionVariable{
	public ExceptionVariable() throws IOError, FileNotFoundException{
		throw new FileNotFoundException();
	}
}