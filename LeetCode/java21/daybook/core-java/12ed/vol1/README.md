# Chapter 3: Fundamental Programming Structures in Java
## 3.10 Arrays
### 3.10.4 Array Copying
# Chapter 9: Collections
## 9.3 Concrete Collections
### 9.3.3 Hash Sets
> In Java, hash tables are implemented as arrays of *linked lists*. Each list is called a *bucket*. To find the place of an object in the table, compute the *hash code* and reduce it modulo the total number of buckets. The resulting number is the index of the bucket that holds the element.

**OWN COMMENTS**

The essence of the hash function in Java is the use of `Object#hashCode`
