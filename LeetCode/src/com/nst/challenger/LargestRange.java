package com.nst.challenger;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LargestRange {

	public LargestRange() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		new LargestRange().largestRange(new int[]{1,4,5,6,2,10,11,3});
	}

	public void largestRange(int[] data){
		Set<Integer> dataSet=new HashSet<Integer>();
		Set<Integer> temp=new HashSet<Integer>();
		Set<Integer> largest=new TreeSet<Integer>();
		for(int i: data){
			dataSet.add(i);
		}
		
		
		while(dataSet.size()>0){
			boolean check=false;
			Integer currData=null;
			temp.clear();
			Iterator<Integer> dataSetIterator = dataSet.iterator();
			if(dataSetIterator.hasNext()){
				currData=dataSetIterator.next();
				temp.add(currData);
				check=true;
			}
			
			if(check){
				for(int i=currData;dataSet.contains(i);i++){
					temp.add(i);
					dataSet.remove(i);
				}

				for(int i=currData;dataSet.contains(i);i--){
					temp.add(i);
					dataSet.remove(i);
				}
			}
			
			if(temp.size()>largest.size()){
				largest.clear();
				largest.addAll(temp);
			}
		}
		
		System.out.println(largest);
	}
	
}
