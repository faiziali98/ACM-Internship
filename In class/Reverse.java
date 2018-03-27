public class Reverse
{
	public static String rev(String x,int n)
	{   
		String newn="";
		if ((n-1)==0)
		{
			return newn=newn+Character.toString(x.charAt(0));
		}
		else
		{   

			return newn=newn+Character.toString(x.charAt(n-1))+rev(x,n-1);

		}
	}

	public static String revw(String x,int n)	
	{
		int l=0;
		String newn="";
		for (int k=0;k<n;k++)
		{
			int n1=(int) x.charAt(k);
			if (n1==32)
				{l=k;
					break;}
		}

		int jj=l;

		while (jj<n)
			{
				newn=newn+Character.toString(x.charAt(jj));
				jj=jj+1;
			}
		jj=0;
		newn=newn+" ";
		while (jj<=l)
			{
				newn=newn+Character.toString(x.charAt(jj));
				jj=jj+1;
			}

			return newn;


	}

		public static void main(String[] args)

    {   
    	String s="Get You it";
    	int n=s.length();

	    System.out.println(rev(s,n));
	    System.out.println(revw(s,n));

	}
}