# FexcoTechnicalProject
Fexco Technical Task: This is the solution to a technical task under taken for Fexco.

Overview of the classes in the solution.

EnglishWords Class: This contains all the string Values needed to convert a number into a word. 
The String values are stored in a Hashmap and mapped to the corresponding number for that string value.

WordifiedNumber: This is the Interface class with the toWords Method.

WordifiedNumberImpl Class: This class implements the WordifiedNumber Interface. In this the class the number supplied 
is converted to a list object. The List object is then iterated through and the values required to map a number to a word 
are passed to the methods that map a number to a wprd in the EnglishWords Class.

WordifiedNumberImplFrench Class: This contains skeleton code and comments to show how the french language would be implemented.

FrenchWords Class: This class contains skeleton code with comments toi show how it would be implemented.

#Next release
The design should also take into account that a requirement for the next release is to also support outputting numbers as:
Given 1 output first
Given 2 output second
Given 21 output twenty first
Given 105 output one hundred and fifth

To implement the ordinal numbers on the next release developers would have to add the english words required for the ordinal numbers to the EnglishWords
Class. Once these have been added a method would need to be created to access and return these values. 

A new class that implements the WordifiedNumber Interface would have to be created. In this class the developers would have to iterate through the number
and pass the values into the returnword from the english class expect for the last digit in the number that is greater than 0. This Digit would have to 
be passed into a method that returns the ordinal number based on the position and value of the digit.

