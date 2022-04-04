# Tech Talks 3

What are Sorts? 
* sorts are used with numerical lists of data
* often there is a lot of data that needs to be sorted from minimum to maximum and there are many algorithms that can be used to sort them
* once sorted, it is easier to make an analysis of the data and use it accordingly
* Time Complexity (using Big O Notation): 
  * used to describe the complexity of an algorithm when measuring its efficiency
  * time it takes to complete the sorting (usually determined by worst possible case / longest possible time)
  * in comparison to n, which is the amount of data in the lists / arrays
* Space Complexity:
  * amount of space / memory used with the algorithm in the worst possible case


## Selection Sort
* linear sort algorithm
* finds the smallest number in the list and moves it to the appropriate position, swapping it with the other data in that position
* index moves from 0 to n-1, which then will stop since it will have already been sorted
* **O(n²) time complexity:** 
  * pretty inefficient especially with large amounts of data
  * loops through the list each time to find the smallest value between index i and n-1
  * swaps data in position of i-1
  * loops this process through an entire array / list through all the elements to be fully sorted from index 0 to i-1
* **O(1) space complexity:** 
  * constant amount of space needed
  * use space when storing index of lists, minimum value for each loop through the list, & swapping

## Insertion Sort
* groups the first two elements and compares them and swaps to put them in order
* adds one more element and keeps moving the values one element to the right
* once there is a value that is smaller than that element that would go between the values to the left and right of it, the value will be placed there and no other values will need to be moved
* keeps "inserting" elements based on how many are present in the full list and sorting until complete with the full list
* **O(n²) time complexity:**
  * better than other sorts when n is small, but inefficient when n is bigger
  * if short and best case, there will not be much shifting of the values and it will be sorted easily
  * once there are many values and depending on how unsorted they are, they may have to go through entire lists to be able to find their position
* **O(1) space complexity:** 
  * constant amount of space needed
  * use space when storing index of lists, shifting elements in different positions, & comparing the different values

## Merge Sort
* continously splits the sorts in half till there are single elements
* then as they are merged back together, the smaller lists are compared and then sorted into the larger lists
* finally they merge together into a single list
* uses recursion (calls its own method to form a loop until a certain condition is fulfilled) to separate the lists into singular elements to compare
* merges by using pointers on the two lists that are being compared
  * inserts into another list when a value is smaller compared to the value on the other list
  * moves the pointer to the next value and continues comparing till complete
  * once one of the lists has all its elements in the merged list, the remaining elements in the other list are simply inserted after in the merged list
  * since these individual lists are already sorted as they go, there is no need to sort anything else
* best for LinkedLists 
* **O(n*Log n) complexity:**
  * dividing the lists in halves: log n
  * sorting and merging the lists requires going through all the lists once to compare and then storing: n
* **O(n) space complexity:** 
  * space varies on the amount of items needed
  * use space when storing lists that are being split, lists when merging together, & variables to store pointers to put into the merged lists

## Bubble Sort
* compares in "bubbles" one at a time till fully sorted
* starts at index i = 0 and compares i and i + 1 and swaps if they are in the wrong order
* keeps swapping till the end of the list
* partially sorted, but not fully: need to keep repeating and swapping through the list till there are no swaps left to be done
* **O(n²) complexity:** 
  * meant to be one of the worst sorting methods ever
  * if a value that is meant to be at the front of the list is towards the end of the list, it has to swap with each individual element between that to get to the right position
  * swapping once goes through entire list, but then repeating till sorted goes through list n times (worst possible case)
* **O(1) space complexity:** 
  * constant amount of space needed
  * use space when storing for swaps and indexes for moving through the list
