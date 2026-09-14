package com.FileHandlingAssignment2.Question1;
import java.util.*;
import java.io.*;

public class CharacterBasedReadAndWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string you to add in the file : ");
		String str =sc.nextLine();
		File file=new File("pratice.txt");
		
		FileWriter fw=new FileWriter(file);
		fw.write(str);
		System.out.println("the data tranfer done");
		
		fw.close();
		FileReader fr=new FileReader(file);
		int ch = 0;
		int upperCase = 0;
		int lowerCase = 0;
		int digits = 0;
		int specialCharacters = 0;
		int spaces = 0;
		while((ch=fr.read())!=-1) {
			char c=(char)ch;
			if(Character.isUpperCase(c)) {
				upperCase++;
			}
			else if (Character.isLowerCase(c)) {
	                lowerCase++;
	            } 
	         else if (Character.isDigit(c)) {
	                digits++;
	            } 
	         else if(Character.isWhitespace(c)) {
	        	 spaces++;
	         }
	         else {
	        	 specialCharacters++;
	         }
		}
		System.out.println("the upper case letters are: "+upperCase);
		System.out.println("the lowert  case letters are: "+lowerCase);
		System.out.println("the numbers of digits are: "+digits);
		System.out.println("the special characters are: "+specialCharacters);
		System.out.println("the spaces are: "+spaces);
		

	}

}
