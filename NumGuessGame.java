import java.util.Random;
import java.util.Scanner;

    public class NumGuessGame 
    {
        public static void main(String[] args) 
        {
            Random Random_number= new Random();
            int right_guess=Random_number.nextInt(100);

            int turns=0;
            Scanner S1=new Scanner(System.in);
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
            System.out.println("Hello User! Welcome to the number guessing game." );
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
            System.out.println("Guess a number between [1-100], You have 10 turns ! " );
            System.out.println("Enter the number :");

            int guess;
            int i=0;

            boolean win=false;
            while(win==false) 
            {
                guess=S1.nextInt();
                turns++;

                if(guess==right_guess) 
                {
                    win=true;
                }
                else if(i>9)
                {
                    System.out.println("You have Failed! The right answer is : "+right_guess);
                    return;
                }
                else if(guess<right_guess)
                {
                    i++;
                    System.out.println("\nYour Guess is lower than the right guess! Turns left: " +(10-i) +"\n");

                }
                else if(guess>right_guess) 
                {
                    i++;
                    System.out.println("\nYour Guess is higher than the right guess! Turns left: " +(10-i) +"\n");

                }

            }
            System.out.println("You win the Game!");
            System.out.println("\n The correct number is  "+right_guess);
            System.out.println("\n You have used "+turns+" turns to guess the right number");
            System.out.println("\n Your score is "+((11-turns)*10)+" out of 100 for this Game");

        }
    }