package is.sjosund.TicTacToeSjosund;


public class Board {
    public static void main(String[] args) {
    }
	
	static int SIZE = 3;
	static char[][] BOARD;
	
	Board(int size) {
		SIZE = size;
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
	
	public static char winner(char[][] board) {
		for(int i = 0; i < SIZE; i++) {
			char currentChar = board[i][0];
			boolean winner = true;
			for(int j = 1; j < SIZE; j++) {
				if(board[i][j] != currentChar) {
					winner = false;
				}
			}
			if (winner == true) {
				return currentChar;
			}
		}
		
		for(int i = 0; i < SIZE; i++) {
			char currentChar = board[0][i];
			boolean winner = true;
			for(int j = 1; j < SIZE; j++) {
				if(board[j][i] != currentChar) {
					winner = false;
				}
			}
			if (winner == true) {
				return currentChar;
			}
		}
		
		char currentChar = board[0][0];
		boolean winner = true;
		for(int i = 1; i < SIZE; i++) {
			if(board[i][i] != currentChar) {
				winner = false;
			}
		}
		if(winner == true) {
			return currentChar;
		}
		
		currentChar = board[0][2];
		if(board[1][1] == currentChar && board[2][0] == currentChar) {
			return currentChar;
		}
		return '-';
	}
	
	public static boolean checkIfFull(char[][] board) {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

	public static void printBoard ()
    {
    	System.out.print(" ");
    	for (int i = 0; i < BOARD.length; i++)
    	{
    		System.out.print(i + " ");
    	}
    	System.out.println();
    	for (int i = 0; i < BOARD.length; i++)
    	{
    		System.out.print(i + " ");
    		for (int j = 0; j < BOARD.length; j++)
    		{
    			System.out.print(BOARD[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
}

