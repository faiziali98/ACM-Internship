public class Functions // Use of Functions

// Syntax:
// return type (like int) name (like adder) (int a,int b)
// {
// int sum=a+b;
// return sum;
//}
// If we dont want to call any output then we use following:
//
//
//

{
	public static int sum(int x, int y)
     {
	
       int abc = x+y;
       return abc;

	}

	public static void main(String[] args)

    {
	    int i=10;
	    int j=10;

	    int k=sum (i,j);
	    System.out.println(k);

	}
}