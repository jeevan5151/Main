package demo;

import package1.A;

public class DemoAccessModifiers {

	public static void main(String[] args) {

		A a1 = new A();
		
		a1.method1A();
		
		int result = a1.method2A(3);
		System.out.println("result = "+result);
		
	}

}