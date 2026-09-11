package com.FileHandlingAssignment2.Question2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringBasedFileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string you to add in the file : ");
		String str =sc.nextLine();
		File file=new File("StringBAsed.txt");
		
		FileWriter fw=new FileWriter(file);
		fw.write(str);
		
		fw.close();
		BufferedReader bf=new BufferedReader(new FileReader(file));
		//System.out.println(bf.readLine());
		String strread=(bf.readLine());
		
		bf.close();
		
		String uppercase=strread.toUpperCase();
		String[] stringarr=strread.split(" ");
		int vowels=0;
		int consonants=0;
		for( int i =0;i<uppercase.length();i++) {
			char ch=uppercase.charAt(i);
			if(ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vowels++;
			}
			else if(ch>='A' && ch<='Z') {
				consonants++;
			}
		}
		
		int wordlen=0;
		String loneststring ="";
		for(String ele:stringarr) {
			if (ele.length()>wordlen) {
				wordlen = ele.length();
				loneststring=ele;
			}
				
		}
		
		String revstr = "";
		for(int i=0;i<strread.length();i++) {
			revstr=strread.charAt(i)+revstr;
		}
		
		
		System.out.println("number of words : "+stringarr.length);
		System.out.println("number of vowels : "+vowels);
		System.out.println("number of consonants : "+ consonants);
		System.out.println("Longest word : "+loneststring);
		System.out.println("upper case : "+ uppercase);
		System.out.println("reveser of string : "+revstr);
		
	}

}
