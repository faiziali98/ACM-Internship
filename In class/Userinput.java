public class Userinput// WIll not take input in runtime but when we run in prompt we will write java programname input.

{
	
	public static void main(String[] args)

	{
		float number1 = Integer.parseInt(args[0]);
		float number2 = Integer.parseInt(args[1]);
		float number3 = Integer.parseInt(args[2]);
		float sum = number1+number2+number3;
		float avg = sum/3;

        System.out.println (sum);
        System.out.println (avg);



	}

}