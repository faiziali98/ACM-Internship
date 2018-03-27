import java.util.Scanner;
 
public class Main
{
   public static void main(String args[])
   {
   	  String[] cities = {"Lahore","Karachi","Islamabad","Los Angles"};
   	  Country a=new Country("Pakistan",cities);
      String b="";
      int s;
 
      Scanner in = new Scanner(System.in);
 
      System.out.println("Press 1 to add a City."); 
      System.out.println("Press 2 to list Cities."); 
	  System.out.println("Press 3 to remove a City.");

      s = in.nextInt();

      if (s==2)
      	{a.listCities();}
		else if (s==1)
        {System.out.println("Write the name of the City you want to add");
        in = new Scanner(System.in);
        b = in.nextLine();
        System.out.println("");
        a.addCity(b);}
		else if (s==3)
		{System.out.println("Write the name of the City you want to remove");
		in = new Scanner(System.in);
        b = in.nextLine();
        System.out.println("");
        a.removeCity(b);}
        else
        	{System.out.println("Sorry Take some number from menu");}



   }
}
		

