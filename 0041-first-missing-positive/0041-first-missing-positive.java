// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int n = nums.length;
//         for(int num = 1; num <= n+1; num++){
//             boolean flag = false;
//             for(int ele : nums){
//                 if(ele == num){
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag == false) 
//                 return num;
//         }
//         return 1; // fallback (not actually needed)
//     }
// }

// By Hash map
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set <Integer> set = new HashSet<>(); // take extra spaces
        for(int ele :nums){
            set.add(ele);
        }
        for(int num=1;num<=n+1;num++){
            if(!set.contains(num)) return num;
        }
        return 147;
    }
}

