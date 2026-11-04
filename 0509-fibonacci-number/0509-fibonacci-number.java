class Solution {
    public int fib(int n) {
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
    // so we can use rec + Memoization use dp top - down approch tc = 0(n) , sc o(n)
    // public int fibo(int n,int[] dp){
    //     if(n<=1) return n;
    //     if(dp[n]!=0) return dp[n];
    //     return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    // }
    //  public int fib(int n){
    //     int[]dp = new int[n+1];
    //     return fibo(n,dp);
    // }

    // now tabulation form nuttom up approch

    if(n<=1) return n;
    int []dp = new int [n+1];
    dp[0] = 0;
    dp[1] = 1;
    for(int i = 2;i<=n;i++){
        dp[i] = dp[i-1] +dp[i-2];
    }
   return dp[n];
    }
}