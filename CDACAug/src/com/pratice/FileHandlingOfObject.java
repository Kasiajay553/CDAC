package com.pratice;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandlingOfObject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("student.csv",true);
		BufferedReader bf=new BufferedReader(new FileReader("student.csv"));
		String str;
		ArrayList<StudentFileHandling> al=new ArrayList<>();
		while((str=bf.readLine())!=null) {
		
		System.out.println(str);
		String[] data=str.split(" ");
		al.add(new StudentFileHandling(Integer.parseInt(data[0]), data[1]));

		}
		for(StudentFileHandling ele: al) {
			System.out.println();
		}
		bf.close();
		fw.close();

	}

}
