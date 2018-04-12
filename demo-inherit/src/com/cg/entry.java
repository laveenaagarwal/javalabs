package com.cg;

import com.cg.Animal;

public class entry {
	public static void main(String[] args){
		Animal anref;
		//anref= new Animal("white",30);
		anref = new Dog();
		anref.eat();
		anref.roam();
	}

}
