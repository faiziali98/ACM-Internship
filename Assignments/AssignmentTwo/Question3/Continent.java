public class Continent
{   
	String cont;
  String [] count = new String[1000];

  	public Continent(String y,String[] x)
  	{   
        cont=y;
        count=x;
  	}
        public void addCountry(Country x)
        { 
          int n=count.length;
          String [] c1=new String[n+1]; 
          int n1=c1.length;
          for (int k=0;k<n;k++)
          {
            c1[k]=count[k];
          }
          String j=x.getCountry();
          c1[n]=j;
          for (int k=0;k<n1;k++)
          {
            System.out.println(c1[k]);
          }

        }
        public void listCountries()
        {
          int n=count.length;
          for (int k=0;k<n;k++)
          {
            System.out.println(count[k]);
          }
        }

        public void removeCountry(String name)
        {          
          int n=count.length;
          for (int k=0;k<n;k++)
          {
            if (count[k].equals(name))
              {count[k]="";}
          }
          for (int k=0;k<n;k++)
          {
            System.out.println(count[k]);
          }
        }

        public void addCountry(String name) 
        {
         int n=count.length;
          String [] c1=new String[n+1]; 
          int n1=c1.length;
          for (int k=0;k<n;k++)
          {
            c1[k]=count[k];
          }
          c1[n]=name;
          for (int k=0;k<n1;k++)
          {
            System.out.println(c1[k]);
          }
        }
      }
