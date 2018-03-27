public class MyThread implements Runnable
{
	int j=0;
	public MyThread(int k)
	{
		j=k;
	}

	public void run()
	{
		int x=1;
		while (x<101)
		{
			int m=j*x;
			String m1=Integer.toString(m);
			String m2=Integer.toString(j);
			String m3=Integer.toString(x);
			System.out.println(m2+" * "+m3+" = "+m1);
			x++;
			try {
			Thread.sleep(5);
		} catch(Exception e)
		{
			System.out.println("Error!!");
		}
		}
	}
}