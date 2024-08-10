<This is the beginning of chapter 4>
<maximum swollage day still, lots of pain but grinding as much as possible>
<stopped to watch and follow along with ForrestKnight's video on Java OOP>
<https://www.youtube.com/watch?v=TiccevwEVe8>
<08.09.2024>

CHAPTER 4: Methods Use Instance Variables: How Objects Behave

State affects behavior, behavior affects state

We know that objects have state and behavior represented by instance variables and methods
a class just describes what an object knows and what an object does

every instance of a particular class has the same methods, but they can behave differently depending on the value of the instance variables

YOU CAN SEND THINGS TO A METHOD (parameters, arguments, etc.)

a method uses parameters
a caller passes arguments

parameter is nothing more than a local variable
a variable with a type and a name that can be used inside the body of a method

if a method takes a parameter, you HAVE to pass it something, and it must be of the appropriate type

methods can return values as well

every method is declared with a return type, but so far we have just used **void**

- this means we will receive nothing back after the method runs

If you declare a method to return a value, it must return a value of the declared type (or at least one compatible)

you can send more than one thing to a method

- just separate them with commas when you pass them
- pass them in the correct order
  - if the method is expecting a string, an int, then a double you can not pass the double first, then the string, then the int
  - they must be in the exact same order the method was declared in

**JAVA IS PASS-BY-VALUE**
**THIS MEANS PASS BY COPY**

GETTERS AND SETTERS

A Getter's sole purpose in life is to send back, as a return value, the value of whatever it is that particular Getter is supposed to be Getting

A Setter lives and breathes for the chance to take an argument and use it to set the value of an instance variable

build setter methods for all the instance variables and find a way to force other code to call the setters rather than access the data directly

PUBLIC and PRIVATE access modifiers

**MARK YOUR INSTANCE VARIABLES PRIVATE**
**PROVIDE PUBLIC GETTERS AND SETTERS FOR ACCESS CONTROL**

    - this will keep data safe, but as time goes on you will learn what is right and wrong basically

you can change setters and getters without breaking other code

ENCAPSULATING THE GoodDog CLASS

<finished here 08.10.2024 (technically lol)>
<p.82>

How do objects in an array behave?

- just like any other object

  1. declare and create a Dog array to hold 7 Dog references

     Dog[] pets;
     pets = new Dog[7];

  2. create 2 new Dog objects and assign them to the first 2 elements of the array

     pets[0] = new Dog();
     pets[1] = new Dog();

  3. call methods on the two Dog objects

     pets[0].setSize(30);
     int x = pets[0].getSize();
     pets[1].setSize(8);

Declaring and initializing instance variables

**Instance variables always get a default value**
**if you don't assign a value or call a setter method, the instance variable still has a value**

integer --> 0
floating points --> 0.0
booleans --> false
references --> null

DIFFERENCE BETWEEN INSTANCE AND LOCAL VARIABLES

1.  Instance variables are declared inside a class but _not within a method_

    class Horse {
    private double height = 15.2; --> height is an instance variable
    private String breed; --> so is breed
    }

2.  Local variables are declared _within a method_

    class AddThing {
    int a;
    int b = 12;

        public int add() {

            int total = a + b; --> total is the local variable
            return total;
        }

    }

3.  Local variables must be initialized before use

    class Foo {
    public void go() {
    int x; --> x must be initialized or the compiler will freak out lol
    int z = x + 3;
    }
    }

    **LOCAL VARIABLES DO NOT GET A DEFAULT VALUE**
    **THE COMPILER WILL COMPLAIN IF YOU TRY TO USE A LOCAL VARIABLE BEFORE THE VARIABLE IS INITIALIZED**

Method parameters are virtually the same as local variables -- declared inside the method
they will never be uninitialized, therefore you will never get a compiler error telling you that a parameter variable might not have been initialized

the compiler will give you an error if you try to invoke a method without sending arguments that the method needs

COMPARING VARIABLES (primitives or references)
<Stop here, late night studying>
<08.10.2024>
<p.86>

this is just testing the github nonsense