package br.com.jsn.composite;

public class Demo {
	
	
	public static void main(String args []) {
		
		
		
		
		Component leaf = new Leaf();
		
		
		leaf.operaion();
		
		Component tree = new Composite();
		
		
		tree.add(leaf);
		
		tree.operaion();
		
	}

}
