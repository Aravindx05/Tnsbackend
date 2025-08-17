package com.kprit.tns.backendtraining.oopsdemo;

public class AccessModifiersMain {

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.a = 100;
		// obj.name = "KPRIT"; //Cannot access Private variable
		obj.num=50;
		obj.no = 49;
		obj.print();
	}

}
