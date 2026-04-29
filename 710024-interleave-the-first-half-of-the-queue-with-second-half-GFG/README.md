# [Interleave the First Half of the Queue with Second Half](https://www.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/1)
## Medium
Given a queue q[] of even size. Your task is to rearrange the queue by interleaving its first half with the second half.
Interleaving is the process of mixing two sequences by alternating their elements while preserving their relative order.In other words, Interleaving means place the first element from the first half and then first element from the 2nd half and again&nbsp;second element from the first half and then second element from the 2nd half and so on....
Examples:
Input: q[] = [2, 4, 3, 1]
Output: [2, 3, 4, 1]
Explanation: We place the first element of the first half 2 and after that place the first element of second half 3 and after that repeatthe same process one more time so the resulting queue will be [2, 3, 4, 1]
Input: q[] = [3, 5]Output: [3, 5]Explanation: We place the first element of the first half 3 and first elementof the second half 5 so the resulting queue is [3, 5]
Constraints:1&nbsp;≤ queue.size() ≤ 1031&nbsp;≤ queue[i] ≤ 105