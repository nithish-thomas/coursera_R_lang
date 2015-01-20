package com.nst.challenger;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public RemoveDuplicate() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		float[] test=new float[]{1.00f,3.00f,5.45f,1.00f};
		RemoveDuplicate d=new RemoveDuplicate();
		
		d.removeDup(test);
	}
	
	public void removeDup(float[] a){
		Set<Float> duplicate=new HashSet<Float>(a.length);
		Set<Float> unique=new HashSet<>(a.length);
		
		for (Float data : a) {
			if(unique.contains(data)){
				duplicate.add(data);
			}else{
				unique.add(data);
			}
		}
		System.out.println("Duplicate : "+duplicate);
		System.out.println("Unique :"+unique);
	}
	
}
