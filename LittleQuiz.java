import java.util.Scanner;

public class LittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int q1, q2, q3, correct = 0;

// first question about capital of CT
		System.out.println( "Q1) What is the capital of Conneticut?" );
		System.out.print( "\t1) Manchester\n\t2) Hartford\n\t3) Tampa\n> " );
		q1 = keyboard.nextInt();
		if ( q1 == 2 )
		{
			System.out.println( "\nThat's right!\n" );
			correct++;
		}
		else
			System.out.println( "\nSorry, the capital of Alaska is Juneau.\n" );

//  Second question about strings
		System.out.println( "Q2) Can you store the value \"cat\" in a variable of type int?" );
		System.out.println( "\t1) yes" );
		System.out.println( "\t2) no" );
		System.out.print( "\n> " );
		q2 = keyboard.nextInt();
		if ( q2 == 2 )
		{
			System.out.println( "\nThat's right!\n" );
			correct++;
		}
		else
		System.out.println( "\nSorry, \"cat\" is a string. Ints can only store numbers.\n" );

//  Third question is for math
		System.out.println( "Q3) What is the result of 9+6/3?" );
		System.out.print( "\t1) 5\n\t2) 11\n\t3) 15/3\n> " );
		q3 = keyboard.nextInt();

		if ( q3 == 2 )
		{
			System.out.println( "\nThat is correct!\n\n" );
			correct++;
		}
		else
			System.out.println( "\nSorry, 9+(6/3) is equal to 11.\n\n" );

		System.out.println( "Overall, you got " + correct + " out of 3 correct." );
		System.out.println( "Thanks for playing!");
	}
}
