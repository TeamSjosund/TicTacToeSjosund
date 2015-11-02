package is.sjosund.TicTacToeSjosund;

import java.util.Scanner;


public class Player {
    private char c;
    
    public Player(char c)
    {
        this.c = c;
    }
    public int humanXMove()
    {
        int x;
        do {
            System.out.println("Enter row");
            Scanner sc = new Scanner(System.in);
            String xs = sc.nextLine();
            x = convertInput(xs);
        } while (verifyInput(x) == false);

        return x;
    }
    public int humanYMove()
    {
        int y;
        do {
            System.out.println("Enter column");
            Scanner sc = new Scanner(System.in);
            String ys = sc.nextLine();
            y = convertInput(ys);
        } while (verifyInput(y) == false);

        return y;
    }
    
    public static boolean verifyInput(int input)
    {
         if(input < 0 || input > 2)
         {
            System.out.println("Invalid input! Try again: ");
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