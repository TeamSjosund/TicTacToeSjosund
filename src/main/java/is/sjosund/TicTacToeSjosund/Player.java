package is.sjosund.TicTacToeSjosund;

import java.util.Scanner;


public class Player {
    private char c;
    
    // Creates new player with char c as a board mark
    public Player(char c)
    {
        this.c = c;
    }
    public int humanMove()
    {
        int x;
        Scanner sc = new Scanner(System.in);
        String xs = sc.nextLine();
        x = convertInput(xs);
        return x;
    }
    
    // Returns true if and only if input is inside board boundries
    public static boolean verifyInput(int input)
    {
         if(input < 0 || input > 2)
         {
            return false;
         }
        return true;
        
    }

    // Returns string s as an integer but throws exception if it's not an integer
    public static int convertInput (String s) {
        int number;
        try {
            number = Integer.parseInt(s);
        }
        catch (NumberFormatException ex) {
            number = -1;
        }
        return number;
    }

    // Returns the board mark that the player has
    public char playerChar()
    {
        return c;
    }
    
}