public class Country
{   
	String count;
  String [] cities = new String[1000];

  	public Country(String y,String[] x)
  	{   
        cities=x;
        count=y;
  	}
        public void addCity(City x)
        { 
          int n=cities.length;
          String [] c1=new String[n+1]; 
          int n1=c1.length;
          for (int k=0;k<n;k++)
          {
            c1[k]=cities[k];
          }
          String j=x.getCity();
          c1[n]=j;
          for (int k=0;k<n1;k++)
          {
            System.out.println(c1[k]);
          }

        }
        public void listCities()
        {
          int n=cities.length;
          for (int k=0;k<n;k++)
          {
            System.out.println(cities[k]);
          }
        }

        public void removeCity(String name)
        {          
          int n=cities.length;
          for (int k=0;k<n;k++)
          {
            if (cities[k].equals(name))
              {cities[k]="";}
          }
          for (int k=0;k<n;k++)
          {
            System.out.println(cities[k]);
          }
        }

        public void addCity(String name) 
        {
         int n=cities.length;
          String [] c1=new String[n+1]; 
          int n1=c1.length;
          for (int k=0;k<n;k++)
          {
            c1[k]=cities[k];
          }
          c1[n]=name;
          for (int k=0;k<n1;k++)
          {
            System.out.println(c1[k]);
          }
        }
        public String getCountry()
      {
        return count;
      }
          	

} 