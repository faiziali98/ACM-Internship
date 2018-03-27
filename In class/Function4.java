public class Functions4 {
	public static String comp(String x,int y)

     {
	   
	    char x1= x.charAt(y);
	    char x2= x.charAt(y-1)
	    char x3= x.charAt(y-2);
	    char x4= x.charAt(y-3);

	    if (x1 == ('t') && x2==('n') && x3==('e') && x4==('m'))
	    {
	       x=replace(CharSequence "ment",
             CharSequence "MENT");
	    }



     }

	public static void main(String[] args)

    {
	    String input= args[0];
        int n=input.length()
	   
	    String k= comp (input,n);
	    System.out.println(k);

	}
}
