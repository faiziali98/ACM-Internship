import java.math.BigInteger;

public class Longer1
{
	
	public Longer1()
	{
		
	}
	public Longer add(Longer x , Longer y)
	{
		String x1=x.global;
		String x2=y.global;
		Longer n=new Longer();
		Longer n4=new Longer(n.sum(x1,x2));
		return n4;
	}
	public Longer sub(Longer x , Longer y)
	{
		String x1=x.global;
		String x2=y.global;
		Longer n=new Longer();
		Longer n4=new Longer(n.substract(x1,x2));
		return n4;
	}
}