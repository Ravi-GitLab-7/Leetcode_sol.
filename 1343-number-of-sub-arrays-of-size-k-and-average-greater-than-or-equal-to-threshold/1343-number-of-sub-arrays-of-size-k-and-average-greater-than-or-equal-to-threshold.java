class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        for(int i = 0;i<n-k+1;i++){
            int sum = 0;
            for(int j = i;j<i+k;j++){
                sum += arr[j];
            }
            double average = (double) sum / k;
            if(average >= threshold)
            count ++;
        }
        return count;
    }
}