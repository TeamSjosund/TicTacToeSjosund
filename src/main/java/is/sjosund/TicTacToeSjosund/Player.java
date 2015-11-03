package is.sjosund.TicTacToeSjosund;

import java.util.Scanner;


public class Player {
    private char c;
    
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
    
    public static boolean verifyInput(int input)
    {
         if(input < 0 || input > 2)
         {
            return false;
         }
        return true;
        
    }

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
    
    /*public Point computerMove()
    {
        int random1 = Random.nextInt(3);
        int random2 = Random.nextInt(3);
        
        Point P = new Point(random1, random2);
        
        return p;
    }*/

    public char playerChar()
    {
        return c;
    }
    
}