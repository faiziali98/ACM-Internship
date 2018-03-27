public class Functions1 {
	public static String monkey(String x, String y)
     {
	   String km="";
       if (x.equals(y)){
       	 km="True";}
       else{ 
       	 km="False";}

       	return km;

	}

	public static void main(String[] args)

    {
	    String i= args[0];
	    String j= args[1];

	    String k= monkey (i,j);
	    System.out.println(k);

	}
}