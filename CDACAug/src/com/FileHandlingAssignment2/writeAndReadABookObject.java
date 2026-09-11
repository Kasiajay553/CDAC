package com.FileHandlingAssignment2.Question3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class writeAndReadABookObject {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Book b1=new Book(21,"java","ajay",4000);
		Book b2=new Book(21,"C++","ajay",3500);
		Book b3=new Book(21,"c#","ajay",3240);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.txt"));
		oos.writeObject(b1);
		oos.writeObject(b2);
		oos.writeObject(b3);
		
		System.out.println("THE OBJECT WRITE IS COMPLTED ");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.txt"));
	
		
			Book b=(Book)ois.readObject();
			b.display(); 
			System.out.println("--------------------");
		if(b.price>500) {
			b.price-=b.price*0.1f;
		}
		b.display();
		
		
		
	}

}
