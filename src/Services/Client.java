package Services;

import java.io.DataOutputStream;
import java.io.IOException;

public class Client extends Connection{

	public Client(String type) throws IOException {
		super("client");
		// TODO Auto-generated constructor stub
	}
	
	public void onClient() {
		
		try {
		outputServer = new DataOutputStream(s.getOutputStream());
		
		outputServer.writeUTF("Este es un mensaje para el servidor de Cliente");
		
		s.close();
		
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}

	
	}
}
