public class Loops1 // Use of loops

{
	public static void main(String[] args)

	{
		
		int i = 1;
		int j = 1;


		while (i!=0)
		{
			for(int k=0;k!=i; k++)
			{
				System.out.print ("*");
			}

			if (i == 5)
			{
				j=j*(-1); 
			}
			i=i+j;
			System.out.println("");

		    
		}



	}

}