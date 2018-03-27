public class Functions2 {

	public static int calc(int x, String y, int z)
     {
	   int km=0;
       if (y.equals("x")){
       	 km=x*z;}
       else if (y.equals("+")){ 
       	 km=x+z;}

       	return km;

	}

	public static void main(String[] args)

    {
	    int i= Integer.parseInt(args[0]);
	    String j= args[1];
	    int m= Integer.parseInt(args[2]);

	    int k= calc (i,j,m);
	    System.out.println(k);

	}
}