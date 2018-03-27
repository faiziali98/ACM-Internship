public class Main

{   public static void main(String[] args)
	{ 
		String[] cities = {"Lahore","Karachi","Islamabad","Los Angles"};
		Country a=new Country("Pakistan",cities);
		City y=new City("Peshawar");		
		a.listCities();
		System.out.println("");
		a.addCity(y);
		System.out.println("");
		a.removeCity("Los Angles");
		System.out.println("");
		a.addCity("Los Angles");
	    //System.out.println(k);

    } 
}