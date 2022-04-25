## Study Plan for Week

* Monday: Review of CollegeBoard Videos: Classes and Objects Terminology and Review (where I lack most on)
* Tuesday: Take full 2015 MCQ 
* Wednesday: Take corrections of the MCQ, retake the ending part of the MCQ to see full score, and finish up terminology with any other review
* Thursday: Take full 2015 FRQ
* Friday: Finish FRQ + code on REPL + keep track of errors and report in notes

All of the following should be placed below or in the review ticket: [TICKET](https://github.com/mistylavender/techtalks/issues/3#issue-1207182795)

## Notes for AP Week: Revision of Terminology for Classes/Objects

* Encapsulation: using a class to hide the state (data)  and the behavior (method)

* Final variables: once set, variables cannot be changed

* Final class: cannot have subclasses

* Final method: method cannot be overridden in the subclass

* Default Constructor: constructor without arguments / inputs

* Constructor: initialization of a class, called automatically w/ the class

* Instantiation: calls the object of the class to run it

* Initialization: putting default values to input later

* Accessor Method: accesses data in object without alteration (ex: getters, setters)

* Mutator Method: changes states of data in object

* Instance method: a method that operate on individual objects

* Static method / Class method: a method that performs operations for entire classes, instead of just objects, often uses keyword static in header, can use a static variable in its code

* Static methods in Driver Class: when driver method is static, all the other methods that are running also have to be static

* Method Overloading: multiple methods in the same class with same names but different parameters, return type is irrelevant but input type(s) matters
EX: having multiple constructors with different arguments

* Scope: region that a variable or method can be accessed

* Block: piece of code within a {} -> can be a method, class, if-else statement, etc.

* Local variable: defined inside a method instead of without or within a statement -> declared to end of the block

* this Keyword: used to implement instance methods/variables, often used if needs to be called from outside the method/class, 

* implicit parameter: parameter for an instance method

* passing primitives as parameters: passed by value, primitive types must be stored in memory, when method is exited, local memory slots are exited

* Passive objects as parameters: address/reference of the object is copied instead of the values of the objects -> cannot replace the objects later, but can change the state of the objects 

* Null Reference: defines a reference that is uninitialized, null/no value in place, can input value later
EX: BankAccount b;

* An abstract class allows you to create functionality that subclasses can implement or override. 
* An interface only allows you to define functionality, static variables
* Can extend a single abstract classes, can implement multiple interfaces

* [type] [name] = new [instantiation/memory type]([parameter])

* compiles based on type, allocates memory to instantiation



## 2015 Practice CollegeBoard MCQ



**Q10: Student interface, Athlete and TennisPlayer Class**
<br> ![image](https://user-images.githubusercontent.com/89210459/164276898-8261a638-c593-4941-91f8-e3075ad07fb5.png) <br>
**Correct Answer:** *D. Student d = new Athlete();* <br> A subclass cannot call a parent class. <br> <br>
**My Answer:** *C. Athlete c = new TennisPlayer();* <br> I thought that I could not call a parent class could call a subclass, when it was actually the other way around.

---

**Q24: Adding overloaded method one to SomeClass**
<br> ![image](https://user-images.githubusercontent.com/89210459/164270210-7201c6d2-45e8-400c-8669-00daad1c94a5.png) <br> <br>
**Correct Answer:** *D. II and III only* <br> ?? <br> <br>
**My Answer:** *C. I and III only* <br> ??

---

**Q26:**
<br> ![image](https://user-images.githubusercontent.com/89210459/164271091-485b6025-ac3f-4f7e-bcde-43314a4fdfbb.png) <br> <br>
**Correct Answer:** *E. 1 2 3 4 5 6 blackboard* <br> The ChangeIt Function did not return any values and changed other values, but not the same variables that were in the main method. To change it, there would need to be a constructor that sets these values <br> to be used and modified in multiple methods or an object that is set to these values. <br> <br>
**My Answer:** *N/A* <br> I most likely would have thought the method changed the values, but it didn't.

---


## 2015 Practice CollegeBoard FRQ

[Repl](https://replit.com/join/vxdxppoemr-mistylavender)

![2015 FRQs_1](https://user-images.githubusercontent.com/89210459/165123208-9c533d50-aa67-4948-b259-023249e69561.jpg)
![2015 FRQs_2](https://user-images.githubusercontent.com/89210459/165123248-ad1f5c9e-e397-4721-a1e1-33f1caa79487.jpg)
![2015 FRQs_3](https://user-images.githubusercontent.com/89210459/165123279-13819b5e-adbb-483d-8e0f-9ca5304511c3.jpg)
![2015 FRQs_4](https://user-images.githubusercontent.com/89210459/165123347-f6169d0a-1446-4b54-a7f0-93021b9d6e6b.jpg)
