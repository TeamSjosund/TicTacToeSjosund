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
        System.out.println("Enter row");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        return x;
    }
    public int humanYMove()
    {
        System.out.println("Enter column");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        return y;
    }
    
    public static boolean verifyInput(int input)
    {
         if(input < 0 || input > 2)
         {
             throw new RuntimeException("Invalid input");
         }
        return true;
        
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