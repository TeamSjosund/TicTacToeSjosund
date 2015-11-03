package is.sjosund.TicTacToeSjosund;

public class TicTacToe {
    public static void main(String[] args) {
	Board board = new Board(3);
    Player player1 = new Player('x');
    Player player2 = new Player('o');
    char winner = '-';
    boolean player1Turn = true;
    while (!board.checkIfFull(board.BOARD) && winner == '-') {
        board.printBoard();
        if (player1Turn == true)
        {
        	System.out.println("Player 1 turn");
        	int p1x;
        	int p1y;
        	boolean move;
        	boolean goodInput;
        	do {
        		do {
        			System.out.println("Enter row");
		            p1x = player1.humanXMove();
		            goodInput = player1.verifyInput(p1x);
		            if (goodInput == false)
		            {
		            	System.out.println("Invalid input! Try again: ");
		            }
		        } while (goodInput == false);
		        do {
		        	System.out.println("Enter column");
		            p1y = player1.humanXMove();
		            goodInput = player1.verifyInput(p1y);
		            if (goodInput == false)
		            {
		            	System.out.println("Invalid input! Try again: ");
		            }
		        } while (goodInput == false);
	            move = board.checkBoard(p1x, p1y, board.BOARD);
	            if (move == false)
	            {
	            	System.out.println("Field occupied! Try again: ");
	            }
            } while (move == false);
            board.makeMove(p1x, p1y, board.BOARD, player1.playerChar());
            player1Turn = false;
        }
        else
        {
        	System.out.println("Player 2 turn");
        	int p2x;
        	int p2y;
        	boolean move;
        	boolean goodInput;
        	do {
	            do {
	            	System.out.println("Enter row");
		            p2x = player1.humanXMove();
		            goodInput = player1.verifyInput(p2x);
		            if (goodInput == false)
		            {
		            	System.out.println("Invalid input! Try again: ");
		            }
		        } while (goodInput == false);
		        do {
		        	System.out.println("Enter column");
		            p2y = player1.humanXMove();
		            goodInput = player1.verifyInput(p2y);
		            if (goodInput == false)
		            {
		            	System.out.println("Invalid input! Try again: ");
		            }
		        } while (goodInput == false);
	            move = board.checkBoard(p2x, p2y, board.BOARD);
	            if (move == false)
	            {
	            	System.out.println("Field occupied! Try again: ");
	            }
	        } while (move == false);
            board.makeMove(p2x, p2y, board.BOARD, player2.playerChar());
            player1Turn = true;
        }
        winner = board.winner(board.BOARD);
    }
    board.printBoard();
   
    if(winner == '-')
    {
        System.out.println("Tie!");
    }
    else
    {
        System.out.println("Winner: " + winner);
    }
}
}

    

