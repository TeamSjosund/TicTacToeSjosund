package is.sjosund.TicTacToeSjosund;


public class Board {
    public static void main(String[] args) {
	System.out.println("Hello world");
    }
	
	char[][] BOARD;
	
	Board(int size) {
		BOARD = makeBoard(size);	
	}
	
    public static char[][] makeBoard (int size) {
    	if (size <= 2)
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
	
	public static boolean checkBoard(int x, int y, char[][] board) {
		
		if(x >= board.length || x < 0 || y >= board.length || y < 0 ) {
			throw new RuntimeException("Not a valid field");
		}
		
		if(board[x][y] != '-') {
			return false;
		}
		
		return true;
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