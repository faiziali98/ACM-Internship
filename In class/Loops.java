public class Loops // Use of loops

{
	public static void main(String[] args)

	{
		String number1 = args[0];
		int counter = 0;

		while (counter<20)
		{
			System.out.println (number1);
		    counter=counter+1;
		}

		// int i=0 then no need of int in the loop 

		for (int i=0; i<20; i++)
		{
			System.out.println (number1);
		}

	}

}