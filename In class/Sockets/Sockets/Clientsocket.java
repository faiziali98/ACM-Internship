import java.net.*;
import java.util.*;
import java.io.*;

public class Clientsocket  {
	public static void main(String[] args) throws Exception{
		Socket servConn = new Socket("localhost", 10176);
		Scanner fromServer = new Scanner(servConn.getInputStream());
		ClientThread ST = new ClientThread(servConn);
		Thread T = new Thread(ST);
		T.start();
		while(true) {
			if (fromServer.hasNext()) {
				System.out.println("Server Says: " + fromServer.nextLine());
			}
		}
	}
}