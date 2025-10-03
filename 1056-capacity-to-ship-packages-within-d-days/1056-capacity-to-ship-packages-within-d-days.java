class Solution {
    public boolean isPossible(int [] arr,int d ,int c){   
        int n = arr.length,loads = 0,days = 1;
        for(int i=0;i<n;i++){
            if(loads + arr[i]<=c) loads +=arr[i];
            else{
                loads = arr[i];
                days ++;
            }
        }
        if(days>d) return false;
        else return true;
    }

    public int shipWithinDays(int[] arr, int d) {
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int lo = max, hi = sum, midC = sum;
        while(lo<=hi){
            int mid = lo+(hi - lo)/2;
            if(isPossible(arr,d,mid)==true){  
                midC = mid;                   
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return midC;
    }
}
