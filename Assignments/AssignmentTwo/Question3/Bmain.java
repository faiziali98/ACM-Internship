public class Bmain

{   public static void main(String[] args)
	{ 
		String[] count = {"India","Pakistan","Bangladesh","America"};
		String[] cities = {"Lahore","Karachi","Islamabad","Los Angles"};
		Continent a=new Continent("Asia",count);
		Country y=new Country("Malysia",cities);		
		a.listCountries();
		System.out.println("");
		a.addCountry(y);
		System.out.println("");
		a.removeCountry("America");
		System.out.println("");
		a.addCountry("America");

    } 
}