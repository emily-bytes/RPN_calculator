# RPN_calculator
Reverse Polish Notation calculator in Java

Write a Stack class for doubles: constructor, push, pop, empty, peek. You can choose an array or a linked list implementation as you see fit. If you want, you can limit the stack size to ten (HP only had three on their first attempt!), but in that case you should make your push do nothing if the stack is full. Most modern stack implementations have no arbitrary size limit. The pop and peek methods should throw an exception if they are called on an empty stack (see code for this below).
Write an RPN class: constructor (takes a String expression, e.g. "3 4 5 + *") and an evaluate method which returns a double ("3 4 5 + *" would evaluate to (4+5)*3=27).
Write an RPNCalculator class: main method with whatever accouterments you see fit.
Allow the user to type in an expression, then evaluate it and repeat until they say quit.
