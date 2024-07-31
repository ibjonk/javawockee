NOTES CAN GO HERE ABOUT JAVA-RELATED ACTIVITIES
https://learning.oreilly.com/library/view/head-first-java/9781492091646/preface03.html#hereapostrophes_what_you_can_do_to_bend

CHAPTER 1: Breaking The Surface: Dive In: A Quick Dip

**how to approach the book**

slow down and think about questions being asked instead of just rushing to the answer

write down notes physically in a notebook as you go through the problems
helps with retention as you think through solutions

do the exercises

read the "There are No Dumb Questions" sidebars, they are main content

move around periodically to stay fresh

make this the last thing you read before bed

DRINK WATER

talk about concepts out loud
record a video of you going through a problem or just talking about a concept OR just explain a concept to someone that is willing to listen to you yap

know when the brain is being overloaded and stop

write the code and run it

**things to learn**

difference between a class and an object

how objects are useful

---

in a source file, put a class
in a class, put methods
in a method, put statements

a source file is what ends in '.java'
the class represents a _piece_ of the program

inside the class you can put methods with statements that are instructions on how the method should be performed
method = function

---

**class**
public class Dog {

**method**
void bark() {

**statement**
statement1;
statement2;
}

}

every java application has to have:

at LEAST one class

ONE MAIN PER APPLICATION

---

syntax things to know:

each statement should end with a semicolon (;)
comments are made with 2 forward slashes, //
white space is generally okay
declare variables with a type then the name (int age)
classes and methods must be defined with a set of curly braces, {}

---

things you can do:

do something - just do it
do something again and again - for and while loops
do something under a condition - if/else statements

---

**looping**

while, do-while, for

while - for as long as the condition is true, everything inside the loop block is executed

can do simple boolean checks on variables using <, >, and ==

a class is a blueprint for an object and nearly everything in java is an object

the result of a conditional test MUST be a boolean, not a number or a string or any other type

println vs print

print just prints to the same line
println prints to a newline each time it is used

---

arrays:

array.length returns the number of elements in the array

java.util.Random allows for random number generation among other things

nextInt() returns a number between 0 and the number we give it, not including the number we gave it

using array[i] can call the element at the ith position of the array
can set variables = to this value etc etc

---

---------BE THE COMPILER---------

A: Will compile. It will run endlessly without adding some sort of incrementor.
Add the line x = x + 1; before the if statement.

B: Will not compile. There is no class wrapping the methods, therefore it will not be able to run.
Would add public class Exercise1c {} around the code and it should work.
I would also consider moving the x = x - 1; line down below the if statement as I think it is typically better to increment/decrement at the end of whatever function you are doing than before it.

C: Will not compile. Missing the main method.
Add public static void main(String[] args) {} beneath the class declaration

Candidates: 1, 2, 3, 4, 5 Outputs: A, B, C, D, E, F, G, H

1 provides E
2 provides G
3 provides H
4 provides B
5 provides D
