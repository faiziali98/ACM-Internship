public class Functions4 {
	public static String comp(String x,int y)
       
       

     {
	    String newn ="";
	    char x1= x.charAt(y-1);
	    char x2= x.charAt(y-2);
	    char x3= x.charAt(y-3);
	    char x4= x.charAt(y-4);

	    if (x1 == ('t') && x2==('n') && x3==('e') && x4==('m'))
	    {
	    	
	       newn = x.substring(0,y-4)+"MENT";

    	 }

    	 else 
    	 	newn=x;
       
       return newn;


     }

	public static void main(String[] args)

    {
	    String input= args[0];
        int n=input.length();
	   
	    String k= comp (input,n);
	    System.out.println(k);

	}
}
