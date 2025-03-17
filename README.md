### **Five-in-a-Row Game (Gomoku)**

**Description:**

The Five-in-a-Row (Gomoku) game is a classic board game played on a 15x15 grid. The objective is for one player to align five of their marks (either "X" or "O") in a row, either horizontally, vertically, or diagonally, before their opponent does. This project is implemented in Java and is suitable for beginners to practice object-oriented programming concepts and GUI development.

**Features:**

- Two-player gameplay: Play against another human player.
- Grid size: The game uses a 15x15 grid for placing marks.
- Win condition: A player wins by getting five marks in a row horizontally, vertically, or diagonally.
- Reset functionality: The game can be reset after a win or a draw.
- Simple GUI: The game is presented with a graphical user interface for better user interaction.

**Technologies Used:**

- Java: The core programming language used for logic implementation.
- Java Swing: Used for building the graphical user interface (GUI).

**Setup and Installation:**

1. Clone this repository:
   `git clone https://github.com/bfyqjzsgkqycf/Gomoku.git`
2. Navigate to the project directory:
   `cd src`
3. Compile and run the project:
   `javac ChessJFrame.java`
   `java ChessJFrame`

**How to Play:**

1. The game is played by two players. Player 1 uses "X" and Player 2 uses "O".
2. Players take turns to place their marks on the grid by clicking on the empty spaces.
3. The game continues until one player aligns five marks in a row, either horizontally, vertically, or diagonally.
4. If the grid is filled without any player winning, the game ends in a draw.

**Project Structure:**

- GomokuGame.java: Main game logic and entry point.
- GameBoard.java: Handles the board creation and checking of win conditions.
- GameUI.java: The graphical user interface for interacting with the game.

**Contributing:**

If you would like to contribute to this project, feel free to open a pull request with your changes. Please ensure that any changes are properly tested and that the code follows the existing style and structure of the project.

**License:**

This project is licensed under the ```MIT License``` - see the LICENSE file for details.
