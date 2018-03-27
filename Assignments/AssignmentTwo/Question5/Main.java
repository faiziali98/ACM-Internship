import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  { 
    String s="";
    int q=0;
    int q1=0;

    Scanner in = new Scanner(System.in);

    System.out.println("What is your String");
    s = in.nextLine();
    MyString a=new MyString(s);
    int z=a.calculateChar();
    System.out.println (z);
    System.out.println ("");

    System.out.println("What is your Lower Bound");
    q = in.nextInt();
    System.out.println("What is your Upper Bound");
    q1 = in.nextInt();

    String l=a.subString(q,q1);
    System.out.println (l);
    System.out.println ("");

    String s1="";
    in = new Scanner(System.in);
    System.out.println("What is your 2nd String");
    s1 = in.nextLine();

    boolean k=a.isEqual(s1);
    System.out.println (k);
    System.out.println ("");

    char[] h=a.toCharArray();
    
    String newn=a.reverseCaps();
    System.out.println (newn);
    System.out.println ("");

    boolean k1=a.isPalindrome();
    System.out.println (k1);
    System.out.println ("");

    String x1="";
    in = new Scanner(System.in);
    System.out.println("Type a word to check if its a palindrome.");
    x1 = in.nextLine();
        if(a.palindromeRecurse(x1))
            System.out.println(x1 + " is a palindrome");
        else
            System.out.println(x1 + " is not a palindrome");
  }
}