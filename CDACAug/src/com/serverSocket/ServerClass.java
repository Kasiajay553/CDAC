package com.serverSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
	public static void main(String[] args) {
		try(ServerSocket server =new ServerSocket(8000);
			Socket cilent=server.accept();
				BufferedReader br=new BufferedReader(new InputStreamReader(cilent.getInputStream()));
				PrintWriter pw=new PrintWriter(cilent.getOutputStream(),true)){
			String str=br.readLine();
			System.out.println("server says : "+str);
			pw.println(str);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
