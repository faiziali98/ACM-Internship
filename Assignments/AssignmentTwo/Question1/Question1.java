import java.util.Scanner;
 
public class Question1
{
   public static void main(String args[])
   {
      String a;
      String s;
 
      Scanner in = new Scanner(System.in);
 
      System.out.println("What is your first name?");
      s = in.nextLine();
 
      System.out.println("What is your last name?");
      a = in.nextLine();

      System.out.println("Your full name is "+s+" "+a);
   }
}