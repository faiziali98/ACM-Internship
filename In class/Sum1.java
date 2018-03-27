public class Sum1
{
	public int sum()

        {   
        	int s=0;
            for (int k=1;k<=1000;k++)
            {if (k%3==0 || k%5==0)
 				{	s=s+k;}}
            return s;
 				
        }
}