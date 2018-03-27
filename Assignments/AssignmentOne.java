public class AssignmentOne 
{
	public static String question1(String word, String sep, int count)
       
    {
     String newn =word;

     for (int km=0;km<count-1;km++)

     {
          newn = newn+sep+word;    
        }
     
       return newn;
     }

     public static void question3()
     {
	   int km=1;
	   int ll=1; int lk=20;
	   int num=1;
	   int inc=1;

       while (km!=0)
      {
         while (num<=lk)
        { 

         System.out.print (" "+num);        
       	 num=num+inc;
       	 
        }
         
         ll=ll+1;
         System.out.println("");

         if (ll==2)
         {	lk=40;
            inc=2;
            num=20; }
         else if (ll == 3)
         {
         	lk=61;
            inc=3;
            num=40;
         }

        else
        {
        	km=0;
        }


      }
  }

      public static float question4(int x, int y)
     {  // As we also have to include negetive powers, I have used float output instead of integer.
       int jj=1;
       float km=(float)x; 
       float mm=km;int kk=y;
       if (y<0)
       	{kk=-y;}
	   
	   while(jj<kk)
	   {
	   	km=km*mm;
	   	jj=jj+1;	   	
	   } 
       
       if (y<0)
       	{km=1/km;}

	   return km;
	}

	public static void question6(int m, int n)
     {
        int jj=0;
		while (jj<m)
		{
			for(int k=0;k<n; k++)
			{
				System.out.print ("x");
			}

			jj=jj+1;
			System.out.println("");

		    
		}

	}

	public static void question7(int y)
     {
	    
     String y1=Integer.toString(y); 
     int n=y1.length();

     for (int km=0;km<n;km++)
     { 
      char x1=y1.charAt(km);
      String jj = Character.toString(x1);
      System.out.println(jj);
     }  

	 }

	 public static boolean question5(String y)
     { 
       int n=y.length();
       int jj=0;
       int kk=0;
       int km=0;

     while (km<n)
     {
      char x1=y.charAt(km);
      if (x1=='g')
      {   
          jj=jj+1;
            int cc=km+1;
            int gg=km-1;
            if (cc>n-1)
              {cc=km-1;}
            char x2=y.charAt(cc);char x3=y.charAt(gg);
        if (x2=='g' || x3=='g') 
        {
              kk=kk+1;
        }
        
      }
      km=km+1;
     }

     if (jj==kk && jj!=0)
      {
       return true;
      }
     else
     {
      return false;
     } 


  }

	public static void question9(String[] y) 
     { 
        // Note For this function: Just give args as inpt
	   int n=y.length;
	   int [] count = new int[n];
	   int point=0;

	   for (int km=0;km<n;km++)
	   {
	   	 String cc=y[km];
	   	 if (km<5)
	   	 {
	   		for (int kl=km+1;kl<n;kl++)
	   		{    
	   			String kk=y[kl];
	   			if (kk.equals(cc))
	   			{
	   			  count[km]=count[km]+1;
	   			}
	   		}
	   	 } 
	   }
       
      int maxValue = count[0];  
      for(int i=1;i < count.length;i++)
     {  
       if(count[i] > maxValue)
       {  
        maxValue = count[i];
        point=i;
       }
      }

      System.out.println(y[point]);
      
     } 

     public static String question2 (String[] x) 

     { // Note: For this, just give args as input 

       String kk="";
       int n=x.length;
     
	    for (int km=0;km<n;km++)
	    {	
	     String input= x[km];
	     char x1= input.charAt(0);
	          x1=(Character.toUpperCase(x1));
         String jj = Character.toString(x1);
         kk=kk+jj;
        }

         return kk;

     }

     public static String question8(String x,String y)
       
       

     {
      String newn ="";
        int km=0; int n=x.length();
        int n1=y.length(); int ind=0; int ll=0;
        char y1= y.charAt(0);int count=-1;
        String y2=Character.toString(y1) ; int [] point = new int[n];

      while (km<n)

      {   char x1= x.charAt(km);
        String x2=Character.toString(x1) ;


        if (y2.equals(x2))
          
        { 
          ll=km+1;

          for (int kj=1;kj<n1;kj++)
         {  
           char y3= y.charAt(kj);
                 String y4=Character.toString(y3) ;
                 char x3= x.charAt(ll);
             String x4=Character.toString(x3) ;
                                
           if (y4.equals(x4)) {  
                   ind=ind+1;
                   ll=ll+1;}  

            else if (x3!=y3){   
                     ll=km;
             ind=0;
             break;}

          if (ind ==(n1-1))
                {
                  count=count+2;
                  point[count]=km;
                  km=km+(n1-1);
                  ind=0;
                }

         }

          }
          else
          {
            System.out.print("");

          }

           km=km+1;
      }

      if (ind==0)
      {   
        point[count+2]=n;
        point[0]=0;
        for (int kk=2;kk<=count+1;kk=kk+2)
          {point[kk]=point[kk-1]+n1;}
        
        for (int jj=0;jj<=count+1;jj=jj+2)

        {newn =newn+x.substring(point[jj],point[jj+1]);}
          //newn = x.substring(0,point)+x.substring(point+n1,n);
      }
      else 
      {
        newn = x; 
      }
          return newn;


     }

     public static void main(String[] args)

    {
    
  }

}