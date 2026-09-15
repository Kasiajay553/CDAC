package com.serverSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class cilentClass {

	public static void main(String[] args) {
		try(Socket socket =new Socket("localhost",8000);
				PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
				BufferedReader bw=new BufferedReader(new InputStreamReader(socket.getInputStream()))){
			
			pw.println("hello ");
			System.out.println(bw.readLine());
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
