# [Chapter 1](https://courses.mooc.fi/org/uh-cs/courses/data-analysis-with-python-2024-2025/chapter-1/python)
## Exercise 1.9 (merge)
Suppose we have two lists `L1` and `L2` that contain integers which are sorted in ascending order. Create a function `merge` that gets these lists as parameters and returns a new sorted list `L` that has all the elements of L1 and L2. So, len(L) should equal to len(L1)+len(L2). Do this using the fact that both lists are already sorted. You can’t use the `sorted` function or the `sort` method in implementing the merge method. You can however use these sorted in the main function for creating inputs to the merge function. Test with a couple of examples in the main function that your solution works correctly.

Note: In Python argument lists are passed by reference to the function, they are not copied! Make sure you don't modify the original lists of the caller.
