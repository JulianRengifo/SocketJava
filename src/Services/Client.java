package Services;

import java.io.DataOutputStream;
import java.io.IOException;

import java.io.IOException;

public class Client extends Connection{

	public Client() throws IOException {
		super("client");
		// TODO Auto-generated constructor stub
	}
	
	public void OnClient(String client) {
		System.out.println(client+"Running...");
		
		try {
		outputServer = new DataOutputStream(s.getOutputStream());
		
		System.out.println("Client> Sending data to the server");
		for (int i = 0; i < 2; i++) {
			
		outputServer.writeUTF(client +">Mensaje numero"+ (i+1)+ "\n");
		}
		System.out.println(client+">Data Sent...");
		
		s.close();
		
		System.out.println("Client> Stop...");
		
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}

	
	}
}
