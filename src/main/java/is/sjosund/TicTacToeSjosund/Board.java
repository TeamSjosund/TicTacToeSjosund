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
	
	private boolean checkBoard(int x, int y) {
		
		if(BOARD[x][y] != '-') {
			return false;
		}
		
		return true;
	}
}