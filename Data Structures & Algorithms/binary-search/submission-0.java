class Solution {
    public int search(int[] nums, int target) {
        int[] arr = nums.clone();   // ✅ clone to avoid modifying original
        Arrays.sort(arr);           // ✅ keep sorting

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                // find index in original array
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == target){
                        return j;   // ✅ return original index
                    }
                }
            }
        }
        return -1;
    }
}