//This program is a quiz created by Sham
import java.util.Scanner;
public class shortquiz
{
  public static void main( String[] arg)
  {
    Scanner keyboard = new Scanner (System.in);
    int q1, q2, q3, q4, q5, correct = 0;
  // First question about capital of CT
    System.out.println("Q1) What is the capital of Connecticut?");
    System.out.print ("\t1) Rocky Hill \n\t2) Hartford \n\t3) Tampa \n") ;
    q1 = keyboard.nextInt ();
    if (q1 == 2)
    {
        System.out.println("\nThat is right!\n");
        correct++;
    }
    else
      System.out.println("\nSorry, the Capital is Hartford.\n");
//Second question about German
System.out.println("Q2) When is German?");
System.out.print ("\t1) Today \n\t2) Tomorrow \n\t3) Next Week") ;
q2 = keyboard.nextInt ();
if (q2 == 3)
{
    System.out.println("\nYes!!! How did you know??\n");
    correct++;
}
else
  System.out.println("\nSorry, you are wrong\n");
//Third question test your math skills
System.out.println("Q3) What is the result of 9+6/3?");
System.out.print ("\t1) 5 \n\t2) 11 \n\t3) 15") ;
q3 = keyboard.nextInt ();
if (q3 == 2)
{
    System.out.println("\nYes!!! You're a genius!\n");
    correct++;
}
else
  System.out.println("\nSorry, that's not right\n");
//Fourth question about a fun fact
System.out.println("Q4) How many letters does the longest English Word Have?");
System.out.print ("\t1) 675 \n\t2) 150,873 \n\t3) 189,819") ;
q4 = keyboard.nextInt ();
if (q2 == 3)
{
    System.out.println("\nYes!!! That's a HUGE word!\n");
    correct++;
}
else
  System.out.println("\nSorry, but that's wrong. The correct answer is 189,819 letters.\n");
//Fifth question is about pockets in jeans
System.out.println("Q5) What was supposed to be stored in the original jeans' pocket?");
System.out.print ("\t1) A cigar \n\t2) A pocket watch \n\t3) Cell phone") ;
q5 = keyboard.nextInt ();
if (q5 == 2)
{
    System.out.println("\nYes!!! That's right!\n");
    correct++;
}
else
  System.out.println("\nSorry, but it actually was a pocket watch.\n");
  System.out.println ("Overall, you got " + correct + " out of five");
  System.out.println("Thanks for playing!");
  }
}
