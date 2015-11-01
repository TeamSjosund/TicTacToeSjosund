package is.sjosund.TicTacToeSjosund;

public final class Point 
{ 
    private final int x;  
    private final int y; 

    public Point(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
}

public class Player {
    private char c;
    
    public Player(char c)
    {
        this.c = c;
    }
    public static Point humanMove()
    {
        StdOut.printf("Enter row");
        int x = StdIn.readInt();
        StdOut.printf("Enter column");
        int y = StdIn.readInt();
        
        Point p = new Point(x, y);
        
        return p;
    }
    
    public static Point computerMove()
    {
        int random1 = Random.nextInt(3);
        int random2 = Random.nextInt(3);
        
        Point P = new Point(random1, random2);
        
        return p;
    }

    public char playerChar()
    {
        return c;
    }
    
}