package com.nst.challenger;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class FireCracker {

	
	
	public FireCracker() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] boxWidthStr=input.split(" ");
		int boxWidth[]=new int[boxWidthStr.length];
		for (int i=0;i<boxWidth.length;i++) {
			boxWidth[i]=Integer.valueOf(boxWidthStr[i]);
		}
		
		List<BoxStack> floor=new LinkedList<>();
		
		
	}
	
	public class Floor{
		List<BoxStack> boxStacks=new LinkedList<FireCracker.BoxStack>();
		
		public Floor(Box b) {
			boxStacks.add(new BoxStack(b));
		}
		
		
		public void add(Box b){
			boolean added=false;
			int i=0;
			
			if(boxStacks.get(0).addTop(b)){
				return;
			}
			
						
		}
		
		public void add(final BoxStack b,final int i){
			boolean added=false;
			
			if(boxStacks.get(i).addTop(b.getBaseBox())){
				return;
			}
			
			if(!boxStacks.get(i).canAdd(b.getBaseBox())){
				boxStacks.add(i, b);
			}else{
				BoxStack stack=boxStacks.get(i);
				for(int j=0;j<stack.size();j--){
					if(stack.stack.get(j).canAdd(b.getBaseBox())){
						stack.stack.subList(j, stack.stack.size());
					}
				}
			}
						
		}
		
	}
	
	public class BoxStack{
		List<Box> stack=new LinkedList<>();
		
		
		public BoxStack(Box baseBox) {
			super();
			stack.add(baseBox);
		}
		
		

		public Box getBaseBox(){
			return stack.get(0);
		}
		
		public boolean addTop(Box b){
			Box stackTop = stack.get(stack.size());
			if(stackTop.canAdd(b)){
				stack.add(b);
				return true;
			}else return false;
		}
		
		
		public boolean canAdd(Box b){
			return this.getBaseBox().canAdd(b);
		}
	}
	
	public class Box{
		final int width;
		final int pos;
		
		public Box(int width, int pos) {
			super();
			this.width = width;
			this.pos = pos;
		}
		
		public boolean canAdd(Box b){
			return (this.width>=b.width)&&(this.pos<b.pos);
		}
	}
}
