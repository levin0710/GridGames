/**
 * Levin Sanchez
 * 3/31/2021
 * Mrs. Wright
 * CSA
 * This programs creates a Penny Pitch game and allows the user to interact with the game.
 * Two Boards are displayed, the prize board and the penny board, each after the user
 * indicates to do so.
 */ 
import java.util.Scanner;
public class GameTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Game levin = new Game();
        System.out.println("Welcome to Penny Pitch! The prizes available on this board are puzzle, game, ball, poster, and doll. At the end of \n the game, if all of the spaces that say BALL are covered \n by a penny, the player gets the ball. This is also true \n for the other prizes. The board is made up of 25 squares \n (5 x 5). Each prize appears on three randomly chosen \n squares so that 15 squares contain prizes. To start the \n game, press 1 to generate a board with the prizes. ");
        int num1 = scanner.nextInt();
        if(num1==1)
        {
            levin.printBoard();
        }
        
        System.out.println("\n Okay, now this is the board that was randmoly generated \n and where each prize lies. Now press 1 to pitch your 10 \n pennies and see if you have won something!");
        int num2 = scanner.nextInt();
        if(num2==1)
        {
            levin.throwPennies();
            levin.printTries();
        }
        levin.checkWin();
    }
}