public class Userinput1// WIll not take input in runtime but when we run in prompt we will write java programname input.

{
	
	public static void main(String[] args)

	{
		String number1 = args[0];
		String name = "Gohar";
		String name1 = "Arif";
		String name2 = "Ali";


		if (number1.equals(name) || number1.equals(name2) || number1.equals(name1)) 

          {
          	System.out.println ("Logged In");   
          }

          else 
          {
          	System.out.println ("Error"); 
 
          }

        


	}

}