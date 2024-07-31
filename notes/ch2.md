CHAPTER 2: A Trip To Objectville : Classes and Objects

make objects of our own

can change and add code without having to touch previously tested, working code if specs change

make a class for each object and edit each class that is affected rather than writing one general function that takes in all objects and runs different code depending on what the object is

find what the classes have in common and abstract them out into their own class that they can share (Superclass)
then link the other classes to the superclass by inheritance

"Square inherits from Shape" for example

If the Shape class (Superclass) has the functionality, the subclasses automatically get it too

If you edit a method in a subclass that was inherited from the Superclass, it overrides it at runtime

---

things you need to ask yourself when designing a Java class:

what kind of data will be needed
what do i want it to do

think about things the objects within the class will know
and what they can/will need to be able to do

**things an object knows about itself are called instance variables**
instance === object

**things an object can do are called methods**

TELEVISION OBJECT

what it might need to know (instance variables):
screen size
input type
current channel

what it might need to do(methods):
turn on and off
change channels
change volume
change input

--- A CLASS IS NOT AN OBJECT

--- but it is used to construct them

one class can have many objects, but there is only one class

think of the class as a blueprint for an object

each object made from a class can have instance variables of that class

EXAMPLE: You might use the Button class to make a dozen buttons, each with their own size, shape, color, etc.
each button that was created would be its own _object_

an object is like one contact entry in your contacts list
when you create a new contact, you are creating a new object (instance)
the entries you make for that contact (the information) represents the state (or data) of that object

the methods of the class are what you can do to the objects:
getName, changeName, setName, etc. could be methods for the contact class

all contacts can do the same thing, but each individual contact knows unique information about its own object

---

MAKING YOUR FIRST OBJECT WOOOOOOOOOO

2 USES OF MAIN

- to test class
- to start/launch application

a real Java application is nothing but objects talking to other objects (or calling methods from one another)

--- <July 28th>

when an object is created in Java, it goes into an area of memory called THE HEAP.
All objects live on the heap.

Java heap is called the Garbage-Collectible Heap.

When the JVM can see that an object can not be used again it makes it eligible for garbage collection so that, if you are running low on memory, the garbage collector can remove it to free up space to be reused.

"public" and "static" basically make a method "global".

any code in any class can call a public static method.

if you add public static final to a variable, this essentially marks it as a globally available constant.

a class is like a recipe, objects are cookies.

- OOP lets you extend a program without touching previously tested code.
- All Java code is defined in a class.
- A CLASS IS LIKE A BLUEPRINT, describes how to make an object of that class type.
- an object knows things and does things.
- things an object knows about itself are called instance variables.
  - they represent the state of an object.
- things an object does are called methods.
  - the behavior of an object.
- when you create a class, you will also want to create a test class that you can use to create objects of your new class type.
- a class can INHERIT instance variables and methods from a more abstract superclass.
- at runtime, a Java program is nothing more than a bunch of obejects talking to other objects.

EXERCISE: WILL IT RUN??

A: the StreamingSongTestDrive class needs to create an object of the StreamingSong type before calling all of the methods in it.
B: EpisodeTestDrive calls the play() method, but there is no method to call by that name. Create the play() method within the Episode class and give it the instructions it needs to carry out its intended purpose and it should be fine.

--- <July 30th>

EXERCISE: CODE MAGNETS

expected output: 
bang bang ba-bang
ding ding da-ding

EXERCISE: WHO AM I?

Class, Object, Method, Instance variable

I am compiled from a .java file.	== class

my instance variables values can be different from my buddy's values == object

i behave like a template == class

i like to do stuff == method, object

i can have many methods == class, object

i represent state == instance variable

i have behaviors == object, class

i am located in objects == method, instance variable

i live on the heap == object

i am used to create object instances == class

my state can change == instance variable, object

i declare methods == class

i can change at runtime == instance variable, object

both objects and instance behaviors are said to have state and behavior

