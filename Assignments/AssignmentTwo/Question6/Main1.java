import java.util.Scanner;
 
public class Main1
{
	public static void main(String args[])
	{
		String s1;
		String s2;
		Scanner in = new Scanner(System.in);
		System.out.println("Write first number");
		s1 = in.nextLine();
		in = new Scanner(System.in);
		System.out.println("Write Second number");
		s2 = in.nextLine();

		System.out.println("Using String as input and output");
		Longer n=new Longer();// Using Strings as input and output Arguments
		System.out.println("Subtract = "+n.substract(s1,s2));
		System.out.println("Addition = "+n.sum(s1,s2));

		// Using Longer as input and output arguments
		System.out.println("");
		System.out.println("Now using Longer as input and output");
		Longer i1=new Longer(s1);
		Longer i2=new Longer(s2);
		Longer n2=new Longer();
		Longer n3=new Longer();

		Longer1 n1=new Longer1();
		n2=n1.sub(i1,i2);
		n3=n1.add(i1,i2);
		System.out.println("Subtract = "+n2.global);
		System.out.println("Addition = "+n3.global);
	}
}