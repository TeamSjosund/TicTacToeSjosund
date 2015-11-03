Introduction
============

The purpose of this report is to describe how we are going to design TicTacToe. Our TicTacToe system has three classes, one for the Player, one for the Board and the last one is for the gameplay of the TicTacToe.


Player class
-------------

-   This class reads the input from the user and verifies the input. The initializer keeps track of if the player is 'X' or 'O'.
-   The functions humanXMove and humanYMove takes the input from the user and check if that square that the player wants to insert either 'X' or 'O' is valid for insertion and check if the input is valid.
-  The verifyInput class goes without saying, it verifies the input from the user and if the input is invalid the user can try again.


Board class
------------

-   This class creates and prints the board for the players to play in. 
-   The initializer calls the makeBoard function that simply creates the 3x3 board.
-   In this class we have functions that checks if the field that the player wants to insert in is available and also checks whether we have a winner or a tie
-   We also check if the input is out of bounds.

TicTacToe class
---------------

-   This class creates new board and two new players. Player 1 gets the 'X' and player 2 gets the 'O'. 
-   In this class we handles the gameplay and talks to the other classes. Here we check which player has the next move and if we have a winner and in the end the winner (or the tie) is announced. 

Coding rules
-----------------

-   One statement or declaration per line.

-   We used PMD to analyze the code.

-   Use curly braces around blocks, even when they would be optional (no one liners).

-   Class names are PascalCased.

-   local variables and parameters are camelCased.

-   Functions are camelCased if and only if they are not class constructors then they are PascalCased.

