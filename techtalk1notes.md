## Tech Talk 1 - Linked Lists ##

[Repl for Tech Talks](https://replit.com/join/shtgcacbqv-mistylavender)

Linked Lists:
* Dynamic List: Manages objects, able to add or delete
  * Preferred over arraylists b/c of dynamicity

* Disadvantages: nodes cannot be accessed directly and must start from the head and go through the list to get the nodes
  * Each set of data inputted has two elements: a previous pointer and a next pointer that connects itself to the list
  * Pointers can be connected to another piece of data or can be null when it is not connected to anything

Queue: 
* Built using LinkedList objects
* FIFO: first in first out
* always dequeues (removes) from the head (front of the list) node 
* always enqueues (adds) from the tail (back of the list) node
* keeps track of the current node for iteration
* similar to a line of customers, first in line means first one to get served

Stacks:
* Can be built using LinkedList objects
* LIFO: last in first out
* only needs one
* lifo node instead of a head and tail
  * only add or remove through the last one
  * similar to a stack of plates, take the top out out and only add to the top
  * push (add) & pop (remove)

Generics:
* parameterized types: allows user-defined types (Integers, Strings, etc.)
* create classes with different data types
* object: superclass of all other classes
* Generic method: takes a parameter and returns some value after performing a task -> general parameters can be inserted
* Generic class: implemented like a non-generic class, but it can accept one or more types of parameters
