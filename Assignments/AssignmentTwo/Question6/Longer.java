import java.math.BigInteger;

public class Longer
{
	String global;
	
	public Longer()
	{
		// For empty constructor
	}
	public Longer(String x)
	{
		// for input argument constructor
		BigInteger a = new BigInteger(x);
		global=""+a;
	}


	public String sum(String x,String y)
	{
		
		BigInteger a = new BigInteger(x);
		BigInteger b = new BigInteger(y);
		BigInteger r = a.add(b);
		String r1=""+r;
		return r1;
	}
	public String substract(String x,String y)
	{
		
		BigInteger a = new BigInteger(x);
		BigInteger b = new BigInteger(y);
		BigInteger r = a.subtract(b);
		String r1=""+r;
		return r1;
	}
}