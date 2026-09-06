package com.java.Assignment2;
import java.util.Scanner;
public class TemperatureConversion {
	static int converttemperature(int a) {
		return (a*9/5)+32;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int celsius = sc.nextInt();
		int fahrenheit = converttemperature(celsius);
		if(fahrenheit>100) {
			System.out.println("the temperature is above 100 " );
		}
		else {
			System.out.println("temperature is : "+fahrenheit);
		}

	}

}
