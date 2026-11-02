class Solution {
    // but this method occure multipls times recuring 
    //like fib(5)->  this methop tc =2^n
  /* fib(5)
 ├── fib(4)
 │    └── fib(3) here fib(3) will be overlaping 2 times comes
 └── fib(3) 
                    
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
    */ 
    // so we can use rec + Memoization use dp top - down approch tc = 
    public int fibo(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
     public int fib(int n){
        int[]dp = new int[n+1];
        return fibo(n,dp);
    }

}