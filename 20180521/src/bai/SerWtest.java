package bai;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerWtest {
	public static void main(String[] args) {
		try(ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("out.txt"));
			ObjectInputStream obh=new ObjectInputStream(new FileInputStream("out.txt"))	
				){
			Person p =new Person(12,"sadf");
			ob.writeObject(p);
			Person p1=(Person)obh.readObject();
			System.out.println(p1.toString());
		}catch(Exception io) {
			io.printStackTrace();
		}
	}
}
