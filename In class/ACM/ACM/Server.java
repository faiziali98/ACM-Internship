import java.io.*;
import java.net.*;
public class Server {
	public static void main(String args[]) throws Exception {
		ServerSocket welcomeSocket = new ServerSocket(10176);
		while (true) {
      		Socket socks = welcomeSocket.accept();
      		Serverthread h = new Serverthread(socks);
      		Thread t = new Thread(h);
			t.start();
      	}
	}
}