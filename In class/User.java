public class User
{
   public static void main(String args[])
   {
      int a;
      float b;
      String s;
 
      String in = new String(System.in);
 
      System.out.println("Enter a string");
      s = in.nextLine();
      System.out.println("You entered string "+s);
 
      System.out.println("Enter an integer");
      a = in.nextInt();
      System.out.println("You entered integer "+a);
 
      System.out.println("Enter a float");
      b = in.nextFloat();
      System.out.println("You entered float "+b);   
   }
}