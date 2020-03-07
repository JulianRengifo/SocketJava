package Services;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Connection  {

	public Server() throws IOException {
		super("server");
		// TODO Auto-generated constructor stub
	}
	
	public void onServer () {
		
		System.out.println("Server> Running.....");
		
		try {
			
			System.out.println("Serever> Waiting...");
			
			while (true) {
			
		s = ss.accept();
		System.out.println("Client online.....");
		
		outputClient = new DataOutputStream(s.getOutputStream());
		outputClient.writeUTF("Petition Recived");
		
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
	}
}
