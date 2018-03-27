import java.util.Scanner;
 
public class Main1
{
	public static void main(String args[])
	{
		int s;
		String s1="";
 		Scanner in = new Scanner(System.in);

	  	System.out.println("Press 1 to calculate charaters."); 
      	System.out.println("Press 2 to reverse cap."); 
	  	System.out.println("Press 3 to find if palindrome.");
		s = in.nextInt();
		System.out.println ("");

	  	in = new Scanner(System.in);
	  	System.out.println("What is your String");
        s1 = in.nextLine();
        System.out.println ("");

	  	MyString a=new MyString(s1);

	  	if (s==1)
	  		{
	  			int z=a.calculateChar();
   				System.out.println (z);
    			System.out.println ("");
			}
		else if (s==2)
			{
				String newn=a.reverseCaps();
    			System.out.println (newn);
    			System.out.println ("");

			} 
		else if (s==3)
			{
				boolean k1=a.isPalindrome();
    			System.out.println (k1);
    			System.out.println ("");
			} 
		else
			{
				System.out.println("Sorry Take some number from menu");
			}
	}
}