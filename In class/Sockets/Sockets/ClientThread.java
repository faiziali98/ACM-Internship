import java.net.*;
import java.util.*;
import java.io.*;

public class ClientThread implements Runnable {
	Socket servConn;
	Scanner fromUser;
	PrintWriter toServer;
	ClientThread(Socket _socket) throws Exception{
		servConn = _socket;
		toServer = new PrintWriter(servConn.getOutputStream(),true);
		fromUser = new Scanner(System.in);
	}
	public void run() {
		while(true) {
			if (fromUser.hasNext()) {
				toServer.println(fromUser.nextLine());
			}
		}
	}
}