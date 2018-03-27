import java.net.*;
import java.util.*;
import java.io.*;

public class Serversocket {
	public static void main(String[] args) throws Exception{
			ServerSocket server = new ServerSocket(10176);
			Socket client = server.accept();
			ServerThread C = new ServerThread(client);
			Thread T = new Thread(C);	
			Scanner fromUser = new Scanner(System.in); // command line input.
			PrintWriter toClient = new PrintWriter(client.getOutputStream(), true);		
			T.start();
			while (true) {
				if (fromUser.hasNext()) {
						toClient.println(fromUser.nextLine()); // fromuser t
				} 
		}
}
}