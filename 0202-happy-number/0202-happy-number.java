class Solution {
    public int squareSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;   
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast)); // fast moves 2 steps
        }
        while(slow != fast);

        return slow == 1;
    }
}