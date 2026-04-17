# [The Celebrity Problem](https://www.geeksforgeeks.org/problems/the-celebrity-problem/1)
## Medium
A celebrity is a person who is known to all but&nbsp;does not know&nbsp;anyone at a party. A party is being organized by some people. A square matrix&nbsp;mat[][]&nbsp;of size n*n is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person.&nbsp;You need to return the index of the celebrity in the party, if the celebrity does not exist, return&nbsp;-1.
Note:&nbsp;Follow 0-based indexing.
Examples:
Input: mat[][] = [[1, 1, 0],                [0, 1, 0],                [0, 1, 1]]
Output: 1
Explanation: 0th and 2nd person both know 1st person and 1st person does not know anyone. Therefore, 1 is the celebrity person.
Input: mat[][] = [[1, 1],                 [1, 1]]
Output: -1
Explanation: Since both the people at the party know each other. Hence none of them is a celebrity person.
Input: mat[][] = [[1]]
Output: 0
Constraints:1 ≤ mat.size() ≤ 10000 ≤ mat[i][j] ≤ 1mat[i][i] = 1