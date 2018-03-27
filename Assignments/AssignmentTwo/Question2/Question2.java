import java.util.Scanner;

public class Question2
{
	public static float sqrt(float x, float a, float b, float temp) {

     float ab=(a+b)/2;
     float avg= (float)Math.round(ab*100000)/100000f;
     float x1=(float)Math.round(x*100000)/100000f;
     float avgs=avg*avg;
     float avgsq=(float)Math.round(avgs*100000)/100000f;

     if (avgsq==x1 || temp == avg)
        {return avg;}
     else if (avgsq>x1)
        {b=avg;System.out.println("mid="+avg+" Mid Square="+avgsq+" too high\n");}
          else 
           {a=avg;System.out.println("Mid="+avg+" Mid Square="+avgsq+" too low\n");}
          temp=avg;
          return sqrt(x1,a,b,temp);


}
	public static void main(String[] args)

    { 
    	float number1=1;
      Scanner in = new Scanner(System.in);
      System.out.println("Write the number");
      float temp=0;

      number1 = in.nextFloat();
	  float number2 = 0;
	  float number3 = number1;

	  float k=sqrt(number1, number2, number3,temp);
	  System.out.println ("Square Root = " +k);
    } 
}