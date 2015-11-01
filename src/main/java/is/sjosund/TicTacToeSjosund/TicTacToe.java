package is.sjosund.TicTacToeSjosund;

public class TicTacToe {
    public static void main(String[] args) {
	System.out.println("Hello world");
    }

    public static char[][] makeBoard (int size) {
    	if (size <= 0)
    	{
    		throw new RuntimeException("Size too small");
    	}
    	char[][] board = new char[size][size];
    	for (int i = 0; i < size; i++)
    	{
    		for (int j = 0; j < size; j++)
    		{
    			board[i][j] = '-';
    		}
    	}
    	return board;
    }

    public static void printBoard (char[][] board)
    {
    	System.out.print(" ");
    	for (int i = 0; i < board.length; i++)
    	{
    		System.out.print(i + " ");
    	}
    	System.out.println();
    	for (int i = 0; i < board.length; i++)
    	{
    		System.out.print(i + " ");
    		for (int j = 0; j < board.length; j++)
    		{
    			System.out.print(board[i][j] + " ");
    		}
    		System.out.println();
    	}
    }

    public static char[][] makeMove (int x, int y, char[][] board, char playerChar)
    {
    	if (x >= board.length || x < 0 || y >= board.length || y < 0)
    	{
    		throw new RuntimeException("Move out of bounds");
    	}
    	if (board[x][y] != '-')
    	{
    		throw new RuntimeException("Move already made");
    	}
    	board[x][y] = playerChar;
    	return board;
    }
}
