public class MyString
{
	String x;

	public MyString(String y)
	{
		x=y;
	}

	public int calculateChar()
	{
		String x1 = x.replaceAll("\\s","");
		int n=x1.length();
		return n;
	}

	public String subString(int a, int b)
	{   
		String x2=x.substring(a,b);
		return x2;
	}

	public boolean isEqual(String b)

	{
		int n2=x.length();
		int n1=b.length();
		int z=0;

		if (n2==n1)
		{

		for (int k=0;k<n2;k++)
			{ 
				char j=x.charAt(k);
				char j1=b.charAt(k);
			if (j==j1)
				{z=z+1;}
			else 
				{break;}}
		}
		else
		{
			return false ;
		}

		if (z==n2)
		{
			return true;
			

		}
		else
		{
			return false;
			

		}
	}

	public char[] toCharArray()
	{

		int n=x.length();
		char[] hm = new char[n];

		for (int k=0;k<n;k++)
			{hm[k]=x.charAt(k);}
		return hm;

	}

	public String reverseCaps()
	{
		int n=x.length();
		String newn="";

		for (int k=0;k<n;k++)
		{	
			int n1=(int) x.charAt(k);

			if (n1>64 && n1<91)
			{
				newn=newn+String.valueOf(Character.toChars(n1+32));
			} 
			else if (n1>96 && n1<123)
			{
				newn=newn+String.valueOf(Character.toChars(n1-32));
			} 
			else if (n1==32)
			{
				newn=newn+String.valueOf(Character.toChars(n1));
			}
 		}

 		return newn;
 	}

 	public boolean isPalindrome()
 	{
 		int n=x.length();
 		String newn1="";int k=n-1;

 		while (k>=0)
 		{
 			newn1=newn1+Character.toString(x.charAt(k));
 			k=k-1;
 		}

 		if (x.equals(newn1))
 			{return true;}
 		else 
 			{return false;}

 	} 

 	public boolean palindromeRecurse(String y)
 	{
 		int n;
 		char n1;
 		char n2;
 		
        if(y.length() == 0 || y.length() == 1)
        {
           return true;
        }
        else
        {
            n=y.length();
            n1=y.charAt(0);
            n2=y.charAt(n-1);
        } 

        if(n1 == n2)
           {return palindromeRecurse(y.substring(1, y.length()-1));}

		   return false;
    }


}