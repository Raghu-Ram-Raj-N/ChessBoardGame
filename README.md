# ChessBoardGame
Problem :
You are to program a 2 Player Chess game in a command line environment.
Assumptions

1. The players takes chances alternatively.
2. Consider the Chess board as shown below, and each square is denoted as
<Num><Alphabet>

● To start the game, set all the coins as shown in the image.
  
● Player 1 takes the White coin and Player 2 takes the Black coin.
  
# Task 1 - Game Play :
Choose Coin :
  When it is the player's turn, he/she can choose any one of his coin by denoting the position in the board (Eg: b1 - denotes the white Knight in the left) Once the position is entered, The system should be able to figure out and print the following
  
  1. The current type of coin (King, Queen, Bishop, Knight, Rook or Pawn )
  
  2. The next set of positions the particular coin will be able to move.
  
  a. Each coin has its own logic and moves in a particular fashion.
  (https://en.wikipedia.org/wiki/Rules_of_chess#Basic_moves)
  
  b. Consider obstructing coin (both white and black)
  
  c. Also mention, if any of the opposite coin can be captured.
  
Move Coin
  Now prompt to enter the new position, where the coin should be moved.
  
    ■ If it is a valid position, move the coin to the new position.
  
Move the game to player 2 and continue playing the game as mentioned above
  
Instead of a position, if the user types
  
  ● "exit"   - get out of the game.
  
  ● "Print" - show the current state of the board.

SAMPLE OUTPUT  
  
  Select the Task:
  
  1.Game Play
  
  2.Printing the Board
  
  3.Recording
  
  4.Exit
  
  1
  
  White Player's Turn
  
  Enter the Position of Coin
  
  b2
  
  The Current type of Coin : W_P
  
  Enter the new Position of Coin
  
  b3
  
  The move had been made
  
 # Task 2 - Printing the Board :

  
