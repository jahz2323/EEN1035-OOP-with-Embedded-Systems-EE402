package App;

import java.lang.*;
import java.awt.*;


public class helloworld extends Object {
	
	private String name; 
	public helloworld(String name_) {
		 name = name_; 
	}
	public void display() {
		System.out.println("hello! " + name ); 
	}
	public boolean equals(helloworld object) {
		if(object.name == this.name) {
			return true; 
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		helloworld jahz = new helloworld("jahz");
		helloworld kaye = new helloworld("kaye");
		kaye.display();
		jahz.display();
		if(kaye.equals(jahz)) {
			System.out.println("they are the same");
		}
		else {
			System.out.println("they are different");
		}
//		String s = new String("Hello World!");
//		StringBuffer buffer = new StringBuffer(s);
//
//		buffer.insert(5, " to the");
//
//		String t = buffer.toString();
//		System.out.println(t);
		
		
	}
}


