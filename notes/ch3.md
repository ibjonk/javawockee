CHAPTER 3: Know Your Variables: Primitives and References

variables can store two types of things

- primitives
- references

so far we've used variables in two places - object state (instance variables) - local variables (declared within a method)

later will learn to use them as: - arguments (values sent to a method by the calling code) - return types (values sent back to the caller of the method)

Variables have been declared as integers, strings, and arrays so far, but there is more to it than these simpler data types

difference between primited and references

will learn: - what you can declare as a variable - what you can put in a variable - what you can do with a variable

JAVA CARES ABOUT TYPE

    - can't put a giraffe reference in a Rabbit variable

the compiler can spot most problems like creating a rabbit using the Giraffe class

variables come in 2 flavors:

- primitives hold:
  - fundamental values (simple bit patterns):
    - ints
    - bools
    - floats
- object references hold
  - references to objects

2 rules to follow when declaring a variable:

- variables must have a type
- variables must have a name

"an object of type X" think of type and class as synonyms

a variable is just a cup --> it holds something

- it has a size and type

PRIMITIVES
coffee terms:

- they are like the cups they have at the coffee shop:
  - come in different sizes
  - they all have a name: - short, tall, etc.
    Java terms:
- Primitives come in different sizes
- Those sizes have names
- When declaring variables in Java, you must declare it with a specific type

The Four integer primitives in Java:

- long
- int
- short
- byte

"I'd like a tall french roast" --> to the barista === "I'd like an int variable with the number 90 please" --> the compiler

BUT in Java, you have to give that 'cup' (variable) a name, so it would be more like:
"I'd like an int variable with the number 90, and call that variable 'height' please"

Each primitive variable has a fixed number of bits (size of cup):

- byte --> 8 bits
- short --> 16 bits
- int --> 32 bits
- long --> 64 bits
- float --> 32 bits
- double --> 64 bits

with some number types (Float and Long at least), you have to specifically tell the compiler what you mean

- can use upper or lowercase, for example:
  - long big = 32567324L;
  - float f = 32.5f;

MAKE SURE THE VALUE CAN FIT IN THE CUP, YOU DON'T WANT IT TO SPILL

- you can not put a large value into a small cup
  - _without spillage_
- the compiler tries to help prevent this from happening if it can tell from the code that something is not going to fit in the container

FOR EXAMPLE:

    int x = 24;
    byte b = x;
    WILL NOT WORK

the compiler just sees that you are trying to store the value of an int (32 bits) into a variable meant to hold bytes (8 bits), even if the number 24 would be able to fit into a bit normally. The possibility of _spilling_ is what causes the compiler to warn you

You can assign a value to a variable in several ways:

- type a literal value after the equals sign
  - x = 12, isGood = true, etc.
- assign the value of one variable to another
  - x = y
- use an expression combining the two
  - x = y + 43

Some examples:

int size = 32;

char initial = 'j';

double d = 456.709;

boolean isLearning;

isLearning = true;

int y = x + 45;

BCBSILFD --> 8 primitive types

**but what can you use as names?**

- You can name a class, method, or variable according to the following rules (to be safe):
  - it must start with a letter, underscore, or dollar sign.
    - **can not start with a number**
  - after the first character, you can use numbers as well
  - don't use a reserved a word, otherwise it can be anything you like

reserved words are keywords (and other things) that the compiler recognizes

- there are a lot of these, some so far include:
  - public
  - static
  - void
  - boolean
  - char
  - byte
  - short
  - int
  - long
  - float
  - double

Take this code as an example of controlling your object:

Dog d = new Dog();
d.bark();

Think of a Dog reference variable as a Dog remote control
Use it to get the object to do something (invoke methods)

some things to know:

- there is no such thing as an object variable
- there is only an object reference variable
- an object reference variable holds bits that represent a way to access an object
- it does not hold the object itself, but it holds something like a pointer or an address to the object
- the JVM knows how to use the reference to get to the object

You can not stuff an object into a variable

<SWITCHED TO THE 2nd EDITION HERE, TRIAL ENDED ON OREILLY APPARENTLY LOL>
<08.05.2024>

didn't do anything this day unfortunately

<lets gooooooooo>
<08.06.2024>

The DOT OPERATOR:

- you use the dot operator on a reference variable to say "use the thing before the dot to get me to the thing after the dot"
- think of it like you are pressing a button on the remote control for that object

myDog.bark();
means use the object referenced by the variable myDog to invoke the bark() method

an object reference is just another variable value

- something that goes in a cup, only this time the value is a remote control

