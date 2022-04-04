## Tech Talks 3

# Selection Sort
* linear sort algorithm
* finds the smallest number in the list and moves it to the appropriate position, swapping it with the other data in that position
* index moves from 0 to n-1, which then will stop since it will have already been sorted
* O(n^2) time complexity: pretty inefficient especially with large amounts of data
  * loops through the list each time to find the smallest value between index i and n-1
  * swaps data in position of i-1
  * loops this process through an entire array / list through all the elements to be fully sorted from index 0 to i-1

# Insertion Sort
* groups the first two elements and compares them and swaps to put them in order
* adds one more element and keeps moving the values one element to the right
* once there is a value that is smaller than that element that would go between the values to the left and right of it, the value will be placed there and no other values will need to be moved
* keeps "inserting" elements based on how many are present in the full list and sorting until complete with the full list
* O(n²) in the average and worst case, and O(n) in the best case
  * better than other sorts when n is small, but inefficient when n is bigger
  * if short and best case, there will not be much shifting of the values and it will be sorted easily
  * once there are many values and depending on how unsorted they are, they may have to go through entire lists to be able to find their position

# Merge Sort
* continously splits the sorts in half
* 
* O(n*Log n) 

# Bubble Sort
* 
