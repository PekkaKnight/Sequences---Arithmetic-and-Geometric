
# Sequences---Arithmetic-and-Geometric
A fun mini project in Java.\
Uses Interface, Sorting, Inheritance, and other OOP concepts

## About this project:
This project will give an insight on sequences and series. 
#### First Part:
Our first part is an interface, which sets the behaviour up for our parent class.\
Our interface, Initialize, will setup behaviour for seeing wheter the interface is an arithmetic, geometric sequence, or neither, and then return true or false for that\
We finally have a String method to setup the behaviour for the type. 
#### Second Part:
Our second part is the parent class, Sequence, which implements Initialize, which is our interface. For the instance variable, I made a protected array of integers. I made it protected, so that that our subclass, which is in the third part, can build on the variable.\
Our constructor will take in our protected instance variable and then use insertion sort in order to sort our array of random order into ascending order.\
We can see that this has formed a sequence that is in increasing manner.\
After that, we have implemented the interface and written the methods that we were supposed to right, including a void method that I used so that the array is only printed once.
#### Third Part:
Our third part is the child class. The child class, Internal, will extend our Parent Class, Sequence.\
Now, we have all the methods that we need and some additionals.\
For the constructor, I just said to call to Sequence by using the super keyword.\
I also used the super keyword in the method and because our instance variable is protected(can be viewed through subclasses), to make sure that our algorihm is sorted.\
This class will return the common difference and common ratio depending on the sequence.
#### Fourth Part:
Our fourth part is our main method code. 
In the main method, I created instances of both the parent and child class, so that we could use the Child Class methods.\
If the sequence is Arithmetic, then return the name of the sequence, and then the common differene.\
If the sequence is Geometric, then return the name of the sequence, and then the common ratio.\
Otherwise, print that it is neither Arithmetic or Geometric at the same time

