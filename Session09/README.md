# Java Projects for Study Circle

## Currency Converter

The idea is to develop an interactive currency conversion system, where there is a list of available currencies, and conversions can be made between these currencies. The program should include the following:
- An interactive interface with the user (from the terminal).
- The user selects the source currency and the target currency.
- Determine the amount to convert from the source currency to the target currency.
- The program prints the result of the conversion in a comprehensible format, for example: "25 Mexican pesos are 1.35 euros."
- The program should have the option to exit, and it should only terminate in that case. Otherwise, it should allow for more conversions.
- The program should handle unexpected inputs and react appropriately.
- There should be a minimum of 10 different currencies, and conversions can be made between any two of them.


## Number Guessing Game

The project idea is to develop a Java game that allows the player to guess a number that the computer is thinking of. The game consists of the following:
- The computer selects a random number.
- The user must guess this number, and they have 10 attempts.
- In each attempt, the player guesses a number, and the computer responds with one of three possible outcomes: "Too high" if the number is greater than the target, "Too low" if the number is less than the target, and "You got it" if the number is the one to be guessed.
- If the user exhausts all attempts, the computer responds with "You lost" and gives the player the option to play again or exit the program.
- The program only terminates if the user selects the exit option. If they win or lose, they are given the option to play again or exit.
- The program should handle unexpected inputs and react appropriately.


## Simple Banking Application

The idea is to simulate the operation of a bank, where there are customers, and each customer has an account. The project consists of the following:
- All customers can perform operations: withdrawal, transfer, balance inquiries, and deposits.
- For all operations, a PIN and the amount for the operation are required.
- The PIN must match the customer's PIN, and the customer must have sufficient funds in their account for deposits and transfers.
- Transfers are made using the customer's number, and the recipient customer must exist.
- Transfers must have an impact on both customers.
- The project should include an interactive menu that allows these operations to be carried out.
- It should also have a minimum of 10 customers.
- The menu should have the exit option, and until this option is selected, operations can continue to be performed.
- Customers are identified by their customer number and PIN.
- The menu should also include all the operations that customers can perform.
- When selecting an operation, the customer is prompted to authenticate.


## Word Counter

This Java application is most suitable for word counting. Remember our childhood days when we were asked to write an essay on a specific topic where the word count should be 500 or 1000. This application comes with a feature that could help you. The application should do the following:
- Read a text file from disk.
- Analyze the text file.
- Print a report of the analyzed text in the console with the following information:
- Number of words
- The top 10 most frequent words
- The top 10 most frequent words, excluding prepositions (in Spanish)
- The number of paragraphs
- The number of sentences
- The number of characters
- The average word length
- In all cases, the analysis should be case-insensitive.
