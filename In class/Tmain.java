import java.util.Scanner;

public class Tmain
{
	public static void main(String [] args)
	{
		try 
	{
		int s1;
		int s2;

		Scanner in = new Scanner(System.in);
		System.out.println("Write first number");
		s1 = in.nextInt();
		in = new Scanner(System.in);
		System.out.println("Write Second number");
		s2 = in.nextInt();

		MyThread dt=new MyThread(s1);
		MyThread2 mt=new MyThread2(s2);

		Thread t1=new Thread(dt);
		Thread t2=new Thread(mt);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

		catch(Exception e)
		{

		} 
	}
}