import java.io.*;
import java.net.*;

class Client {
	static Socket clientz;
	static BufferedReader userinput;
	static DataOutputStream out;
	static BufferedReader in;
	static void abc() throws Exception {
   		String a = userinput.readLine();
   			out.writeBytes(a+"\n");

				abc();
			}
		

	
	public static void main(String[] args) throws Exception {
		if (args.length != 0) {
				clientz = new Socket(args[0], 10176);
			} else {
				clientz = new Socket("localhost", 10176);
			}
			System.out.println("Connection Estabilished!");
			userinput = new BufferedReader( new InputStreamReader(System.in));
			out = new DataOutputStream(clientz.getOutputStream());
			in = new BufferedReader(new InputStreamReader(clientz.getInputStream()));
			abc();
		
	}
}

