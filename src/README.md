## Force myself to practice algorithms
### By: Josh Mansito

----
### **Part 1: Insertion sort**
Class: Insertion.java
<p>Simple sorting algorithm designed for smaller data values, and good
for data sets which are already partially sorted</p>

- Pseudo Code for insertion sort:
```
procedure insertionSort(A: list of sortable items)
    n = length(A)
    for i = 1 to n - 1 do
        j = i
        while j > 0 and A[j-1] > A[J] do
            swap(A[J], A[j-1])
            j = j - 1
        end while
    end for
end procedure
```
This algorithm sorts an array of items by repeatedly taking an element from the unsorted portion of the array and inserting it into its correct position in the sorted portion of the array.

1. The procedure takes a single argument, ‘A’, which is a list of sortable items.
2. The variable ‘n’ is assigned the length of the array A.
3. The outer for loop starts at index ‘1’ and runs for ‘n-1’ iterations, where ‘n’ is the length of the array.
4. The inner while loop starts at the current index i of the outer for loop and compares each element to its left neighbor. If an element is smaller than its left neighbor, the elements are swapped.
5. The inner while loop continues to move an element to the left as long as it is smaller than the element to its left.
6. Once the inner while loop is finished, the element at the current index is in its correct position in the sorted portion of the array.
7. The outer for loop continues iterating through the array until all elements are in their correct positions and the array is fully sorted.

#### Steps for ascending order:

- Iterate from arr[1] to arr [N] over the array. 
- Compare the current element (key) to its predecessor.
- If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

----
### **Part 2: Selection Sort**
Class: Selection.java
<p>Creates a sorted portion, and an unsorted portion of the array. 
It works by repeatedly selecting the smallest (or largest) element from 
the unsorted portion of the list and moving it to the sorted portion of the list.</p>

#### Steps for selection sort:

- Initialize minimum value(min_idx) to location 0.
- Traverse the array to find the minimum element in the array.
- While traversing if any element smaller than min_idx is found then swap both the values.
- Then, increment min_idx to point to the next element.
- Repeat until the array is sorted.
----
