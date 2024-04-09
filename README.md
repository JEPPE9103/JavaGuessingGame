# Guessing Game
This Java program implements a simple guessing game where the player tries to guess a randomly generated number between 1 and 100.

### Usage
- Run the program.
- Enter your guess when prompted.
- The program will inform you if your guess is too high or too low.
- Continue guessing until you guess the correct number.
- After each correct guess, you have the option to play again or exit.
### Components
- java.util.Random: Used to generate random numbers.
- java.util.Scanner: Used to read user input.
- GissaSpel class: Contains the main logic of the guessing game.
- startGame() method: Starts the game and controls the game flow.
- Various helper methods to handle user input, generate random numbers, and check guesses.
### How It Works
- The program generates a random number between 1 and 100.
- The player guesses the number, and the program provides feedback (higher or lower).
- The game continues until the player guesses the correct number.
- After each correct guess, the player has the option to play again or exit.
### Note
- Ensure that you input valid integers when prompted.
- You can customize the range of the random number by adjusting the parameters in nextInt() method.
