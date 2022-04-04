# Tech Talks 3

What are Sorts? 
* sorts are used with numerical lists of data
* often there is a lot of data that needs to be sorted from minimum to maximum and there are many algorithms that can be used to sort them
* once sorted, it is easier to make an analysis of the data and use it accordingly
* Big O Complexity: 
  * used to describe the complexity of an algorithm when measuring its efficiency
  * time it takes to complete the sorting (usually determined by worst possible case / longest possible time)
  * best ones for different situations / amounts of data

## Selection Sort
* linear sort algorithm
* finds the smallest number in the list and moves it to the appropriate position, swapping it with the other data in that position
* index moves from 0 to n-1, which then will stop since it will have already been sorted
* O(n²) time complexity: pretty inefficient especially with large amounts of data
  * loops through the list each time to find the smallest value between index i and n-1
  * swaps data in position of i-1
  * loops this process through an entire array / list through all the elements to be fully sorted from index 0 to i-1

## Insertion Sort
* groups the first two elements and compares them and swaps to put them in order
* adds one more element and keeps moving the values one element to the right
* once there is a value that is smaller than that element that would go between the values to the left and right of it, the value will be placed there and no other values will need to be moved
* keeps "inserting" elements based on how many are present in the full list and sorting until complete with the full list
* O(n²) in the average and worst case, and O(n) in the best case
  * better than other sorts when n is small, but inefficient when n is bigger
  * if short and best case, there will not be much shifting of the values and it will be sorted easily
  * once there are many values and depending on how unsorted they are, they may have to go through entire lists to be able to find their position

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
* O(n*Log n)
  * dividing the lists in halves: log n
  * sorting and merging the lists requires going through all the lists once to compare and then storing: n

## Bubble Sort
* 
