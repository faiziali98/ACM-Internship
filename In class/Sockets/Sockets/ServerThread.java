import java.net.*;
import java.util.*;
import java.io.*;

public class ServerThread implements Runnable {
		Socket servConn;
		Scanner fromClient;
		PrintWriter toClient;
		Scanner fromUser;
		ServerThread(Socket _incoming) throws Exception{
			servConn = _incoming;
			fromClient = new Scanner(_incoming.getInputStream());
			System.out.println("Connection has been made");
			toClient = new PrintWriter(_incoming.getOutputStream(), true);
		}

		public void run() {
			while(true) {

				try {
					if (fromClient.hasNext()) {
				    	System.out.println("Client Says: " + fromClient.nextLine());
					} 
				} catch(Exception e) {
					e.printStackTrace();
				}
			} 
		}
}