With PRIMITIVE VARIABLES:

- the value of the variable is the value (5,25.6, 'a')

With REFERENCE VARIABLES:

- the value of the variable is the bits that represent a way to get to a specific object

**3 steps of object declaration, creation, and assignment**

1. Declare a reference variable
   1. Dog myDog
2. Create an object
   1. new Dog();
3. link the object and the reference
   1. Dog myDog = new Dog();

**LIFE ON THE GARBAGE-COLLECTIBLE HEAP**

Declare 2 Book reference variables, create 2 book objects, and assign them to each other:

Book b = new Book();
Book c = new Book();

- THE 2 BOOK OBJECTS ARE NOW LIVING ON THE HEAP

Objects: 2
References: 2

Declare a new Book reference variable:

Book d = c;

- Take the bits in c, make a copy of them, and stick that copy into d, essentially
- Now both c and d are referring to the same object
- 2 remotes programmed to the same TV

Objects: 2
References: 3

Assign the value of variable b to the variable c:

c = b;

- the bits inside the variable b are copied into variable c
- both b and c refer to the same object now

Objects: 2
References: 3

**LIFE AND DEATH ON THE HEAP**

Book b = new Book();
Book c = new Book();

Active references: 2
Reachable objects: 2

b = c;

- both b and c refer to the same object now, leaving the original object that was created when declaring b initially eligible for garbage collection
- the first object that b referenced (Object 1) has no more references, therefore it is unreachable

Active references: 2
Reachable objects: 1
Abandoned objects: 1

c = null;

- assign the value null to the variable c
- this makes c refer to nothing
- it is still a reference variable, so another Book object can be assigned to it
- Object 2 still has an active reference (b)
  - as long as it does, the object is not eligible for GC

Active references: 1
Reachable objects: 1
Abandoned objects: 1
null references: 1

**AN ARRAY IS LIKE A TRAY OF CUPS**

1. Declare an int array variable
   1. an array variable is a remote control to an array object
2. Create a new int array with a length of 7, and assign it to the previously-declared int[] variable nums
3. Give each element in the array an int value

   1. elements in an int array are just int variables

4. int[] nums;
5. nums = new int[7]
6. 1. nums[0] = 1;
   2. nums[1] = 2;
   3. nums[2] = 3;
   4. nums[3] = 4;
   5. nums[4] = 5;
   6. nums[5] = 6;
   7. nums[6] = 7;

Arrays are objects, too

the Java standard library includes a lot of sophisticated data structures including maps, trees, and sets
Arrays are great when you want a quick, ordered, efficient list of things

- fast random access by letting you use an index position to get any element in the array
- every element in an array is just a variable
- can have an array that holds a number of Dog of dog reference varaibles, but not objects themselves
  - Dog[] holds references, not Dog objects

**ARRAYS ARE ALWAYS OBJECTS, REGARDLESS OF IF THEY HOLD PRIMITIVES OR OBJECT REFERENCES**

**CONTROL YOUR DOG (with a reference variable)**

Dog fido = new Dog();
fido.name = "Fido";

- created a dog object and used the dot operator on the reference variable 'fido' to access the name variable
- can use the fido reference to get the dog to bark() or eat() or chaseCat()

What happens if the Dog is in a Dog array?

instead of:

- fido.name = "Fido";
  it would just be:
- myDogs[0].name = "Fido";

Java cares about type:

- once you have declared an array, you can only put things of the array's declared type into it
- The compiler won't let you put the wrong thing into an array, based on the array's declared type

<Got wisdom teeth pulled today haha>
<grind dont stop>
<08.07.2024>

**BULLET POINTS** continued from the Dog class example yesterday

- variables come in two different flavors: primitive and reference
- variables must always be declared with a name and a type
- a primitive variable value is the bits representing the value
- a reference variable value is the bits representing a way to get to an object on the HEAP
- a reference variable is like a remote control
  - using the dot operator on a reference variable is like pressing a button on the remote control to access a method or instance variable
- a reference variable has a value of null when it is not referencing any object
- an array is always an object, even if it is declared to hold primitives
- no such thing as a primitive array, only an array that holds primitives

BE THE COMPILER

A: looks like it would work. it creates an array, assigns values to each element of the array, loops through the array to display the title and author. i am sure there is something wrong in there that i am missing, but it looks okay to me. _of course it forgot to actually create the objects for each element of the array. can not believe i overlooked that lol_

B: looks messy is my first impression. this one needs to fix the counter so that it starts at the first element of the array, such as z = -1 and change the validation check to be z < 2 instead of z < 4
