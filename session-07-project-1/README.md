# Hands-on project 1

- This is a _team_ project. Recommended team size: 2-3
- Solo submissions are allowed but not encouraged. If you have trouble finding a team mate, call it out on Discord
- Pick one of the project options in the list below
- The goal is to make the project "usable". This is not a hobby project. You are building a tool for the world to use.
- Use proper object oriented programming and good coding practices
- Brainstorm features and technical design. Document the decisions in the final repo
- Write tests!
- The assets of a completed project are:
  - A GitHub repo containing the source code
  - A README explaining the usage of the tool and how someone can install and use the tool
  
# Project options


## Calculator
A command-line calculator that can perform basic arithmetic operations such as addition, subtraction, multiplication, and division.

### Features

- Support for basic arithmetic operations such as addition, subtraction, multiplication, and division
- Support for decimal numbers and negative numbers
- Ability to perform multiple calculations in a single command.
- Ability to display the result of the calculation
- Ability to handle errors and display error messages when invalid input is provided. The calculator should be able to handle multiple spaces and unwanted characters in the input.

## Text processor

A command-line tool for manipulating text files, such as sorting lines of text alphabetically and removing duplicate lines.

### Features

- Ability to sort lines of text alphabetically in ascending or descending order.
- Ability to remove duplicate lines from a text file.
- Ability to search for specific text within a file and return the line numbers where it appears.
- Ability to replace a specific text within a file with new text.
- Ability to merge two or more text files into a single file.
- Ability to handle large files efficiently (Hint: Look for streaming APIs in `java.nio.file.Files`).
- Ability to handle errors and display error messages when invalid input is provided.
## Unit converter
    
A command-line utility for converting units of measurement, such as converting miles to kilometers or Celsius to Fahrenheit.

### Features

- Support for 3 units of measurement each in length, temperature, weight and volume
- Ability to convert between different units within the same category, such as miles to kilometers or ounces to grams, Celsius to Fahrenheit.
- A user-friendly interface for inputting the values and units to be converted.
- Ability to handle errors and display error messages when invalid input is provided.

## Word Game
A command-line hangman game 

### Features

- A word or phrase to be guessed by the player.
- Display of the word or phrase with hidden letters, represented by underscores or other symbols.
- Ability for the player to input letters as guesses.
- The game should use the popular word list from here: https://github.com/dolph/dictionary/blob/master/popular.txt
- Feedback on whether the guess was correct or not.
- A visual representation of the hangman, (graphical or text based) that indicates number of guesses done and pending, letters of incorrect guesses
- Ability to choose the level of difficulty (e.g. easy, medium, hard) that affects the length of the words
- A scoring system that keeps track of the player's performance over multiple games.

## Time tracker app
A command-line application that can be used to track time spent on different tasks, and generate reports

### Features

- Ability to create and manage multiple tasks - add tasks and assign them to categories
- Ability to start and stop a timer for a specific task.
- Ability to record and track time spent on each task.
- Ability to auto-switch: starting a task when another is in progress automatically stops the previous task.
- Ability to view the total time spent on each task.
- Ability to generate reports on time spent on each task
- Ability to set reminders for task
- Ability to track time based on categories



