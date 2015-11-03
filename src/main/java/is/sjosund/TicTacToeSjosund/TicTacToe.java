package is.sjosund.TicTacToeSjosund;

public class TicTacToe {
    public static void main(String[] args) {
		Board board = new Board(3);
	    Player player1 = new Player('x');
	    Player player2 = new Player('o');
	    char winner = '-';
	    boolean player1Turn = true;
	    while (!board.checkIfFull(board.BOARD) && winner == '-') {
	        printBoard(board.BOARD);
	        if (player1Turn == true)
	        {
	        	turn(player1, board);
	            player1Turn = false;
	        }
	        else
	        {
	        	turn(player2, board);
	            player1Turn = true;
	        }
	        winner = board.winner(board.BOARD);
	    }
	    printBoard(board.BOARD);
	   
	    if(winner == '-')
	    {
	        System.out.println("Tie!");
	    }
	    else
	    {
	        System.out.println("Winner: " + winner);
	    }
	}

	public static void printBoard (char[][] board) {
		System.out.print("  ");
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

	public static void turn (Player p, Board board) {
		System.out.println(p.playerChar() +  " turn");
	        	int px;
	        	int py;
	        	boolean move;
	        	boolean goodInput;
	        	do {
	        		do {
	        			System.out.println("Enter row");
			            px = p.humanMove();
			            goodInput = p.verifyInput(px);
			            if (goodInput == false)
			            {
			            	System.out.println("Invalid input! Try again: ");
			            }
			        } while (goodInput == false);
			        do {
			        	System.out.println("Enter column");
			            py = p.humanMove();
			            goodInput = p.verifyInput(py);
			            if (goodInput == false)
			            {
			            	System.out.println("Invalid input! Try again: ");
			            }
			        } while (goodInput == false);
		            move = board.checkBoard(px, py, board.BOARD);
		            if (move == false)
		            {
		            	System.out.println("Field occupied! Try again: ");
		            }
	            } while (move == false);
	            board.makeMove(px, py, board.BOARD, p.playerChar());
	}
}

    

