# TDD calculator Kata project

## What is a Code Kata?
 Take a look at this site for a deep definition [Code Kata](http://codekata.com/)

## Before you start

 - Try not to read ahead.
 - Do one task at a time. The trick is to learn to work incrementally.
 - Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata
 - Make sure you commit your work once you've finished each test and/or your round (if pair/mob programming is being applied)

## String Calculator

 - Create a simple String calculator with a method int Add(string numbers)
    - The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example “” or “1” or “1,2”
    - Start with the simplest test case of an empty string and move to 1 and two numbers
    - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
    - Remember to refactor after each passing test
 - Allow the Add method to handle an unknown amount of numbers
 - Allow the Add method to handle new lines between numbers (instead of commas).
    - the following input is ok:  “1\n2,3”  (will equal 6)
    - the following input is NOT ok:  “1,\n” (not need to prove it - just clarifying)
 - Support different delimiters
    - to change a delimiter, the beginning of the string will contain a separate line that looks like this:   “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
     - the first line is optional. all existing scenarios should still be supported
 - Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.if there are multiple negatives, show all of them in the exception message


## Calc Stats

This time you're not given the steps, but a general definition. Can you extract unit tests from this definition??

Your task is to process a sequence of integer numbers
to determine the following statistics:

    o) minimum value
    o) maximum value
    o) number of elements in the sequence
    o) average value

For example: [6, 9, 15, -2, 92, 11]

    o) minimum value = -2
    o) maximum value = 92
    o) number of elements in the sequence = 6
    o) average value = 18.166666
