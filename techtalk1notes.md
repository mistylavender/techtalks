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
