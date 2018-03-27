public class Fibbonaci // Detergen
{
    // Every recursive fuction should have terminating condition otherwise it will run forever.
	public static int fibonacci(int n)
	{
		if (n==0)
		{
			return 0;
		}
		else if (n==1)
		{
			return 1;
		}
		else
		{
			return fibonacci (n-1) + fibonacci(n-2);
		}
	}
	public static void main(String[] args)

    {
	    int j=Integer.parseInt(args[0]);int j1=0;
	    while (j1<=j){
	    int k=fibonacci(j1);
	    System.out.println(k);
	    j1=j1+1;}
	}
} 