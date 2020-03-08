package Services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import java.net.ServerSocket;

public class MainServerThread {
	
	public static void main(String[]args)throws IOException{

		System.out.println("Serever> Runnig...");
		
		ServerSocket ss = new ServerSocket(1234);
		
		int idClient = 0;
		
		while (true) {
			
			System.out.println("Serever> Waiting...");
			
			Socket s = new Socket();
			
			s= ss.accept();
			
			
			
			ServerThread serverThread = new ServerThread(s, idClient);
			serverThread.start();
			idClient ++;
		
	


}
	}
}
