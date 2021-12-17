# Palindrome problem
 Given a string, this program will find all the palindrome substrings, and output the palindromes together with their starting index and length, sorted in descending order of length
 
For example:
```
input: reifierfioaoiamwhooamimadamalularevverwebbewmurdrum
output: 

reifier, 0, 7
murdrum, 44, 7
revver, 32, 6
webbew, 38, 6
ioaoi, 8, 5
amima, 19, 5
madam, 22, 5
alula, 27, 5
ama, 25, 3
oo, 17, 2
```

# Algorithm
 I will loop through all the characters presented in the given string. For each character, do the following:

 - As palindromes are string which is mirrored by the pivot point, expand the search to character before and after this character, to see if they are the same. If they are not, the "expanded" string around the pivot point is not a palindrome. If they are the same, continue the process until the characters on both side are not the same. Extract this string and the starting index of this string.
 - As there are 2 types of palindromes, odd and even in length, we need to evaluate both cases: consider the current character as pivot point for odd case, and consider both the current character and the next one as pivot point.
 
 Time and space complexity for this algorithm is O(N<sup>2</sup>) and O(1) respectively.

 After all the palindromes are extracted, sort them by length, then by index, and print them out the console.
 
# Instruction
### Requirements
  Java SDK 8 and above installed
  
### How to run the program
  - Clone the project, and extract to your designed folder, for example
```
    /yourprofile/palindrome-main/
```
  - Open terminal and navigate to the output folder
```
    /yourprofile/palindrome-main/out/production/Palindrome
```
  - run the program, and pass in a string to be evaluated
```
    java ahoang.MainProgram reifierfioaoiamwhooamimadamalularevverwebbewmurdrum
```
  - Output will be printed in console