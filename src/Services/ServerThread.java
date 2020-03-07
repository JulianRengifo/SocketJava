package Services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread extends Thread {
	
	private String message;
	private Socket s;

	@Override
	public void run() {
		
try {
	
			
			while (true) {
			
		
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		while((message = input.readLine())!= null){
			System.out.println("Client>"+message);
		
		
		System.out.println("Clien offline.....");
		}
		
		System.out.println("Server> Stop.....");
		
			}
		
	}catch (IOException e) {
		System.out.println("Server>"+e.getMessage());
	
	}
	
		
		// TODO Auto-generated method stub
		super.run();
	}

}
